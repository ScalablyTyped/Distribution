package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Detailed info for a selectable option.
  */
@js.native
trait SelectionOption extends StObject {
  
  /**
    * A descriptive text that will be displayed below option label.
    *
    * This field is optional.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * A unique identifier for the option.
    *
    * This field is required.
    */
  var id: String = js.native
  
  /**
    * The label to be displayed as the option.
    *
    * This field is required.
    */
  var label: String = js.native
}
object SelectionOption {
  
  @scala.inline
  def apply(id: String, label: String): SelectionOption = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionOption]
  }
  
  @scala.inline
  implicit class SelectionOptionMutableBuilder[Self <: SelectionOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
