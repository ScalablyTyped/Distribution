package typings.javascriptDashObfuscator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator/src/interfaces/logger/ILogger", JSImport.Namespace)
@js.native
object srcInterfacesLoggerILoggerMod extends js.Object {
  @js.native
  trait ILogger extends js.Object {
    /**
      * @param {LoggingMessage} loggingMessage
      * @param {string | number} value
      */
    def info(
      loggingMessage: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LoggingMessage */ js.Any
    ): Unit = js.native
    def info(
      loggingMessage: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LoggingMessage */ js.Any,
      value: String
    ): Unit = js.native
    def info(
      loggingMessage: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LoggingMessage */ js.Any,
      value: Double
    ): Unit = js.native
    /**
      * @param {LoggingMessage} loggingMessage
      * @param {string | number} value
      */
    def success(
      loggingMessage: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LoggingMessage */ js.Any
    ): Unit = js.native
    def success(
      loggingMessage: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LoggingMessage */ js.Any,
      value: String
    ): Unit = js.native
    def success(
      loggingMessage: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LoggingMessage */ js.Any,
      value: Double
    ): Unit = js.native
    /**
      * @param {LoggingMessage} loggingMessage
      * @param {string | number} value
      */
    def warn(
      loggingMessage: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LoggingMessage */ js.Any
    ): Unit = js.native
    def warn(
      loggingMessage: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LoggingMessage */ js.Any,
      value: String
    ): Unit = js.native
    def warn(
      loggingMessage: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LoggingMessage */ js.Any,
      value: Double
    ): Unit = js.native
  }
  
}

