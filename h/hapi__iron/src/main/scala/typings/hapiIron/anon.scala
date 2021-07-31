package typings.hapiIron

import typings.hapiIron.mod.Key
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Encrypted extends StObject {
    
    var encrypted: Buffer
    
    var key: Key
  }
  object Encrypted {
    
    @scala.inline
    def apply(encrypted: Buffer, key: Key): Encrypted = {
      val __obj = js.Dynamic.literal(encrypted = encrypted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encrypted]
    }
    
    @scala.inline
    implicit class EncryptedMutableBuilder[Self <: Encrypted] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncrypted(value: Buffer): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait IvBits extends StObject {
    
    var ivBits: Double
    
    var keyBits: Double
  }
  object IvBits {
    
    @scala.inline
    def apply(ivBits: Double, keyBits: Double): IvBits = {
      val __obj = js.Dynamic.literal(ivBits = ivBits.asInstanceOf[js.Any], keyBits = keyBits.asInstanceOf[js.Any])
      __obj.asInstanceOf[IvBits]
    }
    
    @scala.inline
    implicit class IvBitsMutableBuilder[Self <: IvBits] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIvBits(value: Double): Self = StObject.set(x, "ivBits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyBits(value: Double): Self = StObject.set(x, "keyBits", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyBits extends StObject {
    
    var keyBits: Double
  }
  object KeyBits {
    
    @scala.inline
    def apply(keyBits: Double): KeyBits = {
      val __obj = js.Dynamic.literal(keyBits = keyBits.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyBits]
    }
    
    @scala.inline
    implicit class KeyBitsMutableBuilder[Self <: KeyBits] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyBits(value: Double): Self = StObject.set(x, "keyBits", value.asInstanceOf[js.Any])
    }
  }
}
