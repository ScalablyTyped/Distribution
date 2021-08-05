package typings.karmaNotifyReporter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  trait ConfigOptions extends StObject {
    
    /**
      * Report test results using OSX Notification Center, Growl or notify-send.
      * {@link https://github.com/jdcataldo/karma-notify-reporter#karma-notify-reporter}
      */
    var notifyReporter: js.UndefOr[NotifyReporterOptions] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    extension [Self <: ConfigOptions](x: Self) {
      
      inline def setNotifyReporter(value: NotifyReporterOptions): Self = StObject.set(x, "notifyReporter", value.asInstanceOf[js.Any])
      
      inline def setNotifyReporterUndefined: Self = StObject.set(x, "notifyReporter", js.undefined)
    }
  }
  
  trait NotifyReporterOptions extends StObject {
    
    /**
      * Will notify when a suite was back to successful
      * @default true
      */
    var reportBackToSuccess: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Will notify on every failed spec
      * @default false
      */
    var reportEachFailure: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Will notify when a suite was successful
      * @default true
      */
    var reportSuccess: js.UndefOr[Boolean] = js.undefined
  }
  object NotifyReporterOptions {
    
    inline def apply(): NotifyReporterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotifyReporterOptions]
    }
    
    extension [Self <: NotifyReporterOptions](x: Self) {
      
      inline def setReportBackToSuccess(value: Boolean): Self = StObject.set(x, "reportBackToSuccess", value.asInstanceOf[js.Any])
      
      inline def setReportBackToSuccessUndefined: Self = StObject.set(x, "reportBackToSuccess", js.undefined)
      
      inline def setReportEachFailure(value: Boolean): Self = StObject.set(x, "reportEachFailure", value.asInstanceOf[js.Any])
      
      inline def setReportEachFailureUndefined: Self = StObject.set(x, "reportEachFailure", js.undefined)
      
      inline def setReportSuccess(value: Boolean): Self = StObject.set(x, "reportSuccess", value.asInstanceOf[js.Any])
      
      inline def setReportSuccessUndefined: Self = StObject.set(x, "reportSuccess", js.undefined)
    }
  }
}
