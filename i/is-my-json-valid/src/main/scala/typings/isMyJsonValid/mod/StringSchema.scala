package typings.isMyJsonValid.mod

import typings.isMyJsonValid.isMyJsonValidStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringSchema extends _AnySchema {
  
  var `type`: string = js.native
}
object StringSchema {
  
  @scala.inline
  def apply(`type`: string): StringSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringSchema]
  }
  
  @scala.inline
  implicit class StringSchemaMutableBuilder[Self <: StringSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
