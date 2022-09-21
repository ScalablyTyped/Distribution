package typings.interactjsTypes.anon

import typings.interactjsTypes.typesMod.ActionName
import typings.interactjsTypes.typesMod.RectResolvable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@interactjs/types.@interactjs/modifiers/restrict/pointer.RestrictOptions & {  elementRect :{  top :number,   left :number,   bottom :number,   right :number}}> */
trait PartialRestrictOptionsele extends StObject {
  
  var elementRect: js.UndefOr[typings.interactjsTypes.typesMod.Rect] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var endOnly: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[typings.interactjsTypes.typesMod.Rect] = js.undefined
  
  var restriction: js.UndefOr[
    RectResolvable[
      js.Tuple3[Double, Double, typings.interactjsTypes.interactionMod.Interaction[ActionName]]
    ]
  ] = js.undefined
}
object PartialRestrictOptionsele {
  
  inline def apply(): PartialRestrictOptionsele = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRestrictOptionsele]
  }
  
  extension [Self <: PartialRestrictOptionsele](x: Self) {
    
    inline def setElementRect(value: typings.interactjsTypes.typesMod.Rect): Self = StObject.set(x, "elementRect", value.asInstanceOf[js.Any])
    
    inline def setElementRectUndefined: Self = StObject.set(x, "elementRect", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEndOnly(value: Boolean): Self = StObject.set(x, "endOnly", value.asInstanceOf[js.Any])
    
    inline def setEndOnlyUndefined: Self = StObject.set(x, "endOnly", js.undefined)
    
    inline def setOffset(value: typings.interactjsTypes.typesMod.Rect): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setRestriction(
      value: RectResolvable[
          js.Tuple3[Double, Double, typings.interactjsTypes.interactionMod.Interaction[ActionName]]
        ]
    ): Self = StObject.set(x, "restriction", value.asInstanceOf[js.Any])
    
    inline def setRestrictionFunction1(
      value: js.Tuple3[Double, Double, typings.interactjsTypes.interactionMod.Interaction[ActionName]] => typings.interactjsTypes.typesMod.Rect | typings.interactjsTypes.typesMod.Element
    ): Self = StObject.set(x, "restriction", js.Any.fromFunction1(value))
    
    inline def setRestrictionUndefined: Self = StObject.set(x, "restriction", js.undefined)
  }
}
