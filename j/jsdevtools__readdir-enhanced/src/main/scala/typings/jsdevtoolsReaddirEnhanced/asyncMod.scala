package typings.jsdevtoolsReaddirEnhanced

import typings.jsdevtoolsReaddirEnhanced.anon.Optionsstatsfalseundefine
import typings.jsdevtoolsReaddirEnhanced.anon.Optionsstatstrue
import typings.jsdevtoolsReaddirEnhanced.typesPublicMod.Callback
import typings.jsdevtoolsReaddirEnhanced.typesPublicMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMod {
  
  @JSImport("@jsdevtools/readdir-enhanced/lib/async", "readdirAsync")
  @js.native
  def readdirAsync(dir: String): js.Promise[js.Array[String]] = js.native
  @JSImport("@jsdevtools/readdir-enhanced/lib/async", "readdirAsync")
  @js.native
  def readdirAsync(dir: String, callback: Callback[js.Array[String]]): Unit = js.native
  @JSImport("@jsdevtools/readdir-enhanced/lib/async", "readdirAsync")
  @js.native
  def readdirAsync(dir: String, options: js.UndefOr[scala.Nothing], callback: Callback[js.Array[String]]): Unit = js.native
  @JSImport("@jsdevtools/readdir-enhanced/lib/async", "readdirAsync")
  @js.native
  def readdirAsync(dir: String, options: Optionsstatsfalseundefine): js.Promise[js.Array[String]] = js.native
  @JSImport("@jsdevtools/readdir-enhanced/lib/async", "readdirAsync")
  @js.native
  def readdirAsync(dir: String, options: Optionsstatsfalseundefine, callback: Callback[js.Array[String]]): Unit = js.native
  @JSImport("@jsdevtools/readdir-enhanced/lib/async", "readdirAsync")
  @js.native
  def readdirAsync(dir: String, options: Optionsstatstrue): js.Promise[js.Array[Stats]] = js.native
  @JSImport("@jsdevtools/readdir-enhanced/lib/async", "readdirAsync")
  @js.native
  def readdirAsync(dir: String, options: Optionsstatstrue, callback: Callback[js.Array[Stats]]): Unit = js.native
}
