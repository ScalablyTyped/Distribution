package typings.hostValidation.mod

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.hostValidation.hostValidationStrings.both
import typings.hostValidation.hostValidationStrings.either
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait config extends js.Object {
  var fail: js.UndefOr[
    js.Function3[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* res */ Response_[_], 
      /* next */ NextFunction, 
      Unit
    ]
  ] = js.undefined
  var hosts: js.UndefOr[js.Array[String | RegExp]] = js.undefined
  var mode: js.UndefOr[both | either] = js.undefined
  var referers: js.UndefOr[js.Array[String | RegExp]] = js.undefined
}

object config {
  @scala.inline
  def apply(
    fail: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], /* next */ NextFunction) => Unit = null,
    hosts: js.Array[String | RegExp] = null,
    mode: both | either = null,
    referers: js.Array[String | RegExp] = null
  ): config = {
    val __obj = js.Dynamic.literal()
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction3(fail))
    if (hosts != null) __obj.updateDynamic("hosts")(hosts.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (referers != null) __obj.updateDynamic("referers")(referers.asInstanceOf[js.Any])
    __obj.asInstanceOf[config]
  }
}

