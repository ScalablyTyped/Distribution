package typings.instagramDashPrivateDashApi.distResponsesMediaDotEntityDotOembedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaEntityOembedResponse extends js.Object {
  var author_id: Double
  var author_name: String
  var author_url: String
  var height: Null
  var html: String
  var media_id: String
  var provider_name: String
  var provider_url: String
  var thumbnail_height: Double
  var thumbnail_url: String
  var thumbnail_width: Double
  var title: String
  var `type`: String
  var version: String
  var width: Double
}

object MediaEntityOembedResponse {
  @scala.inline
  def apply(
    author_id: Double,
    author_name: String,
    author_url: String,
    height: Null,
    html: String,
    media_id: String,
    provider_name: String,
    provider_url: String,
    thumbnail_height: Double,
    thumbnail_url: String,
    thumbnail_width: Double,
    title: String,
    `type`: String,
    version: String,
    width: Double
  ): MediaEntityOembedResponse = {
    val __obj = js.Dynamic.literal(author_id = author_id.asInstanceOf[js.Any], author_name = author_name.asInstanceOf[js.Any], author_url = author_url.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], provider_name = provider_name.asInstanceOf[js.Any], provider_url = provider_url.asInstanceOf[js.Any], thumbnail_height = thumbnail_height.asInstanceOf[js.Any], thumbnail_url = thumbnail_url.asInstanceOf[js.Any], thumbnail_width = thumbnail_width.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaEntityOembedResponse]
  }
}

