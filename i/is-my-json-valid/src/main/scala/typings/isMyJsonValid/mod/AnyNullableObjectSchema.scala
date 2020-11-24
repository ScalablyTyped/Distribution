package typings.isMyJsonValid.mod

import typings.isMyJsonValid.isMyJsonValidStrings.`null`
import typings.isMyJsonValid.isMyJsonValidStrings.`object`
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyNullableObjectSchema
  extends NullableObjectSchema[Record[String, AnySchema], String]
     with _AnySchema
object AnyNullableObjectSchema {
  
  @scala.inline
  def apply(
    properties: Record[String, AnySchema],
    required: js.Array[String],
    `type`: js.Array[`object` | `null`]
  ): AnyNullableObjectSchema = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyNullableObjectSchema]
  }
}
