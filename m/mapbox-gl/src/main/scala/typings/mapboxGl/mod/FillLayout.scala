package typings.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillLayout
  extends Layout
     with _AnyLayout {
  var `fill-sort-key`: js.UndefOr[Double] = js.undefined
}

object FillLayout {
  @scala.inline
  def apply(`fill-sort-key`: Int | Double = null, visibility: Visibility = null): FillLayout = {
    val __obj = js.Dynamic.literal()
    if (`fill-sort-key` != null) __obj.updateDynamic("fill-sort-key")(`fill-sort-key`.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillLayout]
  }
}

