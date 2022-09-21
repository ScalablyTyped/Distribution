package typings.googleapis.websecurityscannerV1Mod.websecurityscannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaXxe extends StObject {
  
  /**
    * Location within the request where the payload was placed.
    */
  var payloadLocation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The XML string that triggered the XXE vulnerability. Non-payload values might be redacted.
    */
  var payloadValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaXxe {
  
  inline def apply(): SchemaXxe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaXxe]
  }
  
  extension [Self <: SchemaXxe](x: Self) {
    
    inline def setPayloadLocation(value: String): Self = StObject.set(x, "payloadLocation", value.asInstanceOf[js.Any])
    
    inline def setPayloadLocationNull: Self = StObject.set(x, "payloadLocation", null)
    
    inline def setPayloadLocationUndefined: Self = StObject.set(x, "payloadLocation", js.undefined)
    
    inline def setPayloadValue(value: String): Self = StObject.set(x, "payloadValue", value.asInstanceOf[js.Any])
    
    inline def setPayloadValueNull: Self = StObject.set(x, "payloadValue", null)
    
    inline def setPayloadValueUndefined: Self = StObject.set(x, "payloadValue", js.undefined)
  }
}
