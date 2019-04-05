package typings
package lyricistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Asc extends js.Object {
  var page: js.UndefOr[scala.Double] = js.undefined
  var perPage: js.UndefOr[scala.Double] = js.undefined
  var sort: js.UndefOr[lyricistLib.lyricistLibStrings.asc | lyricistLib.lyricistLibStrings.desc] = js.undefined
}

object Anon_Asc {
  @scala.inline
  def apply(
    page: scala.Int | scala.Double = null,
    perPage: scala.Int | scala.Double = null,
    sort: lyricistLib.lyricistLibStrings.asc | lyricistLib.lyricistLibStrings.desc = null
  ): Anon_Asc = {
    val __obj = js.Dynamic.literal()
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (perPage != null) __obj.updateDynamic("perPage")(perPage.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Asc]
  }
}

