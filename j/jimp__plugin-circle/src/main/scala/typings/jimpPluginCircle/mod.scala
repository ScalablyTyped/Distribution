package typings.jimpPluginCircle

import typings.jimpCore.etcMod.ImageCallback
import typings.jimpPluginCircle.anon.Radius
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-circle", JSImport.Default)
  @js.native
  def default(): Circle = js.native
  
  @js.native
  trait Circle extends StObject {
    
    def circle(): this.type = js.native
    def circle(cb: ImageCallback[this.type]): this.type = js.native
    def circle(options: js.UndefOr[scala.Nothing], cb: ImageCallback[this.type]): this.type = js.native
    def circle(options: Radius): this.type = js.native
    def circle(options: Radius, cb: ImageCallback[this.type]): this.type = js.native
  }
}
