package typings.interactjsTypes.anon

import typings.interactjsTypes.coreTypesMod.ActionName
import typings.interactjsTypes.coreTypesMod.Point
import typings.interactjsTypes.coreTypesMod.RectResolvable
import typings.interactjsTypes.interactjsTypesStrings.startCoords
import typings.interactjsTypes.modifiersSnapPointerMod.SnapTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@interactjs/types.@interactjs/modifiers/snap/size.SnapSizeOptions> */
trait PartialSnapSizeOptions extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var endOnly: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[
    Point | RectResolvable[js.Array[typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]]] | startCoords | Null
  ] = js.undefined
  
  var range: js.UndefOr[Double] = js.undefined
  
  var targets: js.UndefOr[js.Array[SnapTarget] | Null] = js.undefined
}
object PartialSnapSizeOptions {
  
  inline def apply(): PartialSnapSizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSnapSizeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialSnapSizeOptions] (val x: Self) extends AnyVal {
    
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
    
    inline def setRange(value: Double): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setTargets(value: js.Array[SnapTarget]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsNull: Self = StObject.set(x, "targets", null)
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    inline def setTargetsVarargs(value: SnapTarget*): Self = StObject.set(x, "targets", js.Array(value*))
  }
}
