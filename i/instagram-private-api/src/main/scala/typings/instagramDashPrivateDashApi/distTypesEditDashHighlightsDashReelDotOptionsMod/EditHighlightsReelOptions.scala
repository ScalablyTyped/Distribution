package typings.instagramDashPrivateDashApi.distTypesEditDashHighlightsDashReelDotOptionsMod

import typings.instagramDashPrivateDashApi.distTypesCommonDotTypesMod.IgAppModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditHighlightsReelOptions extends js.Object {
  var added: js.UndefOr[js.Array[String]] = js.undefined
  var coverId: String
  var highlightId: String
  var removed: js.UndefOr[js.Array[String]] = js.undefined
  var source: js.UndefOr[IgAppModule] = js.undefined
  var title: String
}

object EditHighlightsReelOptions {
  @scala.inline
  def apply(
    coverId: String,
    highlightId: String,
    title: String,
    added: js.Array[String] = null,
    removed: js.Array[String] = null,
    source: IgAppModule = null
  ): EditHighlightsReelOptions = {
    val __obj = js.Dynamic.literal(coverId = coverId, highlightId = highlightId, title = title)
    if (added != null) __obj.updateDynamic("added")(added)
    if (removed != null) __obj.updateDynamic("removed")(removed)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditHighlightsReelOptions]
  }
}

