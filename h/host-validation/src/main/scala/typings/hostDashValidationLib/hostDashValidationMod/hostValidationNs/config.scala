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

