package typings.luminoWidgets

import typings.luminoWidgets.boxlayoutMod.BoxLayout
import typings.luminoWidgets.boxpanelMod.BoxPanel.Alignment
import typings.luminoWidgets.boxpanelMod.BoxPanel.Direction
import typings.luminoWidgets.boxpanelMod.BoxPanel.IOptions
import typings.luminoWidgets.panelMod.Panel
import typings.luminoWidgets.widgetMod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@lumino/widgets/types/boxpanel", "BoxPanel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get the box panel size basis for the given widget.
      *
      * @param widget - The widget of interest.
      *
      * @returns The box panel size basis for the widget.
      */
    inline def getSizeBasis(widget: Widget): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSizeBasis")(widget.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Get the box panel stretch factor for the given widget.
      *
      * @param widget - The widget of interest.
      *
      * @returns The box panel stretch factor for the widget.
      */
    inline def getStretch(widget: Widget): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStretch")(widget.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Set the box panel size basis for the given widget.
      *
      * @param widget - The widget of interest.
      *
      * @param value - The value for the size basis.
      */
    inline def setSizeBasis(widget: Widget, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSizeBasis")(widget.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Set the box panel stretch factor for the given widget.
      *
      * @param widget - The widget of interest.
      *
      * @param value - The value for the stretch factor.
      */
    inline def setStretch(widget: Widget, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStretch")(widget.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    trait IOptions extends StObject {
      
      /**
        * The content alignment of the panel.
        *
        * The default is `'start'`.
        */
      var alignment: js.UndefOr[Alignment] = js.undefined
      
      /**
        * The layout direction of the panel.
        *
        * The default is `'top-to-bottom'`.
        */
      var direction: js.UndefOr[Direction] = js.undefined
      
      /**
        * The box layout to use for the box panel.
        *
        * If this is provided, the other options are ignored.
        *
        * The default is a new `BoxLayout`.
        */
      var layout: js.UndefOr[BoxLayout] = js.undefined
      
      /**
        * The spacing between items in the panel.
        *
        * The default is `4`.
        */
      var spacing: js.UndefOr[Double] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
        
        inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
        
        inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
        
        inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
        
        inline def setLayout(value: BoxLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
        
        inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
        
        inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
        
        inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      }
    }
  }
}
