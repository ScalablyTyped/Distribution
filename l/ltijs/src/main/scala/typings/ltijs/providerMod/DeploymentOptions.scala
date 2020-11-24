package typings.ltijs.providerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentOptions extends js.Object {
  
  var port: js.UndefOr[Double] = js.native
  
  var serverless: js.UndefOr[Boolean] = js.native
  
  var silent: js.UndefOr[Boolean] = js.native
}
object DeploymentOptions {
  
  @scala.inline
  def apply(): DeploymentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentOptions]
  }
  
  @scala.inline
  implicit class DeploymentOptionsOps[Self <: DeploymentOptions] (val x: Self) extends AnyVal {
    
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
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setServerless(value: Boolean): Self = this.set("serverless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerless: Self = this.set("serverless", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
  }
}
