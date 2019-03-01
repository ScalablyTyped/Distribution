package typings
package iotaDotLibDotJsLib.iotaDotLibDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IotaClass extends js.Object {
  var api: IotaApi
  var multisig: IotaMultisig
  var utils: IotaUtils
  var valid: IotaValid
  var version: java.lang.String
}

object IotaClass {
  @scala.inline
  def apply(
    api: IotaApi,
    multisig: IotaMultisig,
    utils: IotaUtils,
    valid: IotaValid,
    version: java.lang.String
  ): IotaClass = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("api")(api)
    __obj.updateDynamic("multisig")(multisig)
    __obj.updateDynamic("utils")(utils)
    __obj.updateDynamic("valid")(valid)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[IotaClass]
  }
}

