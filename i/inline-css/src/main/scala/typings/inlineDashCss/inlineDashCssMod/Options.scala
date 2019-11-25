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
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(applyLinkTags)) __obj.updateDynamic("applyLinkTags")(applyLinkTags.asInstanceOf[js.Any])
    if (!js.isUndefined(applyStyleTags)) __obj.updateDynamic("applyStyleTags")(applyStyleTags.asInstanceOf[js.Any])
    if (!js.isUndefined(applyTableAttributes)) __obj.updateDynamic("applyTableAttributes")(applyTableAttributes.asInstanceOf[js.Any])
    if (!js.isUndefined(applyWidthAttributes)) __obj.updateDynamic("applyWidthAttributes")(applyWidthAttributes.asInstanceOf[js.Any])
    if (extraCss != null) __obj.updateDynamic("extraCss")(extraCss.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveMediaQueries)) __obj.updateDynamic("preserveMediaQueries")(preserveMediaQueries.asInstanceOf[js.Any])
    if (!js.isUndefined(removeLinkTags)) __obj.updateDynamic("removeLinkTags")(removeLinkTags.asInstanceOf[js.Any])
    if (!js.isUndefined(removeStyleTags)) __obj.updateDynamic("removeStyleTags")(removeStyleTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

