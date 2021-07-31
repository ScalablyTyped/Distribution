package typings.jsreportReports

import typings.jsreportCore.mod.ExtensionDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ExtensionDefinition]
  @scala.inline
  def apply(cfg: Configuration): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply(cfg.asInstanceOf[js.Any]).asInstanceOf[ExtensionDefinition]
  
  @JSImport("jsreport-reports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Configuration extends StObject {
    
    var cleanInterval: js.UndefOr[String] = js.undefined
    
    var cleanTreshold: js.UndefOr[String] = js.undefined
  }
  object Configuration {
    
    @scala.inline
    def apply(): Configuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Configuration]
    }
    
    @scala.inline
    implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCleanInterval(value: String): Self = StObject.set(x, "cleanInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleanIntervalUndefined: Self = StObject.set(x, "cleanInterval", js.undefined)
      
      @scala.inline
      def setCleanTreshold(value: String): Self = StObject.set(x, "cleanTreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleanTresholdUndefined: Self = StObject.set(x, "cleanTreshold", js.undefined)
    }
  }
  
  trait ReportsOptions extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var public: js.UndefOr[Boolean] = js.undefined
    
    var save: js.UndefOr[Boolean] = js.undefined
  }
  object ReportsOptions {
    
    @scala.inline
    def apply(): ReportsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportsOptions]
    }
    
    @scala.inline
    implicit class ReportsOptionsMutableBuilder[Self <: ReportsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      @scala.inline
      def setSave(value: Boolean): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    }
  }
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    trait Options extends StObject {
      
      var reports: js.UndefOr[ReportsOptions] = js.undefined
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setReports(value: ReportsOptions): Self = StObject.set(x, "reports", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReportsUndefined: Self = StObject.set(x, "reports", js.undefined)
      }
    }
  }
}
