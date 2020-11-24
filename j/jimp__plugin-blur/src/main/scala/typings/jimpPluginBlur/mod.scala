package typings.jimpPluginBlur

import typings.jimpCore.etcMod.ImageCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jimp/plugin-blur", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(): Blur = js.native
  
  @js.native
  trait Blur extends js.Object {
    
    def blur(r: Double): this.type = js.native
    def blur(r: Double, cb: ImageCallback[this.type]): this.type = js.native
  }
}
