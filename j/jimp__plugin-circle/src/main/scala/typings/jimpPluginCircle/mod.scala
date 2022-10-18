package typings.jimpPluginCircle

import typings.jimpCore.typesEtcMod.ImageCallback
import typings.jimpPluginCircle.anon.Radius
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-circle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Circle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Circle]
  
  @js.native
  trait Circle extends StObject {
    
    def circle(): this.type = js.native
    def circle(cb: ImageCallback[this.type]): this.type = js.native
    def circle(options: Unit, cb: ImageCallback[this.type]): this.type = js.native
    def circle(options: Radius): this.type = js.native
    def circle(options: Radius, cb: ImageCallback[this.type]): this.type = js.native
  }
}
