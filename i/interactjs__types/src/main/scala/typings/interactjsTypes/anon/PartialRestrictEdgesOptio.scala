package typings.interactjsTypes.anon

import typings.interactjsTypes.coreTypesMod.ActionName
import typings.interactjsTypes.coreTypesMod.RectResolvable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@interactjs/types.@interactjs/modifiers/restrict/edges.RestrictEdgesOptions> */
trait PartialRestrictEdgesOptio extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var endOnly: js.UndefOr[Boolean] = js.undefined
  
  var inner: js.UndefOr[
    RectResolvable[
      js.Tuple3[Double, Double, typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]]
    ]
  ] = js.undefined
  
  var offset: js.UndefOr[typings.interactjsTypes.coreTypesMod.Rect] = js.undefined
  
  var outer: js.UndefOr[
    RectResolvable[
      js.Tuple3[Double, Double, typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]]
    ]
  ] = js.undefined
}
object PartialRestrictEdgesOptio {
  
  inline def apply(): PartialRestrictEdgesOptio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRestrictEdgesOptio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRestrictEdgesOptio] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEndOnly(value: Boolean): Self = StObject.set(x, "endOnly", value.asInstanceOf[js.Any])
    
    inline def setEndOnlyUndefined: Self = StObject.set(x, "endOnly", js.undefined)
    
    inline def setInner(
      value: RectResolvable[
          js.Tuple3[Double, Double, typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]]
        ]
    ): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
    
    inline def setInnerFunction1(
      value: js.Tuple3[Double, Double, typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]] => typings.interactjsTypes.coreTypesMod.Rect | typings.interactjsTypes.coreTypesMod.Element
    ): Self = StObject.set(x, "inner", js.Any.fromFunction1(value))
    
    inline def setInnerUndefined: Self = StObject.set(x, "inner", js.undefined)
    
    inline def setOffset(value: typings.interactjsTypes.coreTypesMod.Rect): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOuter(
      value: RectResolvable[
          js.Tuple3[Double, Double, typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]]
        ]
    ): Self = StObject.set(x, "outer", value.asInstanceOf[js.Any])
    
    inline def setOuterFunction1(
      value: js.Tuple3[Double, Double, typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]] => typings.interactjsTypes.coreTypesMod.Rect | typings.interactjsTypes.coreTypesMod.Element
    ): Self = StObject.set(x, "outer", js.Any.fromFunction1(value))
    
    inline def setOuterUndefined: Self = StObject.set(x, "outer", js.undefined)
  }
}
