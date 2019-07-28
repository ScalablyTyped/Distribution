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
    val __obj = js.Dynamic.literal(api_path = api_path, client_timestamps = client_timestamps, context = context, id = id, image_url = image_url, link_title = link_title, title = title, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Apipath]
  }
}

