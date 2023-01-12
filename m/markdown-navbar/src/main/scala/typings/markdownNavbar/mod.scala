package typings.markdownNavbar

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: MarkdownNavbarProps): Element = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("markdown-navbar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait MarkdownNavbarProps extends StObject {
    
    /** The className that defines the outermost container of navbar */
    var className: js.UndefOr[String] = js.undefined
    
    /** Use the text of the title from Markdown content as the hash value for the anchor if true */
    var declarative: js.UndefOr[Boolean] = js.undefined
    
    /** Anchor displacement relative to the top of the window (for the anchor jump) */
    var headingTopOffset: js.UndefOr[Double] = js.undefined
    
    /** The event callback function before the hash value of browser address changing */
    var onHashChange: js.UndefOr[js.Function2[/* newHash */ String, /* oldHash */ String, Unit]] = js.undefined
    
    /** The event callback function after clicking navbar item */
    var onNavItemClick: js.UndefOr[
        js.Function3[
          /* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
          /* element */ HTMLDivElement, 
          /* hashValue */ String, 
          Unit
        ]
      ] = js.undefined
    
    /** Whether the title contains a numerical prefix, such as: 1. 2. 2.2 */
    var ordered: js.UndefOr[Boolean] = js.undefined
    
    /** Markdown text content */
    var source: String
    
    /** Automatically update the hash value of browser address when page scrolling if true */
    var updateHashAuto: js.UndefOr[Boolean] = js.undefined
  }
  object MarkdownNavbarProps {
    
    inline def apply(source: String): MarkdownNavbarProps = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkdownNavbarProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MarkdownNavbarProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDeclarative(value: Boolean): Self = StObject.set(x, "declarative", value.asInstanceOf[js.Any])
      
      inline def setDeclarativeUndefined: Self = StObject.set(x, "declarative", js.undefined)
      
      inline def setHeadingTopOffset(value: Double): Self = StObject.set(x, "headingTopOffset", value.asInstanceOf[js.Any])
      
      inline def setHeadingTopOffsetUndefined: Self = StObject.set(x, "headingTopOffset", js.undefined)
      
      inline def setOnHashChange(value: (/* newHash */ String, /* oldHash */ String) => Unit): Self = StObject.set(x, "onHashChange", js.Any.fromFunction2(value))
      
      inline def setOnHashChangeUndefined: Self = StObject.set(x, "onHashChange", js.undefined)
      
      inline def setOnNavItemClick(
        value: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* element */ HTMLDivElement, /* hashValue */ String) => Unit
      ): Self = StObject.set(x, "onNavItemClick", js.Any.fromFunction3(value))
      
      inline def setOnNavItemClickUndefined: Self = StObject.set(x, "onNavItemClick", js.undefined)
      
      inline def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
      
      inline def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setUpdateHashAuto(value: Boolean): Self = StObject.set(x, "updateHashAuto", value.asInstanceOf[js.Any])
      
      inline def setUpdateHashAutoUndefined: Self = StObject.set(x, "updateHashAuto", js.undefined)
    }
  }
}
