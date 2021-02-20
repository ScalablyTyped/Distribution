package typings.jimpPluginFisheye

import typings.jimpCore.etcMod.ImageCallback
import typings.jimpPluginFisheye.anon.R
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-fisheye", JSImport.Default)
  @js.native
  def default(): Fisheye = js.native
  
  @js.native
  trait Fisheye extends StObject {
    
    def fishEye(): this.type = js.native
    def fishEye(cb: ImageCallback[this.type]): this.type = js.native
    def fishEye(opts: js.UndefOr[scala.Nothing], cb: ImageCallback[this.type]): this.type = js.native
    def fishEye(opts: R): this.type = js.native
    def fishEye(opts: R, cb: ImageCallback[this.type]): this.type = js.native
  }
}
