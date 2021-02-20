package typings.lottieWeb

import org.scalablytyped.runtime.Shortcut
import typings.lottieWeb.mod.LottiePlayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lottieSvgMod extends Shortcut {
  
  @JSImport("lottie-web/build/player/lottie_svg", JSImport.Default)
  @js.native
  val default: LottiePlayer = js.native
  
  type _To = LottiePlayer
  
  /* This means you don't have to write `default`, but can instead just say `lottieSvgMod.foo` */
  override def _to: LottiePlayer = default
}
