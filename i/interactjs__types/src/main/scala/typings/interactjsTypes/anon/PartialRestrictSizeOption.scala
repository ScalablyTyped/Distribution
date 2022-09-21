package typings.interactjsTypes.anon

import typings.interactjsTypes.typesMod.ActionName
import typings.interactjsTypes.typesMod.Point
import typings.interactjsTypes.typesMod.RectResolvable
import typings.interactjsTypes.typesMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@interactjs/types.@interactjs/modifiers/restrict/size.RestrictSizeOptions> */
trait PartialRestrictSizeOption extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var endOnly: js.UndefOr[Boolean] = js.undefined
  
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
}
object PartialRestrictSizeOption {
  
  inline def apply(): PartialRestrictSizeOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRestrictSizeOption]
  }
  
  extension [Self <: PartialRestrictSizeOption](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEndOnly(value: Boolean): Self = StObject.set(x, "endOnly", value.asInstanceOf[js.Any])
    
    inline def setEndOnlyUndefined: Self = StObject.set(x, "endOnly", js.undefined)
    
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
  }
}
