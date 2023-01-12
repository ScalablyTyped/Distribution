package typings.luminoWidgets

import typings.luminoWidgets.typesBoxlayoutMod.BoxLayout.Alignment
import typings.luminoWidgets.typesBoxlayoutMod.BoxLayout.Direction
import typings.luminoWidgets.typesBoxlayoutMod.BoxLayout.IOptions
import typings.luminoWidgets.typesPanellayoutMod.PanelLayout
import typings.luminoWidgets.typesWidgetMod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBoxlayoutMod {
  
  @JSImport("@lumino/widgets/types/boxlayout", "BoxLayout")
  @js.native
  /**
    * Construct a new box layout.
    *
    * @param options - The options for initializing the layout.
    */
  open class BoxLayout () extends PanelLayout {
    def this(options: IOptions) = this()
    
    /* private */ var _alignment: Any = js.native
    
    /* private */ var _box: Any = js.native
    
    /* private */ var _direction: Any = js.native
    
    /* private */ var _dirty: Any = js.native
    
    /**
      * Fit the layout to the total size required by the widgets.
      */
    /* private */ var _fit: Any = js.native
    
    /* private */ var _fixed: Any = js.native
    
    /* private */ var _items: Any = js.native
    
    /* private */ var _sizers: Any = js.native
    
    /* private */ var _spacing: Any = js.native
    
    /**
      * Update the layout position and size of the widgets.
      *
      * The parent offset dimensions should be `-1` if unknown.
      */
    /* private */ var _update: Any = js.native
    
    /**
      * Get the content alignment for the box layout.
      *
      * #### Notes
      * This is the alignment of the widgets in the layout direction.
      *
      * The alignment has no effect if the widgets can expand to fill the
      * entire box layout.
      */
    /**
      * Set the content alignment for the box layout.
      *
      * #### Notes
      * This is the alignment of the widgets in the layout direction.
      *
      * The alignment has no effect if the widgets can expand to fill the
      * entire box layout.
      */
    var alignment: Alignment = js.native
    
    /**
      * Get the layout direction for the box layout.
      */
    /**
      * Set the layout direction for the box layout.
      */
    var direction: Direction = js.native
    
    /**
      * Get the inter-element spacing for the box layout.
      */
    /**
      * Set the inter-element spacing for the box layout.
      */
    var spacing: Double = js.native
  }
  object BoxLayout {
    
    @JSImport("@lumino/widgets/types/boxlayout", "BoxLayout")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get the box layout size basis for the given widget.
      *
      * @param widget - The widget of interest.
      *
      * @returns The box layout size basis for the widget.
      */
    inline def getSizeBasis(widget: Widget): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSizeBasis")(widget.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Get the box layout stretch factor for the given widget.
      *
      * @param widget - The widget of interest.
      *
      * @returns The box layout stretch factor for the widget.
      */
    inline def getStretch(widget: Widget): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStretch")(widget.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Set the box layout size basis for the given widget.
      *
      * @param widget - The widget of interest.
      *
      * @param value - The value for the size basis.
      */
    inline def setSizeBasis(widget: Widget, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSizeBasis")(widget.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Set the box layout stretch factor for the given widget.
      *
      * @param widget - The widget of interest.
      *
      * @param value - The value for the stretch factor.
      */
    inline def setStretch(widget: Widget, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStretch")(widget.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * A type alias for a box layout alignment.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.luminoWidgets.luminoWidgetsStrings.start
      - typings.luminoWidgets.luminoWidgetsStrings.center
      - typings.luminoWidgets.luminoWidgetsStrings.end
      - typings.luminoWidgets.luminoWidgetsStrings.justify
    */
    trait Alignment extends StObject
    object Alignment {
      
      inline def center: typings.luminoWidgets.luminoWidgetsStrings.center = "center".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.center]
      
      inline def end: typings.luminoWidgets.luminoWidgetsStrings.end = "end".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.end]
      
      inline def justify: typings.luminoWidgets.luminoWidgetsStrings.justify = "justify".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.justify]
      
      inline def start: typings.luminoWidgets.luminoWidgetsStrings.start = "start".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.start]
    }
    
    /**
      * A type alias for a box layout direction.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.luminoWidgets.luminoWidgetsStrings.`left-to-right`
      - typings.luminoWidgets.luminoWidgetsStrings.`right-to-left`
      - typings.luminoWidgets.luminoWidgetsStrings.`top-to-bottom`
      - typings.luminoWidgets.luminoWidgetsStrings.`bottom-to-top`
    */
    trait Direction extends StObject
    object Direction {
      
      inline def `bottom-to-top`: typings.luminoWidgets.luminoWidgetsStrings.`bottom-to-top` = "bottom-to-top".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.`bottom-to-top`]
      
      inline def `left-to-right`: typings.luminoWidgets.luminoWidgetsStrings.`left-to-right` = "left-to-right".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.`left-to-right`]
      
      inline def `right-to-left`: typings.luminoWidgets.luminoWidgetsStrings.`right-to-left` = "right-to-left".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.`right-to-left`]
      
      inline def `top-to-bottom`: typings.luminoWidgets.luminoWidgetsStrings.`top-to-bottom` = "top-to-bottom".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.`top-to-bottom`]
    }
    
    /**
      * An options object for initializing a box layout.
      */
    trait IOptions extends StObject {
      
      /**
        * The content alignment of the layout.
        *
        * The default is `'start'`.
        */
      var alignment: js.UndefOr[Alignment] = js.undefined
      
      /**
        * The direction of the layout.
        *
        * The default is `'top-to-bottom'`.
        */
      var direction: js.UndefOr[Direction] = js.undefined
      
      /**
        * The spacing between items in the layout.
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
        
        inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
        
        inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
        
        inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
        
        inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
        
        inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      }
    }
  }
}
