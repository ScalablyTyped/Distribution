package typings.gulpDashImagemin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashImageminMod {
  import typings.imagemin.imageminMod.Plugin

  type PluginFactory[T] = js.Function1[/* options */ js.UndefOr[T], Plugin]
}
