package typings.jui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Count extends js.Object {
  /**
    * @cfg {Integer} [count=0]
    * Total number of data records subject to paging)
    */
  var count: js.UndefOr[Double] = js.native
  var event: js.UndefOr[js.Any] = js.native
  /**
    * @cfg {Integer} [pageCount=10]
    * Number of data records per page
    */
  var pageCount: js.UndefOr[Double] = js.native
  /**
    * @cfg {Integer} [screenCount=5]
    * Number of pages shown on the paging screen
    */
  var screenCount: js.UndefOr[Double] = js.native
  var tpl: js.UndefOr[js.Any] = js.native
}

object Count {
  @scala.inline
  def apply(): Count = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Count]
  }
  @scala.inline
  implicit class CountOps[Self <: Count] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setEvent(value: js.Any): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setPageCount(value: Double): Self = this.set("pageCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageCount: Self = this.set("pageCount", js.undefined)
    @scala.inline
    def setScreenCount(value: Double): Self = this.set("screenCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenCount: Self = this.set("screenCount", js.undefined)
    @scala.inline
    def setTpl(value: js.Any): Self = this.set("tpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTpl: Self = this.set("tpl", js.undefined)
  }
  
}

