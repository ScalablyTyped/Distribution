package typings.kdbxweb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Argon2 extends js.Object {
  
  var Aes: String = js.native
  
  var Argon2: String = js.native
}
object Argon2 {
  
  @scala.inline
  def apply(Aes: String, Argon2: String): Argon2 = {
    val __obj = js.Dynamic.literal(Aes = Aes.asInstanceOf[js.Any], Argon2 = Argon2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argon2]
  }
  
  @scala.inline
  implicit class Argon2Ops[Self <: Argon2] (val x: Self) extends AnyVal {
    
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
    def setArgon2(value: String): Self = this.set("Argon2", value.asInstanceOf[js.Any])
  }
}
