package typings.ipfsCore.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeychainConfig extends js.Object {
  
  var DEK: typings.ipfsCore.configMod.DEK = js.native
}
object KeychainConfig {
  
  @scala.inline
  def apply(DEK: DEK): KeychainConfig = {
    val __obj = js.Dynamic.literal(DEK = DEK.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeychainConfig]
  }
  
  @scala.inline
  implicit class KeychainConfigOps[Self <: KeychainConfig] (val x: Self) extends AnyVal {
    
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
    def setDEK(value: DEK): Self = this.set("DEK", value.asInstanceOf[js.Any])
  }
}
