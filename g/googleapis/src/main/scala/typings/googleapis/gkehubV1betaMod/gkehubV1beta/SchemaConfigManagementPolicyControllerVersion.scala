package typings.googleapis.gkehubV1betaMod.gkehubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigManagementPolicyControllerVersion extends StObject {
  
  /**
    * The gatekeeper image tag that is composed of ACM version, git tag, build number.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaConfigManagementPolicyControllerVersion {
  
  inline def apply(): SchemaConfigManagementPolicyControllerVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigManagementPolicyControllerVersion]
  }
  
  extension [Self <: SchemaConfigManagementPolicyControllerVersion](x: Self) {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
