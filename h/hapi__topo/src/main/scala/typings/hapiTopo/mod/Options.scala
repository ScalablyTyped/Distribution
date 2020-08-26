package typings.hapiTopo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The group or groups the added items must come after
    */
  val after: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * The group or groups the added items must come before
    */
  val before: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * The sorting group the added items belong to
    */
  val group: js.UndefOr[String] = js.native
  /**
    * A number used to sort items with equal before/after requirements
    */
  val sort: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAfterVarargs(value: String*): Self = this.set("after", js.Array(value :_*))
    @scala.inline
    def setAfter(value: String | js.Array[String]): Self = this.set("after", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    @scala.inline
    def setBeforeVarargs(value: String*): Self = this.set("before", js.Array(value :_*))
    @scala.inline
    def setBefore(value: String | js.Array[String]): Self = this.set("before", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setSort(value: Double): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
  
}

