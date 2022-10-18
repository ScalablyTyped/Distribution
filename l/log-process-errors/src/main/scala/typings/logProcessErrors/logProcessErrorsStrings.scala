package typings.logProcessErrors

import typings.logProcessErrors.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logProcessErrorsStrings {
  
  @js.native
  sealed trait rejectionHandled
    extends StObject
       with Event
  inline def rejectionHandled: rejectionHandled = "rejectionHandled".asInstanceOf[rejectionHandled]
  
  @js.native
  sealed trait uncaughtException
    extends StObject
       with Event
  inline def uncaughtException: uncaughtException = "uncaughtException".asInstanceOf[uncaughtException]
  
  @js.native
  sealed trait unhandledRejection
    extends StObject
       with Event
  inline def unhandledRejection: unhandledRejection = "unhandledRejection".asInstanceOf[unhandledRejection]
  
  @js.native
  sealed trait warning
    extends StObject
       with Event
  inline def warning: warning = "warning".asInstanceOf[warning]
}
