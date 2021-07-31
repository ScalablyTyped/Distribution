package typings.holderjs

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("holderjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def run(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var images: HTMLElement | Null
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal(images = null)
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImages(value: HTMLElement): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagesNull: Self = StObject.set(x, "images", null)
    }
  }
}
