package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateFamilyConfig extends js.Object {
  
  /** If true, this family corresponds to a read operation. */
  var isRead: js.UndefOr[Boolean] = js.native
  
  /** The state family value. */
  var stateFamily: js.UndefOr[String] = js.native
}
object StateFamilyConfig {
  
  @scala.inline
  def apply(): StateFamilyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateFamilyConfig]
  }
  
  @scala.inline
  implicit class StateFamilyConfigOps[Self <: StateFamilyConfig] (val x: Self) extends AnyVal {
    
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
    def setIsRead(value: Boolean): Self = this.set("isRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRead: Self = this.set("isRead", js.undefined)
    
    @scala.inline
    def setStateFamily(value: String): Self = this.set("stateFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateFamily: Self = this.set("stateFamily", js.undefined)
  }
}
