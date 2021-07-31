package typings.isMyJsonValid.mod

import typings.isMyJsonValid.isMyJsonValidStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringSchema
  extends StObject
     with _AnySchema {
  
  var `type`: string
}
object StringSchema {
  
  @scala.inline
  def apply(): StringSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[StringSchema]
  }
  
  @scala.inline
  implicit class StringSchemaMutableBuilder[Self <: StringSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
