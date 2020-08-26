package typings.layuiSrc.layui

import typings.layuiSrc.layuiSrcStrings.count
import typings.layuiSrc.layuiSrcStrings.limit
import typings.layuiSrc.layuiSrcStrings.next
import typings.layuiSrc.layuiSrcStrings.page
import typings.layuiSrc.layuiSrcStrings.prev
import typings.layuiSrc.layuiSrcStrings.skip
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageOptions extends js.Object {
  var count: js.UndefOr[Double] = js.native
  var curr: js.UndefOr[Double] = js.native
  // id选择器 不加#
  var elem: js.UndefOr[String | HTMLElement] = js.native
  var first: js.UndefOr[String] = js.native
  var groups: js.UndefOr[Double] = js.native
  var hash: js.UndefOr[String | Boolean] = js.native
  var jump: js.UndefOr[js.Function2[/* obj */ this.type, /* first */ Boolean, Unit]] = js.native
  var last: js.UndefOr[String] = js.native
  var layout: js.UndefOr[js.Array[count | prev | page | next | limit | skip]] = js.native
  var limit: js.UndefOr[Double] = js.native
  var limits: js.UndefOr[js.Array[Double]] = js.native
  var next: js.UndefOr[String] = js.native
  var prev: js.UndefOr[String] = js.native
  var theme: js.UndefOr[String] = js.native
}

object PageOptions {
  @scala.inline
  def apply(): PageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageOptions]
  }
  @scala.inline
  implicit class PageOptionsOps[Self <: PageOptions] (val x: Self) extends AnyVal {
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
    def setCurr(value: Double): Self = this.set("curr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurr: Self = this.set("curr", js.undefined)
    @scala.inline
    def setElem(value: String | HTMLElement): Self = this.set("elem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElem: Self = this.set("elem", js.undefined)
    @scala.inline
    def setFirst(value: String): Self = this.set("first", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirst: Self = this.set("first", js.undefined)
    @scala.inline
    def setGroups(value: Double): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    @scala.inline
    def setHash(value: String | Boolean): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    @scala.inline
    def setJump(value: (PageOptions, /* first */ Boolean) => Unit): Self = this.set("jump", js.Any.fromFunction2(value))
    @scala.inline
    def deleteJump: Self = this.set("jump", js.undefined)
    @scala.inline
    def setLast(value: String): Self = this.set("last", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast: Self = this.set("last", js.undefined)
    @scala.inline
    def setLayoutVarargs(value: (count | prev | page | next | limit | skip)*): Self = this.set("layout", js.Array(value :_*))
    @scala.inline
    def setLayout(value: js.Array[count | prev | page | next | limit | skip]): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setLimitsVarargs(value: Double*): Self = this.set("limits", js.Array(value :_*))
    @scala.inline
    def setLimits(value: js.Array[Double]): Self = this.set("limits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimits: Self = this.set("limits", js.undefined)
    @scala.inline
    def setNext(value: String): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    @scala.inline
    def setPrev(value: String): Self = this.set("prev", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrev: Self = this.set("prev", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

