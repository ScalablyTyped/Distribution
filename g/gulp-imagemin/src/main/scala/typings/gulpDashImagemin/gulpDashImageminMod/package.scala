package typings.gulpDashImagemin

import typings.imagemin.imageminMod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashImageminMod {
  type PluginFactory[T] = js.Function1[/* options */ js.UndefOr[T], Plugin]
}
