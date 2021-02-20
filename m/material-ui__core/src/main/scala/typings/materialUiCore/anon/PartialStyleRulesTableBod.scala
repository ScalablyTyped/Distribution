package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/TableBody.TableBodyClassKey>> */
@js.native
trait PartialStyleRulesTableBod extends StObject {
  
  var root: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesTableBod {
  
  @scala.inline
  def apply(): PartialStyleRulesTableBod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesTableBod]
  }
  
  @scala.inline
  implicit class PartialStyleRulesTableBodMutableBuilder[Self <: PartialStyleRulesTableBod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
