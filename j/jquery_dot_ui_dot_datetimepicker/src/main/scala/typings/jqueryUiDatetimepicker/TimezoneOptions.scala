package typings.jqueryUiDatetimepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimezoneOptions extends StObject {
  
  var label: String = js.native
  
  var value: Double = js.native
}
object TimezoneOptions {
  
  @scala.inline
  def apply(label: String, value: Double): TimezoneOptions = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimezoneOptions]
  }
  
  @scala.inline
  implicit class TimezoneOptionsMutableBuilder[Self <: TimezoneOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
