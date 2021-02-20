package typings.karmaNotifyReporter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @js.native
  trait ConfigOptions extends StObject {
    
    /**
      * Report test results using OSX Notification Center, Growl or notify-send.
      * {@link https://github.com/jdcataldo/karma-notify-reporter#karma-notify-reporter}
      */
    var notifyReporter: js.UndefOr[NotifyReporterOptions] = js.native
  }
  object ConfigOptions {
    
    @scala.inline
    def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNotifyReporter(value: NotifyReporterOptions): Self = StObject.set(x, "notifyReporter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotifyReporterUndefined: Self = StObject.set(x, "notifyReporter", js.undefined)
    }
  }
  
  @js.native
  trait NotifyReporterOptions extends StObject {
    
    /**
      * Will notify when a suite was back to successful
      * @default true
      */
    var reportBackToSuccess: js.UndefOr[Boolean] = js.native
    
    /**
      * Will notify on every failed spec
      * @default false
      */
    var reportEachFailure: js.UndefOr[Boolean] = js.native
    
    /**
      * Will notify when a suite was successful
      * @default true
      */
    var reportSuccess: js.UndefOr[Boolean] = js.native
  }
  object NotifyReporterOptions {
    
    @scala.inline
    def apply(): NotifyReporterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotifyReporterOptions]
    }
    
    @scala.inline
    implicit class NotifyReporterOptionsMutableBuilder[Self <: NotifyReporterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReportBackToSuccess(value: Boolean): Self = StObject.set(x, "reportBackToSuccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportBackToSuccessUndefined: Self = StObject.set(x, "reportBackToSuccess", js.undefined)
      
      @scala.inline
      def setReportEachFailure(value: Boolean): Self = StObject.set(x, "reportEachFailure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportEachFailureUndefined: Self = StObject.set(x, "reportEachFailure", js.undefined)
      
      @scala.inline
      def setReportSuccess(value: Boolean): Self = StObject.set(x, "reportSuccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportSuccessUndefined: Self = StObject.set(x, "reportSuccess", js.undefined)
    }
  }
}
