package typings
package jsreportDashCoreLib.jsreportDashCoreMod.JsReportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListenerCollection extends js.Object {
  def add(
    `type`: java.lang.String,
    callback: js.Function3[
      /* req */ Request, 
      /* res */ Response, 
      /* err */ js.UndefOr[js.Any], 
      stdLib.Promise[_] | scala.Unit
    ]
  ): scala.Unit
}

