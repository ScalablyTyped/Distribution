package typings.iotaLibJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IotaClass extends js.Object {
  
  var api: IotaApi = js.native
  
  var multisig: IotaMultisig = js.native
  
  var utils: IotaUtils = js.native
  
  var valid: IotaValid = js.native
  
  var version: String = js.native
}
object IotaClass {
  
  @scala.inline
  def apply(api: IotaApi, multisig: IotaMultisig, utils: IotaUtils, valid: IotaValid, version: String): IotaClass = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], multisig = multisig.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IotaClass]
  }
  
  @scala.inline
  implicit class IotaClassOps[Self <: IotaClass] (val x: Self) extends AnyVal {
    
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
    def setApi(value: IotaApi): Self = this.set("api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultisig(value: IotaMultisig): Self = this.set("multisig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtils(value: IotaUtils): Self = this.set("utils", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid(value: IotaValid): Self = this.set("valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
