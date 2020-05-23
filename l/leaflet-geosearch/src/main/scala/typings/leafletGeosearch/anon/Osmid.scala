package typings.leafletGeosearch.anon

import typings.leafletGeosearch.leafletGeosearchStrings.node
import typings.leafletGeosearch.leafletGeosearchStrings.relation
import typings.leafletGeosearch.leafletGeosearchStrings.way
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Osmid extends js.Object {
  var osm_id: js.UndefOr[Double] = js.undefined
  var osm_type: js.UndefOr[node | way | relation] = js.undefined
}

object Osmid {
  @scala.inline
  def apply(osm_id: js.UndefOr[Double] = js.undefined, osm_type: node | way | relation = null): Osmid = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(osm_id)) __obj.updateDynamic("osm_id")(osm_id.get.asInstanceOf[js.Any])
    if (osm_type != null) __obj.updateDynamic("osm_type")(osm_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Osmid]
  }
}

