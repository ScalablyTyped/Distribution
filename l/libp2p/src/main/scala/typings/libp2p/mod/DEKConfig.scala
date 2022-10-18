package typings.libp2p.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DEKConfig extends StObject {
  
  var hash: String
  
  var iterationCount: Double
  
  var keyLength: Double
  
  var salt: String
}
object DEKConfig {
  
  inline def apply(hash: String, iterationCount: Double, keyLength: Double, salt: String): DEKConfig = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], iterationCount = iterationCount.asInstanceOf[js.Any], keyLength = keyLength.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEKConfig]
  }
  
  extension [Self <: DEKConfig](x: Self) {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setIterationCount(value: Double): Self = StObject.set(x, "iterationCount", value.asInstanceOf[js.Any])
    
    inline def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
    
    inline def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
  }
}
