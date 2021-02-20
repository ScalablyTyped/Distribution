package typings.isMyJsonValid.mod

import typings.isMyJsonValid.isMyJsonValidStrings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberSchema extends _AnySchema {
  
  var `type`: number = js.native
}
object NumberSchema {
  
  @scala.inline
  def apply(`type`: number): NumberSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberSchema]
  }
  
  @scala.inline
  implicit class NumberSchemaMutableBuilder[Self <: NumberSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
