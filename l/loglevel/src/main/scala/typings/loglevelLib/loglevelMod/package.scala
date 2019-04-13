package typings
package loglevelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loglevelMod {
  type LoggingMethod = js.Function1[/* repeated */ js.Any, scala.Unit]
  type MethodFactory = js.Function3[
    /* methodName */ java.lang.String, 
    /* level */ LogLevelNumbers, 
    /* loggerName */ java.lang.String, 
    LoggingMethod
  ]
}
