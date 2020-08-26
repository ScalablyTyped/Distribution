package typings.koaRequestid.anon

import typings.koaRequestid.koaRequestidBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expose extends js.Object {
  var expose: js.UndefOr[String | `false`] = js.native
  var header: js.UndefOr[String | `false`] = js.native
  var query: js.UndefOr[String | `false`] = js.native
}

object Expose {
  @scala.inline
  def apply(): Expose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expose]
  }
  @scala.inline
  implicit class ExposeOps[Self <: Expose] (val x: Self) extends AnyVal {
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
    def setExpose(value: String | `false`): Self = this.set("expose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpose: Self = this.set("expose", js.undefined)
    @scala.inline
    def setHeader(value: String | `false`): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setQuery(value: String | `false`): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
  
}

