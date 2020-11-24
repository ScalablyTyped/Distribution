package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Keychain extends js.Object {
  
  var keychain: js.Any = js.native
}
object Keychain {
  
  @scala.inline
  def apply(keychain: js.Any): Keychain = {
    val __obj = js.Dynamic.literal(keychain = keychain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keychain]
  }
  
  @scala.inline
  implicit class KeychainOps[Self <: Keychain] (val x: Self) extends AnyVal {
    
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
    def setKeychain(value: js.Any): Self = this.set("keychain", value.asInstanceOf[js.Any])
  }
}
