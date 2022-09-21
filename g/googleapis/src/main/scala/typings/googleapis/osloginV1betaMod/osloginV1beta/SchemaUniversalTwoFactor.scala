package typings.googleapis.osloginV1betaMod.osloginV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUniversalTwoFactor extends StObject {
  
  /**
    * Application ID for the U2F protocol.
    */
  var appId: js.UndefOr[String | Null] = js.undefined
}
object SchemaUniversalTwoFactor {
  
  inline def apply(): SchemaUniversalTwoFactor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUniversalTwoFactor]
  }
  
  extension [Self <: SchemaUniversalTwoFactor](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
  }
}
