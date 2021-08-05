package typings.jimpPluginNormalize

import typings.jimpCore.etcMod.ImageCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-normalize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Normalize = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Normalize]
  
  @js.native
  trait Normalize extends StObject {
    
    def normalize(): this.type = js.native
    def normalize(cb: ImageCallback[this.type]): this.type = js.native
  }
}
