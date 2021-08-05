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
  
  inline def apply(): NullSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("null")
    __obj.asInstanceOf[NullSchema]
  }
  
  extension [Self <: NullSchema](x: Self) {
    
    inline def setType(value: `null`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
