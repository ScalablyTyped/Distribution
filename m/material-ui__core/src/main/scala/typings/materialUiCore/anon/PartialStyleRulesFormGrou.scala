package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/FormGroup.FormGroupClassKey>> */
@js.native
trait PartialStyleRulesFormGrou extends StObject {
  
  var root: js.UndefOr[CSSProperties] = js.native
  
  var row: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesFormGrou {
  
  @scala.inline
  def apply(): PartialStyleRulesFormGrou = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesFormGrou]
  }
  
  @scala.inline
  implicit class PartialStyleRulesFormGrouMutableBuilder[Self <: PartialStyleRulesFormGrou] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setRow(value: CSSProperties): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
