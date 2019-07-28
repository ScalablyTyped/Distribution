package typings.markdownlint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Olmulti extends js.Object {
  var ol_multi: js.UndefOr[Double] = js.undefined
  var ol_single: js.UndefOr[Double] = js.undefined
  var ul_multi: js.UndefOr[Double] = js.undefined
  var ul_single: js.UndefOr[Double] = js.undefined
}

object Anon_Olmulti {
  @scala.inline
  def apply(
    ol_multi: Int | Double = null,
    ol_single: Int | Double = null,
    ul_multi: Int | Double = null,
    ul_single: Int | Double = null
  ): Anon_Olmulti = {
    val __obj = js.Dynamic.literal()
    if (ol_multi != null) __obj.updateDynamic("ol_multi")(ol_multi.asInstanceOf[js.Any])
    if (ol_single != null) __obj.updateDynamic("ol_single")(ol_single.asInstanceOf[js.Any])
    if (ul_multi != null) __obj.updateDynamic("ul_multi")(ul_multi.asInstanceOf[js.Any])
    if (ul_single != null) __obj.updateDynamic("ul_single")(ul_single.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Olmulti]
  }
}

