package typings.isMyJsonValid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnyOneOfSchema
  extends StObject
     with _AnySchema {
  
  var oneOf: js.Array[AnySchema]
}
object AnyOneOfSchema {
  
  inline def apply(oneOf: js.Array[AnySchema]): AnyOneOfSchema = {
    val __obj = js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyOneOfSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnyOneOfSchema] (val x: Self) extends AnyVal {
    
    inline def setOneOf(value: js.Array[AnySchema]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    
    inline def setOneOfVarargs(value: AnySchema*): Self = StObject.set(x, "oneOf", js.Array(value*))
  }
}
