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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _AnySchema extends StObject
object _AnySchema {
  
  @scala.inline
  def AnyAllOptionalObjectSchema(properties: Record[String, AnySchema], `type`: `object`): typings.isMyJsonValid.mod.AnyAllOptionalObjectSchema = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.isMyJsonValid.mod.AnyAllOptionalObjectSchema]
  }
  
  @scala.inline
  def AnyArraySchema(items: AnySchema, `type`: array): typings.isMyJsonValid.mod.AnyArraySchema = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.isMyJsonValid.mod.AnyArraySchema]
  }
  
  @scala.inline
  def AnyNullableAllOptionalObjectSchema(properties: Record[String, AnySchema], `type`: js.Array[`object` | `null`]): typings.isMyJsonValid.mod.AnyNullableAllOptionalObjectSchema = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.isMyJsonValid.mod.AnyNullableAllOptionalObjectSchema]
  }
  
  @scala.inline
  def AnyNullableArraySchema(items: AnySchema, `type`: js.Array[array | `null`]): typings.isMyJsonValid.mod.AnyNullableArraySchema = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.isMyJsonValid.mod.AnyNullableArraySchema]
  }
  
  @scala.inline
  def AnyNullableObjectSchema(
    properties: Record[String, AnySchema],
    required: js.Array[String],
    `type`: js.Array[`object` | `null`]
  ): typings.isMyJsonValid.mod.AnyNullableObjectSchema = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.isMyJsonValid.mod.AnyNullableObjectSchema]
  }
  
  @scala.inline
  def AnyObjectSchema(properties: Record[String, AnySchema], required: js.Array[String], `type`: `object`): typings.isMyJsonValid.mod.AnyObjectSchema = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.isMyJsonValid.mod.AnyObjectSchema]
  }
  
  @scala.inline
  def AnyOneOfSchema(oneOf: js.Array[AnySchema]): typings.isMyJsonValid.mod.AnyOneOfSchema = {
    val __obj = js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.isMyJsonValid.mod.AnyOneOfSchema]
  }
  
  @scala.inline
  def BooleanSchema(`type`: boolean): typings.isMyJsonValid.mod.BooleanSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.isMyJsonValid.mod.BooleanSchema]
  }
  
  @scala.inline
  def NullSchema(`type`: `null`): typings.isMyJsonValid.mod.NullSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.isMyJsonValid.mod.NullSchema]
  }
  
  @scala.inline
  def NullableBooleanSchema(`type`: js.Array[boolean | `null`]): typings.isMyJsonValid.mod.NullableBooleanSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.isMyJsonValid.mod.NullableBooleanSchema]
  }
  
  @scala.inline
  def NullableNumberSchema(`type`: js.Array[number | `null`]): typings.isMyJsonValid.mod.NullableNumberSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.isMyJsonValid.mod.NullableNumberSchema]
  }
  
  @scala.inline
  def NullableStringSchema(`type`: js.Array[string | `null`]): typings.isMyJsonValid.mod.NullableStringSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.isMyJsonValid.mod.NullableStringSchema]
  }
  
  @scala.inline
  def NumberSchema(`type`: number): typings.isMyJsonValid.mod.NumberSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.isMyJsonValid.mod.NumberSchema]
  }
  
  @scala.inline
  def StringSchema(`type`: string): typings.isMyJsonValid.mod.StringSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.isMyJsonValid.mod.StringSchema]
  }
}
