package typings.jimpPluginCover

import typings.jimpCore.etcMod.ImageCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-cover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): Cover = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Cover]
  
  @js.native
  trait Cover extends StObject {
    
    def cover(w: Double, h: Double): this.type = js.native
    def cover(w: Double, h: Double, alignBits: Double): this.type = js.native
    def cover(w: Double, h: Double, alignBits: Double, cb: ImageCallback[this.type]): this.type = js.native
    def cover(w: Double, h: Double, alignBits: Double, mode: String): this.type = js.native
    def cover(w: Double, h: Double, alignBits: Double, mode: String, cb: ImageCallback[this.type]): this.type = js.native
    def cover(w: Double, h: Double, alignBits: Double, mode: Unit, cb: ImageCallback[this.type]): this.type = js.native
    def cover(w: Double, h: Double, alignBits: Unit, cb: ImageCallback[this.type]): this.type = js.native
    def cover(w: Double, h: Double, alignBits: Unit, mode: String): this.type = js.native
    def cover(w: Double, h: Double, alignBits: Unit, mode: String, cb: ImageCallback[this.type]): this.type = js.native
    def cover(w: Double, h: Double, alignBits: Unit, mode: Unit, cb: ImageCallback[this.type]): this.type = js.native
    def cover(w: Double, h: Double, cb: ImageCallback[this.type]): this.type = js.native
  }
}
