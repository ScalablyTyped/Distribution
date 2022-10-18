package typings.jimpPluginBlit

import typings.jimpCore.typesEtcMod.ImageCallback
import typings.jimpCore.typesJimpMod.Jimp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-blit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Blit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Blit]
  
  @js.native
  trait Blit extends StObject {
    
    def blit(src: Jimp, x: Double, y: Double): this.type = js.native
    def blit(src: Jimp, x: Double, y: Double, cb: ImageCallback[this.type]): this.type = js.native
    def blit(src: Jimp, x: Double, y: Double, srcx: Double, srcy: Double, srcw: Double, srch: Double): this.type = js.native
    def blit(
      src: Jimp,
      x: Double,
      y: Double,
      srcx: Double,
      srcy: Double,
      srcw: Double,
      srch: Double,
      cb: ImageCallback[this.type]
    ): this.type = js.native
  }
}
