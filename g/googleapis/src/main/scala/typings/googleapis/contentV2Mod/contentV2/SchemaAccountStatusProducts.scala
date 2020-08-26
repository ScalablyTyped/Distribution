package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAccountStatusProducts extends js.Object {
  /**
    * The channel the data applies to.
    */
  var channel: js.UndefOr[String] = js.native
  /**
    * The country the data applies to.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The destination the data applies to.
    */
  var destination: js.UndefOr[String] = js.native
  /**
    * List of item-level issues.
    */
  var itemLevelIssues: js.UndefOr[js.Array[SchemaAccountStatusItemLevelIssue]] = js.native
  /**
    * Aggregated product statistics.
    */
  var statistics: js.UndefOr[SchemaAccountStatusStatistics] = js.native
}

object SchemaAccountStatusProducts {
  @scala.inline
  def apply(): SchemaAccountStatusProducts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountStatusProducts]
  }
  @scala.inline
  implicit class SchemaAccountStatusProductsOps[Self <: SchemaAccountStatusProducts] (val x: Self) extends AnyVal {
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
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    @scala.inline
    def setItemLevelIssuesVarargs(value: SchemaAccountStatusItemLevelIssue*): Self = this.set("itemLevelIssues", js.Array(value :_*))
    @scala.inline
    def setItemLevelIssues(value: js.Array[SchemaAccountStatusItemLevelIssue]): Self = this.set("itemLevelIssues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemLevelIssues: Self = this.set("itemLevelIssues", js.undefined)
    @scala.inline
    def setStatistics(value: SchemaAccountStatusStatistics): Self = this.set("statistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatistics: Self = this.set("statistics", js.undefined)
  }
  
}

