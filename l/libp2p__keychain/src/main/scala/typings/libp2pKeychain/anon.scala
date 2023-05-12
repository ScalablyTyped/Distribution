package typings.libp2pKeychain

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dek extends StObject {
    
    var dek: Hash
  }
  object Dek {
    
    inline def apply(dek: Hash): Dek = {
      val __obj = js.Dynamic.literal(dek = dek.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dek]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dek] (val x: Self) extends AnyVal {
      
      inline def setDek(value: Hash): Self = StObject.set(x, "dek", value.asInstanceOf[js.Any])
    }
  }
  
  trait Hash extends StObject {
    
    var hash: String
    
    var iterationCount: Double
    
    var keyLength: Double
    
    var salt: String
  }
  object Hash {
    
    inline def apply(hash: String, iterationCount: Double, keyLength: Double, salt: String): Hash = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], iterationCount = iterationCount.asInstanceOf[js.Any], keyLength = keyLength.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hash]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hash] (val x: Self) extends AnyVal {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setIterationCount(value: Double): Self = StObject.set(x, "iterationCount", value.asInstanceOf[js.Any])
      
      inline def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
      
      inline def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    }
  }
}
