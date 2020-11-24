package typings.grpcGrpcJs.serviceConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MethodConfig extends js.Object {
  
  var maxRequestBytes: js.UndefOr[Double] = js.native
  
  var maxResponseBytes: js.UndefOr[Double] = js.native
  
  var name: js.Array[MethodConfigName] = js.native
  
  var timeout: js.UndefOr[String] = js.native
  
  var waitForReady: js.UndefOr[Boolean] = js.native
}
object MethodConfig {
  
  @scala.inline
  def apply(name: js.Array[MethodConfigName]): MethodConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodConfig]
  }
  
  @scala.inline
  implicit class MethodConfigOps[Self <: MethodConfig] (val x: Self) extends AnyVal {
    
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
    def setNameVarargs(value: MethodConfigName*): Self = this.set("name", js.Array(value :_*))
    
    @scala.inline
    def setName(value: js.Array[MethodConfigName]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRequestBytes(value: Double): Self = this.set("maxRequestBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRequestBytes: Self = this.set("maxRequestBytes", js.undefined)
    
    @scala.inline
    def setMaxResponseBytes(value: Double): Self = this.set("maxResponseBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResponseBytes: Self = this.set("maxResponseBytes", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setWaitForReady(value: Boolean): Self = this.set("waitForReady", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForReady: Self = this.set("waitForReady", js.undefined)
  }
}
