package typings
package loglevelLib.loglevelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object logNs {
  type LoggingMethod = js.Function1[/* repeated */ js.Any, scala.Unit]
  type MethodFactory = js.Function3[
    /* methodName */ java.lang.String, 
    /* level */ LogLevelNumbers, 
    /* loggerName */ java.lang.String, 
    LoggingMethod
  ]
}
