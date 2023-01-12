package typings.holderjs

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("holderjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def run(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("run")().asInstanceOf[Unit]
  inline def run(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var images: HTMLElement | Null
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal(images = null)
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setImages(value: HTMLElement): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesNull: Self = StObject.set(x, "images", null)
    }
  }
}
