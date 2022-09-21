package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIdentityServiceGoogleConfig extends StObject {
  
  /**
    * Disable automatic configuration of Google Plugin on supported platforms.
    */
  var disable: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaIdentityServiceGoogleConfig {
  
  inline def apply(): SchemaIdentityServiceGoogleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentityServiceGoogleConfig]
  }
  
  extension [Self <: SchemaIdentityServiceGoogleConfig](x: Self) {
    
    inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    inline def setDisableNull: Self = StObject.set(x, "disable", null)
    
    inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
  }
}
