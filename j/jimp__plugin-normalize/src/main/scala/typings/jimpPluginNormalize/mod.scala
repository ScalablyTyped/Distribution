package typings.jimpPluginNormalize

import typings.jimpCore.etcMod.ImageCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-normalize", JSImport.Default)
  @js.native
  def default(): Normalize = js.native
  
  @js.native
  trait Normalize extends StObject {
    
    def normalize(): this.type = js.native
    def normalize(cb: ImageCallback[this.type]): this.type = js.native
  }
}
