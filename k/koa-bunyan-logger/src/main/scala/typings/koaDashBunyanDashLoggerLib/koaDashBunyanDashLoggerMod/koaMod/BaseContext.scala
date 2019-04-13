package typings
package koaDashBunyanDashLoggerLib.koaDashBunyanDashLoggerMod.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait BaseContext extends js.Object {
  var log: bunyanLib.bunyanMod.^
}

object BaseContext {
  @scala.inline
  def apply(log: bunyanLib.bunyanMod.^): BaseContext = {
    val __obj = js.Dynamic.literal(log = log)
  
    __obj.asInstanceOf[BaseContext]
  }
}

