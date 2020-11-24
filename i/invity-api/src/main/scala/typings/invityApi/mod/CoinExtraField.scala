package typings.invityApi.mod

import typings.invityApi.invityApiStrings.hex
import typings.invityApi.invityApiStrings.number
import typings.invityApi.invityApiStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoinExtraField extends js.Object {
  
  var description: String = js.native
  
  var name: String = js.native
  
  var required: Boolean = js.native
  
  var `type`: number | text | hex = js.native
}
object CoinExtraField {
  
  @scala.inline
  def apply(description: String, name: String, required: Boolean, `type`: number | text | hex): CoinExtraField = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoinExtraField]
  }
  
  @scala.inline
  implicit class CoinExtraFieldOps[Self <: CoinExtraField] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: number | text | hex): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
