package typings.iotaLibJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IotaClass extends js.Object {
  var api: IotaApi
  var multisig: IotaMultisig
  var utils: IotaUtils
  var valid: IotaValid
  var version: String
}

object IotaClass {
  @scala.inline
  def apply(api: IotaApi, multisig: IotaMultisig, utils: IotaUtils, valid: IotaValid, version: String): IotaClass = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], multisig = multisig.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IotaClass]
  }
}

