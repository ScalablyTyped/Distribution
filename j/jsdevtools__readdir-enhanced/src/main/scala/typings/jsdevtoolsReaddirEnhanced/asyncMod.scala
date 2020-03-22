package typings.jsdevtoolsReaddirEnhanced

import typings.jsdevtoolsReaddirEnhanced.typesPublicMod.Callback
import typings.jsdevtoolsReaddirEnhanced.typesPublicMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jsdevtools/readdir-enhanced/lib/async", JSImport.Namespace)
@js.native
object asyncMod extends js.Object {
  def readdirAsync(dir: String): js.Promise[js.Array[String]] = js.native
  def readdirAsync(dir: String, callback: Callback[js.Array[String]]): Unit = js.native
  def readdirAsync(dir: String, options: js.UndefOr[scala.Nothing], callback: Callback[js.Array[String]]): Unit = js.native
  def readdirAsync(dir: String, options: Optionsstatsfalse): js.Promise[js.Array[String]] = js.native
  def readdirAsync(dir: String, options: Optionsstatsfalse, callback: Callback[js.Array[String]]): Unit = js.native
  def readdirAsync(dir: String, options: Optionsstatstrue): js.Promise[js.Array[Stats]] = js.native
  def readdirAsync(dir: String, options: Optionsstatstrue, callback: Callback[js.Array[Stats]]): Unit = js.native
}

