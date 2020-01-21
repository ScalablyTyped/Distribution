package typings.linkifyIt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fuzzyEmail: js.UndefOr[Boolean] = js.undefined
  var fuzzyIP: js.UndefOr[Boolean] = js.undefined
  var fuzzyLink: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fuzzyEmail: js.UndefOr[Boolean] = js.undefined,
    fuzzyIP: js.UndefOr[Boolean] = js.undefined,
    fuzzyLink: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fuzzyEmail)) __obj.updateDynamic("fuzzyEmail")(fuzzyEmail.asInstanceOf[js.Any])
    if (!js.isUndefined(fuzzyIP)) __obj.updateDynamic("fuzzyIP")(fuzzyIP.asInstanceOf[js.Any])
    if (!js.isUndefined(fuzzyLink)) __obj.updateDynamic("fuzzyLink")(fuzzyLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

