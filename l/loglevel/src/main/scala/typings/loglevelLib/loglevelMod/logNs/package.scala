package typings
package loglevelLib.loglevelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object logNs {
  /**
    * Possible log level descriptors, may be string, lower or upper case, or number.
    */
  type LogLevelDesc = LogLevelNumbers | loglevelLib.loglevelLibStrings.trace | loglevelLib.loglevelLibStrings.debug | loglevelLib.loglevelLibStrings.info | loglevelLib.loglevelLibStrings.warn | loglevelLib.loglevelLibStrings.error | loglevelLib.loglevelLibStrings.silent | loglevelLib.loglevelLibStrings.TRACE | loglevelLib.loglevelLibStrings.DEBUG | loglevelLib.loglevelLibStrings.INFO | loglevelLib.loglevelLibStrings.WARN | loglevelLib.loglevelLibStrings.ERROR | loglevelLib.loglevelLibStrings.SILENT
  /**
    * Possible log level numbers.
    */
  type LogLevelNumbers = loglevelLib.loglevelLibNumbers.`0` | loglevelLib.loglevelLibNumbers.`1` | loglevelLib.loglevelLibNumbers.`2` | loglevelLib.loglevelLibNumbers.`3` | loglevelLib.loglevelLibNumbers.`4` | loglevelLib.loglevelLibNumbers.`5`
  type LoggingMethod = js.Function1[/* repeated */ js.Any, scala.Unit]
  type MethodFactory = js.Function3[
    /* methodName */ java.lang.String, 
    /* level */ LogLevelNumbers, 
    /* loggerName */ java.lang.String, 
    LoggingMethod
  ]
}
