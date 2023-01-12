package typings.i18nextBrowserLanguagedetector

import typings.i18nextBrowserLanguagedetector.mod.DetectorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object esmMod {
  
  /* augmented module */
  object i18nextAugmentingMod {
    
    trait CustomPluginOptions extends StObject {
      
      var detection: js.UndefOr[DetectorOptions] = js.undefined
    }
    object CustomPluginOptions {
      
      inline def apply(): CustomPluginOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CustomPluginOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: CustomPluginOptions] (val x: Self) extends AnyVal {
        
        inline def setDetection(value: DetectorOptions): Self = StObject.set(x, "detection", value.asInstanceOf[js.Any])
        
        inline def setDetectionUndefined: Self = StObject.set(x, "detection", js.undefined)
      }
    }
  }
}
