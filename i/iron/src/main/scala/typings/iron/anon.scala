package typings.iron

import typings.iron.mod.Key
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: Buffer
    
    var key: Key
  }
  object Data {
    
    inline def apply(data: Buffer, key: Key): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait IvBits extends StObject {
    
    var ivBits: Double
    
    var keyBits: Double
  }
  object IvBits {
    
    inline def apply(ivBits: Double, keyBits: Double): IvBits = {
      val __obj = js.Dynamic.literal(ivBits = ivBits.asInstanceOf[js.Any], keyBits = keyBits.asInstanceOf[js.Any])
      __obj.asInstanceOf[IvBits]
    }
    
    extension [Self <: IvBits](x: Self) {
      
      inline def setIvBits(value: Double): Self = StObject.set(x, "ivBits", value.asInstanceOf[js.Any])
      
      inline def setKeyBits(value: Double): Self = StObject.set(x, "keyBits", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyBits extends StObject {
    
    var keyBits: Double
  }
  object KeyBits {
    
    inline def apply(keyBits: Double): KeyBits = {
      val __obj = js.Dynamic.literal(keyBits = keyBits.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyBits]
    }
    
    extension [Self <: KeyBits](x: Self) {
      
      inline def setKeyBits(value: Double): Self = StObject.set(x, "keyBits", value.asInstanceOf[js.Any])
    }
  }
}
