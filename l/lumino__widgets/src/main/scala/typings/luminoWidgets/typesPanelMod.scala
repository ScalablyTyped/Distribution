package typings.luminoWidgets

import typings.luminoWidgets.typesPanelMod.Panel.IOptions
import typings.luminoWidgets.typesPanellayoutMod.PanelLayout
import typings.luminoWidgets.typesWidgetMod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPanelMod {
  
  @JSImport("@lumino/widgets/types/panel", "Panel")
  @js.native
  /**
    * Construct a new panel.
    *
    * @param options - The options for initializing the panel.
    */
  open class Panel () extends Widget {
    def this(options: IOptions) = this()
    
    /**
      * Add a widget to the end of the panel.
      *
      * @param widget - The widget to add to the panel.
      *
      * #### Notes
      * If the widget is already contained in the panel, it will be moved.
      */
    def addWidget(widget: Widget): Unit = js.native
    
    /**
      * Insert a widget at the specified index.
      *
      * @param index - The index at which to insert the widget.
      *
      * @param widget - The widget to insert into to the panel.
      *
      * #### Notes
      * If the widget is already contained in the panel, it will be moved.
      */
    def insertWidget(index: Double, widget: Widget): Unit = js.native
    
    /**
      * A read-only array of the widgets in the panel.
      */
    def widgets: js.Array[Widget] = js.native
  }
  object Panel {
    
    /**
      * An options object for creating a panel.
      */
    trait IOptions extends StObject {
      
      /**
        * The panel layout to use for the panel.
        *
        * The default is a new `PanelLayout`.
        */
      var layout: js.UndefOr[PanelLayout] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setLayout(value: PanelLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
        
        inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      }
    }
  }
}
