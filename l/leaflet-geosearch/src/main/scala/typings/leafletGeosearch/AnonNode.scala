package typings.leafletGeosearch

import typings.leafletGeosearch.leafletGeosearchStrings.node
import typings.leafletGeosearch.leafletGeosearchStrings.relation
import typings.leafletGeosearch.leafletGeosearchStrings.way
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNode extends js.Object {
  var osm_id: js.UndefOr[Double] = js.undefined
  var osm_type: js.UndefOr[node | way | relation] = js.undefined
}

object AnonNode {
  @scala.inline
  def apply(osm_id: Int | Double = null, osm_type: node | way | relation = null): AnonNode = {
    val __obj = js.Dynamic.literal()
    if (osm_id != null) __obj.updateDynamic("osm_id")(osm_id.asInstanceOf[js.Any])
    if (osm_type != null) __obj.updateDynamic("osm_type")(osm_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNode]
  }
}

