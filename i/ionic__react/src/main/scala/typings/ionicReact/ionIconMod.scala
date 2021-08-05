package typings.ionicReact

import typings.ionicReact.anon.IonIconPropsIonicReactPro
import typings.ionicReact.ionicReactStrings.ios
import typings.ionicReact.ionicReactStrings.md
import typings.react.mod.ForwardRefExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionIconMod {
  
  @JSImport("@ionic/react/dist/types/components/IonIcon", "IonIcon")
  @js.native
  val IonIcon: ForwardRefExoticComponent[IonIconPropsIonicReactPro] = js.native
  
  trait IonIconProps extends StObject {
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var flipRtl: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var ios: js.UndefOr[String] = js.undefined
    
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    var md: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[ios | md] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
  }
  object IonIconProps {
    
    inline def apply(): IonIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IonIconProps]
    }
    
    extension [Self <: IonIconProps](x: Self) {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFlipRtl(value: Boolean): Self = StObject.set(x, "flipRtl", value.asInstanceOf[js.Any])
      
      inline def setFlipRtlUndefined: Self = StObject.set(x, "flipRtl", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIos(value: String): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setMd(value: String): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      inline def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
}
