package typings.isMyJsonValid.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnyAllOptionalObjectSchema = AllOptionalObjectSchema[Record[String, AnySchema]]

type AnyArraySchema = ArraySchema[AnySchema]

type AnyEnumSchema = EnumSchema[Any]

type AnyNullableAllOptionalObjectSchema = NullableAllOptionalObjectSchema[Record[String, AnySchema]]

type AnyNullableArraySchema = NullableArraySchema[AnySchema]

type AnyNullableObjectSchema = NullableObjectSchema[Record[String, AnySchema], String]

type AnyObjectSchema = ObjectSchema[Record[String, AnySchema], String]

/* Rewritten from type alias, can be one of: 
  - typings.isMyJsonValid.mod.NullSchema
  - typings.isMyJsonValid.mod.BooleanSchema
  - typings.isMyJsonValid.mod.NullableBooleanSchema
  - typings.isMyJsonValid.mod.NumberSchema
  - typings.isMyJsonValid.mod.NullableNumberSchema
  - typings.isMyJsonValid.mod.StringSchema
  - typings.isMyJsonValid.mod.NullableStringSchema
  - typings.isMyJsonValid.mod.AnyEnumSchema
  - scala.Any
  - typings.isMyJsonValid.mod.AnyOneOfSchema
*/
type AnySchema = _AnySchema | AnyEnumSchema | Any

type ArrayFromSchema[ItemSchema /* <: AnySchema */] = js.Array[TypeFromSchema[ItemSchema]]

type Filter[Schema /* <: AnySchema */, Output] = js.Function2[/* input */ Output, /* options */ js.UndefOr[Any], Output]

type ObjectFromSchema[Properties /* <: Record[String, AnySchema] */, Required /* <: StringKeys[Properties] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ Key in keyof Properties ]: Key extends Required? is-my-json-valid.is-my-json-valid.TypeFromSchema<Properties[Key]> : is-my-json-valid.is-my-json-valid.TypeFromSchema<Properties[Key]> | undefined}
  */ typings.isMyJsonValid.isMyJsonValidStrings.ObjectFromSchema & TopLevel[Any]

type StringKeys[T] = /* keyof T */ String

type TypeFromSchema[Schema /* <: AnySchema */] = (ObjectFromSchema[Any, Any | scala.Nothing]) | Null | Any | String | Double | Boolean
