package typings.ionicCore

import typings.ionicCore.ionicCoreStrings.button
import typings.ionicCore.ionicCoreStrings.reset
import typings.ionicCore.ionicCoreStrings.submit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementInterfaceMod {
  
  trait AnchorInterface extends StObject {
    
    var download: js.UndefOr[String] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var rel: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
  }
  object AnchorInterface {
    
    inline def apply(): AnchorInterface = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnchorInterface]
    }
    
    extension [Self <: AnchorInterface](x: Self) {
      
      inline def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait ButtonInterface extends StObject {
    
    var disabled: Boolean
    
    var `type`: submit | reset | button
  }
  object ButtonInterface {
    
    inline def apply(disabled: Boolean, `type`: submit | reset | button): ButtonInterface = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonInterface]
    }
    
    extension [Self <: ButtonInterface](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setType(value: submit | reset | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
