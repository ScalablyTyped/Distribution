package typings.materialUiCore.anon

import typings.materialUiCore.materialUiCoreStrings.end
import typings.materialUiCore.materialUiCoreStrings.filled
import typings.materialUiCore.materialUiCoreStrings.outlined
import typings.materialUiCore.materialUiCoreStrings.standard
import typings.materialUiCore.materialUiCoreStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisablePointerEvents extends StObject {
  
  var disablePointerEvents: js.UndefOr[Boolean] = js.undefined
  
  var disableTypography: js.UndefOr[Boolean] = js.undefined
  
  var position: start | end
  
  var variant: js.UndefOr[standard | outlined | filled] = js.undefined
}
object DisablePointerEvents {
  
  inline def apply(position: start | end): DisablePointerEvents = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisablePointerEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisablePointerEvents] (val x: Self) extends AnyVal {
    
    inline def setDisablePointerEvents(value: Boolean): Self = StObject.set(x, "disablePointerEvents", value.asInstanceOf[js.Any])
    
    inline def setDisablePointerEventsUndefined: Self = StObject.set(x, "disablePointerEvents", js.undefined)
    
    inline def setDisableTypography(value: Boolean): Self = StObject.set(x, "disableTypography", value.asInstanceOf[js.Any])
    
    inline def setDisableTypographyUndefined: Self = StObject.set(x, "disableTypography", js.undefined)
    
    inline def setPosition(value: start | end): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setVariant(value: standard | outlined | filled): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
