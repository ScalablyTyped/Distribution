package typings.isMyJsonValid.mod

import typings.isMyJsonValid.isMyJsonValidStrings.`null`
import typings.isMyJsonValid.isMyJsonValidStrings.`object`
import typings.isMyJsonValid.isMyJsonValidStrings.array
import typings.isMyJsonValid.isMyJsonValidStrings.boolean
import typings.isMyJsonValid.isMyJsonValidStrings.number
import typings.isMyJsonValid.isMyJsonValidStrings.string
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _AnySchema extends StObject
object _AnySchema {
  
  inline def AnyAllOptionalObjectSchema(properties: Record[String, AnySchema]): typings.isMyJsonValid.mod.AnyAllOptionalObjectSchema = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("object")
    __obj.asInstanceOf[typings.isMyJsonValid.mod.AnyAllOptionalObjectSchema]
  }
  
  inline def AnyArraySchema(items: AnySchema): typings.isMyJsonValid.mod.AnyArraySchema = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[typings.isMyJsonValid.mod.AnyArraySchema]
  }
  
  inline def AnyNullableAllOptionalObjectSchema(properties: Record[String, AnySchema], `type`: js.Array[`object` | `null`]): typings.isMyJsonValid.mod.AnyNullableAllOptionalObjectSchema = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.isMyJsonValid.mod.AnyNullableAllOptionalObjectSchema]
  }
  
  inline def AnyNullableArraySchema(items: AnySchema, `type`: js.Array[array | `null`]): typings.isMyJsonValid.mod.AnyNullableArraySchema = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.isMyJsonValid.mod.AnyNullableArraySchema]
  }
  
  inline def AnyNullableObjectSchema(
    properties: Record[String, AnySchema],
    required: js.Array[String],
    `type`: js.Array[`object` | `null`]
  ): typings.isMyJsonValid.mod.AnyNullableObjectSchema = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.isMyJsonValid.mod.AnyNullableObjectSchema]
  }
  
  inline def AnyObjectSchema(properties: Record[String, AnySchema], required: js.Array[String]): typings.isMyJsonValid.mod.AnyObjectSchema = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("object")
    __obj.asInstanceOf[typings.isMyJsonValid.mod.AnyObjectSchema]
  }
  
  inline def AnyOneOfSchema(oneOf: js.Array[AnySchema]): typings.isMyJsonValid.mod.AnyOneOfSchema = {
    val __obj = js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.isMyJsonValid.mod.AnyOneOfSchema]
  }
  
  inline def BooleanSchema(): typings.isMyJsonValid.mod.BooleanSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typings.isMyJsonValid.mod.BooleanSchema]
  }
  
  inline def NullSchema(): typings.isMyJsonValid.mod.NullSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("null")
    __obj.asInstanceOf[typings.isMyJsonValid.mod.NullSchema]
  }
  
  inline def NullableBooleanSchema(`type`: js.Array[boolean | `null`]): typings.isMyJsonValid.mod.NullableBooleanSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.isMyJsonValid.mod.NullableBooleanSchema]
  }
  
  inline def NullableNumberSchema(`type`: js.Array[number | `null`]): typings.isMyJsonValid.mod.NullableNumberSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.isMyJsonValid.mod.NullableNumberSchema]
  }
  
  inline def NullableStringSchema(`type`: js.Array[string | `null`]): typings.isMyJsonValid.mod.NullableStringSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.isMyJsonValid.mod.NullableStringSchema]
  }
  
  inline def NumberSchema(): typings.isMyJsonValid.mod.NumberSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[typings.isMyJsonValid.mod.NumberSchema]
  }
  
  inline def StringSchema(): typings.isMyJsonValid.mod.StringSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typings.isMyJsonValid.mod.StringSchema]
  }
}
