package typings.googleapis.stsV1betaMod.stsV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIdentityStsV1betaAccessBoundary extends StObject {
  
  /**
    * A list of access boundary rules which defines the upper bound of the permission a principal may carry. If multiple rules are specified, the effective access boundary is the union of all the access boundary rules attached. One access boundary can contain at most 10 rules.
    */
  var accessBoundaryRules: js.UndefOr[js.Array[SchemaGoogleIdentityStsV1betaAccessBoundaryRule]] = js.undefined
}
object SchemaGoogleIdentityStsV1betaAccessBoundary {
  
  inline def apply(): SchemaGoogleIdentityStsV1betaAccessBoundary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIdentityStsV1betaAccessBoundary]
  }
  
  extension [Self <: SchemaGoogleIdentityStsV1betaAccessBoundary](x: Self) {
    
    inline def setAccessBoundaryRules(value: js.Array[SchemaGoogleIdentityStsV1betaAccessBoundaryRule]): Self = StObject.set(x, "accessBoundaryRules", value.asInstanceOf[js.Any])
    
    inline def setAccessBoundaryRulesUndefined: Self = StObject.set(x, "accessBoundaryRules", js.undefined)
    
    inline def setAccessBoundaryRulesVarargs(value: SchemaGoogleIdentityStsV1betaAccessBoundaryRule*): Self = StObject.set(x, "accessBoundaryRules", js.Array(value*))
  }
}
