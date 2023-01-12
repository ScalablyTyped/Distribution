package typings.jsreportReports

import typings.jsreportCore.mod.ExtensionDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ExtensionDefinition]
  inline def apply(cfg: Configuration): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply(cfg.asInstanceOf[js.Any]).asInstanceOf[ExtensionDefinition]
  
  @JSImport("jsreport-reports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Configuration extends StObject {
    
    var cleanInterval: js.UndefOr[String] = js.undefined
    
    var cleanTreshold: js.UndefOr[String] = js.undefined
  }
  object Configuration {
    
    inline def apply(): Configuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Configuration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      inline def setCleanInterval(value: String): Self = StObject.set(x, "cleanInterval", value.asInstanceOf[js.Any])
      
      inline def setCleanIntervalUndefined: Self = StObject.set(x, "cleanInterval", js.undefined)
      
      inline def setCleanTreshold(value: String): Self = StObject.set(x, "cleanTreshold", value.asInstanceOf[js.Any])
      
      inline def setCleanTresholdUndefined: Self = StObject.set(x, "cleanTreshold", js.undefined)
    }
  }
  
  trait ReportsOptions extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var public: js.UndefOr[Boolean] = js.undefined
    
    var save: js.UndefOr[Boolean] = js.undefined
  }
  object ReportsOptions {
    
    inline def apply(): ReportsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReportsOptions] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      inline def setSave(value: Boolean): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
      
      inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    }
  }
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    trait RequestOptions extends StObject {
      
      var reports: js.UndefOr[ReportsOptions] = js.undefined
    }
    object RequestOptions {
      
      inline def apply(): RequestOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RequestOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
        
        inline def setReports(value: ReportsOptions): Self = StObject.set(x, "reports", value.asInstanceOf[js.Any])
        
        inline def setReportsUndefined: Self = StObject.set(x, "reports", js.undefined)
      }
    }
  }
}
