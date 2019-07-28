package typings.inlineDashCss.inlineDashCssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var applyLinkTags: js.UndefOr[Boolean] = js.undefined
  var applyStyleTags: js.UndefOr[Boolean] = js.undefined
  var applyTableAttributes: js.UndefOr[Boolean] = js.undefined
  var applyWidthAttributes: js.UndefOr[Boolean] = js.undefined
  var extraCss: js.UndefOr[String] = js.undefined
  var preserveMediaQueries: js.UndefOr[Boolean] = js.undefined
  var removeLinkTags: js.UndefOr[Boolean] = js.undefined
  var removeStyleTags: js.UndefOr[Boolean] = js.undefined
  var url: String
}

object Options {
  @scala.inline
  def apply(
    url: String,
    applyLinkTags: js.UndefOr[Boolean] = js.undefined,
    applyStyleTags: js.UndefOr[Boolean] = js.undefined,
    applyTableAttributes: js.UndefOr[Boolean] = js.undefined,
    applyWidthAttributes: js.UndefOr[Boolean] = js.undefined,
    extraCss: String = null,
    preserveMediaQueries: js.UndefOr[Boolean] = js.undefined,
    removeLinkTags: js.UndefOr[Boolean] = js.undefined,
    removeStyleTags: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(url = url)
    if (!js.isUndefined(applyLinkTags)) __obj.updateDynamic("applyLinkTags")(applyLinkTags)
    if (!js.isUndefined(applyStyleTags)) __obj.updateDynamic("applyStyleTags")(applyStyleTags)
    if (!js.isUndefined(applyTableAttributes)) __obj.updateDynamic("applyTableAttributes")(applyTableAttributes)
    if (!js.isUndefined(applyWidthAttributes)) __obj.updateDynamic("applyWidthAttributes")(applyWidthAttributes)
    if (extraCss != null) __obj.updateDynamic("extraCss")(extraCss)
    if (!js.isUndefined(preserveMediaQueries)) __obj.updateDynamic("preserveMediaQueries")(preserveMediaQueries)
    if (!js.isUndefined(removeLinkTags)) __obj.updateDynamic("removeLinkTags")(removeLinkTags)
    if (!js.isUndefined(removeStyleTags)) __obj.updateDynamic("removeStyleTags")(removeStyleTags)
    __obj.asInstanceOf[Options]
  }
}

