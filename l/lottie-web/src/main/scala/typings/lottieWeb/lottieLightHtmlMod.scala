package typings.lottieWeb

import org.scalablytyped.runtime.Shortcut
import typings.lottieWeb.mod.LottiePlayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lottieLightHtmlMod extends Shortcut {
  
  @JSImport("lottie-web/build/player/lottie_light_html", JSImport.Default)
  @js.native
  val default: LottiePlayer = js.native
  
  type _To = LottiePlayer
  
  /* This means you don't have to write `default`, but can instead just say `lottieLightHtmlMod.foo` */
  override def _to: LottiePlayer = default
}
