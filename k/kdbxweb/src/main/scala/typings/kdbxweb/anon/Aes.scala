package typings.kdbxweb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aes extends js.Object {
  
  var Aes: String = js.native
  
  var ChaCha20: String = js.native
}
object Aes {
  
  @scala.inline
  def apply(Aes: String, ChaCha20: String): Aes = {
    val __obj = js.Dynamic.literal(Aes = Aes.asInstanceOf[js.Any], ChaCha20 = ChaCha20.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aes]
  }
  
  @scala.inline
  implicit class AesOps[Self <: Aes] (val x: Self) extends AnyVal {
    
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
    def setAes(value: String): Self = this.set("Aes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChaCha20(value: String): Self = this.set("ChaCha20", value.asInstanceOf[js.Any])
  }
}
