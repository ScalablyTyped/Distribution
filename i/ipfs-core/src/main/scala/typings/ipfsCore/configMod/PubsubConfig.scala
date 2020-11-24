package typings.ipfsCore.configMod

import typings.ipfsCore.ipfsCoreStrings.floodsub
import typings.ipfsCore.ipfsCoreStrings.gossipsub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PubsubConfig extends js.Object {
  
  var Enabled: js.UndefOr[Boolean] = js.native
  
  var Router: js.UndefOr[gossipsub | floodsub] = js.native
}
object PubsubConfig {
  
  @scala.inline
  def apply(): PubsubConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PubsubConfig]
  }
  
  @scala.inline
  implicit class PubsubConfigOps[Self <: PubsubConfig] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    
    @scala.inline
    def setRouter(value: gossipsub | floodsub): Self = this.set("Router", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouter: Self = this.set("Router", js.undefined)
  }
}
