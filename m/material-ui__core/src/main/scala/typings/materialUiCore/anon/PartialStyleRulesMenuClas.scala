package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Menu.MenuClassKey>> */
trait PartialStyleRulesMenuClas extends StObject {
  
  var paper: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesMenuClas {
  
  inline def apply(): PartialStyleRulesMenuClas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesMenuClas]
  }
  
  extension [Self <: PartialStyleRulesMenuClas](x: Self) {
    
    inline def setPaper(value: CSSProperties): Self = StObject.set(x, "paper", value.asInstanceOf[js.Any])
    
    inline def setPaperUndefined: Self = StObject.set(x, "paper", js.undefined)
  }
}
