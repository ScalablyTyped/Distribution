package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpgradeSettings extends js.Object {
  
  /** The maximum number of nodes that can be created beyond the current size of the node pool during the upgrade process. */
  var maxSurge: js.UndefOr[Double] = js.native
  
  /** The maximum number of nodes that can be simultaneously unavailable during the upgrade process. A node is considered available if its status is Ready. */
  var maxUnavailable: js.UndefOr[Double] = js.native
}
object UpgradeSettings {
  
  @scala.inline
  def apply(): UpgradeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeSettings]
  }
  
  @scala.inline
  implicit class UpgradeSettingsOps[Self <: UpgradeSettings] (val x: Self) extends AnyVal {
    
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
    def setMaxSurge(value: Double): Self = this.set("maxSurge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSurge: Self = this.set("maxSurge", js.undefined)
    
    @scala.inline
    def setMaxUnavailable(value: Double): Self = this.set("maxUnavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxUnavailable: Self = this.set("maxUnavailable", js.undefined)
  }
}
