package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KubernetesDashboard extends js.Object {
  
  /** Whether the Kubernetes Dashboard is enabled for this cluster. */
  var disabled: js.UndefOr[Boolean] = js.native
}
object KubernetesDashboard {
  
  @scala.inline
  def apply(): KubernetesDashboard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KubernetesDashboard]
  }
  
  @scala.inline
  implicit class KubernetesDashboardOps[Self <: KubernetesDashboard] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
  }
}
