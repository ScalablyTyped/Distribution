package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Partitioned extends js.Object {
  var delimited: js.UndefOr[Boolean] = js.native
  var delimiter: js.UndefOr[String] = js.native
  var partitioned: js.UndefOr[Boolean] = js.native
}

object Partitioned {
  @scala.inline
  def apply(): Partitioned = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partitioned]
  }
  @scala.inline
  implicit class PartitionedOps[Self <: Partitioned] (val x: Self) extends AnyVal {
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
    def setDelimited(value: Boolean): Self = this.set("delimited", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimited: Self = this.set("delimited", js.undefined)
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setPartitioned(value: Boolean): Self = this.set("partitioned", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartitioned: Self = this.set("partitioned", js.undefined)
  }
  
}

