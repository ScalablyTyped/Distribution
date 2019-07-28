package typings.gulpDashWatch.gulpDashWatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-watch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(glob: js.Array[String] | String): IWatchStream = js.native
  def apply(glob: String | js.Array[String], callback: Cb): IWatchStream = js.native
  def apply(glob: String | js.Array[String], options: IOptions): IWatchStream = js.native
  def apply(glob: String | js.Array[String], options: IOptions, callback: Cb): IWatchStream = js.native
}

