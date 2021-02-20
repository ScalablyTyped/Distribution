package typings.ionicReact

import typings.ionicReact.anon.IonIconPropsIonicReactPro
import typings.ionicReact.ionicReactStrings.ios
import typings.ionicReact.ionicReactStrings.md
import typings.react.mod.ForwardRefExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionIconMod {
  
  @JSImport("@ionic/react/dist/types/components/IonIcon", "IonIcon")
  @js.native
  val IonIcon: ForwardRefExoticComponent[IonIconPropsIonicReactPro] = js.native
  
  @js.native
  trait IonIconProps extends StObject {
    
    var ariaLabel: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var flipRtl: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[String] = js.native
    
    var ios: js.UndefOr[String] = js.native
    
    var `lazy`: js.UndefOr[Boolean] = js.native
    
    var md: js.UndefOr[String] = js.native
    
    var mode: js.UndefOr[ios | md] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[String] = js.native
    
    var src: js.UndefOr[String] = js.native
  }
  object IonIconProps {
    
    @scala.inline
    def apply(): IonIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IonIconProps]
    }
    
    @scala.inline
    implicit class IonIconPropsMutableBuilder[Self <: IonIconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFlipRtl(value: Boolean): Self = StObject.set(x, "flipRtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipRtlUndefined: Self = StObject.set(x, "flipRtl", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIos(value: String): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
      
      @scala.inline
      def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      @scala.inline
      def setMd(value: String): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      @scala.inline
      def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
}
