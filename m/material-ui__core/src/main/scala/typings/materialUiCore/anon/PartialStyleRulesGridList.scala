package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/GridListTile.GridListTileClassKey>> */
trait PartialStyleRulesGridList extends StObject {
  
  var imgFullHeight: js.UndefOr[CSSProperties] = js.undefined
  
  var imgFullWidth: js.UndefOr[CSSProperties] = js.undefined
  
  var root: js.UndefOr[CSSProperties] = js.undefined
  
  var tile: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesGridList {
  
  inline def apply(): PartialStyleRulesGridList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesGridList]
  }
  
  extension [Self <: PartialStyleRulesGridList](x: Self) {
    
    inline def setImgFullHeight(value: CSSProperties): Self = StObject.set(x, "imgFullHeight", value.asInstanceOf[js.Any])
    
    inline def setImgFullHeightUndefined: Self = StObject.set(x, "imgFullHeight", js.undefined)
    
    inline def setImgFullWidth(value: CSSProperties): Self = StObject.set(x, "imgFullWidth", value.asInstanceOf[js.Any])
    
    inline def setImgFullWidthUndefined: Self = StObject.set(x, "imgFullWidth", js.undefined)
    
    inline def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setTile(value: CSSProperties): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    
    inline def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
  }
}
