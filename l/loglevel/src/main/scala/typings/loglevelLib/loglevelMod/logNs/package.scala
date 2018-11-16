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
  type LogLevelNumbers = /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(loglevel), TsIdentModule(None,List(loglevel)), TsIdentNamespace(log), TsIdentSimple(LogLevel))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(loglevel), TsIdentModule(None,List(loglevel)), TsIdentNamespace(log), TsIdentSimple(LogLevel))),List())))) */js.Any
  type LoggingMethod = js.Function1[/* repeated */js.Any, scala.Unit]
  type MethodFactory = js.Function3[
    /* methodName */ java.lang.String, 
    /* level */ LogLevelNumbers, 
    /* loggerName */ java.lang.String, 
    LoggingMethod
  ]
}
