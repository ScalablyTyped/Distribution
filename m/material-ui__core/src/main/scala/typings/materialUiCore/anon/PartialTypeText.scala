package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/createPalette.TypeText> */
trait PartialTypeText extends StObject {
  
  var disabled: js.UndefOr[String] = js.undefined
  
  var hint: js.UndefOr[String] = js.undefined
  
  var primary: js.UndefOr[String] = js.undefined
  
  var secondary: js.UndefOr[String] = js.undefined
}
object PartialTypeText {
  
  inline def apply(): PartialTypeText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTypeText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialTypeText] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setSecondary(value: String): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
  }
}
