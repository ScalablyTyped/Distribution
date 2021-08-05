package typings.karmaMaterialReporter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  trait ConfigOptions extends StObject {
    
    /**
      * Visualize karma test results in real time with material designed reporter
      * See {@link https://github.com/ameerthehacker/karma-material-reporter#availble-configurations}
      */
    var materialReporter: js.UndefOr[MaterialReporterOptions] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    extension [Self <: ConfigOptions](x: Self) {
      
      inline def setMaterialReporter(value: MaterialReporterOptions): Self = StObject.set(x, "materialReporter", value.asInstanceOf[js.Any])
      
      inline def setMaterialReporterUndefined: Self = StObject.set(x, "materialReporter", js.undefined)
    }
  }
  
  trait MaterialReporterOptions extends StObject {
    
    /**
      * whether to open the reporter UI automatically in the default browser
      * @default true
      */
    var autoOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * expand all the expandable suite menus
      * @default true
      */
    var expandSuites: js.UndefOr[Boolean] = js.undefined
    
    /**
      * port in which the reporter startes a express server
      * @default 3000
      */
    var serverPort: js.UndefOr[Double] = js.undefined
  }
  object MaterialReporterOptions {
    
    inline def apply(): MaterialReporterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaterialReporterOptions]
    }
    
    extension [Self <: MaterialReporterOptions](x: Self) {
      
      inline def setAutoOpen(value: Boolean): Self = StObject.set(x, "autoOpen", value.asInstanceOf[js.Any])
      
      inline def setAutoOpenUndefined: Self = StObject.set(x, "autoOpen", js.undefined)
      
      inline def setExpandSuites(value: Boolean): Self = StObject.set(x, "expandSuites", value.asInstanceOf[js.Any])
      
      inline def setExpandSuitesUndefined: Self = StObject.set(x, "expandSuites", js.undefined)
      
      inline def setServerPort(value: Double): Self = StObject.set(x, "serverPort", value.asInstanceOf[js.Any])
      
      inline def setServerPortUndefined: Self = StObject.set(x, "serverPort", js.undefined)
    }
  }
}
