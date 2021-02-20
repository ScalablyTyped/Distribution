package typings.hasura

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Aggregate[T] = T with typings.hasura.anon.Aggregate
  
  type AggregateResult[T] = (typings.hasura.mod.NumberAggregateResult[T, typings.hasura.mod.NumberScalarKeys[T]]) | typings.hasura.mod.BaseAggregateResult[T]
  
  @scala.inline
  def HASURA_ROLE_ADMIN: /* "admin" */ java.lang.String = typings.hasura.mod.^.asInstanceOf[js.Dynamic].selectDynamic("HASURA_ROLE_ADMIN").asInstanceOf[/* "admin" */ java.lang.String]
  
  type HasuraDataItem[T /* <: typings.std.Record[java.lang.String, _] */] = T with org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type HasuraDataResult[T /* <: typings.std.Record[java.lang.String, _] */] = js.Array[typings.hasura.mod.HasuraDataItem[T]]
  
  type HasuraDeleteInput[T /* <: typings.std.Record[java.lang.String, _] */, WhereKey /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ ok in WhereKey ]: hasura.hasura.WhereBoolExp<T>}
    */ typings.hasura.hasuraStrings.HasuraDeleteInput with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type HasuraInsertInput[T /* <: typings.std.Record[java.lang.String, _] */, OKey /* <: java.lang.String */, ConflictKey /* <: java.lang.String */] = typings.hasura.hasuraStrings.HasuraInsertInput with org.scalablytyped.runtime.TopLevel[js.Any] with (typings.hasura.mod.HasuraInsertOnConflict[T, ConflictKey])
  
  type HasuraInsertInputObject[T /* <: typings.std.Record[java.lang.String, _] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof T ]:? hasura.hasura.Equals<T[key], hasura.hasura.ScalarJSON<T[key]>> extends true? T[key] : hasura.hasura.Equals<T[key], hasura.hasura.ScalarJSONB<T[key]>> extends true? T[key] : T[key] extends hasura.hasura.ObjectType? hasura.hasura.HasuraInsertInputSingle<T[key], 'data', 'on_conflict'> : T[key] extends std.Array<hasura.hasura.ObjectType>? hasura.hasura.HasuraInsertInput<T[key][0], 'data', 'on_conflict'> : T[key]}
    */ typings.hasura.hasuraStrings.HasuraInsertInputObject with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type HasuraInsertInputSingle[T /* <: typings.std.Record[java.lang.String, _] */, OKey /* <: java.lang.String */, OC /* <: java.lang.String */] = typings.hasura.hasuraStrings.HasuraInsertInputSingle with org.scalablytyped.runtime.TopLevel[js.Any] with (typings.hasura.mod.HasuraInsertOnConflict[T, OC])
  
  type HasuraInsertOnConflict[T /* <: typings.std.Record[java.lang.String, _] */, OC /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ oc in OC ]:? {  constraint :string,   update_columns :std.Array<keyof T>,   where :hasura.hasura.WhereBoolExp<T> | undefined}}
    */ typings.hasura.hasuraStrings.HasuraInsertOnConflict with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type JSONColumnBoolExp = typings.hasura.mod.ColumnBoolExp[java.lang.String]
  
  type MinMaxAggregateKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof T ]: hasura.hasura.Equals<T[key], hasura.hasura.ScalarUUID> extends true? never : T[key] extends number | string | boolean? key : never}[keyof T] */ js.Any
  
  type NumberScalarKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof T ]: T[key] extends number? key : never}[keyof T] */ js.Any
  
  type ObjectType = typings.std.Record[
    java.lang.String, 
    typings.hasura.mod.ScalarType | (typings.std.Record[java.lang.String, typings.hasura.mod.ScalarType]) | (js.Array[typings.std.Record[java.lang.String, typings.hasura.mod.ScalarType]])
  ]
  
  type OrderByAggregate[T /* <: typings.std.Record[java.lang.String, _] */] = ((typings.hasura.mod.BaseOrderByAggregate[T] with (typings.hasura.mod.NumberOrderByAggregate[T, typings.hasura.mod.NumberScalarKeys[T]])) | typings.hasura.mod.BaseOrderByAggregate[T]) with typings.hasura.mod.OrderBy[T]
  
  type ScalaKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof T ]: hasura.hasura.Equals<T[key], hasura.hasura.ScalarJSON<T[key]>> extends true? key : hasura.hasura.Equals<T[key], hasura.hasura.ScalarJSONB<T[key]>> extends true? key : T[key] extends number | string | boolean? key : never}[keyof T] */ js.Any
  
  type ScalarJSON[T] = T with typings.hasura.anon.Type
  
  type ScalarJSONB[T] = T with typings.hasura.anon.`0`
  
  type ScalarType = java.lang.String | scala.Double | scala.Boolean | typings.hasura.mod.ScalarJSON[js.Any] | typings.hasura.mod.ScalarJSONB[js.Any]
  
  type ScalarUUID = java.lang.String with typings.hasura.anon.`1`
  
  @scala.inline
  def XHasuraAdminSecret: /* "x-hasura-admin-secret" */ java.lang.String = typings.hasura.mod.^.asInstanceOf[js.Dynamic].selectDynamic("XHasuraAdminSecret").asInstanceOf[/* "x-hasura-admin-secret" */ java.lang.String]
  
  @scala.inline
  def XHasuraClientName: /* "hasura-client-name" */ java.lang.String = typings.hasura.mod.^.asInstanceOf[js.Dynamic].selectDynamic("XHasuraClientName").asInstanceOf[/* "hasura-client-name" */ java.lang.String]
  
  @scala.inline
  def XHasuraRole: /* "x-hasura-role" */ java.lang.String = typings.hasura.mod.^.asInstanceOf[js.Dynamic].selectDynamic("XHasuraRole").asInstanceOf[/* "x-hasura-role" */ java.lang.String]
  
  @scala.inline
  def XHasuraUserID: /* "x-hasura-user-id" */ java.lang.String = typings.hasura.mod.^.asInstanceOf[js.Dynamic].selectDynamic("XHasuraUserID").asInstanceOf[/* "x-hasura-user-id" */ java.lang.String]
}
