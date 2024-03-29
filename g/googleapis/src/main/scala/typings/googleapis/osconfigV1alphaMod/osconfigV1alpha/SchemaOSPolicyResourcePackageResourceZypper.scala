package typings.googleapis.osconfigV1alphaMod.osconfigV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOSPolicyResourcePackageResourceZypper extends StObject {
  
  /**
    * Required. Package name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaOSPolicyResourcePackageResourceZypper {
  
  inline def apply(): SchemaOSPolicyResourcePackageResourceZypper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOSPolicyResourcePackageResourceZypper]
  }
  
  extension [Self <: SchemaOSPolicyResourcePackageResourceZypper](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
