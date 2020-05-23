package typings.markdownlint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Olmulti extends js.Object {
  var ol_multi: js.UndefOr[Double] = js.undefined
  var ol_single: js.UndefOr[Double] = js.undefined
  var ul_multi: js.UndefOr[Double] = js.undefined
  var ul_single: js.UndefOr[Double] = js.undefined
}

object Olmulti {
  @scala.inline
  def apply(
    ol_multi: js.UndefOr[Double] = js.undefined,
    ol_single: js.UndefOr[Double] = js.undefined,
    ul_multi: js.UndefOr[Double] = js.undefined,
    ul_single: js.UndefOr[Double] = js.undefined
  ): Olmulti = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ol_multi)) __obj.updateDynamic("ol_multi")(ol_multi.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ol_single)) __obj.updateDynamic("ol_single")(ol_single.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ul_multi)) __obj.updateDynamic("ul_multi")(ul_multi.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ul_single)) __obj.updateDynamic("ul_single")(ul_single.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Olmulti]
  }
}

