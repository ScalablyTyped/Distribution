package typings.jsonwebtoken

import typings.jsonwebtoken.jsonwebtokenBooleans.`true`
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined jsonwebtoken.jsonwebtoken.DecodeOptions & {  json :true} */
  @js.native
  trait DecodeOptionsjsontrue extends StObject {
    
    var complete: js.UndefOr[Boolean] = js.native
    
    var json: js.UndefOr[Boolean] with `true` = js.native
  }
  object DecodeOptionsjsontrue {
    
    @scala.inline
    def apply(json: js.UndefOr[Boolean] with `true`): DecodeOptionsjsontrue = {
      val __obj = js.Dynamic.literal(json = json.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodeOptionsjsontrue]
    }
    
    @scala.inline
    implicit class DecodeOptionsjsontrueMutableBuilder[Self <: DecodeOptionsjsontrue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setJson(value: js.UndefOr[Boolean] with `true`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Key extends StObject {
    
    var key: String | Buffer = js.native
    
    var passphrase: String = js.native
  }
  object Key {
    
    @scala.inline
    def apply(key: String | Buffer, passphrase: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], passphrase = passphrase.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    }
  }
}
