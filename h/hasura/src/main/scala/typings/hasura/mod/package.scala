package typings.hasura.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.hasura.anon.Type
import typings.hasura.anon.`0`
import typings.hasura.mod.^
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def HASURA_ROLE_ADMIN: /* "admin" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("HASURA_ROLE_ADMIN").asInstanceOf[/* "admin" */ String]

inline def XHasuraAdminSecret: /* "x-hasura-admin-secret" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("XHasuraAdminSecret").asInstanceOf[/* "x-hasura-admin-secret" */ String]

inline def XHasuraClientName: /* "hasura-client-name" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("XHasuraClientName").asInstanceOf[/* "hasura-client-name" */ String]

inline def XHasuraRole: /* "x-hasura-role" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("XHasuraRole").asInstanceOf[/* "x-hasura-role" */ String]

inline def XHasuraUserID: /* "x-hasura-user-id" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("XHasuraUserID").asInstanceOf[/* "x-hasura-user-id" */ String]

type Aggregate[T] = T & typings.hasura.anon.Aggregate

type AggregateResult[T] = (NumberAggregateResult[T, NumberScalarKeys[T]]) | BaseAggregateResult[T]

type HasuraDataItem[T /* <: Record[String, Any] */] = T & StringDictionary[Any]

type HasuraDataResult[T /* <: Record[String, Any] */] = js.Array[HasuraDataItem[T]]

type HasuraDeleteInput[T /* <: Record[String, Any] */, WhereKey /* <: String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ ok in WhereKey ]: hasura.hasura.WhereBoolExp<T>}
  */ typings.hasura.hasuraStrings.HasuraDeleteInput & TopLevel[Any]

type HasuraInsertInput[T /* <: Record[String, Any] */, OKey /* <: String */, ConflictKey /* <: String */] = typings.hasura.hasuraStrings.HasuraInsertInput & TopLevel[Any] & (HasuraInsertOnConflict[T, ConflictKey])

type HasuraInsertInputObject[T /* <: Record[String, Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ key in keyof T ]:? hasura.hasura.Equals<T[key], hasura.hasura.ScalarJSON<T[key]>> extends true? T[key] : hasura.hasura.Equals<T[key], hasura.hasura.ScalarJSONB<T[key]>> extends true? T[key] : T[key] extends hasura.hasura.ObjectType? hasura.hasura.HasuraInsertInputSingle<T[key], 'data', 'on_conflict'> : T[key] extends std.Array<hasura.hasura.ObjectType>? hasura.hasura.HasuraInsertInput<T[key][0], 'data', 'on_conflict'> : T[key]}
  */ typings.hasura.hasuraStrings.HasuraInsertInputObject & TopLevel[Any]

type HasuraInsertInputSingle[T /* <: Record[String, Any] */, OKey /* <: String */, OC /* <: String */] = typings.hasura.hasuraStrings.HasuraInsertInputSingle & TopLevel[Any] & (HasuraInsertOnConflict[T, OC])

type HasuraInsertOnConflict[T /* <: Record[String, Any] */, OC /* <: String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ oc in OC ]:? {  constraint :string,   update_columns :std.Array<keyof T>,   where :hasura.hasura.WhereBoolExp<T> | undefined}}
  */ typings.hasura.hasuraStrings.HasuraInsertOnConflict & TopLevel[Any]

type JSONColumnBoolExp = ColumnBoolExp[String]

type MinMaxAggregateKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof T ]: hasura.hasura.Equals<T[key], hasura.hasura.ScalarUUID> extends true? never : T[key] extends number | string | boolean? key : never}[keyof T] */ js.Any

type NumberScalarKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof T ]: T[key] extends number? key : never}[keyof T] */ js.Any

type ObjectType = Record[
String, 
ScalarType | (Record[String, ScalarType]) | (js.Array[Record[String, ScalarType]])]

type OrderByAggregate[T /* <: Record[String, Any] */] = ((BaseOrderByAggregate[T] & (NumberOrderByAggregate[T, NumberScalarKeys[T]])) | BaseOrderByAggregate[T]) & OrderBy[T]

type ScalaKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof T ]: hasura.hasura.Equals<T[key], hasura.hasura.ScalarJSON<T[key]>> extends true? key : hasura.hasura.Equals<T[key], hasura.hasura.ScalarJSONB<T[key]>> extends true? key : T[key] extends number | string | boolean? key : never}[keyof T] */ js.Any

type ScalarJSON[T] = T & Type

type ScalarJSONB[T] = T & `0`

type ScalarType = String | Double | Boolean | ScalarJSON[Any] | ScalarJSONB[Any]
