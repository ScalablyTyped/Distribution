package typings.jimpPluginResize

import typings.jimpCore.typesEtcMod.ImageCallback
import typings.jimpPluginResize.anon.RESIZEBEZIER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-resize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Resize = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Resize]
  
  trait Resize extends StObject {
    
    var `class`: ResizeClass
    
    var constants: RESIZEBEZIER
  }
  object Resize {
    
    inline def apply(`class`: ResizeClass, constants: RESIZEBEZIER): Resize = {
      val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any])
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resize]
    }
    
    extension [Self <: Resize](x: Self) {
      
      inline def setClass(value: ResizeClass): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setConstants(value: RESIZEBEZIER): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResizeClass extends StObject {
    
    def resize(w: Double, h: Double): this.type = js.native
    def resize(w: Double, h: Double, cb: ImageCallback[this.type]): this.type = js.native
    def resize(w: Double, h: Double, mode: String): this.type = js.native
    def resize(w: Double, h: Double, mode: String, cb: ImageCallback[this.type]): this.type = js.native
    def resize(w: Double, h: Double, mode: Unit, cb: ImageCallback[this.type]): this.type = js.native
  }
}
