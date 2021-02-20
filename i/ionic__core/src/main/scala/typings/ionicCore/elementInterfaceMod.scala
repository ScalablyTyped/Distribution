package typings.ionicCore

import typings.ionicCore.ionicCoreStrings.button
import typings.ionicCore.ionicCoreStrings.reset
import typings.ionicCore.ionicCoreStrings.submit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementInterfaceMod {
  
  @js.native
  trait AnchorInterface extends StObject {
    
    var download: js.UndefOr[String] = js.native
    
    var href: js.UndefOr[String] = js.native
    
    var rel: js.UndefOr[String] = js.native
    
    var target: js.UndefOr[String] = js.native
  }
  object AnchorInterface {
    
    @scala.inline
    def apply(): AnchorInterface = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnchorInterface]
    }
    
    @scala.inline
    implicit class AnchorInterfaceMutableBuilder[Self <: AnchorInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  @js.native
  trait ButtonInterface extends StObject {
    
    var disabled: Boolean = js.native
    
    var `type`: submit | reset | button = js.native
  }
  object ButtonInterface {
    
    @scala.inline
    def apply(disabled: Boolean, `type`: submit | reset | button): ButtonInterface = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonInterface]
    }
    
    @scala.inline
    implicit class ButtonInterfaceMutableBuilder[Self <: ButtonInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: submit | reset | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
