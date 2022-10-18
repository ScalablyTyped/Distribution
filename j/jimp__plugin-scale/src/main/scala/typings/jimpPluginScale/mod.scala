package typings.jimpPluginScale

import typings.jimpCore.typesEtcMod.ImageCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-scale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Scale = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Scale]
  
  @js.native
  trait Scale extends StObject {
    
    def scale(f: Double): this.type = js.native
    def scale(f: Double, cb: ImageCallback[this.type]): this.type = js.native
    def scale(f: Double, mode: String): this.type = js.native
    def scale(f: Double, mode: String, cb: ImageCallback[this.type]): this.type = js.native
    def scale(f: Double, mode: Unit, cb: ImageCallback[this.type]): this.type = js.native
    
    def scaleToFit(w: Double, h: Double): this.type = js.native
    def scaleToFit(w: Double, h: Double, cb: ImageCallback[this.type]): this.type = js.native
    def scaleToFit(w: Double, h: Double, mode: String): this.type = js.native
    def scaleToFit(w: Double, h: Double, mode: String, cb: ImageCallback[this.type]): this.type = js.native
    def scaleToFit(w: Double, h: Double, mode: Unit, cb: ImageCallback[this.type]): this.type = js.native
  }
}
