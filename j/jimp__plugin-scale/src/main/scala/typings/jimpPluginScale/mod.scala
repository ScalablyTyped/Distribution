package typings.jimpPluginScale

import typings.jimpCore.etcMod.ImageCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-scale", JSImport.Default)
  @js.native
  def default(): Scale = js.native
  
  @js.native
  trait Scale extends StObject {
    
    def scale(f: Double): this.type = js.native
    def scale(f: Double, cb: ImageCallback[this.type]): this.type = js.native
    def scale(f: Double, mode: js.UndefOr[scala.Nothing], cb: ImageCallback[this.type]): this.type = js.native
    def scale(f: Double, mode: String): this.type = js.native
    def scale(f: Double, mode: String, cb: ImageCallback[this.type]): this.type = js.native
    
    def scaleToFit(w: Double, h: Double): this.type = js.native
    def scaleToFit(w: Double, h: Double, cb: ImageCallback[this.type]): this.type = js.native
    def scaleToFit(w: Double, h: Double, mode: js.UndefOr[scala.Nothing], cb: ImageCallback[this.type]): this.type = js.native
    def scaleToFit(w: Double, h: Double, mode: String): this.type = js.native
    def scaleToFit(w: Double, h: Double, mode: String, cb: ImageCallback[this.type]): this.type = js.native
  }
}
