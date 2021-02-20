package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/GridListTile.GridListTileClassKey>> */
@js.native
trait PartialStyleRulesGridList extends StObject {
  
  var imgFullHeight: js.UndefOr[CSSProperties] = js.native
  
  var imgFullWidth: js.UndefOr[CSSProperties] = js.native
  
  var root: js.UndefOr[CSSProperties] = js.native
  
  var tile: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesGridList {
  
  @scala.inline
  def apply(): PartialStyleRulesGridList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesGridList]
  }
  
  @scala.inline
  implicit class PartialStyleRulesGridListMutableBuilder[Self <: PartialStyleRulesGridList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImgFullHeight(value: CSSProperties): Self = StObject.set(x, "imgFullHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgFullHeightUndefined: Self = StObject.set(x, "imgFullHeight", js.undefined)
    
    @scala.inline
    def setImgFullWidth(value: CSSProperties): Self = StObject.set(x, "imgFullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgFullWidthUndefined: Self = StObject.set(x, "imgFullWidth", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setTile(value: CSSProperties): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
  }
}
