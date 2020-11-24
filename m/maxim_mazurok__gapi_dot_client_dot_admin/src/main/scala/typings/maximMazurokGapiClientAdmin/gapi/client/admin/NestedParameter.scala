package typings.maximMazurokGapiClientAdmin.gapi.client.admin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NestedParameter extends js.Object {
  
  /** Boolean value of the parameter. */
  var boolValue: js.UndefOr[Boolean] = js.native
  
  /** Integer value of the parameter. */
  var intValue: js.UndefOr[String] = js.native
  
  /** Multiple boolean values of the parameter. */
  var multiBoolValue: js.UndefOr[js.Array[Boolean]] = js.native
  
  /** Multiple integer values of the parameter. */
  var multiIntValue: js.UndefOr[js.Array[String]] = js.native
  
  /** Multiple string values of the parameter. */
  var multiValue: js.UndefOr[js.Array[String]] = js.native
  
  /** The name of the parameter. */
  var name: js.UndefOr[String] = js.native
  
  /** String value of the parameter. */
  var value: js.UndefOr[String] = js.native
}
object NestedParameter {
  
  @scala.inline
  def apply(): NestedParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NestedParameter]
  }
  
  @scala.inline
  implicit class NestedParameterOps[Self <: NestedParameter] (val x: Self) extends AnyVal {
    
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
    def setMultiBoolValueVarargs(value: Boolean*): Self = this.set("multiBoolValue", js.Array(value :_*))
    
    @scala.inline
    def setMultiBoolValue(value: js.Array[Boolean]): Self = this.set("multiBoolValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiBoolValue: Self = this.set("multiBoolValue", js.undefined)
    
    @scala.inline
    def setMultiIntValueVarargs(value: String*): Self = this.set("multiIntValue", js.Array(value :_*))
    
    @scala.inline
    def setMultiIntValue(value: js.Array[String]): Self = this.set("multiIntValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiIntValue: Self = this.set("multiIntValue", js.undefined)
    
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
