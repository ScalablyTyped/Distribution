package typings.jimpPluginThreshold

import typings.jimpCore.etcMod.ImageCallback
import typings.jimpPluginThreshold.anon.AutoGreyscale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-threshold", JSImport.Default)
  @js.native
  def default(): Threshold = js.native
  
  @js.native
  trait Threshold extends StObject {
    
    def threshold(opts: AutoGreyscale): this.type = js.native
    def threshold(opts: AutoGreyscale, cb: ImageCallback[this.type]): this.type = js.native
  }
}
