package typings.jimpPluginDisplace

import typings.jimpCore.typesEtcMod.ImageCallback
import typings.jimpCore.typesJimpMod.Jimp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-displace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Displace = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Displace]
  
  @js.native
  trait Displace extends StObject {
    
    def displace(map: Jimp, offset: Double): this.type = js.native
    def displace(map: Jimp, offset: Double, cb: ImageCallback[this.type]): this.type = js.native
  }
}
