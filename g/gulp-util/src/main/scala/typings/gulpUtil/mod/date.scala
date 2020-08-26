package typings.gulpUtil.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-util", "date")
@js.native
object date extends js.Object {
  var masks: js.Any = js.native
  def apply(): js.Any = js.native
  def apply(now: js.UndefOr[scala.Nothing], mask: js.UndefOr[scala.Nothing], convertLocalTimeToUTC: Boolean): js.Any = js.native
  def apply(now: js.UndefOr[scala.Nothing], mask: String): js.Any = js.native
  def apply(now: js.UndefOr[scala.Nothing], mask: String, convertLocalTimeToUTC: Boolean): js.Any = js.native
  def apply(now: String): js.Any = js.native
  def apply(now: String, mask: js.UndefOr[scala.Nothing], convertLocalTimeToUTC: Boolean): js.Any = js.native
  def apply(now: String, mask: String): js.Any = js.native
  def apply(now: String, mask: String, convertLocalTimeToUTC: Boolean): js.Any = js.native
  def apply(now: Date): js.Any = js.native
  def apply(now: Date, mask: js.UndefOr[scala.Nothing], convertLocalTimeToUTC: Boolean): js.Any = js.native
  def apply(now: Date, mask: String): js.Any = js.native
  def apply(now: Date, mask: String, convertLocalTimeToUTC: Boolean): js.Any = js.native
}

