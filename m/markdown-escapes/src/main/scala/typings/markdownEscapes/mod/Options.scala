package typings.markdownEscapes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** @default false */
  var commonmark: js.UndefOr[Boolean] = js.undefined
  /** @default false */
  var gfm: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(commonmark: js.UndefOr[Boolean] = js.undefined, gfm: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(commonmark)) __obj.updateDynamic("commonmark")(commonmark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gfm)) __obj.updateDynamic("gfm")(gfm.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

