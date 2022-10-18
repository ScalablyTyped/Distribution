package typings.interactjsTypes.anon

import typings.interactjsTypes.interactjsTypesStrings.preserve
import typings.interactjsTypes.modifiersTypesMod.Modifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@interactjs/types.@interactjs/modifiers/aspectRatio.AspectRatioOptions> */
trait PartialAspectRatioOptions extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var equalDelta: js.UndefOr[Boolean] = js.undefined
  
  var modifiers: js.UndefOr[js.Array[Modifier[Any, Any, Any, Any]]] = js.undefined
  
  var ratio: js.UndefOr[Double | preserve] = js.undefined
}
object PartialAspectRatioOptions {
  
  inline def apply(): PartialAspectRatioOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAspectRatioOptions]
  }
  
  extension [Self <: PartialAspectRatioOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEqualDelta(value: Boolean): Self = StObject.set(x, "equalDelta", value.asInstanceOf[js.Any])
    
    inline def setEqualDeltaUndefined: Self = StObject.set(x, "equalDelta", js.undefined)
    
    inline def setModifiers(value: js.Array[Modifier[Any, Any, Any, Any]]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setModifiersVarargs(value: (Modifier[Any, Any, Any, Any])*): Self = StObject.set(x, "modifiers", js.Array(value*))
    
    inline def setRatio(value: Double | preserve): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
  }
}
