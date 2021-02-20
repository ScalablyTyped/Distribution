package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/createPalette.TypeText> */
@js.native
trait PartialTypeText extends StObject {
  
  var disabled: js.UndefOr[String] = js.native
  
  var hint: js.UndefOr[String] = js.native
  
  var primary: js.UndefOr[String] = js.native
  
  var secondary: js.UndefOr[String] = js.native
}
object PartialTypeText {
  
  @scala.inline
  def apply(): PartialTypeText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTypeText]
  }
  
  @scala.inline
  implicit class PartialTypeTextMutableBuilder[Self <: PartialTypeText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    @scala.inline
    def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setSecondary(value: String): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
  }
}
