package typings.isMyJsonValid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnyEnumSchema = typings.isMyJsonValid.mod.EnumSchema[js.Any]

/* Rewritten from type alias, can be one of: 
  - typings.isMyJsonValid.mod.NullSchema
  - typings.isMyJsonValid.mod.BooleanSchema
  - typings.isMyJsonValid.mod.NullableBooleanSchema
  - typings.isMyJsonValid.mod.NumberSchema
  - typings.isMyJsonValid.mod.NullableNumberSchema
  - typings.isMyJsonValid.mod.StringSchema
  - typings.isMyJsonValid.mod.NullableStringSchema
  - typings.isMyJsonValid.mod.AnyEnumSchema
  - typings.isMyJsonValid.mod.AnyArraySchema
  - typings.isMyJsonValid.mod.AnyNullableArraySchema
  - typings.isMyJsonValid.mod.AnyObjectSchema
  - typings.isMyJsonValid.mod.AnyNullableObjectSchema
  - typings.isMyJsonValid.mod.AnyAllOptionalObjectSchema
  - typings.isMyJsonValid.mod.AnyNullableAllOptionalObjectSchema
  - typings.isMyJsonValid.mod.AnyOneOfSchema
*/
type AnySchema = typings.isMyJsonValid.mod._AnySchema | typings.isMyJsonValid.mod.AnyEnumSchema

type Filter[Schema /* <: typings.isMyJsonValid.mod.AnySchema */, Output] = js.Function2[/* input */ Output, /* options */ js.UndefOr[js.Any], Output]

type ObjectFromSchema[Properties /* <: typings.std.Record[java.lang.String, typings.isMyJsonValid.mod.AnySchema] */, Required /* <: typings.isMyJsonValid.mod.StringKeys[Properties] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ Key in keyof Properties ]: Key extends Required? is-my-json-valid.is-my-json-valid.TypeFromSchema<Properties[Key]> : is-my-json-valid.is-my-json-valid.TypeFromSchema<Properties[Key]> | undefined}
  */ typings.isMyJsonValid.isMyJsonValidStrings.ObjectFromSchema & org.scalablytyped.runtime.TopLevel[js.Any]

type StringKeys[T] = /* keyof T */ java.lang.String

type TypeFromSchema[Schema /* <: typings.isMyJsonValid.mod.AnySchema */] = (typings.isMyJsonValid.mod.ObjectFromSchema[js.Any, js.Any | scala.Nothing]) | scala.Null | typings.isMyJsonValid.mod.ArrayFromSchema[js.Any] | java.lang.String | scala.Double | scala.Boolean
