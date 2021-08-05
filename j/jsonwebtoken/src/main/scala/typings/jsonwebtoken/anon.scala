package typings.jsonwebtoken

import typings.jsonwebtoken.jsonwebtokenBooleans.`true`
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined jsonwebtoken.jsonwebtoken.DecodeOptions & {  json :true} */
  trait DecodeOptionsjsontrue extends StObject {
    
    var complete: js.UndefOr[Boolean] = js.undefined
    
    var json: js.UndefOr[Boolean] & `true`
  }
  object DecodeOptionsjsontrue {
    
    inline def apply(json: js.UndefOr[Boolean] & `true`): DecodeOptionsjsontrue = {
      val __obj = js.Dynamic.literal(json = json.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodeOptionsjsontrue]
    }
    
    extension [Self <: DecodeOptionsjsontrue](x: Self) {
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setJson(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var key: String | Buffer
    
    var passphrase: String
  }
  object Key {
    
    inline def apply(key: String | Buffer, passphrase: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], passphrase = passphrase.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    }
  }
}
