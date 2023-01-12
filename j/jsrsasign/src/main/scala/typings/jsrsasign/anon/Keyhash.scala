package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Keyhash extends StObject {
  
  var alg: String
  
  var keyhash: String
  
  var namehash: String
  
  var serial: String
}
object Keyhash {
  
  inline def apply(alg: String, keyhash: String, namehash: String, serial: String): Keyhash = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], keyhash = keyhash.asInstanceOf[js.Any], namehash = namehash.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyhash]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Keyhash] (val x: Self) extends AnyVal {
    
    inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    inline def setKeyhash(value: String): Self = StObject.set(x, "keyhash", value.asInstanceOf[js.Any])
    
    inline def setNamehash(value: String): Self = StObject.set(x, "namehash", value.asInstanceOf[js.Any])
    
    inline def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
  }
}
