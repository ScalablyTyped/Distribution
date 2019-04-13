package typings
package lyricistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Apipath extends js.Object {
  var api_path: java.lang.String
  var client_timestamps: lyricistLib.lyricistMod.ClientTimestamps
  var context: java.lang.String
  var id: scala.Double
  var image_url: java.lang.String
  var link_title: java.lang.String
  var title: java.lang.String
  var `type`: java.lang.String
  var url: java.lang.String
}

object Anon_Apipath {
  @scala.inline
  def apply(
    api_path: java.lang.String,
    client_timestamps: lyricistLib.lyricistMod.ClientTimestamps,
    context: java.lang.String,
    id: scala.Double,
    image_url: java.lang.String,
    link_title: java.lang.String,
    title: java.lang.String,
    `type`: java.lang.String,
    url: java.lang.String
  ): Anon_Apipath = {
    val __obj = js.Dynamic.literal(api_path = api_path, client_timestamps = client_timestamps, context = context, id = id, image_url = image_url, link_title = link_title, title = title, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Apipath]
  }
}

