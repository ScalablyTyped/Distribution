package typings.loglevel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loglevelMod {
  type LoggingMethod = js.Function1[/* repeated */ js.Any, Unit]
  type MethodFactory = js.Function3[
    /* methodName */ String, 
    /* level */ LogLevelNumbers, 
    /* loggerName */ String, 
    LoggingMethod
  ]
}
