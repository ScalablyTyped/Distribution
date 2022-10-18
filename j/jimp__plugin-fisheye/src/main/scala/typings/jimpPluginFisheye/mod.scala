package typings.jimpPluginFisheye

import typings.jimpCore.typesEtcMod.ImageCallback
import typings.jimpPluginFisheye.anon.R
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-fisheye", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Fisheye = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Fisheye]
  
  @js.native
  trait Fisheye extends StObject {
    
    def fishEye(): this.type = js.native
    def fishEye(cb: ImageCallback[this.type]): this.type = js.native
    def fishEye(opts: Unit, cb: ImageCallback[this.type]): this.type = js.native
    def fishEye(opts: R): this.type = js.native
    def fishEye(opts: R, cb: ImageCallback[this.type]): this.type = js.native
  }
}
