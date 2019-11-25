package typings.instagramDashPrivateDashApi.distTypesCreateDashHighlightsDashReelDotOptionsMod

import typings.instagramDashPrivateDashApi.distTypesCommonDotTypesMod.IgAppModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateHighlightsReelOptions extends js.Object {
  var coverId: js.UndefOr[String] = js.undefined
  var mediaIds: js.Array[String]
  var source: js.UndefOr[IgAppModule] = js.undefined
  var title: String
}

object CreateHighlightsReelOptions {
  @scala.inline
  def apply(mediaIds: js.Array[String], title: String, coverId: String = null, source: IgAppModule = null): CreateHighlightsReelOptions = {
    val __obj = js.Dynamic.literal(mediaIds = mediaIds.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (coverId != null) __obj.updateDynamic("coverId")(coverId.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHighlightsReelOptions]
  }
}

