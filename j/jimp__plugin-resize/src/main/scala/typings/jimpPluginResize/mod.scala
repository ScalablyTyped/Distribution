package typings.jimpPluginResize

import typings.jimpCore.etcMod.ImageCallback
import typings.jimpPluginResize.anon.RESIZEBEZIER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-resize", JSImport.Default)
  @js.native
  def default(): Resize = js.native
  
  @js.native
  trait Resize extends StObject {
    
    var `class`: ResizeClass = js.native
    
    var constants: RESIZEBEZIER = js.native
  }
  object Resize {
    
    @scala.inline
    def apply(`class`: ResizeClass, constants: RESIZEBEZIER): Resize = {
      val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any])
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resize]
    }
    
    @scala.inline
    implicit class ResizeMutableBuilder[Self <: Resize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: ResizeClass): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstants(value: RESIZEBEZIER): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResizeClass extends StObject {
    
    def resize(w: Double, h: Double): this.type = js.native
    def resize(w: Double, h: Double, cb: ImageCallback[this.type]): this.type = js.native
    def resize(w: Double, h: Double, mode: js.UndefOr[scala.Nothing], cb: ImageCallback[this.type]): this.type = js.native
    def resize(w: Double, h: Double, mode: String): this.type = js.native
    def resize(w: Double, h: Double, mode: String, cb: ImageCallback[this.type]): this.type = js.native
  }
}
