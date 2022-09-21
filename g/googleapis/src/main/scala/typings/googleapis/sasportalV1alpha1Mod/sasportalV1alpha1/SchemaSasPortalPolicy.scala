package typings.googleapis.sasportalV1alpha1Mod.sasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSasPortalPolicy extends StObject {
  
  /**
    * List of assignments
    */
  var assignments: js.UndefOr[js.Array[SchemaSasPortalAssignment]] = js.undefined
  
  /**
    * The etag is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. It is strongly suggested that systems make use of the etag in the read-modify-write cycle to perform policy updates in order to avoid race conditions: An etag is returned in the response to GetPolicy, and systems are expected to put that etag in the request to SetPolicy to ensure that their change will be applied to the same version of the policy. If no etag is provided in the call to GetPolicy, then the existing policy is overwritten blindly.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
}
object SchemaSasPortalPolicy {
  
  inline def apply(): SchemaSasPortalPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSasPortalPolicy]
  }
  
  extension [Self <: SchemaSasPortalPolicy](x: Self) {
    
    inline def setAssignments(value: js.Array[SchemaSasPortalAssignment]): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    inline def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    inline def setAssignmentsVarargs(value: SchemaSasPortalAssignment*): Self = StObject.set(x, "assignments", js.Array(value*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
  }
}
