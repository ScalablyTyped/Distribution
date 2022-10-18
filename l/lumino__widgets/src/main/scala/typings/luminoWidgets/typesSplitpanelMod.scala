package typings.luminoWidgets

import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.typesPanelMod.Panel
import typings.luminoWidgets.typesSplitlayoutMod.SplitLayout
import typings.luminoWidgets.typesSplitpanelMod.SplitPanel.Alignment
import typings.luminoWidgets.typesSplitpanelMod.SplitPanel.IOptions
import typings.luminoWidgets.typesSplitpanelMod.SplitPanel.IRenderer
import typings.luminoWidgets.typesSplitpanelMod.SplitPanel.Orientation
import typings.luminoWidgets.typesWidgetMod.Widget
import typings.std.Event
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSplitpanelMod {
  
  @JSImport("@lumino/widgets/types/splitpanel", "SplitPanel")
  @js.native
  /**
    * Construct a new split panel.
    *
    * @param options - The options for initializing the split panel.
    */
  open class SplitPanel () extends Panel {
    def this(options: IOptions) = this()
    
    /**
      * Handle the `'keydown'` event for the split panel.
      */
    /* private */ var _evtKeyDown: Any = js.native
    
    /**
      * Handle the `'mousedown'` event for the split panel.
      */
    /* private */ var _evtMouseDown: Any = js.native
    
    /**
      * Handle the `'mousemove'` event for the split panel.
      */
    /* private */ var _evtMouseMove: Any = js.native
    
    /**
      * Handle the `'mouseup'` event for the split panel.
      */
    /* private */ var _evtMouseUp: Any = js.native
    
    /* private */ var _handleMoved: Any = js.native
    
    /* private */ var _pressData: Any = js.native
    
    /**
      * Release the mouse grab for the split panel.
      */
    /* private */ var _releaseMouse: Any = js.native
    
    /**
      * Get the content alignment for the split panel.
      *
      * #### Notes
      * This is the alignment of the widgets in the layout direction.
      *
      * The alignment has no effect if the widgets can expand to fill the
      * entire split panel.
      */
    /**
      * Set the content alignment for the split panel.
      *
      * #### Notes
      * This is the alignment of the widgets in the layout direction.
      *
      * The alignment has no effect if the widgets can expand to fill the
      * entire split panel.
      */
    var alignment: Alignment = js.native
    
    /**
      * Handle the DOM events for the split panel.
      *
      * @param event - The DOM event sent to the panel.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the panel's DOM node. It should
      * not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * A signal emitted when a split handle has moved.
      */
    val handleMoved: ISignal[this.type, Unit] = js.native
    
    /**
      * A read-only array of the split handles in the panel.
      */
    val handles: js.Array[HTMLDivElement] = js.native
    
    /**
      * Get the layout orientation for the split panel.
      */
    /**
      * Set the layout orientation for the split panel.
      */
    var orientation: Orientation = js.native
    
    /**
      * Get the relative sizes of the widgets in the panel.
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
      * The renderer used by the split panel.
      */
    val renderer: IRenderer = js.native
    
    /**
      * Set the relative sizes for the widgets in the panel.
      *
      * @param sizes - The relative sizes for the widgets in the panel.
      * @param update - Update the layout after setting relative sizes.
      * Default is True.
      *
      * #### Notes
      * Extra values are ignored, too few will yield an undefined layout.
      *
      * The actual geometry of the DOM nodes is updated asynchronously.
      */
    def setRelativeSizes(sizes: js.Array[Double]): Unit = js.native
    def setRelativeSizes(sizes: js.Array[Double], update: Boolean): Unit = js.native
    
    /**
      * Get the inter-element spacing for the split panel.
      */
    /**
      * Set the inter-element spacing for the split panel.
      */
    var spacing: Double = js.native
  }
  object SplitPanel {
    
    @JSImport("@lumino/widgets/types/splitpanel", "SplitPanel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The default implementation of `IRenderer`.
      */
    @JSImport("@lumino/widgets/types/splitpanel", "SplitPanel.Renderer")
    @js.native
    open class Renderer ()
      extends StObject
         with typings.luminoWidgets.typesSplitlayoutMod.SplitLayout.IRenderer {
      
      /**
        * Create a new handle for use with a split layout.
        *
        * @returns A new handle element.
        */
      /* CompleteClass */
      override def createHandle(): HTMLDivElement = js.native
    }
    
    /**
      * The default `Renderer` instance.
      */
    @JSImport("@lumino/widgets/types/splitpanel", "SplitPanel.defaultRenderer")
    @js.native
    val defaultRenderer: Renderer = js.native
    
    /**
      * Get the split panel stretch factor for the given widget.
      *
      * @param widget - The widget of interest.
      *
      * @returns The split panel stretch factor for the widget.
      */
    inline def getStretch(widget: Widget): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStretch")(widget.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Set the split panel stretch factor for the given widget.
      *
      * @param widget - The widget of interest.
      *
      * @param value - The value for the stretch factor.
      */
    inline def setStretch(widget: Widget, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStretch")(widget.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * A type alias for a split panel alignment.
      */
    type Alignment = typings.luminoWidgets.typesSplitlayoutMod.SplitLayout.Alignment
    
    /**
      * An options object for initializing a split panel.
      */
    trait IOptions extends StObject {
      
      /**
        * The content alignment of the panel.
        *
        * The default is `'start'`.
        */
      var alignment: js.UndefOr[Alignment] = js.undefined
      
      /**
        * The split layout to use for the split panel.
        *
        * If this is provided, the other options are ignored.
        *
        * The default is a new `SplitLayout`.
        */
      var layout: js.UndefOr[SplitLayout] = js.undefined
      
      /**
        * The layout orientation of the panel.
        *
        * The default is `'horizontal'`.
        */
      var orientation: js.UndefOr[Orientation] = js.undefined
      
      /**
        * The renderer to use for the split panel.
        *
        * The default is a shared renderer instance.
        */
      var renderer: js.UndefOr[IRenderer] = js.undefined
      
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
        
        inline def setLayout(value: SplitLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
        
        inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
        
        inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
        
        inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
        
        inline def setRenderer(value: IRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
        
        inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
        
        inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      }
    }
    
    /**
      * A type alias for a split panel renderer.
      */
    type IRenderer = typings.luminoWidgets.typesSplitlayoutMod.SplitLayout.IRenderer
    
    /**
      * A type alias for a split panel orientation.
      */
    type Orientation = typings.luminoWidgets.typesSplitlayoutMod.SplitLayout.Orientation
  }
}
