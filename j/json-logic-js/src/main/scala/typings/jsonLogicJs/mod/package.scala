package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.jsonLogicJs.jsonLogicJsInts.`80`
import typings.jsonLogicJs.mod.^
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def addOperation(name: String, code: js.Function1[/* repeated */ Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add_operation")(name.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def apply(logic: RulesLogic[AdditionalOperation]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("apply")(logic.asInstanceOf[js.Any]).asInstanceOf[Any]
inline def apply(logic: RulesLogic[AdditionalOperation], data: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(logic.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def getOperator(logic: Record[String, Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get_operator")(logic.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getValues(logic: Record[String, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get_values")(logic.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def isLogic(logic: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_logic")(logic.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def rmOperation(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rm_operation")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def ruleLike(rule: Any, pattern: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rule_like")(rule.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def truthy(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("truthy")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def usesData(logic: Record[String, Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("uses_data")(logic.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]

/* Inlined std.Partial<std.Record<json-logic-js.json-logic-js.ReservedOperations, never>> & {[k: string] : any} */
type AdditionalOperation = StringDictionary[Any]

/**
  * Used for the "if" operation, which takes an array of odd length
  * and a minimum of three (3) elements.
  */
type AnyArrayOfOddLengthMin3 = /* import warning: importer.ImportType#apply c repeated non-array type: []['length'] extends json-logic-js.json-logic-js.MAXIMUM_ALLOWED_BOUNDARY ? [] : [any, any] extends [] ? [] : [] extends [] ? any : any */ js.Array[Any | js.Array[Any]]

/**
  * This is a utility type used below for the "if" operation.
  * Original: https://stackoverflow.com/a/68373774/765987
  */
type MAXIMUM_ALLOWED_BOUNDARY = `80`

type Mapped[Tuple /* <: js.Array[Any] */, Result /* <: js.Array[Any] */, Count /* <: js.Array[Double] */] = Any | js.Array[Any] | Result

type RenameToIn[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T as K extends / * template literal string: in${Uppercase<string>}${Lowercase<string>} * / string? / * template literal string: in * / string : K ]: T[K]}
  */ typings.jsonLogicJs.jsonLogicJsStrings.RenameToIn & TopLevel[T]

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - java.lang.String
  - scala.Double
  - typings.jsonLogicJs.mod.JsonLogicVar[AddOps]
  - typings.jsonLogicJs.mod.JsonLogicMissing[AddOps]
  - typings.jsonLogicJs.mod.JsonLogicMissingSome[AddOps]
  - typings.jsonLogicJs.mod.JsonLogicIf
  - typings.jsonLogicJs.mod.JsonLogicEqual
  - typings.jsonLogicJs.mod.JsonLogicStrictEqual
  - typings.jsonLogicJs.mod.JsonLogicNotEqual
  - typings.jsonLogicJs.mod.JsonLogicStrictNotEqual
  - typings.jsonLogicJs.mod.JsonLogicNegation
  - typings.jsonLogicJs.mod.JsonLogicDoubleNegation
  - typings.jsonLogicJs.mod.JsonLogicOr[AddOps]
  - typings.jsonLogicJs.mod.JsonLogicAnd[AddOps]
  - typings.jsonLogicJs.mod.JsonLogicGreaterThan[AddOps]
  - typings.jsonLogicJs.mod.JsonLogicGreaterThanOrEqual[AddOps]
  - typings.jsonLogicJs.mod.JsonLogicLessThan[AddOps]
  - typings.jsonLogicJs.mod.JsonLogicLessThanOrEqual[AddOps]
  - typings.jsonLogicJs.mod.JsonLogicMax[AddOps]
  - typings.jsonLogicJs.mod.JsonLogicMin[AddOps]
  - typings.jsonLogicJs.mod.JsonLogicSum[AddOps]
  - typings.jsonLogicJs.mod.JsonLogicDifference[AddOps]
  - typings.jsonLogicJs.mod.JsonLogicProduct[AddOps]
  - typings.jsonLogicJs.mod.JsonLogicQuotient[AddOps]
  - typings.jsonLogicJs.mod.JsonLogicRemainder[AddOps]
  - typings.jsonLogicJs.mod.JsonLogicMap[AddOps]
  - typings.jsonLogicJs.mod.JsonLogicFilter[AddOps]
  - typings.jsonLogicJs.mod.JsonLogicReduce[AddOps]
  - typings.jsonLogicJs.mod.JsonLogicAll[AddOps]
  - typings.jsonLogicJs.mod.JsonLogicNone[AddOps]
  - typings.jsonLogicJs.mod.JsonLogicSome[AddOps]
  - typings.jsonLogicJs.mod.JsonLogicMerge[AddOps]
  - typings.jsonLogicJs.mod.JsonLogicInArray[AddOps]
  - typings.jsonLogicJs.mod.JsonLogicInString[AddOps]
  - typings.jsonLogicJs.mod.JsonLogicCat[AddOps]
  - typings.jsonLogicJs.mod.JsonLogicSubstr[AddOps]
  - typings.jsonLogicJs.mod.JsonLogicLog[AddOps]
  - AddOps
*/
type RulesLogic[AddOps /* <: AdditionalOperation */] = _RulesLogic[AddOps] | Boolean | String | Double | AddOps
