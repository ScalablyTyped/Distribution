package typings.jimpPluginInvert

import typings.jimpCore.etcMod.ImageCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jimp/plugin-invert", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(): Invert = js.native
  
  @js.native
  trait Invert extends js.Object {
    
    def invert(): this.type = js.native
    def invert(cb: ImageCallback[this.type]): this.type = js.native
  }
}
