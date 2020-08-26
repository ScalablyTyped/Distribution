package typings.leafletGeosearch.anon

import typings.leafletGeosearch.leafletGeosearchStrings.node
import typings.leafletGeosearch.leafletGeosearchStrings.relation
import typings.leafletGeosearch.leafletGeosearchStrings.way
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Osmid extends js.Object {
  var osm_id: js.UndefOr[Double] = js.native
  var osm_type: js.UndefOr[node | way | relation] = js.native
}

object Osmid {
  @scala.inline
  def apply(): Osmid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Osmid]
  }
  @scala.inline
  implicit class OsmidOps[Self <: Osmid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOsm_id(value: Double): Self = this.set("osm_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOsm_id: Self = this.set("osm_id", js.undefined)
    @scala.inline
    def setOsm_type(value: node | way | relation): Self = this.set("osm_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOsm_type: Self = this.set("osm_type", js.undefined)
  }
  
}

