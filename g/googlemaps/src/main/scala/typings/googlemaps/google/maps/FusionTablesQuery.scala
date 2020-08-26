package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO find source documentation
@js.native
trait FusionTablesQuery extends js.Object {
  var from: js.UndefOr[String] = js.native
  var limit: js.UndefOr[Double] = js.native
  var offset: js.UndefOr[Double] = js.native
  var orderBy: js.UndefOr[String] = js.native
  var select: js.UndefOr[String] = js.native
  var where: js.UndefOr[String] = js.native
}

object FusionTablesQuery {
  @scala.inline
  def apply(): FusionTablesQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FusionTablesQuery]
  }
  @scala.inline
  implicit class FusionTablesQueryOps[Self <: FusionTablesQuery] (val x: Self) extends AnyVal {
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
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOrderBy(value: String): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    @scala.inline
    def setSelect(value: String): Self = this.set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setWhere(value: String): Self = this.set("where", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
  
}

