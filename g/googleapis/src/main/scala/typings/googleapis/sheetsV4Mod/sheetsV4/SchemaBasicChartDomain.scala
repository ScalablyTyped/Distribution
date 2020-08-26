package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The domain of a chart. For example, if charting stock prices over time,
  * this would be the date.
  */
@js.native
trait SchemaBasicChartDomain extends js.Object {
  /**
    * The data of the domain. For example, if charting stock prices over time,
    * this is the data representing the dates.
    */
  var domain: js.UndefOr[SchemaChartData] = js.native
  /**
    * True to reverse the order of the domain values (horizontal axis).
    */
  var reversed: js.UndefOr[Boolean] = js.native
}

object SchemaBasicChartDomain {
  @scala.inline
  def apply(): SchemaBasicChartDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicChartDomain]
  }
  @scala.inline
  implicit class SchemaBasicChartDomainOps[Self <: SchemaBasicChartDomain] (val x: Self) extends AnyVal {
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
    def setDomain(value: SchemaChartData): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setReversed(value: Boolean): Self = this.set("reversed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReversed: Self = this.set("reversed", js.undefined)
  }
  
}

