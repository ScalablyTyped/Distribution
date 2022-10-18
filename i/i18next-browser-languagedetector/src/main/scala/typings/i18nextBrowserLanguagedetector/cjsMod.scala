package typings.i18nextBrowserLanguagedetector

import typings.i18nextBrowserLanguagedetector.mod.DetectorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object cjsMod {
  
  @JSImport("i18next-browser-languagedetector/cjs", JSImport.Default)
  @js.native
  open class default ()
    extends typings.i18nextBrowserLanguagedetector.mod.default {
    def this(services: Any) = this()
    def this(services: Any, options: DetectorOptions) = this()
    def this(services: Unit, options: DetectorOptions) = this()
  }
  
  /* augmented module */
  object i18nextAugmentingMod {
    
    trait PluginOptions extends StObject {
      
      var detection: js.UndefOr[DetectorOptions] = js.undefined
    }
    object PluginOptions {
      
      inline def apply(): PluginOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PluginOptions]
      }
      
      extension [Self <: PluginOptions](x: Self) {
        
        inline def setDetection(value: DetectorOptions): Self = StObject.set(x, "detection", value.asInstanceOf[js.Any])
        
        inline def setDetectionUndefined: Self = StObject.set(x, "detection", js.undefined)
      }
    }
  }
}
