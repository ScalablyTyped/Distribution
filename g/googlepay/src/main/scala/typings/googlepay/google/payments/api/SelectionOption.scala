package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Detailed info for a selectable option.
  */
@js.native
trait SelectionOption extends js.Object {
  
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
  implicit class SelectionOptionOps[Self <: SelectionOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
}
