package typings.gulpJasmine

import typings.jasmine.jasmine.CustomReporter
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Executes Jasmine tests. Emits a 'jasmineDone' event on success.
    * @param options Optional options for the execution of the Jasmine test
    */
  @scala.inline
  def apply(): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ReadWriteStream]
  @scala.inline
  def apply(options: JasmineOptions): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  
  @JSImport("gulp-jasmine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait JasmineOptions extends StObject {
    
    /**
      * Passes the config to Jasmine's loadConfig method.
      */
    var config: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Stops the stream on failed tests.
      * @default true
      */
    var errorOnFail: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Include stack traces in failures in default reporter.
      * @default false
      */
    var includeStackTrace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Reporter(s) to use.
      */
    var reporter: js.UndefOr[CustomReporter | js.Array[CustomReporter]] = js.undefined
    
    /**
      * Time to wait in milliseconds before a test automatically fails.
      * @default 5000
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      *  Display spec names in default reporter.
      */
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object JasmineOptions {
    
    @scala.inline
    def apply(): JasmineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JasmineOptions]
    }
    
    @scala.inline
    implicit class JasmineOptionsMutableBuilder[Self <: JasmineOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: js.Object): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setErrorOnFail(value: Boolean): Self = StObject.set(x, "errorOnFail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorOnFailUndefined: Self = StObject.set(x, "errorOnFail", js.undefined)
      
      @scala.inline
      def setIncludeStackTrace(value: Boolean): Self = StObject.set(x, "includeStackTrace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeStackTraceUndefined: Self = StObject.set(x, "includeStackTrace", js.undefined)
      
      @scala.inline
      def setReporter(value: CustomReporter | js.Array[CustomReporter]): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
      
      @scala.inline
      def setReporterVarargs(value: CustomReporter*): Self = StObject.set(x, "reporter", js.Array(value :_*))
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
