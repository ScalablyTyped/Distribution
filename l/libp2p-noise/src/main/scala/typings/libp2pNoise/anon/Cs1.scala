package typings.libp2pNoise.anon

import typings.libp2pNoise.handshakeMod.CipherState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cs1 extends js.Object {
  
  var cs1: CipherState = js.native
  
  var cs2: CipherState = js.native
}
object Cs1 {
  
  @scala.inline
  def apply(cs1: CipherState, cs2: CipherState): Cs1 = {
    val __obj = js.Dynamic.literal(cs1 = cs1.asInstanceOf[js.Any], cs2 = cs2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cs1]
  }
  
  @scala.inline
  implicit class Cs1Ops[Self <: Cs1] (val x: Self) extends AnyVal {
    
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
    def setCs1(value: CipherState): Self = this.set("cs1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCs2(value: CipherState): Self = this.set("cs2", value.asInstanceOf[js.Any])
  }
}
