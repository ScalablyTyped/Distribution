package typings.isMyJsonValid.mod

import typings.isMyJsonValid.isMyJsonValidStrings.`null`
import typings.isMyJsonValid.isMyJsonValidStrings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NullableNumberSchema extends _AnySchema {
  
  var `type`: js.Array[number | `null`] = js.native
}
object NullableNumberSchema {
  
  @scala.inline
  def apply(`type`: js.Array[number | `null`]): NullableNumberSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableNumberSchema]
  }
  
  @scala.inline
  implicit class NullableNumberSchemaMutableBuilder[Self <: NullableNumberSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: js.Array[number | `null`]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: (number | `null`)*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
