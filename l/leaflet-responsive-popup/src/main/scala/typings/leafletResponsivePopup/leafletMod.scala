package typings.leafletResponsivePopup

import typings.leaflet.mod.Layer
import typings.leaflet.mod.PopupOptions
import typings.leaflet.mod.Popup_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  @JSImport("leaflet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("leaflet", "ResponsivePopup")
  @js.native
  open class ResponsivePopup_ () extends Popup_ {
    def this(options: ResponsivePopupOptions) = this()
    def this(options: Unit, source: Layer) = this()
    def this(options: ResponsivePopupOptions, source: Layer) = this()
  }
  
  inline def responsivePopup(options: js.UndefOr[ResponsivePopupOptions], source: js.UndefOr[Layer]): ResponsivePopup_ = (^.asInstanceOf[js.Dynamic].applyDynamic("responsivePopup")(options.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[ResponsivePopup_]
  
  trait ResponsivePopupOptions
    extends StObject
       with PopupOptions {
    
    var hasTip: js.UndefOr[Boolean] = js.undefined
  }
  object ResponsivePopupOptions {
    
    inline def apply(): ResponsivePopupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsivePopupOptions]
    }
    
    extension [Self <: ResponsivePopupOptions](x: Self) {
      
      inline def setHasTip(value: Boolean): Self = StObject.set(x, "hasTip", value.asInstanceOf[js.Any])
      
      inline def setHasTipUndefined: Self = StObject.set(x, "hasTip", js.undefined)
    }
  }
}
