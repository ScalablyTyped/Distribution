package typings.invityApi.mod

import typings.invityApi.invityApiStrings.hex
import typings.invityApi.invityApiStrings.number
import typings.invityApi.invityApiStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoinExtraField extends StObject {
  
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
  implicit class CoinExtraFieldMutableBuilder[Self <: CoinExtraField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: number | text | hex): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
