package typings.iotaDotLibDotJs.iotaDotLibDotJsMod

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
    val __obj = js.Dynamic.literal(api = api, multisig = multisig, utils = utils, valid = valid, version = version)
  
    __obj.asInstanceOf[IotaClass]
  }
}

