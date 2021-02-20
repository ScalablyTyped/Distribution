package typings.luminoWidgets

import typings.luminoWidgets.boxlayoutMod.BoxLayout
import typings.luminoWidgets.boxpanelMod.BoxPanel.Alignment
import typings.luminoWidgets.boxpanelMod.BoxPanel.Direction
import typings.luminoWidgets.boxpanelMod.BoxPanel.IOptions
import typings.luminoWidgets.panelMod.Panel
import typings.luminoWidgets.widgetMod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxpanelMod {
  
  @JSImport("@lumino/widgets/types/boxpanel", "BoxPanel")
  @js.native
  /**
    * Construct a new box panel.
    *
    * @param options - The options for initializing the box panel.
    */
  class BoxPanel () extends Panel {
    def this(options: IOptions) = this()
    
    /**
      * Get the content alignment for the box panel.
      *
      * #### Notes
      * This is the alignment of the widgets in the layout direction.
      *
      * The alignment has no effect if the widgets can expand to fill the
      * entire box layout.
      */
    /**
      * Set the content alignment for the box panel.
      *
      * #### Notes
      * This is the alignment of the widgets in the layout direction.
      *
      * The alignment has no effect if the widgets can expand to fill the
      * entire box layout.
      */
    var alignment: Alignment = js.native
    
    /**
      * Get the layout direction for the box panel.
      */
    /**
      * Set the layout direction for the box panel.
      */
    var direction: Direction = js.native
    
    /**
      * Get the inter-element spacing for the box panel.
      */
    /**
      * Set the inter-element spacing for the box panel.
      */
    var spacing: Double = js.native
  }
  object BoxPanel {
    
    /**
      * Get the box panel size basis for the given widget.
      *
      * @param widget - The widget of interest.
      *
      * @returns The box panel size basis for the widget.
      */
    @JSImport("@lumino/widgets/types/boxpanel", "BoxPanel.getSizeBasis")
    @js.native
    def getSizeBasis(widget: Widget): Double = js.native
    
    /**
      * Get the box panel stretch factor for the given widget.
      *
      * @param widget - The widget of interest.
      *
      * @returns The box panel stretch factor for the widget.
      */
    @JSImport("@lumino/widgets/types/boxpanel", "BoxPanel.getStretch")
    @js.native
    def getStretch(widget: Widget): Double = js.native
    
    /**
      * Set the box panel size basis for the given widget.
      *
      * @param widget - The widget of interest.
      *
      * @param value - The value for the size basis.
      */
    @JSImport("@lumino/widgets/types/boxpanel", "BoxPanel.setSizeBasis")
    @js.native
    def setSizeBasis(widget: Widget, value: Double): Unit = js.native
    
    /**
      * Set the box panel stretch factor for the given widget.
      *
      * @param widget - The widget of interest.
      *
      * @param value - The value for the stretch factor.
      */
    @JSImport("@lumino/widgets/types/boxpanel", "BoxPanel.setStretch")
    @js.native
    def setStretch(widget: Widget, value: Double): Unit = js.native
    
    /**
      * A type alias for a box panel alignment.
      */
    type Alignment = typings.luminoWidgets.boxlayoutMod.BoxLayout.Alignment
    
    /**
      * A type alias for a box panel direction.
      */
    type Direction = typings.luminoWidgets.boxlayoutMod.BoxLayout.Direction
    
    /**
      * An options object for initializing a box panel.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The content alignment of the panel.
        *
        * The default is `'start'`.
        */
      var alignment: js.UndefOr[Alignment] = js.native
      
      /**
        * The layout direction of the panel.
        *
        * The default is `'top-to-bottom'`.
        */
      var direction: js.UndefOr[Direction] = js.native
      
      /**
        * The box layout to use for the box panel.
        *
        * If this is provided, the other options are ignored.
        *
        * The default is a new `BoxLayout`.
        */
      var layout: js.UndefOr[BoxLayout] = js.native
      
      /**
        * The spacing between items in the panel.
        *
        * The default is `4`.
        */
      var spacing: js.UndefOr[Double] = js.native
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
        def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
        
        @scala.inline
        def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
        
        @scala.inline
        def setLayout(value: BoxLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
        
        @scala.inline
        def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      }
    }
  }
}
