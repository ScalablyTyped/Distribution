package typings.luminoWidgets

import typings.luminoWidgets.panellayoutMod.PanelLayout
import typings.luminoWidgets.stackedlayoutMod.StackedLayout.IOptions
import typings.luminoWidgets.widgetMod.Widget.HiddenMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackedlayoutMod {
  
  @JSImport("@lumino/widgets/types/stackedlayout", "StackedLayout")
  @js.native
  open class StackedLayout () extends PanelLayout {
    def this(options: IOptions) = this()
    
    /* private */ var _box: Any = js.native
    
    /* private */ var _dirty: Any = js.native
    
    /**
      * Fit the layout to the total size required by the widgets.
      */
    /* private */ var _fit: Any = js.native
    
    /* private */ var _hiddenMode: Any = js.native
    
    /* private */ var _items: Any = js.native
    
    /**
      * Update the layout position and size of the widgets.
      *
      * The parent offset dimensions should be `-1` if unknown.
      */
    /* private */ var _update: Any = js.native
    
    /**
      * The method for hiding widgets.
      *
      * #### Notes
      * If there is only one child widget, `Display` hiding mode will be used
      * regardless of this setting.
      */
    /**
      * Set the method for hiding widgets.
      *
      * #### Notes
      * If there is only one child widget, `Display` hiding mode will be used
      * regardless of this setting.
      */
    var hiddenMode: HiddenMode = js.native
  }
  object StackedLayout {
    
    /**
      * An options object for initializing a stacked layout.
      */
    trait IOptions
      extends StObject
         with typings.luminoWidgets.layoutMod.Layout.IOptions {
      
      /**
        * The method for hiding widgets.
        *
        * The default is `Widget.HiddenMode.Display`.
        */
      var hiddenMode: js.UndefOr[HiddenMode] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setHiddenMode(value: HiddenMode): Self = StObject.set(x, "hiddenMode", value.asInstanceOf[js.Any])
        
        inline def setHiddenModeUndefined: Self = StObject.set(x, "hiddenMode", js.undefined)
      }
    }
  }
}
