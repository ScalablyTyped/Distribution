package typings.interactjsTypes.anon

import typings.interactjsTypes.coreTypesMod.ActionName
import typings.interactjsTypes.coreTypesMod.Point
import typings.interactjsTypes.coreTypesMod.RectResolvable
import typings.interactjsTypes.interactjsTypesStrings.startCoords
import typings.interactjsTypes.modifiersSnapPointerMod.SnapTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@interactjs/types.@interactjs/modifiers/snap/pointer.SnapOptions> */
trait PartialSnapOptions extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var endOnly: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[
    Point | RectResolvable[js.Array[typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]]] | startCoords | Null
  ] = js.undefined
  
  var offsetWithOrigin: js.UndefOr[Boolean] = js.undefined
  
  var origin: js.UndefOr[
    RectResolvable[js.Array[typings.interactjsTypes.coreTypesMod.Element]] | Point | Null
  ] = js.undefined
  
  var range: js.UndefOr[Double] = js.undefined
  
  var relativePoints: js.UndefOr[js.Array[Point] | Null] = js.undefined
  
  var targets: js.UndefOr[js.Array[SnapTarget] | Null] = js.undefined
}
object PartialSnapOptions {
  
  inline def apply(): PartialSnapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSnapOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialSnapOptions] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEndOnly(value: Boolean): Self = StObject.set(x, "endOnly", value.asInstanceOf[js.Any])
    
    inline def setEndOnlyUndefined: Self = StObject.set(x, "endOnly", js.undefined)
    
    inline def setOffset(
      value: Point | RectResolvable[js.Array[typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]]] | startCoords
    ): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetFunction1(
      value: js.Array[typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]] => typings.interactjsTypes.coreTypesMod.Rect | typings.interactjsTypes.coreTypesMod.Element
    ): Self = StObject.set(x, "offset", js.Any.fromFunction1(value))
    
    inline def setOffsetNull: Self = StObject.set(x, "offset", null)
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOffsetWithOrigin(value: Boolean): Self = StObject.set(x, "offsetWithOrigin", value.asInstanceOf[js.Any])
    
    inline def setOffsetWithOriginUndefined: Self = StObject.set(x, "offsetWithOrigin", js.undefined)
    
    inline def setOrigin(value: RectResolvable[js.Array[typings.interactjsTypes.coreTypesMod.Element]] | Point): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginFunction1(
      value: js.Array[typings.interactjsTypes.coreTypesMod.Element] => typings.interactjsTypes.coreTypesMod.Rect | typings.interactjsTypes.coreTypesMod.Element
    ): Self = StObject.set(x, "origin", js.Any.fromFunction1(value))
    
    inline def setOriginNull: Self = StObject.set(x, "origin", null)
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setRange(value: Double): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRelativePoints(value: js.Array[Point]): Self = StObject.set(x, "relativePoints", value.asInstanceOf[js.Any])
    
    inline def setRelativePointsNull: Self = StObject.set(x, "relativePoints", null)
    
    inline def setRelativePointsUndefined: Self = StObject.set(x, "relativePoints", js.undefined)
    
    inline def setRelativePointsVarargs(value: Point*): Self = StObject.set(x, "relativePoints", js.Array(value*))
    
    inline def setTargets(value: js.Array[SnapTarget]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsNull: Self = StObject.set(x, "targets", null)
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    inline def setTargetsVarargs(value: SnapTarget*): Self = StObject.set(x, "targets", js.Array(value*))
  }
}
