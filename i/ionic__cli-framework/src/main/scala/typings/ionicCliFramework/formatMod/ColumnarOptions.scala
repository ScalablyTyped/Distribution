package typings.ionicCliFramework.formatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnarOptions extends js.Object {
  var headers: js.UndefOr[js.Array[String]] = js.native
  var hsep: js.UndefOr[String] = js.native
  var vsep: js.UndefOr[String] = js.native
}

object ColumnarOptions {
  @scala.inline
  def apply(): ColumnarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnarOptions]
  }
  @scala.inline
  implicit class ColumnarOptionsOps[Self <: ColumnarOptions] (val x: Self) extends AnyVal {
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
    def setHeadersVarargs(value: String*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHsep(value: String): Self = this.set("hsep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHsep: Self = this.set("hsep", js.undefined)
    @scala.inline
    def setVsep(value: String): Self = this.set("vsep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVsep: Self = this.set("vsep", js.undefined)
  }
  
}

