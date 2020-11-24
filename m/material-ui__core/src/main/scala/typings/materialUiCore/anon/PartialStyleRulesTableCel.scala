package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/TableCell.TableCellClassKey>> */
@js.native
trait PartialStyleRulesTableCel extends js.Object {
  
  var body: js.UndefOr[CSSProperties] = js.native
  
  var footer: js.UndefOr[CSSProperties] = js.native
  
  var head: js.UndefOr[CSSProperties] = js.native
  
  var numeric: js.UndefOr[CSSProperties] = js.native
  
  var paddingCheckbox: js.UndefOr[CSSProperties] = js.native
  
  var paddingDense: js.UndefOr[CSSProperties] = js.native
  
  var paddingNone: js.UndefOr[CSSProperties] = js.native
  
  var root: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesTableCel {
  
  @scala.inline
  def apply(): PartialStyleRulesTableCel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesTableCel]
  }
  
  @scala.inline
  implicit class PartialStyleRulesTableCelOps[Self <: PartialStyleRulesTableCel] (val x: Self) extends AnyVal {
    
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
    def setBody(value: CSSProperties): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setFooter(value: CSSProperties): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setHead(value: CSSProperties): Self = this.set("head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHead: Self = this.set("head", js.undefined)
    
    @scala.inline
    def setNumeric(value: CSSProperties): Self = this.set("numeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumeric: Self = this.set("numeric", js.undefined)
    
    @scala.inline
    def setPaddingCheckbox(value: CSSProperties): Self = this.set("paddingCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingCheckbox: Self = this.set("paddingCheckbox", js.undefined)
    
    @scala.inline
    def setPaddingDense(value: CSSProperties): Self = this.set("paddingDense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingDense: Self = this.set("paddingDense", js.undefined)
    
    @scala.inline
    def setPaddingNone(value: CSSProperties): Self = this.set("paddingNone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingNone: Self = this.set("paddingNone", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
