package typings.infiniteScroll

import typings.infiniteScroll.mod.Options
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object InfiniteScroll {
    
    @JSGlobal("InfiniteScroll")
    @js.native
    open class ^ protected ()
      extends typings.infiniteScroll.mod.^ {
      def this(element: String, options: Options) = this()
      def this(element: Element, options: Options) = this()
    }
    
    @JSGlobal("InfiniteScroll")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get the Infinite Scroll instance via its element.
      * This is useful for getting the Infinite Scroll instance in JavaScript
      * after it has been initalized in HTML
      */
    /* static member */
    inline def data(element: String): typings.infiniteScroll.mod.InfiniteScroll = ^.asInstanceOf[js.Dynamic].applyDynamic("data")(element.asInstanceOf[js.Any]).asInstanceOf[typings.infiniteScroll.mod.InfiniteScroll]
    inline def data(element: Element): typings.infiniteScroll.mod.InfiniteScroll = ^.asInstanceOf[js.Dynamic].applyDynamic("data")(element.asInstanceOf[js.Any]).asInstanceOf[typings.infiniteScroll.mod.InfiniteScroll]
  }
}
