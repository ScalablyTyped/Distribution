package typings.logProcessErrors

import typings.logProcessErrors.logProcessErrorsStrings.default
import typings.logProcessErrors.logProcessErrorsStrings.silent
import typings.logProcessErrors.mod.LogLevel
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<std.Record<log-process-errors.log-process-errors.ExceptionType, log-process-errors.log-process-errors.LogLevel>> & {  default :(error : std.Error): 'silent' | 'default' | undefined} */
  trait PartialRecordExceptionTyp extends StObject {
    
    var default: js.UndefOr[
        js.Function1[
          /* error */ Error, 
          silent | typings.logProcessErrors.logProcessErrorsStrings.default
        ]
      ] = js.undefined
    
    var multipleResolves: js.UndefOr[LogLevel] = js.undefined
    
    var rejectionHandled: js.UndefOr[LogLevel] = js.undefined
    
    var uncaughtException: js.UndefOr[LogLevel] = js.undefined
    
    var unhandledRejection: js.UndefOr[LogLevel] = js.undefined
    
    var warning: js.UndefOr[LogLevel] = js.undefined
  }
  object PartialRecordExceptionTyp {
    
    @scala.inline
    def apply(): PartialRecordExceptionTyp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordExceptionTyp]
    }
    
    @scala.inline
    implicit class PartialRecordExceptionTypMutableBuilder[Self <: PartialRecordExceptionTyp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: /* error */ Error => silent | default): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setMultipleResolves(value: LogLevel): Self = StObject.set(x, "multipleResolves", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleResolvesUndefined: Self = StObject.set(x, "multipleResolves", js.undefined)
      
      @scala.inline
      def setRejectionHandled(value: LogLevel): Self = StObject.set(x, "rejectionHandled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectionHandledUndefined: Self = StObject.set(x, "rejectionHandled", js.undefined)
      
      @scala.inline
      def setUncaughtException(value: LogLevel): Self = StObject.set(x, "uncaughtException", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUncaughtExceptionUndefined: Self = StObject.set(x, "uncaughtException", js.undefined)
      
      @scala.inline
      def setUnhandledRejection(value: LogLevel): Self = StObject.set(x, "unhandledRejection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnhandledRejectionUndefined: Self = StObject.set(x, "unhandledRejection", js.undefined)
      
      @scala.inline
      def setWarning(value: LogLevel): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
}
