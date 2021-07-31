package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/TableRow.TableRowClassKey>> */
trait PartialStyleRulesTableRow extends StObject {
  
  var footer: js.UndefOr[CSSProperties] = js.undefined
  
  var head: js.UndefOr[CSSProperties] = js.undefined
  
  var hover: js.UndefOr[CSSProperties] = js.undefined
  
  var root: js.UndefOr[CSSProperties] = js.undefined
  
  var selected: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesTableRow {
  
  @scala.inline
  def apply(): PartialStyleRulesTableRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesTableRow]
  }
  
  @scala.inline
  implicit class PartialStyleRulesTableRowMutableBuilder[Self <: PartialStyleRulesTableRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFooter(value: CSSProperties): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setHead(value: CSSProperties): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
    
    @scala.inline
    def setHover(value: CSSProperties): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setSelected(value: CSSProperties): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
