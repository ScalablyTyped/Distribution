package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntraNodeVisibilityConfig extends js.Object {
  
  /** Enables intra node visibility for this cluster. */
  var enabled: js.UndefOr[Boolean] = js.native
}
object IntraNodeVisibilityConfig {
  
  @scala.inline
  def apply(): IntraNodeVisibilityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntraNodeVisibilityConfig]
  }
  
  @scala.inline
  implicit class IntraNodeVisibilityConfigOps[Self <: IntraNodeVisibilityConfig] (val x: Self) extends AnyVal {
    
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
  }
}
