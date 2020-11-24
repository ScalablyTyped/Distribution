package typings.jimpPluginDisplace

import typings.jimpCore.etcMod.ImageCallback
import typings.jimpCore.jimpMod.Jimp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jimp/plugin-displace", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(): Displace = js.native
  
  @js.native
  trait Displace extends js.Object {
    
    def displace(map: Jimp, offset: Double): this.type = js.native
    def displace(map: Jimp, offset: Double, cb: ImageCallback[this.type]): this.type = js.native
  }
}
