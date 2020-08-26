package typings.massive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetrievalOptions extends js.Object {
  var exprs: js.UndefOr[AnyObject[String]] = js.native
  var fields: js.UndefOr[js.Array[String]] = js.native
  var limit: js.UndefOr[Double] = js.native
  var offset: js.UndefOr[Double] = js.native
  var order: js.UndefOr[js.Array[OrderingOptions]] = js.native
  var pageLength: js.UndefOr[Double] = js.native
}

object RetrievalOptions {
  @scala.inline
  def apply(): RetrievalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetrievalOptions]
  }
  @scala.inline
  implicit class RetrievalOptionsOps[Self <: RetrievalOptions] (val x: Self) extends AnyVal {
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
    def setExprs(value: AnyObject[String]): Self = this.set("exprs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExprs: Self = this.set("exprs", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOrderVarargs(value: OrderingOptions*): Self = this.set("order", js.Array(value :_*))
    @scala.inline
    def setOrder(value: js.Array[OrderingOptions]): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setPageLength(value: Double): Self = this.set("pageLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageLength: Self = this.set("pageLength", js.undefined)
  }
  
}

