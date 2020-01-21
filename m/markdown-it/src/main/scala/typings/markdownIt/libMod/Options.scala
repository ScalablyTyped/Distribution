package typings.markdownIt.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var breaks: js.UndefOr[Boolean] = js.undefined
  var highlight: js.UndefOr[js.Function2[/* str */ String, /* lang */ String, Unit]] = js.undefined
  var html: js.UndefOr[Boolean] = js.undefined
  var langPrefix: js.UndefOr[String] = js.undefined
  var linkify: js.UndefOr[Boolean] = js.undefined
  var quotes: js.UndefOr[String] = js.undefined
  var typographer: js.UndefOr[Boolean] = js.undefined
  var xhtmlOut: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    breaks: js.UndefOr[Boolean] = js.undefined,
    highlight: (/* str */ String, /* lang */ String) => Unit = null,
    html: js.UndefOr[Boolean] = js.undefined,
    langPrefix: String = null,
    linkify: js.UndefOr[Boolean] = js.undefined,
    quotes: String = null,
    typographer: js.UndefOr[Boolean] = js.undefined,
    xhtmlOut: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(breaks)) __obj.updateDynamic("breaks")(breaks.asInstanceOf[js.Any])
    if (highlight != null) __obj.updateDynamic("highlight")(js.Any.fromFunction2(highlight))
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (langPrefix != null) __obj.updateDynamic("langPrefix")(langPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(linkify)) __obj.updateDynamic("linkify")(linkify.asInstanceOf[js.Any])
    if (quotes != null) __obj.updateDynamic("quotes")(quotes.asInstanceOf[js.Any])
    if (!js.isUndefined(typographer)) __obj.updateDynamic("typographer")(typographer.asInstanceOf[js.Any])
    if (!js.isUndefined(xhtmlOut)) __obj.updateDynamic("xhtmlOut")(xhtmlOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

