package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Keyhash extends js.Object {
  
  var alg: String = js.native
  
  var keyhash: String = js.native
  
  var namehash: String = js.native
  
  var serial: String = js.native
}
object Keyhash {
  
  @scala.inline
  def apply(alg: String, keyhash: String, namehash: String, serial: String): Keyhash = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], keyhash = keyhash.asInstanceOf[js.Any], namehash = namehash.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyhash]
  }
  
  @scala.inline
  implicit class KeyhashOps[Self <: Keyhash] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlg(value: String): Self = this.set("alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyhash(value: String): Self = this.set("keyhash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamehash(value: String): Self = this.set("namehash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerial(value: String): Self = this.set("serial", value.asInstanceOf[js.Any])
  }
}
