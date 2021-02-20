package typings.iron

import typings.iron.mod.Key
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Data extends StObject {
    
    var data: Buffer = js.native
    
    var key: Key = js.native
  }
  object Data {
    
    @scala.inline
    def apply(data: Buffer, key: Key): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IvBits extends StObject {
    
    var ivBits: Double = js.native
    
    var keyBits: Double = js.native
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
  
  @js.native
  trait KeyBits extends StObject {
    
    var keyBits: Double = js.native
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
