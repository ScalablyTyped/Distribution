package typings.khroma

import org.scalablytyped.runtime.Shortcut
import typings.khroma.distTypesMod.Channels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMethodsRgbaMod extends Shortcut {
  
  @JSImport("khroma/dist/methods/rgba", JSImport.Default)
  @js.native
  val default: IRgba = js.native
  
  @js.native
  trait IRgba extends StObject {
    
    def apply(color: String, opacity: Double): String = js.native
    def apply(color: Channels, opacity: Double): String = js.native
    def apply(r: Double, g: Double, b: Double): String = js.native
    def apply(r: Double, g: Double, b: Double, a: Double): String = js.native
  }
  
  type _To = IRgba
  
  /* This means you don't have to write `default`, but can instead just say `distMethodsRgbaMod.foo` */
  override def _to: IRgba = default
}
