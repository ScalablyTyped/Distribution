package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOSPolicyResourcePackageResourceYUM extends StObject {
  
  /**
    * Required. Package name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaOSPolicyResourcePackageResourceYUM {
  
  inline def apply(): SchemaOSPolicyResourcePackageResourceYUM = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOSPolicyResourcePackageResourceYUM]
  }
  
  extension [Self <: SchemaOSPolicyResourcePackageResourceYUM](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
