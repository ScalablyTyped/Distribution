package typings.ldapjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PagePause extends js.Object {
  var pagePause: js.UndefOr[Boolean] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
}

object Anon_PagePause {
  @scala.inline
  def apply(pagePause: js.UndefOr[Boolean] = js.undefined, pageSize: Int | Double = null): Anon_PagePause = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pagePause)) __obj.updateDynamic("pagePause")(pagePause.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PagePause]
  }
}

