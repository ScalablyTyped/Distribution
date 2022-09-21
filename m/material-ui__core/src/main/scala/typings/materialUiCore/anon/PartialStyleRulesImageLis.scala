package typings.materialUiCore.anon

import typings.materialUiStyles.withStylesWithStylesMod.CSSProperties
import typings.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties
import typings.materialUiStyles.withStylesWithStylesMod.PropsFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ImageListItem.ImageListItemClassKey, {}>> */
trait PartialStyleRulesImageLis extends StObject {
  
  var imgFullHeight: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var imgFullWidth: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var item: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var root: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
}
object PartialStyleRulesImageLis {
  
  inline def apply(): PartialStyleRulesImageLis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesImageLis]
  }
  
  extension [Self <: PartialStyleRulesImageLis](x: Self) {
    
    inline def setImgFullHeight(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "imgFullHeight", value.asInstanceOf[js.Any])
    
    inline def setImgFullHeightFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "imgFullHeight", js.Any.fromFunction1(value))
    
    inline def setImgFullHeightUndefined: Self = StObject.set(x, "imgFullHeight", js.undefined)
    
    inline def setImgFullWidth(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "imgFullWidth", value.asInstanceOf[js.Any])
    
    inline def setImgFullWidthFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "imgFullWidth", js.Any.fromFunction1(value))
    
    inline def setImgFullWidthUndefined: Self = StObject.set(x, "imgFullWidth", js.undefined)
    
    inline def setItem(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setRoot(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
