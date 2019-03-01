package typings
package ldapjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PagePause extends js.Object {
  var pagePause: js.UndefOr[scala.Boolean] = js.undefined
  var pageSize: js.UndefOr[scala.Double] = js.undefined
}

object Anon_PagePause {
  @scala.inline
  def apply(pagePause: js.UndefOr[scala.Boolean] = js.undefined, pageSize: scala.Int | scala.Double = null): Anon_PagePause = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pagePause)) __obj.updateDynamic("pagePause")(pagePause)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PagePause]
  }
}

