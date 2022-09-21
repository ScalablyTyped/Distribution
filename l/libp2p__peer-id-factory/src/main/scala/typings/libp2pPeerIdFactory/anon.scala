package typings.libp2pPeerIdFactory

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bits extends StObject {
    
    var bits: Double
  }
  object Bits {
    
    inline def apply(bits: Double): Bits = {
      val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bits]
    }
    
    extension [Self <: Bits](x: Self) {
      
      inline def setBits(value: Double): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: String
    
    var privKey: js.UndefOr[String] = js.undefined
    
    var pubKey: js.UndefOr[String] = js.undefined
  }
  object Id {
    
    inline def apply(id: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPrivKey(value: String): Self = StObject.set(x, "privKey", value.asInstanceOf[js.Any])
      
      inline def setPrivKeyUndefined: Self = StObject.set(x, "privKey", js.undefined)
      
      inline def setPubKey(value: String): Self = StObject.set(x, "pubKey", value.asInstanceOf[js.Any])
      
      inline def setPubKeyUndefined: Self = StObject.set(x, "pubKey", js.undefined)
    }
  }
}
