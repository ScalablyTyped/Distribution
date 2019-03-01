package typings
package koaDashBunyanDashLoggerLib.koaDashBunyanDashLoggerMod.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait BaseContext extends js.Object {
  var log: bunyanLib.bunyanMod.namespaced
}

object BaseContext {
  @scala.inline
  def apply(log: bunyanLib.bunyanMod.namespaced): BaseContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("log")(log)
    __obj.asInstanceOf[BaseContext]
  }
}

