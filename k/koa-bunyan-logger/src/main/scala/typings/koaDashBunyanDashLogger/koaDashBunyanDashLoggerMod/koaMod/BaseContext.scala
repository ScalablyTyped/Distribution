package typings.koaDashBunyanDashLogger.koaDashBunyanDashLoggerMod.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait BaseContext extends js.Object {
  var log: typings.bunyan.bunyanMod.^
}

object BaseContext {
  @scala.inline
  def apply(log: typings.bunyan.bunyanMod.^): BaseContext = {
    val __obj = js.Dynamic.literal(log = log)
  
    __obj.asInstanceOf[BaseContext]
  }
}

