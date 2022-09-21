package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudSecuritycenterV1Binding extends StObject {
  
  /**
    * Name for binding.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Namespace for binding.
    */
  var ns: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Role or ClusterRole referenced by the binding.
    */
  var role: js.UndefOr[SchemaRole] = js.undefined
  
  /**
    * Represents the subjects(s) bound to the role. Not always available for PATCH requests.
    */
  var subjects: js.UndefOr[js.Array[SchemaSubject]] = js.undefined
}
object SchemaGoogleCloudSecuritycenterV1Binding {
  
  inline def apply(): SchemaGoogleCloudSecuritycenterV1Binding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudSecuritycenterV1Binding]
  }
  
  extension [Self <: SchemaGoogleCloudSecuritycenterV1Binding](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNs(value: String): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    inline def setNsNull: Self = StObject.set(x, "ns", null)
    
    inline def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
    
    inline def setRole(value: SchemaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSubjects(value: js.Array[SchemaSubject]): Self = StObject.set(x, "subjects", value.asInstanceOf[js.Any])
    
    inline def setSubjectsUndefined: Self = StObject.set(x, "subjects", js.undefined)
    
    inline def setSubjectsVarargs(value: SchemaSubject*): Self = StObject.set(x, "subjects", js.Array(value*))
  }
}
