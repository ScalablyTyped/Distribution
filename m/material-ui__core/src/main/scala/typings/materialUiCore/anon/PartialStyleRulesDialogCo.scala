package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/DialogContentText.DialogContentTextClassKey>> */
trait PartialStyleRulesDialogCo extends StObject {
  
  var root: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesDialogCo {
  
  inline def apply(): PartialStyleRulesDialogCo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesDialogCo]
  }
  
  extension [Self <: PartialStyleRulesDialogCo](x: Self) {
    
    inline def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
