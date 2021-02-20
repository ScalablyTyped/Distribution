package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Namehash extends StObject {
  
  var alg: String = js.native
  
  var keyhash: String = js.native
  
  var namehash: String = js.native
  
  var serial: String = js.native
}
object Namehash {
  
  @scala.inline
  def apply(alg: String, keyhash: String, namehash: String, serial: String): Namehash = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], keyhash = keyhash.asInstanceOf[js.Any], namehash = namehash.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
    __obj.asInstanceOf[Namehash]
  }
  
  @scala.inline
  implicit class NamehashMutableBuilder[Self <: Namehash] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyhash(value: String): Self = StObject.set(x, "keyhash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamehash(value: String): Self = StObject.set(x, "namehash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
  }
}
