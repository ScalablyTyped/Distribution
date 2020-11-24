package typings.maximMazurokGapiClientAdmin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoolValue extends js.Object {
  
  /** Boolean value of the parameter. */
  var boolValue: js.UndefOr[Boolean] = js.native
  
  /** Integer value of the parameter. */
  var intValue: js.UndefOr[String] = js.native
  
  /**
    * Nested parameter value pairs associated with this parameter. Complex value type for a parameter are returned as a list of parameter values. For example, the address
    * parameter may have a value as [{parameter: [{name: city, value: abc}]}]
    */
  var messageValue: js.UndefOr[Parameter] = js.native
  
  /** Integer values of the parameter. */
  var multiIntValue: js.UndefOr[js.Array[String]] = js.native
  
  /** List of messageValue objects. */
  var multiMessageValue: js.UndefOr[js.Array[Parameter]] = js.native
  
  /** String values of the parameter. */
  var multiValue: js.UndefOr[js.Array[String]] = js.native
  
  /** The name of the parameter. */
  var name: js.UndefOr[String] = js.native
  
  /** String value of the parameter. */
  var value: js.UndefOr[String] = js.native
}
object BoolValue {
  
  @scala.inline
  def apply(): BoolValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoolValue]
  }
  
  @scala.inline
  implicit class BoolValueOps[Self <: BoolValue] (val x: Self) extends AnyVal {
    
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
    def setBoolValue(value: Boolean): Self = this.set("boolValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoolValue: Self = this.set("boolValue", js.undefined)
    
    @scala.inline
    def setIntValue(value: String): Self = this.set("intValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntValue: Self = this.set("intValue", js.undefined)
    
    @scala.inline
    def setMessageValue(value: Parameter): Self = this.set("messageValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageValue: Self = this.set("messageValue", js.undefined)
    
    @scala.inline
    def setMultiIntValueVarargs(value: String*): Self = this.set("multiIntValue", js.Array(value :_*))
    
    @scala.inline
    def setMultiIntValue(value: js.Array[String]): Self = this.set("multiIntValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiIntValue: Self = this.set("multiIntValue", js.undefined)
    
    @scala.inline
    def setMultiMessageValueVarargs(value: Parameter*): Self = this.set("multiMessageValue", js.Array(value :_*))
    
    @scala.inline
    def setMultiMessageValue(value: js.Array[Parameter]): Self = this.set("multiMessageValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiMessageValue: Self = this.set("multiMessageValue", js.undefined)
    
    @scala.inline
    def setMultiValueVarargs(value: String*): Self = this.set("multiValue", js.Array(value :_*))
    
    @scala.inline
    def setMultiValue(value: js.Array[String]): Self = this.set("multiValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiValue: Self = this.set("multiValue", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
