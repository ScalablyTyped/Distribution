package typings.jimpPluginRotate

import typings.jimpCore.etcMod.ImageCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-rotate", JSImport.Default)
  @js.native
  def default(): Rotate = js.native
  
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
