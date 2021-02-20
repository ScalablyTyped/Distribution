package typings.jimpPluginInvert

import typings.jimpCore.etcMod.ImageCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-invert", JSImport.Default)
  @js.native
  def default(): Invert = js.native
  
  @js.native
  trait Invert extends StObject {
    
    def invert(): this.type = js.native
    def invert(cb: ImageCallback[this.type]): this.type = js.native
  }
}
