package typings.jimpPluginShadow

import typings.jimpCore.etcMod.ImageCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/plugin-shadow", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Shadow extends js.Object {
    def shadow(): this.type = js.native
    def shadow(cb: ImageCallback[this.type]): this.type = js.native
    def shadow(options: AnonBlur): this.type = js.native
    def shadow(options: AnonBlur, cb: ImageCallback[this.type]): this.type = js.native
  }
  
  def default(): Shadow = js.native
}

