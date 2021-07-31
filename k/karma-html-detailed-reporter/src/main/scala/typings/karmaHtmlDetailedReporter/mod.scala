package typings.karmaHtmlDetailedReporter

import typings.karmaHtmlDetailedReporter.karmaHtmlDetailedReporterStrings.`type`
import typings.karmaHtmlDetailedReporter.karmaHtmlDetailedReporterStrings.factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("karma-html-detailed-reporter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("karma-html-detailed-reporter", "preprocessor:htmlDetailed")
  @js.native
  def preprocessorHtmlDetailed: js.Tuple2[factory, js.Any] = js.native
  
  @scala.inline
  def preprocessorHtmlDetailed_=(x: js.Tuple2[factory, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preprocessor:htmlDetailed")(x.asInstanceOf[js.Any])
  
  @JSImport("karma-html-detailed-reporter", "reporter:htmlDetailed")
  @js.native
  def reporterHtmlDetailed: js.Tuple2[`type`, js.Any] = js.native
  
  @scala.inline
  def reporterHtmlDetailed_=(x: js.Tuple2[`type`, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reporter:htmlDetailed")(x.asInstanceOf[js.Any])
  
  /* augmented module */
  object karmaAugmentingMod {
    
    trait ConfigOptions extends StObject {
      
      /**
        * The reporter provides a dashboard detailing specification runs
        * see {@link https://github.com/a11smiles/karma-html-detailed-reporter#options}
        */
      var htmlDetailed: js.UndefOr[HtmlDetailedOptions] = js.undefined
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
        def setHtmlDetailed(value: HtmlDetailedOptions): Self = StObject.set(x, "htmlDetailed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHtmlDetailedUndefined: Self = StObject.set(x, "htmlDetailed", js.undefined)
      }
    }
    
    /**
      * see {@link https://github.com/a11smiles/karma-html-detailed-reporter#options}
      */
    trait HtmlDetailedOptions extends StObject {
      
      /**
        * Enables/disables the refresh to start automatically
        * @default true
        */
      var autoReload: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Sets the reports output base path
        * @default './_reports'
        */
      var dir: js.UndefOr[String] = js.undefined
      
      /**
        * Sets the refresh timeout (in milliseconds) for the page
        * @default 1000
        */
      var refreshTimeout: js.UndefOr[Double] = js.undefined
      
      /**
        * Determines whether the detailed results of the failed tests are default shown or hidden in the browser (you are able to toggle live in the browser)
        * @default true
        */
      var showFailed: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Determines whether the detailed results of the skipped tests are default shown or hidden in the browser (you are able to toggle live in the browser)
        * @default true
        */
      var showSkipped: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Determines whether the detailed results of the successfull tests are default shown or hidden in the browser (you are able to toggle live in the browser)
        * @default true
        */
      var showSuccess: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Determines whether the results are split into a separate file for each browser
        * @default true
        */
      var splitResults: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Determines whether to use the hosted versions of Boostrap and jQuery. If testing within a CI build (e.g. TFS, Jenkins, TeamCity),
        * setting this to true would allow you to see the reports while the builders do not maintain node modules.
        * @default false
        */
      var useHostedBootstrap: js.UndefOr[Boolean] = js.undefined
    }
    object HtmlDetailedOptions {
      
      @scala.inline
      def apply(): HtmlDetailedOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HtmlDetailedOptions]
      }
      
      @scala.inline
      implicit class HtmlDetailedOptionsMutableBuilder[Self <: HtmlDetailedOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAutoReload(value: Boolean): Self = StObject.set(x, "autoReload", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoReloadUndefined: Self = StObject.set(x, "autoReload", js.undefined)
        
        @scala.inline
        def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
        
        @scala.inline
        def setRefreshTimeout(value: Double): Self = StObject.set(x, "refreshTimeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRefreshTimeoutUndefined: Self = StObject.set(x, "refreshTimeout", js.undefined)
        
        @scala.inline
        def setShowFailed(value: Boolean): Self = StObject.set(x, "showFailed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowFailedUndefined: Self = StObject.set(x, "showFailed", js.undefined)
        
        @scala.inline
        def setShowSkipped(value: Boolean): Self = StObject.set(x, "showSkipped", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowSkippedUndefined: Self = StObject.set(x, "showSkipped", js.undefined)
        
        @scala.inline
        def setShowSuccess(value: Boolean): Self = StObject.set(x, "showSuccess", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowSuccessUndefined: Self = StObject.set(x, "showSuccess", js.undefined)
        
        @scala.inline
        def setSplitResults(value: Boolean): Self = StObject.set(x, "splitResults", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSplitResultsUndefined: Self = StObject.set(x, "splitResults", js.undefined)
        
        @scala.inline
        def setUseHostedBootstrap(value: Boolean): Self = StObject.set(x, "useHostedBootstrap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseHostedBootstrapUndefined: Self = StObject.set(x, "useHostedBootstrap", js.undefined)
      }
    }
  }
}
