package typings.jimpPluginContain

import typings.jimpCore.typesEtcMod.ImageCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-contain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Contain = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Contain]
  
  @js.native
  trait Contain extends StObject {
    
    def contain(w: Double, h: Double): this.type = js.native
    def contain(w: Double, h: Double, alignBits: Double): this.type = js.native
    def contain(w: Double, h: Double, alignBits: Double, cb: ImageCallback[this.type]): this.type = js.native
    def contain(w: Double, h: Double, alignBits: Double, mode: String): this.type = js.native
    def contain(w: Double, h: Double, alignBits: Double, mode: String, cb: ImageCallback[this.type]): this.type = js.native
    def contain(w: Double, h: Double, alignBits: Double, mode: Unit, cb: ImageCallback[this.type]): this.type = js.native
    def contain(w: Double, h: Double, alignBits: Unit, mode: String): this.type = js.native
    def contain(w: Double, h: Double, alignBits: Unit, mode: String, cb: ImageCallback[this.type]): this.type = js.native
    def contain(w: Double, h: Double, alignBits: Unit, mode: Unit, cb: ImageCallback[this.type]): this.type = js.native
    def contain(w: Double, h: Double, cb: ImageCallback[this.type]): this.type = js.native
    def contain(w: Double, h: Double, mode: String): this.type = js.native
    def contain(w: Double, h: Double, mode: String, cb: ImageCallback[this.type]): this.type = js.native
    def contain(w: Double, h: Double, mode: Unit, cb: ImageCallback[this.type]): this.type = js.native
  }
}
