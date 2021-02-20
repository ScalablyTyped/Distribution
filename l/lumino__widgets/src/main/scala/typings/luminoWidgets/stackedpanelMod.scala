package typings.luminoWidgets

import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.panelMod.Panel
import typings.luminoWidgets.stackedlayoutMod.StackedLayout
import typings.luminoWidgets.stackedpanelMod.StackedPanel.IOptions
import typings.luminoWidgets.widgetMod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackedpanelMod {
  
  @JSImport("@lumino/widgets/types/stackedpanel", "StackedPanel")
  @js.native
  /**
    * Construct a new stacked panel.
    *
    * @param options - The options for initializing the panel.
    */
  class StackedPanel () extends Panel {
    def this(options: IOptions) = this()
    
    var _widgetRemoved: js.Any = js.native
    
    /**
      * A signal emitted when a widget is removed from a stacked panel.
      */
    val widgetRemoved: ISignal[this.type, Widget] = js.native
  }
  object StackedPanel {
    
    /**
      * An options object for creating a stacked panel.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The stacked layout to use for the stacked panel.
        *
        * The default is a new `StackedLayout`.
        */
      var layout: js.UndefOr[StackedLayout] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLayout(value: StackedLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      }
    }
  }
}
