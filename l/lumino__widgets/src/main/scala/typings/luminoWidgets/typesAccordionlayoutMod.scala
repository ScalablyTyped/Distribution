package typings.luminoWidgets

import typings.luminoWidgets.typesAccordionlayoutMod.AccordionLayout.IOptions
import typings.luminoWidgets.typesAccordionlayoutMod.AccordionLayout.IRenderer
import typings.luminoWidgets.typesSplitlayoutMod.SplitLayout
import typings.luminoWidgets.typesTitleMod.Title
import typings.luminoWidgets.typesWidgetMod.Widget
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAccordionlayoutMod {
  
  @JSImport("@lumino/widgets/types/accordionlayout", "AccordionLayout")
  @js.native
  open class AccordionLayout protected () extends SplitLayout {
    /**
      * Construct a new accordion layout.
      *
      * @param options - The options for initializing the layout.
      *
      * #### Notes
      * The default orientation will be vertical.
      *
      * Titles must be rotated for horizontal accordion panel using CSS: see accordionpanel.css
      */
    def this(options: IOptions) = this()
    
    /* private */ var _titles: Any = js.native
    
    /**
      * The renderer used by the accordion layout.
      */
    @JSName("renderer")
    val renderer_AccordionLayout: IRenderer = js.native
    
    /**
      * The section title height or width depending on the orientation.
      */
    var titleSpace: Double = js.native
    
    /**
      * A read-only array of the section titles in the panel.
      */
    val titles: js.Array[HTMLElement] = js.native
    
    def updateTitle(index: Double, widget: Widget): Unit = js.native
  }
  object AccordionLayout {
    
    /**
      * A type alias for a accordion layout alignment.
      */
    type Alignment = typings.luminoWidgets.typesSplitlayoutMod.SplitLayout.Alignment
    
    /**
      * An options object for initializing a accordion layout.
      */
    trait IOptions
      extends StObject
         with typings.luminoWidgets.typesSplitlayoutMod.SplitLayout.IOptions {
      
      /**
        * The section title height or width depending on the orientation.
        *
        * The default is `22`.
        */
      var titleSpace: js.UndefOr[Double] = js.undefined
    }
    object IOptions {
      
      inline def apply(renderer: typings.luminoWidgets.typesSplitlayoutMod.SplitLayout.IRenderer): IOptions = {
        val __obj = js.Dynamic.literal(renderer = renderer.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setTitleSpace(value: Double): Self = StObject.set(x, "titleSpace", value.asInstanceOf[js.Any])
        
        inline def setTitleSpaceUndefined: Self = StObject.set(x, "titleSpace", js.undefined)
      }
    }
    
    /**
      * A renderer for use with an accordion layout.
      */
    trait IRenderer
      extends StObject
         with typings.luminoWidgets.typesSplitlayoutMod.SplitLayout.IRenderer {
      
      /**
        * Render the element for a section title.
        *
        * @param data - The data to use for rendering the section title.
        *
        * @returns A element representing the section title.
        */
      def createSectionTitle(title: Title[Widget]): HTMLElement
      
      /**
        * Common class name for all accordion titles.
        */
      val titleClassName: String
    }
    object IRenderer {
      
      inline def apply(
        createHandle: () => HTMLDivElement,
        createSectionTitle: Title[Widget] => HTMLElement,
        titleClassName: String
      ): IRenderer = {
        val __obj = js.Dynamic.literal(createHandle = js.Any.fromFunction0(createHandle), createSectionTitle = js.Any.fromFunction1(createSectionTitle), titleClassName = titleClassName.asInstanceOf[js.Any])
        __obj.asInstanceOf[IRenderer]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IRenderer] (val x: Self) extends AnyVal {
        
        inline def setCreateSectionTitle(value: Title[Widget] => HTMLElement): Self = StObject.set(x, "createSectionTitle", js.Any.fromFunction1(value))
        
        inline def setTitleClassName(value: String): Self = StObject.set(x, "titleClassName", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A type alias for a accordion layout orientation.
      */
    type Orientation = typings.luminoWidgets.typesSplitlayoutMod.SplitLayout.Orientation
  }
}
