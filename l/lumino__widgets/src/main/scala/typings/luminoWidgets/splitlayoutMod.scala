package typings.luminoWidgets

import typings.luminoWidgets.panellayoutMod.PanelLayout
import typings.luminoWidgets.splitlayoutMod.SplitLayout.Alignment
import typings.luminoWidgets.splitlayoutMod.SplitLayout.IOptions
import typings.luminoWidgets.splitlayoutMod.SplitLayout.IRenderer
import typings.luminoWidgets.splitlayoutMod.SplitLayout.Orientation
import typings.luminoWidgets.widgetMod.Widget
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitlayoutMod {
  
  @JSImport("@lumino/widgets/types/splitlayout", "SplitLayout")
  @js.native
  class SplitLayout protected () extends PanelLayout {
    /**
      * Construct a new split layout.
      *
      * @param options - The options for initializing the layout.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _alignment: js.Any = js.native
    
    /* private */ var _box: js.Any = js.native
    
    /* private */ var _dirty: js.Any = js.native
    
    /**
      * Fit the layout to the total size required by the widgets.
      */
    /* private */ var _fit: js.Any = js.native
    
    /* private */ var _fixed: js.Any = js.native
    
    /* private */ var _handles: js.Any = js.native
    
    /* private */ var _hasNormedSizes: js.Any = js.native
    
    /* private */ var _items: js.Any = js.native
    
    /* private */ var _orientation: js.Any = js.native
    
    /* private */ var _sizers: js.Any = js.native
    
    /* private */ var _spacing: js.Any = js.native
    
    /**
      * Update the layout position and size of the widgets.
      *
      * The parent offset dimensions should be `-1` if unknown.
      */
    /* private */ var _update: js.Any = js.native
    
    /**
      * Get the content alignment for the split layout.
      *
      * #### Notes
      * This is the alignment of the widgets in the layout direction.
      *
      * The alignment has no effect if the widgets can expand  to fill the
      * entire split layout.
      */
    /**
      * Set the content alignment for the split layout.
      *
      * #### Notes
      * This is the alignment of the widgets in the layout direction.
      *
      * The alignment has no effect if the widgets can expand  to fill the
      * entire split layout.
      */
    var alignment: Alignment = js.native
    
    /**
      * A read-only array of the split handles in the layout.
      */
    val handles: js.Array[HTMLDivElement] = js.native
    
    /**
      * Move the offset position of a split handle.
      *
      * @param index - The index of the handle of the interest.
      *
      * @param position - The desired offset position of the handle.
      *
      * #### Notes
      * The position is relative to the offset parent.
      *
      * This will move the handle as close as possible to the desired
      * position. The sibling widgets will be adjusted as necessary.
      */
    def moveHandle(index: Double, position: Double): Unit = js.native
    
    /**
      * Get the layout orientation for the split layout.
      */
    /**
      * Set the layout orientation for the split layout.
      */
    var orientation: Orientation = js.native
    
    /**
      * Get the relative sizes of the widgets in the layout.
      *
      * @returns A new array of the relative sizes of the widgets.
      *
      * #### Notes
      * The returned sizes reflect the sizes of the widgets normalized
      * relative to their siblings.
      *
      * This method **does not** measure the DOM nodes.
      */
    def relativeSizes(): js.Array[Double] = js.native
    
    /**
      * The renderer used by the split layout.
      */
    val renderer: IRenderer = js.native
    
    /**
      * Set the relative sizes for the widgets in the layout.
      *
      * @param sizes - The relative sizes for the widgets in the panel.
      *
      * #### Notes
      * Extra values are ignored, too few will yield an undefined layout.
      *
      * The actual geometry of the DOM nodes is updated asynchronously.
      */
    def setRelativeSizes(sizes: js.Array[Double]): Unit = js.native
    
    /**
      * Get the inter-element spacing for the split layout.
      */
    /**
      * Set the inter-element spacing for the split layout.
      */
    var spacing: Double = js.native
  }
  object SplitLayout {
    
    @JSImport("@lumino/widgets/types/splitlayout", "SplitLayout")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get the split layout stretch factor for the given widget.
      *
      * @param widget - The widget of interest.
      *
      * @returns The split layout stretch factor for the widget.
      */
    inline def getStretch(widget: Widget): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStretch")(widget.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Set the split layout stretch factor for the given widget.
      *
      * @param widget - The widget of interest.
      *
      * @param value - The value for the stretch factor.
      */
    inline def setStretch(widget: Widget, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStretch")(widget.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * A type alias for a split layout alignment.
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
      * An options object for initializing a split layout.
      */
    trait IOptions extends StObject {
      
      /**
        * The content alignment of the layout.
        *
        * The default is `'start'`.
        */
      var alignment: js.UndefOr[Alignment] = js.undefined
      
      /**
        * The orientation of the layout.
        *
        * The default is `'horizontal'`.
        */
      var orientation: js.UndefOr[Orientation] = js.undefined
      
      /**
        * The renderer to use for the split layout.
        */
      var renderer: IRenderer
      
      /**
        * The spacing between items in the layout.
        *
        * The default is `4`.
        */
      var spacing: js.UndefOr[Double] = js.undefined
    }
    object IOptions {
      
      inline def apply(renderer: IRenderer): IOptions = {
        val __obj = js.Dynamic.literal(renderer = renderer.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
        
        inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
        
        inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
        
        inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
        
        inline def setRenderer(value: IRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
        
        inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      }
    }
    
    /**
      * A renderer for use with a split layout.
      */
    trait IRenderer extends StObject {
      
      /**
        * Create a new handle for use with a split layout.
        *
        * @returns A new handle element.
        */
      def createHandle(): HTMLDivElement
    }
    object IRenderer {
      
      inline def apply(createHandle: () => HTMLDivElement): IRenderer = {
        val __obj = js.Dynamic.literal(createHandle = js.Any.fromFunction0(createHandle))
        __obj.asInstanceOf[IRenderer]
      }
      
      extension [Self <: IRenderer](x: Self) {
        
        inline def setCreateHandle(value: () => HTMLDivElement): Self = StObject.set(x, "createHandle", js.Any.fromFunction0(value))
      }
    }
    
    /**
      * A type alias for a split layout orientation.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.luminoWidgets.luminoWidgetsStrings.horizontal
      - typings.luminoWidgets.luminoWidgetsStrings.vertical
    */
    trait Orientation extends StObject
    object Orientation {
      
      inline def horizontal: typings.luminoWidgets.luminoWidgetsStrings.horizontal = "horizontal".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.horizontal]
      
      inline def vertical: typings.luminoWidgets.luminoWidgetsStrings.vertical = "vertical".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.vertical]
    }
  }
}
