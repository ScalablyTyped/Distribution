package typings.isMyJsonValid.mod

import typings.isMyJsonValid.isMyJsonValidStrings.`null`
import typings.isMyJsonValid.isMyJsonValidStrings.boolean
import typings.isMyJsonValid.isMyJsonValidStrings.number
import typings.isMyJsonValid.isMyJsonValidStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _AnySchema extends StObject
object _AnySchema {
  
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
