package typings.mapboxMapboxSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapId extends js.Object {
  var mapId: String
  var tilesetName: js.UndefOr[String] = js.undefined
  var url: String
}

object MapId {
  @scala.inline
  def apply(mapId: String, url: String, tilesetName: String = null): MapId = {
    val __obj = js.Dynamic.literal(mapId = mapId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (tilesetName != null) __obj.updateDynamic("tilesetName")(tilesetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapId]
  }
}

