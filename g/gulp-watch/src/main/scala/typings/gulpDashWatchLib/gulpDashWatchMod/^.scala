package typings
package gulpDashWatchLib.gulpDashWatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-watch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(glob: js.Array[java.lang.String] | java.lang.String): gulpDashWatchLib.gulpDashWatchMod.IWatchStream = js.native
  def apply(glob: java.lang.String | js.Array[java.lang.String], callback: gulpDashWatchLib.Cb): gulpDashWatchLib.gulpDashWatchMod.IWatchStream = js.native
  def apply(
    glob: java.lang.String | js.Array[java.lang.String],
    options: gulpDashWatchLib.gulpDashWatchMod.IOptions
  ): gulpDashWatchLib.gulpDashWatchMod.IWatchStream = js.native
  def apply(
    glob: java.lang.String | js.Array[java.lang.String],
    options: gulpDashWatchLib.gulpDashWatchMod.IOptions,
    callback: gulpDashWatchLib.Cb
  ): gulpDashWatchLib.gulpDashWatchMod.IWatchStream = js.native
}

