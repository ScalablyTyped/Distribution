package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHotKeyInfo extends StObject {
  
  /**
    * The age of the hot key measured from when it was first detected.
    */
  var hotKeyAge: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A detected hot key that is causing limited parallelism. This field will be populated only if the following flag is set to true: "--enable_hot_key_logging".
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, then the above key is truncated and cannot be deserialized. This occurs if the key above is populated and the key size is \>5MB.
    */
  var keyTruncated: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaHotKeyInfo {
  
  inline def apply(): SchemaHotKeyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHotKeyInfo]
  }
  
  extension [Self <: SchemaHotKeyInfo](x: Self) {
    
    inline def setHotKeyAge(value: String): Self = StObject.set(x, "hotKeyAge", value.asInstanceOf[js.Any])
    
    inline def setHotKeyAgeNull: Self = StObject.set(x, "hotKeyAge", null)
    
    inline def setHotKeyAgeUndefined: Self = StObject.set(x, "hotKeyAge", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyTruncated(value: Boolean): Self = StObject.set(x, "keyTruncated", value.asInstanceOf[js.Any])
    
    inline def setKeyTruncatedNull: Self = StObject.set(x, "keyTruncated", null)
    
    inline def setKeyTruncatedUndefined: Self = StObject.set(x, "keyTruncated", js.undefined)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
