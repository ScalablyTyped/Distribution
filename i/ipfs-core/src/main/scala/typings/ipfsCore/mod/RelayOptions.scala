package typings.ipfsCore.mod

import typings.ipfsCore.anon.Active
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelayOptions extends js.Object {
  
  /**
    * - Enable circuit relay dialer and listener. (Default: `true`)
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  var hop: js.UndefOr[Active] = js.native
}
object RelayOptions {
  
  @scala.inline
  def apply(): RelayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelayOptions]
  }
  
  @scala.inline
  implicit class RelayOptionsOps[Self <: RelayOptions] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setHop(value: Active): Self = this.set("hop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHop: Self = this.set("hop", js.undefined)
  }
}
