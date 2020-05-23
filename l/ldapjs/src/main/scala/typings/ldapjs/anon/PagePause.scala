package typings.ldapjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagePause extends js.Object {
  var pagePause: js.UndefOr[Boolean] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
}

object PagePause {
  @scala.inline
  def apply(pagePause: js.UndefOr[Boolean] = js.undefined, pageSize: js.UndefOr[Double] = js.undefined): PagePause = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pagePause)) __obj.updateDynamic("pagePause")(pagePause.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagePause]
  }
}

