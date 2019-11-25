package typings.atMapboxMapboxDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MapId extends js.Object {
  var mapId: String
  var tilesetName: js.UndefOr[String] = js.undefined
  var url: String
}

object Anon_MapId {
  @scala.inline
  def apply(mapId: String, url: String, tilesetName: String = null): Anon_MapId = {
    val __obj = js.Dynamic.literal(mapId = mapId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (tilesetName != null) __obj.updateDynamic("tilesetName")(tilesetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MapId]
  }
}

