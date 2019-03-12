package typings
package hostDashValidationLib.hostDashValidationMod.hostValidationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait config extends js.Object {
  var fail: js.UndefOr[
    js.Function3[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* res */ expressLib.expressMod.eNs.Response, 
      /* next */ expressLib.expressMod.eNs.NextFunction, 
      scala.Unit
    ]
  ] = js.undefined
  var hosts: js.UndefOr[js.Array[java.lang.String | stdLib.RegExp]] = js.undefined
  var mode: js.UndefOr[
    hostDashValidationLib.hostDashValidationLibStrings.both | hostDashValidationLib.hostDashValidationLibStrings.either
  ] = js.undefined
  var referers: js.UndefOr[js.Array[java.lang.String | stdLib.RegExp]] = js.undefined
}

object config {
  @scala.inline
  def apply(
    fail: (/* req */ expressLib.expressMod.eNs.Request, /* res */ expressLib.expressMod.eNs.Response, /* next */ expressLib.expressMod.eNs.NextFunction) => scala.Unit = null,
    hosts: js.Array[java.lang.String | stdLib.RegExp] = null,
    mode: hostDashValidationLib.hostDashValidationLibStrings.both | hostDashValidationLib.hostDashValidationLibStrings.either = null,
    referers: js.Array[java.lang.String | stdLib.RegExp] = null
  ): config = {
    val __obj = js.Dynamic.literal()
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction3(fail))
    if (hosts != null) __obj.updateDynamic("hosts")(hosts)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (referers != null) __obj.updateDynamic("referers")(referers)
    __obj.asInstanceOf[config]
  }
}

