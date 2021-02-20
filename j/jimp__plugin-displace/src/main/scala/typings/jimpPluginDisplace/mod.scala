package typings.jimpPluginDisplace

import typings.jimpCore.etcMod.ImageCallback
import typings.jimpCore.jimpMod.Jimp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-displace", JSImport.Default)
  @js.native
  def default(): Displace = js.native
  
  @js.native
  trait Displace extends StObject {
    
    def displace(map: Jimp, offset: Double): this.type = js.native
    def displace(map: Jimp, offset: Double, cb: ImageCallback[this.type]): this.type = js.native
  }
}
