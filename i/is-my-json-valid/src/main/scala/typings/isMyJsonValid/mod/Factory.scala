package typings.isMyJsonValid.mod

import typings.isMyJsonValid.anon.OneOf
import typings.isMyJsonValid.anon.`0`
import typings.isMyJsonValid.anon.`1`
import typings.isMyJsonValid.anon.`2`
import typings.isMyJsonValid.anon.`3`
import typings.isMyJsonValid.anon.`4`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Factory extends StObject {
  
  def apply(schema: AllOptionalObjectSchema[Record[String, AnySchema]]): Validator[
    AllOptionalObjectSchema[Record[String, AnySchema]], 
    TypeFromSchema[AllOptionalObjectSchema[Record[String, AnySchema]]]
  ] = js.native
  def apply(schema: AllOptionalObjectSchema[Record[String, AnySchema]], options: Any): Validator[
    AllOptionalObjectSchema[Record[String, AnySchema]], 
    TypeFromSchema[AllOptionalObjectSchema[Record[String, AnySchema]]]
  ] = js.native
  def apply(schema: AnyOneOfSchema): Validator[AnyOneOfSchema, TypeFromSchema[AnyOneOfSchema]] = js.native
  def apply(schema: AnyOneOfSchema, options: Any): Validator[AnyOneOfSchema, TypeFromSchema[AnyOneOfSchema]] = js.native
  def apply(schema: ArraySchema[AnySchema]): Validator[ArraySchema[AnySchema], TypeFromSchema[ArraySchema[AnySchema]]] = js.native
  def apply(schema: ArraySchema[AnySchema], options: Any): Validator[ArraySchema[AnySchema], TypeFromSchema[ArraySchema[AnySchema]]] = js.native
  def apply(schema: BooleanSchema): Validator[BooleanSchema, TypeFromSchema[BooleanSchema]] = js.native
  def apply(schema: BooleanSchema, options: Any): Validator[BooleanSchema, TypeFromSchema[BooleanSchema]] = js.native
  /* Plain schema */
  def apply(schema: NullSchema): Validator[NullSchema, TypeFromSchema[NullSchema]] = js.native
  def apply(schema: NullSchema, options: Any): Validator[NullSchema, TypeFromSchema[NullSchema]] = js.native
  def apply(schema: NullableAllOptionalObjectSchema[Record[String, AnySchema]]): Validator[
    NullableAllOptionalObjectSchema[Record[String, AnySchema]], 
    TypeFromSchema[NullableAllOptionalObjectSchema[Record[String, AnySchema]]]
  ] = js.native
  def apply(schema: NullableAllOptionalObjectSchema[Record[String, AnySchema]], options: Any): Validator[
    NullableAllOptionalObjectSchema[Record[String, AnySchema]], 
    TypeFromSchema[NullableAllOptionalObjectSchema[Record[String, AnySchema]]]
  ] = js.native
  def apply(schema: NullableArraySchema[AnySchema]): Validator[NullableArraySchema[AnySchema], TypeFromSchema[NullableArraySchema[AnySchema]]] = js.native
  def apply(schema: NullableArraySchema[AnySchema], options: Any): Validator[NullableArraySchema[AnySchema], TypeFromSchema[NullableArraySchema[AnySchema]]] = js.native
  def apply(schema: NullableBooleanSchema): Validator[NullableBooleanSchema, TypeFromSchema[NullableBooleanSchema]] = js.native
  def apply(schema: NullableBooleanSchema, options: Any): Validator[NullableBooleanSchema, TypeFromSchema[NullableBooleanSchema]] = js.native
  def apply(schema: NullableNumberSchema): Validator[NullableNumberSchema, TypeFromSchema[NullableNumberSchema]] = js.native
  def apply(schema: NullableNumberSchema, options: Any): Validator[NullableNumberSchema, TypeFromSchema[NullableNumberSchema]] = js.native
  def apply(schema: NullableObjectSchema[Record[String, AnySchema], String]): Validator[
    NullableObjectSchema[Record[String, AnySchema], String], 
    TypeFromSchema[NullableObjectSchema[Record[String, AnySchema], String]]
  ] = js.native
  def apply(schema: NullableObjectSchema[Record[String, AnySchema], String], options: Any): Validator[
    NullableObjectSchema[Record[String, AnySchema], String], 
    TypeFromSchema[NullableObjectSchema[Record[String, AnySchema], String]]
  ] = js.native
  def apply(schema: NullableStringSchema): Validator[NullableStringSchema, TypeFromSchema[NullableStringSchema]] = js.native
  def apply(schema: NullableStringSchema, options: Any): Validator[NullableStringSchema, TypeFromSchema[NullableStringSchema]] = js.native
  def apply(schema: NumberSchema): Validator[NumberSchema, TypeFromSchema[NumberSchema]] = js.native
  def apply(schema: NumberSchema, options: Any): Validator[NumberSchema, TypeFromSchema[NumberSchema]] = js.native
  def apply(schema: ObjectSchema[Record[String, AnySchema], String]): Validator[
    ObjectSchema[Record[String, AnySchema], String], 
    TypeFromSchema[ObjectSchema[Record[String, AnySchema], String]]
  ] = js.native
  def apply(schema: ObjectSchema[Record[String, AnySchema], String], options: Any): Validator[
    ObjectSchema[Record[String, AnySchema], String], 
    TypeFromSchema[ObjectSchema[Record[String, AnySchema], String]]
  ] = js.native
  def apply(schema: StringSchema): Validator[StringSchema, TypeFromSchema[StringSchema]] = js.native
  def apply(schema: StringSchema, options: Any): Validator[StringSchema, TypeFromSchema[StringSchema]] = js.native
  def apply[Schema /* <: EnumSchema[Any] */](schema: Schema): Validator[Schema, TypeFromSchema[Schema]] = js.native
  def apply[Schema /* <: EnumSchema[Any] */](schema: Schema, options: Any): Validator[Schema, TypeFromSchema[Schema]] = js.native
  /* One of plain schema */
  def apply[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */](schema: `2`[Schema1, Schema2]): Validator[`2`[Schema1, Schema2], TypeFromSchema[Schema1 | Schema2]] = js.native
  def apply[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */](schema: `2`[Schema1, Schema2], options: Any): Validator[`2`[Schema1, Schema2], TypeFromSchema[Schema1 | Schema2]] = js.native
  def apply[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */, Schema3 /* <: AnySchema */](schema: `3`[Schema1, Schema2, Schema3]): Validator[`3`[Schema1, Schema2, Schema3], TypeFromSchema[Schema1 | Schema2 | Schema3]] = js.native
  def apply[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */, Schema3 /* <: AnySchema */](schema: `3`[Schema1, Schema2, Schema3], options: Any): Validator[`3`[Schema1, Schema2, Schema3], TypeFromSchema[Schema1 | Schema2 | Schema3]] = js.native
  /* One of object schema */
  def apply[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */](schema: OneOf[Properties1, Required1, Properties2, Required2]): Validator[
    OneOf[Properties1, Required1, Properties2, Required2], 
    ObjectFromSchema[Properties1 | Properties2, Required1 | Required2]
  ] = js.native
  def apply[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */](schema: OneOf[Properties1, Required1, Properties2, Required2], options: Any): Validator[
    OneOf[Properties1, Required1, Properties2, Required2], 
    ObjectFromSchema[Properties1 | Properties2, Required1 | Required2]
  ] = js.native
  def apply[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */, Schema3 /* <: AnySchema */, Schema4 /* <: AnySchema */](schema: `4`[Schema1, Schema2, Schema3, Schema4]): Validator[
    `4`[Schema1, Schema2, Schema3, Schema4], 
    TypeFromSchema[Schema1 | Schema2 | Schema3 | Schema4]
  ] = js.native
  def apply[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */, Schema3 /* <: AnySchema */, Schema4 /* <: AnySchema */](schema: `4`[Schema1, Schema2, Schema3, Schema4], options: Any): Validator[
    `4`[Schema1, Schema2, Schema3, Schema4], 
    TypeFromSchema[Schema1 | Schema2 | Schema3 | Schema4]
  ] = js.native
  def apply[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */, Properties3 /* <: Record[String, AnySchema] */, Required3 /* <: StringKeys[Properties3] */](schema: `0`[Properties1, Required1, Properties2, Required2, Properties3, Required3]): Validator[
    `0`[Properties1, Required1, Properties2, Required2, Properties3, Required3], 
    ObjectFromSchema[Properties1 | Properties2 | Properties3, Required1 | Required2 | Required3]
  ] = js.native
  def apply[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */, Properties3 /* <: Record[String, AnySchema] */, Required3 /* <: StringKeys[Properties3] */](schema: `0`[Properties1, Required1, Properties2, Required2, Properties3, Required3], options: Any): Validator[
    `0`[Properties1, Required1, Properties2, Required2, Properties3, Required3], 
    ObjectFromSchema[Properties1 | Properties2 | Properties3, Required1 | Required2 | Required3]
  ] = js.native
  def apply[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */, Properties3 /* <: Record[String, AnySchema] */, Required3 /* <: StringKeys[Properties3] */, Properties4 /* <: Record[String, AnySchema] */, Required4 /* <: StringKeys[Properties4] */](
    schema: `1`[Properties1, Required1, Properties2, Required2, Properties3, Required3, Properties4, Required4]
  ): Validator[
    `1`[Properties1, Required1, Properties2, Required2, Properties3, Required3, Properties4, Required4], 
    ObjectFromSchema[
      Properties1 | Properties2 | Properties3 | Properties4, 
      Required1 | Required2 | Required3 | Required4
    ]
  ] = js.native
  def apply[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */, Properties3 /* <: Record[String, AnySchema] */, Required3 /* <: StringKeys[Properties3] */, Properties4 /* <: Record[String, AnySchema] */, Required4 /* <: StringKeys[Properties4] */](
    schema: `1`[Properties1, Required1, Properties2, Required2, Properties3, Required3, Properties4, Required4],
    options: Any
  ): Validator[
    `1`[Properties1, Required1, Properties2, Required2, Properties3, Required3, Properties4, Required4], 
    ObjectFromSchema[
      Properties1 | Properties2 | Properties3 | Properties4, 
      Required1 | Required2 | Required3 | Required4
    ]
  ] = js.native
  
  def createFilter(schema: AllOptionalObjectSchema[Record[String, AnySchema]]): Filter[
    AllOptionalObjectSchema[Record[String, AnySchema]], 
    TypeFromSchema[AllOptionalObjectSchema[Record[String, AnySchema]]]
  ] = js.native
  def createFilter(schema: AllOptionalObjectSchema[Record[String, AnySchema]], options: Any): Filter[
    AllOptionalObjectSchema[Record[String, AnySchema]], 
    TypeFromSchema[AllOptionalObjectSchema[Record[String, AnySchema]]]
  ] = js.native
  def createFilter(schema: AnyOneOfSchema): Filter[AnyOneOfSchema, TypeFromSchema[AnyOneOfSchema]] = js.native
  def createFilter(schema: AnyOneOfSchema, options: Any): Filter[AnyOneOfSchema, TypeFromSchema[AnyOneOfSchema]] = js.native
  def createFilter(schema: ArraySchema[AnySchema]): Filter[ArraySchema[AnySchema], TypeFromSchema[ArraySchema[AnySchema]]] = js.native
  def createFilter(schema: ArraySchema[AnySchema], options: Any): Filter[ArraySchema[AnySchema], TypeFromSchema[ArraySchema[AnySchema]]] = js.native
  def createFilter(schema: BooleanSchema): Filter[BooleanSchema, TypeFromSchema[BooleanSchema]] = js.native
  def createFilter(schema: BooleanSchema, options: Any): Filter[BooleanSchema, TypeFromSchema[BooleanSchema]] = js.native
  def createFilter(schema: NullSchema): Filter[NullSchema, TypeFromSchema[NullSchema]] = js.native
  def createFilter(schema: NullSchema, options: Any): Filter[NullSchema, TypeFromSchema[NullSchema]] = js.native
  def createFilter(schema: NullableAllOptionalObjectSchema[Record[String, AnySchema]]): Filter[
    NullableAllOptionalObjectSchema[Record[String, AnySchema]], 
    TypeFromSchema[NullableAllOptionalObjectSchema[Record[String, AnySchema]]]
  ] = js.native
  def createFilter(schema: NullableAllOptionalObjectSchema[Record[String, AnySchema]], options: Any): Filter[
    NullableAllOptionalObjectSchema[Record[String, AnySchema]], 
    TypeFromSchema[NullableAllOptionalObjectSchema[Record[String, AnySchema]]]
  ] = js.native
  def createFilter(schema: NullableArraySchema[AnySchema]): Filter[NullableArraySchema[AnySchema], TypeFromSchema[NullableArraySchema[AnySchema]]] = js.native
  def createFilter(schema: NullableArraySchema[AnySchema], options: Any): Filter[NullableArraySchema[AnySchema], TypeFromSchema[NullableArraySchema[AnySchema]]] = js.native
  def createFilter(schema: NullableBooleanSchema): Filter[NullableBooleanSchema, TypeFromSchema[NullableBooleanSchema]] = js.native
  def createFilter(schema: NullableBooleanSchema, options: Any): Filter[NullableBooleanSchema, TypeFromSchema[NullableBooleanSchema]] = js.native
  def createFilter(schema: NullableNumberSchema): Filter[NullableNumberSchema, TypeFromSchema[NullableNumberSchema]] = js.native
  def createFilter(schema: NullableNumberSchema, options: Any): Filter[NullableNumberSchema, TypeFromSchema[NullableNumberSchema]] = js.native
  def createFilter(schema: NullableObjectSchema[Record[String, AnySchema], String]): Filter[
    NullableObjectSchema[Record[String, AnySchema], String], 
    TypeFromSchema[NullableObjectSchema[Record[String, AnySchema], String]]
  ] = js.native
  def createFilter(schema: NullableObjectSchema[Record[String, AnySchema], String], options: Any): Filter[
    NullableObjectSchema[Record[String, AnySchema], String], 
    TypeFromSchema[NullableObjectSchema[Record[String, AnySchema], String]]
  ] = js.native
  def createFilter(schema: NullableStringSchema): Filter[NullableStringSchema, TypeFromSchema[NullableStringSchema]] = js.native
  def createFilter(schema: NullableStringSchema, options: Any): Filter[NullableStringSchema, TypeFromSchema[NullableStringSchema]] = js.native
  def createFilter(schema: NumberSchema): Filter[NumberSchema, TypeFromSchema[NumberSchema]] = js.native
  def createFilter(schema: NumberSchema, options: Any): Filter[NumberSchema, TypeFromSchema[NumberSchema]] = js.native
  def createFilter(schema: ObjectSchema[Record[String, AnySchema], String]): Filter[
    ObjectSchema[Record[String, AnySchema], String], 
    TypeFromSchema[ObjectSchema[Record[String, AnySchema], String]]
  ] = js.native
  def createFilter(schema: ObjectSchema[Record[String, AnySchema], String], options: Any): Filter[
    ObjectSchema[Record[String, AnySchema], String], 
    TypeFromSchema[ObjectSchema[Record[String, AnySchema], String]]
  ] = js.native
  def createFilter(schema: StringSchema): Filter[StringSchema, TypeFromSchema[StringSchema]] = js.native
  def createFilter(schema: StringSchema, options: Any): Filter[StringSchema, TypeFromSchema[StringSchema]] = js.native
  def createFilter[Schema /* <: EnumSchema[Any] */](schema: Schema): Filter[Schema, TypeFromSchema[Schema]] = js.native
  def createFilter[Schema /* <: EnumSchema[Any] */](schema: Schema, options: Any): Filter[Schema, TypeFromSchema[Schema]] = js.native
  def createFilter[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */](schema: `2`[Schema1, Schema2]): Filter[`2`[Schema1, Schema2], TypeFromSchema[Schema1 | Schema2]] = js.native
  def createFilter[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */](schema: `2`[Schema1, Schema2], options: Any): Filter[`2`[Schema1, Schema2], TypeFromSchema[Schema1 | Schema2]] = js.native
  def createFilter[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */, Schema3 /* <: AnySchema */](schema: `3`[Schema1, Schema2, Schema3]): Filter[`3`[Schema1, Schema2, Schema3], TypeFromSchema[Schema1 | Schema2 | Schema3]] = js.native
  def createFilter[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */, Schema3 /* <: AnySchema */](schema: `3`[Schema1, Schema2, Schema3], options: Any): Filter[`3`[Schema1, Schema2, Schema3], TypeFromSchema[Schema1 | Schema2 | Schema3]] = js.native
  def createFilter[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */](schema: OneOf[Properties1, Required1, Properties2, Required2]): Filter[
    OneOf[Properties1, Required1, Properties2, Required2], 
    ObjectFromSchema[Properties1 | Properties2, Required1 | Required2]
  ] = js.native
  def createFilter[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */](schema: OneOf[Properties1, Required1, Properties2, Required2], options: Any): Filter[
    OneOf[Properties1, Required1, Properties2, Required2], 
    ObjectFromSchema[Properties1 | Properties2, Required1 | Required2]
  ] = js.native
  def createFilter[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */, Schema3 /* <: AnySchema */, Schema4 /* <: AnySchema */](schema: `4`[Schema1, Schema2, Schema3, Schema4]): Filter[
    `4`[Schema1, Schema2, Schema3, Schema4], 
    TypeFromSchema[Schema1 | Schema2 | Schema3 | Schema4]
  ] = js.native
  def createFilter[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */, Schema3 /* <: AnySchema */, Schema4 /* <: AnySchema */](schema: `4`[Schema1, Schema2, Schema3, Schema4], options: Any): Filter[
    `4`[Schema1, Schema2, Schema3, Schema4], 
    TypeFromSchema[Schema1 | Schema2 | Schema3 | Schema4]
  ] = js.native
  def createFilter[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */, Properties3 /* <: Record[String, AnySchema] */, Required3 /* <: StringKeys[Properties3] */](schema: `0`[Properties1, Required1, Properties2, Required2, Properties3, Required3]): Filter[
    `0`[Properties1, Required1, Properties2, Required2, Properties3, Required3], 
    ObjectFromSchema[Properties1 | Properties2 | Properties3, Required1 | Required2 | Required3]
  ] = js.native
  def createFilter[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */, Properties3 /* <: Record[String, AnySchema] */, Required3 /* <: StringKeys[Properties3] */](schema: `0`[Properties1, Required1, Properties2, Required2, Properties3, Required3], options: Any): Filter[
    `0`[Properties1, Required1, Properties2, Required2, Properties3, Required3], 
    ObjectFromSchema[Properties1 | Properties2 | Properties3, Required1 | Required2 | Required3]
  ] = js.native
  def createFilter[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */, Properties3 /* <: Record[String, AnySchema] */, Required3 /* <: StringKeys[Properties3] */, Properties4 /* <: Record[String, AnySchema] */, Required4 /* <: StringKeys[Properties4] */](
    schema: `1`[Properties1, Required1, Properties2, Required2, Properties3, Required3, Properties4, Required4]
  ): Filter[
    `1`[Properties1, Required1, Properties2, Required2, Properties3, Required3, Properties4, Required4], 
    ObjectFromSchema[
      Properties1 | Properties2 | Properties3 | Properties4, 
      Required1 | Required2 | Required3 | Required4
    ]
  ] = js.native
  def createFilter[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */, Properties3 /* <: Record[String, AnySchema] */, Required3 /* <: StringKeys[Properties3] */, Properties4 /* <: Record[String, AnySchema] */, Required4 /* <: StringKeys[Properties4] */](
    schema: `1`[Properties1, Required1, Properties2, Required2, Properties3, Required3, Properties4, Required4],
    options: Any
  ): Filter[
    `1`[Properties1, Required1, Properties2, Required2, Properties3, Required3, Properties4, Required4], 
    ObjectFromSchema[
      Properties1 | Properties2 | Properties3 | Properties4, 
      Required1 | Required2 | Required3 | Required4
    ]
  ] = js.native
  @JSName("createFilter")
  def createFilter_Properties_RecordStringAnySchemaRequired_StringKeysProperties[Properties /* <: Record[String, AnySchema] */, Required /* <: StringKeys[Properties] */](schema: ObjectSchema[Properties, Required]): Filter[
    ObjectSchema[Properties, Required], 
    TypeFromSchema[ObjectSchema[Properties, Required]]
  ] = js.native
  @JSName("createFilter")
  def createFilter_Properties_RecordStringAnySchemaRequired_StringKeysProperties[Properties /* <: Record[String, AnySchema] */, Required /* <: StringKeys[Properties] */](schema: ObjectSchema[Properties, Required], options: Any): Filter[
    ObjectSchema[Properties, Required], 
    TypeFromSchema[ObjectSchema[Properties, Required]]
  ] = js.native
}
