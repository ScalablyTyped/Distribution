package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.adapter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdapterObject
  extends StObject
     with BaseObject
     with AnyObject {
  
  @JSName("common")
  var common_AdapterObject: AdapterCommon
  
  /** Like protectedNative, but the properties are also encrypted and decrypted automatically */
  var encryptedNative: js.UndefOr[js.Array[String]] = js.undefined
  
  /** An array of `native` properties which cannot be accessed from outside the defining adapter */
  var protectedNative: js.UndefOr[js.Array[String]] = js.undefined
  
  @JSName("type")
  var type_AdapterObject: adapter
}
object AdapterObject {
  
  inline def apply(_id: String, common: AdapterCommon, native: Record[String, Any]): AdapterObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("adapter")
    __obj.asInstanceOf[AdapterObject]
  }
  
  extension [Self <: AdapterObject](x: Self) {
    
    inline def setCommon(value: AdapterCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setEncryptedNative(value: js.Array[String]): Self = StObject.set(x, "encryptedNative", value.asInstanceOf[js.Any])
    
    inline def setEncryptedNativeUndefined: Self = StObject.set(x, "encryptedNative", js.undefined)
    
    inline def setEncryptedNativeVarargs(value: String*): Self = StObject.set(x, "encryptedNative", js.Array(value*))
    
    inline def setProtectedNative(value: js.Array[String]): Self = StObject.set(x, "protectedNative", value.asInstanceOf[js.Any])
    
    inline def setProtectedNativeUndefined: Self = StObject.set(x, "protectedNative", js.undefined)
    
    inline def setProtectedNativeVarargs(value: String*): Self = StObject.set(x, "protectedNative", js.Array(value*))
    
    inline def setType(value: adapter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
