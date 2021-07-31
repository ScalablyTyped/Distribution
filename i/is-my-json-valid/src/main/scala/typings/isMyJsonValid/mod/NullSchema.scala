package typings.isMyJsonValid.mod

import typings.isMyJsonValid.isMyJsonValidStrings.`null`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullSchema
  extends StObject
     with _AnySchema {
  
  var `type`: `null`
}
object NullSchema {
  
  @scala.inline
  def apply(): NullSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("null")
    __obj.asInstanceOf[NullSchema]
  }
  
  @scala.inline
  implicit class NullSchemaMutableBuilder[Self <: NullSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: `null`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
