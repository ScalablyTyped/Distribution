package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/TableFooter.TableFooterClassKey>> */
trait PartialStyleRulesTableFoo extends StObject {
  
  var root: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesTableFoo {
  
  @scala.inline
  def apply(): PartialStyleRulesTableFoo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesTableFoo]
  }
  
  @scala.inline
  implicit class PartialStyleRulesTableFooMutableBuilder[Self <: PartialStyleRulesTableFoo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
