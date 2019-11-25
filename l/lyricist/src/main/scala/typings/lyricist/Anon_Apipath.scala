package typings.lyricist

import typings.lyricist.lyricistMod.ClientTimestamps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Apipath extends js.Object {
  var api_path: String
  var client_timestamps: ClientTimestamps
  var context: String
  var id: Double
  var image_url: String
  var link_title: String
  var title: String
  var `type`: String
  var url: String
}

object Anon_Apipath {
  @scala.inline
  def apply(
    api_path: String,
    client_timestamps: ClientTimestamps,
    context: String,
    id: Double,
    image_url: String,
    link_title: String,
    title: String,
    `type`: String,
    url: String
  ): Anon_Apipath = {
    val __obj = js.Dynamic.literal(api_path = api_path.asInstanceOf[js.Any], client_timestamps = client_timestamps.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_url = image_url.asInstanceOf[js.Any], link_title = link_title.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Apipath]
  }
}

