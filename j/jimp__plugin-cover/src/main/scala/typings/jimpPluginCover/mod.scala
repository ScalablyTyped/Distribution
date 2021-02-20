package typings.jimpPluginCover

import typings.jimpCore.etcMod.ImageCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-cover", JSImport.Default)
  @js.native
  def default(): Cover = js.native
  
  @js.native
  trait Cover extends StObject {
    
    def cover(w: Double, h: Double): this.type = js.native
    def cover(w: Double, h: Double, alignBits: js.UndefOr[scala.Nothing], cb: ImageCallback[this.type]): this.type = js.native
    def cover(
      w: Double,
      h: Double,
      alignBits: js.UndefOr[scala.Nothing],
      mode: js.UndefOr[scala.Nothing],
      cb: ImageCallback[this.type]
    ): this.type = js.native
    def cover(w: Double, h: Double, alignBits: js.UndefOr[scala.Nothing], mode: String): this.type = js.native
    def cover(
      w: Double,
      h: Double,
      alignBits: js.UndefOr[scala.Nothing],
      mode: String,
      cb: ImageCallback[this.type]
    ): this.type = js.native
    def cover(w: Double, h: Double, alignBits: Double): this.type = js.native
    def cover(w: Double, h: Double, alignBits: Double, cb: ImageCallback[this.type]): this.type = js.native
    def cover(
      w: Double,
      h: Double,
      alignBits: Double,
      mode: js.UndefOr[scala.Nothing],
      cb: ImageCallback[this.type]
    ): this.type = js.native
    def cover(w: Double, h: Double, alignBits: Double, mode: String): this.type = js.native
    def cover(w: Double, h: Double, alignBits: Double, mode: String, cb: ImageCallback[this.type]): this.type = js.native
    def cover(w: Double, h: Double, cb: ImageCallback[this.type]): this.type = js.native
  }
}
