package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableSet extends js.Object {
  
  /** The placeholder string; defined by EMM. */
  var placeholder: js.UndefOr[String] = js.native
  
  /** The value of the placeholder, specific to the user. */
  var userValue: js.UndefOr[String] = js.native
}
object VariableSet {
  
  @scala.inline
  def apply(): VariableSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VariableSet]
  }
  
  @scala.inline
  implicit class VariableSetOps[Self <: VariableSet] (val x: Self) extends AnyVal {
    
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
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setUserValue(value: String): Self = this.set("userValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserValue: Self = this.set("userValue", js.undefined)
  }
}
