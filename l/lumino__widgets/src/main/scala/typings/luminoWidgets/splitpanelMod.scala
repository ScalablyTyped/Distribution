package typings.luminoWidgets

import typings.luminoWidgets.panelMod.Panel
import typings.luminoWidgets.splitlayoutMod.SplitLayout
import typings.luminoWidgets.splitpanelMod.SplitPanel.Alignment
import typings.luminoWidgets.splitpanelMod.SplitPanel.IOptions
import typings.luminoWidgets.splitpanelMod.SplitPanel.IRenderer
import typings.luminoWidgets.splitpanelMod.SplitPanel.Orientation
import typings.luminoWidgets.widgetMod.Widget
import typings.std.Event
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitpanelMod {
  
  @JSImport("@lumino/widgets/types/splitpanel", "SplitPanel")
  @js.native
  /**
    * Construct a new split panel.
    *
    * @param options - The options for initializing the split panel.
    */
  class SplitPanel () extends Panel {
    def this(options: IOptions) = this()
    
    /**
      * Handle the `'keydown'` event for the split panel.
      */
    var _evtKeyDown: js.Any = js.native
    
    /**
      * Handle the `'mousedown'` event for the split panel.
      */
    var _evtMouseDown: js.Any = js.native
    
    /**
      * Handle the `'mousemove'` event for the split panel.
      */
    var _evtMouseMove: js.Any = js.native
    
    /**
      * Handle the `'mouseup'` event for the split panel.
      */
    var _evtMouseUp: js.Any = js.native
    
    var _pressData: js.Any = js.native
    
    /**
      * Release the mouse grab for the split panel.
      */
    var _releaseMouse: js.Any = js.native
    
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
      *
      * #### Notes
      * Extra values are ignored, too few will yield an undefined layout.
      *
      * The actual geometry of the DOM nodes is updated asynchronously.
      */
    def setRelativeSizes(sizes: js.Array[Double]): Unit = js.native
    
    /**
      * Get the inter-element spacing for the split panel.
      */
    /**
      * Set the inter-element spacing for the split panel.
      */
    var spacing: Double = js.native
  }
  object SplitPanel {
    
    /**
      * The default implementation of `IRenderer`.
      */
    @JSImport("@lumino/widgets/types/splitpanel", "SplitPanel.Renderer")
    @js.native
    class Renderer ()
      extends typings.luminoWidgets.splitlayoutMod.SplitLayout.IRenderer
    
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
    @JSImport("@lumino/widgets/types/splitpanel", "SplitPanel.getStretch")
    @js.native
    def getStretch(widget: Widget): Double = js.native
    
    /**
      * Set the split panel stretch factor for the given widget.
      *
      * @param widget - The widget of interest.
      *
      * @param value - The value for the stretch factor.
      */
    @JSImport("@lumino/widgets/types/splitpanel", "SplitPanel.setStretch")
    @js.native
    def setStretch(widget: Widget, value: Double): Unit = js.native
    
    /**
      * A type alias for a split panel alignment.
      */
    type Alignment = typings.luminoWidgets.splitlayoutMod.SplitLayout.Alignment
    
    /**
      * An options object for initializing a split panel.
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
        * The split layout to use for the split panel.
        *
        * If this is provided, the other options are ignored.
        *
        * The default is a new `SplitLayout`.
        */
      var layout: js.UndefOr[SplitLayout] = js.native
      
      /**
        * The layout orientation of the panel.
        *
        * The default is `'horizontal'`.
        */
      var orientation: js.UndefOr[Orientation] = js.native
      
      /**
        * The renderer to use for the split panel.
        *
        * The default is a shared renderer instance.
        */
      var renderer: js.UndefOr[IRenderer] = js.native
      
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
        def setLayout(value: SplitLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
        
        @scala.inline
        def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
        
        @scala.inline
        def setRenderer(value: IRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
        
        @scala.inline
        def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      }
    }
    
    /**
      * A type alias for a split panel renderer.
      */
    type IRenderer = typings.luminoWidgets.splitlayoutMod.SplitLayout.IRenderer
    
    /**
      * A type alias for a split panel orientation.
      */
    type Orientation = typings.luminoWidgets.splitlayoutMod.SplitLayout.Orientation
  }
}
