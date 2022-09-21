package typings.luminoDatagrid

import typings.luminoDatagrid.cellrendererMod.CellRenderer.CellConfig
import typings.luminoDatagrid.cellrendererMod.CellRenderer.ConfigOption
import typings.luminoDatagrid.hyperlinkrendererMod.HyperlinkRenderer.IOptions
import typings.luminoDatagrid.textrendererMod.TextRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hyperlinkrendererMod {
  
  @JSImport("@lumino/datagrid/types/hyperlinkrenderer", "HyperlinkRenderer")
  @js.native
  /**
    * Construct a new text renderer.
    *
    * @param options - The options for initializing the renderer.
    */
  open class HyperlinkRenderer () extends TextRenderer {
    def this(options: IOptions) = this()
    
    /**
      * The URL address.
      */
    val url: js.UndefOr[ConfigOption[String]] = js.native
    
    /**
      * The friendly link name.
      */
    val urlName: js.UndefOr[ConfigOption[String]] = js.native
  }
  object HyperlinkRenderer {
    
    /**
      * A type alias for the supported ellipsis sides.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.luminoDatagrid.luminoDatagridStrings.left
      - typings.luminoDatagrid.luminoDatagridStrings.right
    */
    trait ElideDirection extends StObject
    object ElideDirection {
      
      inline def left: typings.luminoDatagrid.luminoDatagridStrings.left = "left".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.left]
      
      inline def right: typings.luminoDatagrid.luminoDatagridStrings.right = "right".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.right]
    }
    
    /**
      * A type alias for the supported horizontal alignment modes.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.luminoDatagrid.luminoDatagridStrings.left
      - typings.luminoDatagrid.luminoDatagridStrings.center
      - typings.luminoDatagrid.luminoDatagridStrings.right
    */
    trait HorizontalAlignment extends StObject
    object HorizontalAlignment {
      
      inline def center: typings.luminoDatagrid.luminoDatagridStrings.center = "center".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.center]
      
      inline def left: typings.luminoDatagrid.luminoDatagridStrings.left = "left".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.left]
      
      inline def right: typings.luminoDatagrid.luminoDatagridStrings.right = "right".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.right]
    }
    
    /**
      * An options object for initializing a text renderer.
      */
    trait IOptions
      extends StObject
         with typings.luminoDatagrid.textrendererMod.TextRenderer.IOptions {
      
      /**
        * The URL address
        */
      var url: js.UndefOr[ConfigOption[String]] = js.undefined
      
      /**
        * The friendly link name.
        *
        * The default is the URL itself.
        */
      var urlName: js.UndefOr[ConfigOption[String]] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setUrl(value: ConfigOption[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlFunction1(value: /* config */ CellConfig => String): Self = StObject.set(x, "url", js.Any.fromFunction1(value))
        
        inline def setUrlName(value: ConfigOption[String]): Self = StObject.set(x, "urlName", value.asInstanceOf[js.Any])
        
        inline def setUrlNameFunction1(value: /* config */ CellConfig => String): Self = StObject.set(x, "urlName", js.Any.fromFunction1(value))
        
        inline def setUrlNameUndefined: Self = StObject.set(x, "urlName", js.undefined)
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    /**
      * A type alias for the supported vertical alignment modes.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.luminoDatagrid.luminoDatagridStrings.top
      - typings.luminoDatagrid.luminoDatagridStrings.center
      - typings.luminoDatagrid.luminoDatagridStrings.bottom
    */
    trait VerticalAlignment extends StObject
    object VerticalAlignment {
      
      inline def bottom: typings.luminoDatagrid.luminoDatagridStrings.bottom = "bottom".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.bottom]
      
      inline def center: typings.luminoDatagrid.luminoDatagridStrings.center = "center".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.center]
      
      inline def top: typings.luminoDatagrid.luminoDatagridStrings.top = "top".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.top]
    }
  }
}
