package typings
package gulpDashWatchLib.gulpDashWatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-watch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(glob: js.Array[java.lang.String] | java.lang.String): IWatchStream = js.native
  def apply(glob: java.lang.String | js.Array[java.lang.String], callback: gulpDashWatchLib.Cb): IWatchStream = js.native
  def apply(glob: java.lang.String | js.Array[java.lang.String], options: IOptions): IWatchStream = js.native
  def apply(
    glob: java.lang.String | js.Array[java.lang.String],
    options: IOptions,
    callback: gulpDashWatchLib.Cb
  ): IWatchStream = js.native
}

