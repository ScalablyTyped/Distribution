package typings.interactjsTypes.anon

import typings.interactjsTypes.typesMod.ActionName
import typings.interactjsTypes.typesMod.Point
import typings.interactjsTypes.typesMod.RectResolvable
import typings.interactjsTypes.typesMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @interactjs/types.@interactjs/modifiers/restrict/size.RestrictSizeOptions & {  inner :@interactjs/types.@interactjs/core/types.Rect,   outer :@interactjs/types.@interactjs/core/types.Rect} */
trait RestrictSizeOptionsinnerR extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var endOnly: Boolean
  
  var inner: typings.interactjsTypes.typesMod.Rect
  
  var max: js.UndefOr[
    Size | Point | (RectResolvable[
      js.Tuple3[Double, Double, typings.interactjsTypes.interactionMod.Interaction[ActionName]]
    ])
  ] = js.undefined
  
  var min: js.UndefOr[
    Size | Point | (RectResolvable[
      js.Tuple3[Double, Double, typings.interactjsTypes.interactionMod.Interaction[ActionName]]
    ])
  ] = js.undefined
  
  var outer: typings.interactjsTypes.typesMod.Rect
}
object RestrictSizeOptionsinnerR {
  
  inline def apply(
    endOnly: Boolean,
    inner: typings.interactjsTypes.typesMod.Rect,
    outer: typings.interactjsTypes.typesMod.Rect
  ): RestrictSizeOptionsinnerR = {
    val __obj = js.Dynamic.literal(endOnly = endOnly.asInstanceOf[js.Any], inner = inner.asInstanceOf[js.Any], outer = outer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestrictSizeOptionsinnerR]
  }
  
  extension [Self <: RestrictSizeOptionsinnerR](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEndOnly(value: Boolean): Self = StObject.set(x, "endOnly", value.asInstanceOf[js.Any])
    
    inline def setInner(value: typings.interactjsTypes.typesMod.Rect): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
    
    inline def setMax(
      value: Size | Point | (RectResolvable[
          js.Tuple3[Double, Double, typings.interactjsTypes.interactionMod.Interaction[ActionName]]
        ])
    ): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxFunction1(
      value: js.Tuple3[Double, Double, typings.interactjsTypes.interactionMod.Interaction[ActionName]] => typings.interactjsTypes.typesMod.Rect | typings.interactjsTypes.typesMod.Element
    ): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(
      value: Size | Point | (RectResolvable[
          js.Tuple3[Double, Double, typings.interactjsTypes.interactionMod.Interaction[ActionName]]
        ])
    ): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinFunction1(
      value: js.Tuple3[Double, Double, typings.interactjsTypes.interactionMod.Interaction[ActionName]] => typings.interactjsTypes.typesMod.Rect | typings.interactjsTypes.typesMod.Element
    ): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setOuter(value: typings.interactjsTypes.typesMod.Rect): Self = StObject.set(x, "outer", value.asInstanceOf[js.Any])
  }
}
