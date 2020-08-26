package typings.lokijs.anon

import typings.lokijs.DeserializeOptions
import typings.lokijs.lokijsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delimited extends DeserializeOptions {
  var delimited: `false` = js.native
  var delimiter: js.UndefOr[String] = js.native
  var partition: js.UndefOr[Double] = js.native
  var partitioned: js.UndefOr[Boolean] = js.native
}

object Delimited {
  @scala.inline
  def apply(delimited: `false`): Delimited = {
    val __obj = js.Dynamic.literal(delimited = delimited.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delimited]
  }
  @scala.inline
  implicit class DelimitedOps[Self <: Delimited] (val x: Self) extends AnyVal {
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
    def setDelimited(value: `false`): Self = this.set("delimited", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setPartition(value: Double): Self = this.set("partition", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartition: Self = this.set("partition", js.undefined)
    @scala.inline
    def setPartitioned(value: Boolean): Self = this.set("partitioned", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartitioned: Self = this.set("partitioned", js.undefined)
  }
  
}

