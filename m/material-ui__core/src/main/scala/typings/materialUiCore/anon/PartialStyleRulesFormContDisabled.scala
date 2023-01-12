package typings.materialUiCore.anon

import typings.materialUiStyles.withStylesWithStylesMod.CSSProperties
import typings.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties
import typings.materialUiStyles.withStylesWithStylesMod.PropsFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/FormControlLabel.FormControlLabelClassKey, {}>> */
trait PartialStyleRulesFormContDisabled extends StObject {
  
  var disabled: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var label: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var labelPlacementBottom: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var labelPlacementStart: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var labelPlacementTop: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var root: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
}
object PartialStyleRulesFormContDisabled {
  
  inline def apply(): PartialStyleRulesFormContDisabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesFormContDisabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialStyleRulesFormContDisabled] (val x: Self) extends AnyVal {
    
    inline def setDisabled(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "disabled", js.Any.fromFunction1(value))
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setLabel(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    inline def setLabelPlacementBottom(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "labelPlacementBottom", value.asInstanceOf[js.Any])
    
    inline def setLabelPlacementBottomFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "labelPlacementBottom", js.Any.fromFunction1(value))
    
    inline def setLabelPlacementBottomUndefined: Self = StObject.set(x, "labelPlacementBottom", js.undefined)
    
    inline def setLabelPlacementStart(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "labelPlacementStart", value.asInstanceOf[js.Any])
    
    inline def setLabelPlacementStartFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "labelPlacementStart", js.Any.fromFunction1(value))
    
    inline def setLabelPlacementStartUndefined: Self = StObject.set(x, "labelPlacementStart", js.undefined)
    
    inline def setLabelPlacementTop(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "labelPlacementTop", value.asInstanceOf[js.Any])
    
    inline def setLabelPlacementTopFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "labelPlacementTop", js.Any.fromFunction1(value))
    
    inline def setLabelPlacementTopUndefined: Self = StObject.set(x, "labelPlacementTop", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setRoot(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
