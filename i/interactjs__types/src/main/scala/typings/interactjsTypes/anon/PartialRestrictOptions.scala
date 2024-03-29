package typings.interactjsTypes.anon

import typings.interactjsTypes.coreTypesMod.ActionName
import typings.interactjsTypes.coreTypesMod.RectResolvable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@interactjs/types.@interactjs/modifiers/restrict/pointer.RestrictOptions> */
trait PartialRestrictOptions extends StObject {
  
  var elementRect: js.UndefOr[typings.interactjsTypes.coreTypesMod.Rect] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var endOnly: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[typings.interactjsTypes.coreTypesMod.Rect] = js.undefined
  
  var restriction: js.UndefOr[
    RectResolvable[
      js.Tuple3[Double, Double, typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]]
    ]
  ] = js.undefined
}
object PartialRestrictOptions {
  
  inline def apply(): PartialRestrictOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRestrictOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRestrictOptions] (val x: Self) extends AnyVal {
    
    inline def setElementRect(value: typings.interactjsTypes.coreTypesMod.Rect): Self = StObject.set(x, "elementRect", value.asInstanceOf[js.Any])
    
    inline def setElementRectUndefined: Self = StObject.set(x, "elementRect", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEndOnly(value: Boolean): Self = StObject.set(x, "endOnly", value.asInstanceOf[js.Any])
    
    inline def setEndOnlyUndefined: Self = StObject.set(x, "endOnly", js.undefined)
    
    inline def setOffset(value: typings.interactjsTypes.coreTypesMod.Rect): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setRestriction(
      value: RectResolvable[
          js.Tuple3[Double, Double, typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]]
        ]
    ): Self = StObject.set(x, "restriction", value.asInstanceOf[js.Any])
    
    inline def setRestrictionFunction1(
      value: js.Tuple3[Double, Double, typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]] => typings.interactjsTypes.coreTypesMod.Rect | typings.interactjsTypes.coreTypesMod.Element
    ): Self = StObject.set(x, "restriction", js.Any.fromFunction1(value))
    
    inline def setRestrictionUndefined: Self = StObject.set(x, "restriction", js.undefined)
  }
}
