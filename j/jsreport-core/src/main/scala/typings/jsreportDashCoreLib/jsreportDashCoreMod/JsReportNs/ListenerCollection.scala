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
      js.Promise[_] | scala.Unit
    ]
  ): scala.Unit
}

object ListenerCollection {
  @scala.inline
  def apply(
    add: (java.lang.String, js.Function3[
      /* req */ Request, 
      /* res */ Response, 
      /* err */ js.UndefOr[js.Any], 
      js.Promise[_] | scala.Unit
    ]) => scala.Unit
  ): ListenerCollection = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add))
  
    __obj.asInstanceOf[ListenerCollection]
  }
}

