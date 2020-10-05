package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/TableCell/TableCell.TableCellClassKey>> */
@js.native
trait PartialClassNameMapTableCBody extends js.Object {
  var body: js.UndefOr[String] = js.native
  var footer: js.UndefOr[String] = js.native
  var head: js.UndefOr[String] = js.native
  var numeric: js.UndefOr[String] = js.native
  var paddingCheckbox: js.UndefOr[String] = js.native
  var paddingDense: js.UndefOr[String] = js.native
  var paddingNone: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapTableCBody {
  @scala.inline
  def apply(): PartialClassNameMapTableCBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapTableCBody]
  }
  @scala.inline
  implicit class PartialClassNameMapTableCBodyOps[Self <: PartialClassNameMapTableCBody] (val x: Self) extends AnyVal {
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setFooter(value: String): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setHead(value: String): Self = this.set("head", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHead: Self = this.set("head", js.undefined)
    @scala.inline
    def setNumeric(value: String): Self = this.set("numeric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumeric: Self = this.set("numeric", js.undefined)
    @scala.inline
    def setPaddingCheckbox(value: String): Self = this.set("paddingCheckbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingCheckbox: Self = this.set("paddingCheckbox", js.undefined)
    @scala.inline
    def setPaddingDense(value: String): Self = this.set("paddingDense", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingDense: Self = this.set("paddingDense", js.undefined)
    @scala.inline
    def setPaddingNone(value: String): Self = this.set("paddingNone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingNone: Self = this.set("paddingNone", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

