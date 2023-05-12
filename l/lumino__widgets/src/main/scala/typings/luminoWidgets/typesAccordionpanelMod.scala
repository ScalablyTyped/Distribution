package typings.luminoWidgets

import typings.luminoWidgets.typesAccordionlayoutMod.AccordionLayout
import typings.luminoWidgets.typesAccordionpanelMod.AccordionPanel.IOptions
import typings.luminoWidgets.typesSplitpanelMod.SplitPanel
import typings.luminoWidgets.typesTitleMod.Title
import typings.luminoWidgets.typesWidgetMod.Widget
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAccordionpanelMod {
  
  @JSImport("@lumino/widgets/types/accordionpanel", "AccordionPanel")
  @js.native
  /**
    * Construct a new accordion panel.
    *
    * @param options - The options for initializing the accordion panel.
    */
  open class AccordionPanel () extends SplitPanel {
    def this(options: IOptions) = this()
    
    /**
      * Compute the size of widgets in this panel on the title click event.
      * On closing, the size of the widget is cached and we will try to expand
      * the last opened widget.
      * On opening, we will use the cached size if it is available to restore the
      * widget.
      * In both cases, if we can not compute the size of widgets, we will let
      * `SplitLayout` decide.
      *
      * @param index - The index of widget to be opened of closed
      *
      * @returns Relative size of widgets in this panel, if this size can
      * not be computed, return `undefined`
      */
    /* private */ var _computeWidgetSize: Any = js.native
    
    /**
      * Handle the `'keydown'` event for the accordion panel.
      */
    /* private */ var _eventKeyDown: Any = js.native
    
    /**
      * Handle the `'click'` event for the accordion panel
      */
    /* private */ var _evtClick: Any = js.native
    
    /**
      * Handle the `changed` signal of a title object.
      */
    /* private */ var _onTitleChanged: Any = js.native
    
    /* private */ var _toggleExpansion: Any = js.native
    
    /* private */ var _widgetSizesCache: Any = js.native
    
    /**
      * Collapse the widget at position `index`.
      *
      * #### Notes
      * If no widget is found for `index`, this will bail.
      *
      * @param index Widget index
      */
    def collapse(index: Double): Unit = js.native
    
    /**
      * Expand the widget at position `index`.
      *
      * #### Notes
      * If no widget is found for `index`, this will bail.
      *
      * @param index Widget index
      */
    def expand(index: Double): Unit = js.native
    
    /**
      * The section title space.
      *
      * This is the height if the panel is vertical and the width if it is
      * horizontal.
      */
    def titleSpace: Double = js.native
    def titleSpace_=(value: Double): Unit = js.native
    
    /**
      * A read-only array of the section titles in the panel.
      */
    def titles: js.Array[HTMLElement] = js.native
  }
  object AccordionPanel {
    
    /**
      * The default implementation of `IRenderer`.
      */
    @JSImport("@lumino/widgets/types/accordionpanel", "AccordionPanel.Renderer")
    @js.native
    open class Renderer ()
      extends typings.luminoWidgets.typesSplitpanelMod.SplitPanel.Renderer
         with typings.luminoWidgets.typesAccordionlayoutMod.AccordionLayout.IRenderer {
      
      /* private */ var _titleID: Any = js.native
      
      /* private */ var _titleKeys: Any = js.native
      
      /* private */ val _uuid: Any = js.native
      
      /**
        * Render the collapse indicator for a section title.
        *
        * @param data - The data to use for rendering the section title.
        *
        * @returns A element representing the collapse indicator.
        */
      def createCollapseIcon(data: Title[Widget]): HTMLElement = js.native
      
      /**
        * Create a new handle for use with a split layout.
        *
        * @returns A new handle element.
        */
      /* CompleteClass */
      override def createHandle(): HTMLDivElement = js.native
      
      /**
        * Render the element for a section title.
        *
        * @param data - The data to use for rendering the section title.
        *
        * @returns A element representing the section title.
        */
      /* CompleteClass */
      override def createSectionTitle(title: Title[Widget]): HTMLElement = js.native
      
      /**
        * Create a unique render key for the title.
        *
        * @param data - The data to use for the title.
        *
        * @returns The unique render key for the title.
        *
        * #### Notes
        * This method caches the key against the section title the first time
        * the key is generated.
        */
      def createTitleKey(data: Title[Widget]): String = js.native
      
      /**
        * Common class name for all accordion titles.
        */
      /* CompleteClass */
      override val titleClassName: String = js.native
    }
    object Renderer {
      
      @JSImport("@lumino/widgets/types/accordionpanel", "AccordionPanel.Renderer")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("@lumino/widgets/types/accordionpanel", "AccordionPanel.Renderer._nInstance")
      @js.native
      def nInstance: Any = js.native
      
      inline def nInstance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_nInstance")(x.asInstanceOf[js.Any])
    }
    
    /**
      * The default `Renderer` instance.
      */
    @JSImport("@lumino/widgets/types/accordionpanel", "AccordionPanel.defaultRenderer")
    @js.native
    val defaultRenderer: Renderer = js.native
    
    /**
      * A type alias for a accordion panel alignment.
      */
    type Alignment = typings.luminoWidgets.typesSplitlayoutMod.SplitLayout.Alignment
    
    /**
      * An options object for initializing a accordion panel.
      */
    /* Inlined parent std.Partial<@lumino/widgets.@lumino/widgets/types/accordionlayout.AccordionLayout.IOptions> */
    trait IOptions extends StObject {
      
      var alignment: js.UndefOr[typings.luminoWidgets.typesSplitlayoutMod.SplitLayout.Alignment] = js.undefined
      
      /**
        * The accordion layout to use for the accordion panel.
        *
        * If this is provided, the other options are ignored.
        *
        * The default is a new `AccordionLayout`.
        */
      var layout: js.UndefOr[AccordionLayout] = js.undefined
      
      var orientation: js.UndefOr[typings.luminoWidgets.typesSplitlayoutMod.SplitLayout.Orientation] = js.undefined
      
      var renderer: js.UndefOr[typings.luminoWidgets.typesAccordionlayoutMod.AccordionLayout.IRenderer] = js.undefined
      
      var spacing: js.UndefOr[Double] = js.undefined
      
      var titleSpace: js.UndefOr[Double] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setAlignment(value: typings.luminoWidgets.typesSplitlayoutMod.SplitLayout.Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
        
        inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
        
        inline def setLayout(value: AccordionLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
        
        inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
        
        inline def setOrientation(value: typings.luminoWidgets.typesSplitlayoutMod.SplitLayout.Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
        
        inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
        
        inline def setRenderer(value: typings.luminoWidgets.typesAccordionlayoutMod.AccordionLayout.IRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
        
        inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
        
        inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
        
        inline def setTitleSpace(value: Double): Self = StObject.set(x, "titleSpace", value.asInstanceOf[js.Any])
        
        inline def setTitleSpaceUndefined: Self = StObject.set(x, "titleSpace", js.undefined)
      }
    }
    
    /**
      * A type alias for a accordion panel renderer.
      */
    type IRenderer = typings.luminoWidgets.typesAccordionlayoutMod.AccordionLayout.IRenderer
    
    /**
      * A type alias for a accordion panel orientation.
      */
    type Orientation = typings.luminoWidgets.typesSplitlayoutMod.SplitLayout.Orientation
  }
}
