package typings.koaDashBunyanDashLogger.koaDashBunyanDashLoggerMod.koaMod

import typings.bunyan.bunyanMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait BaseContext extends js.Object {
  var log: ^
}

object BaseContext {
  @scala.inline
  def apply(log: ^): BaseContext = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseContext]
  }
}

