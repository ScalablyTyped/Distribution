package typings.jimpPluginRotate

import typings.jimpCore.typesEtcMod.ImageCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-rotate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Rotate = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Rotate]
  
  @js.native
  trait Rotate extends StObject {
    
    def rotate(deg: Double): this.type = js.native
    def rotate(deg: Double, cb: ImageCallback[this.type]): this.type = js.native
    def rotate(deg: Double, mode: String): this.type = js.native
    def rotate(deg: Double, mode: String, cb: ImageCallback[this.type]): this.type = js.native
    def rotate(deg: Double, mode: Boolean): this.type = js.native
    def rotate(deg: Double, mode: Boolean, cb: ImageCallback[this.type]): this.type = js.native
  }
}
