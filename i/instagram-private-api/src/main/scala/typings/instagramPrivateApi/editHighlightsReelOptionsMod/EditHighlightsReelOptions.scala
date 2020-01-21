package typings.instagramPrivateApi.editHighlightsReelOptionsMod

import typings.instagramPrivateApi.commonTypesMod.IgAppModule
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
    val __obj = js.Dynamic.literal(coverId = coverId.asInstanceOf[js.Any], highlightId = highlightId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (added != null) __obj.updateDynamic("added")(added.asInstanceOf[js.Any])
    if (removed != null) __obj.updateDynamic("removed")(removed.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditHighlightsReelOptions]
  }
}

