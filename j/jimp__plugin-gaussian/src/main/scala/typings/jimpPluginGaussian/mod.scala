package typings.jimpPluginGaussian

import typings.jimpCore.etcMod.ImageCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jimp/plugin-gaussian", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(): Gaussian = js.native
  
  @js.native
  trait Gaussian extends js.Object {
    
    def gaussian(r: Double): this.type = js.native
    def gaussian(r: Double, cb: ImageCallback[this.type]): this.type = js.native
  }
}
