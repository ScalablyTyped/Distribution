package typings.mapboxMapboxSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMapId extends js.Object {
  var mapId: String
  var tilesetName: js.UndefOr[String] = js.undefined
  var url: String
}

object AnonMapId {
  @scala.inline
  def apply(mapId: String, url: String, tilesetName: String = null): AnonMapId = {
    val __obj = js.Dynamic.literal(mapId = mapId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (tilesetName != null) __obj.updateDynamic("tilesetName")(tilesetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMapId]
  }
}

