package typings.jsImageZoom

import typings.jsImageZoom.mod.Options
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ImageZoom {
    
    @JSGlobal("ImageZoom")
    @js.native
    open class ^ protected ()
      extends typings.jsImageZoom.mod.^ {
      /**
        * Creates an instance of ImageZoom.
        * @param container container DOM element, which contains an image to be zoomed
        * @param opts js-image-zoom options
        */
      def this(container: HTMLElement, opts: Options) = this()
    }
  }
}
