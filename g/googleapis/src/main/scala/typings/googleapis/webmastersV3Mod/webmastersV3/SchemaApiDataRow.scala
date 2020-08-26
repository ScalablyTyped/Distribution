package typings.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaApiDataRow extends js.Object {
  var clicks: js.UndefOr[Double] = js.native
  var ctr: js.UndefOr[Double] = js.native
  var impressions: js.UndefOr[Double] = js.native
  var keys: js.UndefOr[js.Array[String]] = js.native
  var position: js.UndefOr[Double] = js.native
}

object SchemaApiDataRow {
  @scala.inline
  def apply(): SchemaApiDataRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApiDataRow]
  }
  @scala.inline
  implicit class SchemaApiDataRowOps[Self <: SchemaApiDataRow] (val x: Self) extends AnyVal {
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
    def setClicks(value: Double): Self = this.set("clicks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClicks: Self = this.set("clicks", js.undefined)
    @scala.inline
    def setCtr(value: Double): Self = this.set("ctr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCtr: Self = this.set("ctr", js.undefined)
    @scala.inline
    def setImpressions(value: Double): Self = this.set("impressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImpressions: Self = this.set("impressions", js.undefined)
    @scala.inline
    def setKeysVarargs(value: String*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[String]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

