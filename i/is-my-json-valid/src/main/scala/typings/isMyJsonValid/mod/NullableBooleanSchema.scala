package typings.isMyJsonValid.mod

import typings.isMyJsonValid.isMyJsonValidStrings.`null`
import typings.isMyJsonValid.isMyJsonValidStrings.boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullableBooleanSchema
  extends StObject
     with _AnySchema {
  
  var `type`: js.Array[boolean | `null`]
}
object NullableBooleanSchema {
  
  inline def apply(`type`: js.Array[boolean | `null`]): NullableBooleanSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableBooleanSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NullableBooleanSchema] (val x: Self) extends AnyVal {
    
    inline def setType(value: js.Array[boolean | `null`]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: (boolean | `null`)*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
