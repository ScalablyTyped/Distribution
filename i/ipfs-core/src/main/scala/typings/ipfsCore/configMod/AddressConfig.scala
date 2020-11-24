package typings.ipfsCore.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddressConfig extends js.Object {
  
  var API: js.UndefOr[String | js.Array[String]] = js.native
  
  var Delegates: js.UndefOr[js.Array[String]] = js.native
  
  var Gateway: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * *
    */
  var Swarm: js.UndefOr[js.Array[String]] = js.native
}
object AddressConfig {
  
  @scala.inline
  def apply(): AddressConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddressConfig]
  }
  
  @scala.inline
  implicit class AddressConfigOps[Self <: AddressConfig] (val x: Self) extends AnyVal {
    
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
    def setAPIVarargs(value: String*): Self = this.set("API", js.Array(value :_*))
    
    @scala.inline
    def setAPI(value: String | js.Array[String]): Self = this.set("API", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAPI: Self = this.set("API", js.undefined)
    
    @scala.inline
    def setDelegatesVarargs(value: String*): Self = this.set("Delegates", js.Array(value :_*))
    
    @scala.inline
    def setDelegates(value: js.Array[String]): Self = this.set("Delegates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelegates: Self = this.set("Delegates", js.undefined)
    
    @scala.inline
    def setGatewayVarargs(value: String*): Self = this.set("Gateway", js.Array(value :_*))
    
    @scala.inline
    def setGateway(value: String | js.Array[String]): Self = this.set("Gateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGateway: Self = this.set("Gateway", js.undefined)
    
    @scala.inline
    def setSwarmVarargs(value: String*): Self = this.set("Swarm", js.Array(value :_*))
    
    @scala.inline
    def setSwarm(value: js.Array[String]): Self = this.set("Swarm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwarm: Self = this.set("Swarm", js.undefined)
  }
}
