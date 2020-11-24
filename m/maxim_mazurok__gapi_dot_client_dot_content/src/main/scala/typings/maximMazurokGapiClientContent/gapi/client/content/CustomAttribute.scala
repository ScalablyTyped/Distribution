package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomAttribute extends js.Object {
  
  /** Subattributes within this attribute group. Exactly one of value or groupValues must be provided. */
  var groupValues: js.UndefOr[js.Array[CustomAttribute]] = js.native
  
  /** The name of the attribute. Underscores will be replaced by spaces upon insertion. */
  var name: js.UndefOr[String] = js.native
  
  /** The value of the attribute. */
  var value: js.UndefOr[String] = js.native
}
object CustomAttribute {
  
  @scala.inline
  def apply(): CustomAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomAttribute]
  }
  
  @scala.inline
  implicit class CustomAttributeOps[Self <: CustomAttribute] (val x: Self) extends AnyVal {
    
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
    def setGroupValuesVarargs(value: CustomAttribute*): Self = this.set("groupValues", js.Array(value :_*))
    
    @scala.inline
    def setGroupValues(value: js.Array[CustomAttribute]): Self = this.set("groupValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupValues: Self = this.set("groupValues", js.undefined)
    
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
