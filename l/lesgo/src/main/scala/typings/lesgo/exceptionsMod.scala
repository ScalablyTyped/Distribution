package typings.lesgo

import typings.lesgo.exceptionsLesgoExceptionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exceptionsMod {
  
  @JSImport("lesgo/exceptions", "LesgoException")
  @js.native
  open class LesgoException protected () extends default {
    def this(message: String) = this()
    def this(message: String, errorCode: String) = this()
    def this(message: String, errorCode: String, httpStatusCode: Double) = this()
    def this(message: String, errorCode: Unit, httpStatusCode: Double) = this()
    def this(message: String, errorCode: String, httpStatusCode: Double, extra: Any) = this()
    def this(message: String, errorCode: String, httpStatusCode: Unit, extra: Any) = this()
    def this(message: String, errorCode: Unit, httpStatusCode: Double, extra: Any) = this()
    def this(message: String, errorCode: Unit, httpStatusCode: Unit, extra: Any) = this()
  }
}
