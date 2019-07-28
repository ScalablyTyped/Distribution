package typings.jsesc.jsescMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opts extends js.Object {
  var compact: js.UndefOr[Boolean] = js.undefined
  var es6: js.UndefOr[Boolean] = js.undefined
  var escapeEverything: js.UndefOr[Boolean] = js.undefined
  var indent: js.UndefOr[String] = js.undefined
  var json: js.UndefOr[Boolean] = js.undefined
  var quotes: js.UndefOr[String] = js.undefined
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object Opts {
  @scala.inline
  def apply(
    compact: js.UndefOr[Boolean] = js.undefined,
    es6: js.UndefOr[Boolean] = js.undefined,
    escapeEverything: js.UndefOr[Boolean] = js.undefined,
    indent: String = null,
    json: js.UndefOr[Boolean] = js.undefined,
    quotes: String = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): Opts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (!js.isUndefined(es6)) __obj.updateDynamic("es6")(es6)
    if (!js.isUndefined(escapeEverything)) __obj.updateDynamic("escapeEverything")(escapeEverything)
    if (indent != null) __obj.updateDynamic("indent")(indent)
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json)
    if (quotes != null) __obj.updateDynamic("quotes")(quotes)
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[Opts]
  }
}

