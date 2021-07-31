package typings.isMyJsonValid.mod

import typings.isMyJsonValid.isMyJsonValidStrings.`null`
import typings.isMyJsonValid.isMyJsonValidStrings.`object`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnyNullableAllOptionalObjectSchema
  extends StObject
     with NullableAllOptionalObjectSchema[Record[String, AnySchema]]
     with _AnySchema
object AnyNullableAllOptionalObjectSchema {
  
  @scala.inline
  def apply(properties: Record[String, AnySchema], `type`: js.Array[`object` | `null`]): AnyNullableAllOptionalObjectSchema = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyNullableAllOptionalObjectSchema]
  }
}
