package typings.jsreportReports

import typings.jsreportCore.mod.ExtensionDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsreport-reports", JSImport.Namespace)
  @js.native
  def apply(): ExtensionDefinition = js.native
  @JSImport("jsreport-reports", JSImport.Namespace)
  @js.native
  def apply(cfg: Configuration): ExtensionDefinition = js.native
  
  @js.native
  trait Configuration extends StObject {
    
    var cleanInterval: js.UndefOr[String] = js.native
    
    var cleanTreshold: js.UndefOr[String] = js.native
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
  
  @js.native
  trait ReportsOptions extends StObject {
    
    var async: js.UndefOr[Boolean] = js.native
    
    var public: js.UndefOr[Boolean] = js.native
    
    var save: js.UndefOr[Boolean] = js.native
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
    
    @js.native
    trait Options extends StObject {
      
      var reports: js.UndefOr[ReportsOptions] = js.native
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
