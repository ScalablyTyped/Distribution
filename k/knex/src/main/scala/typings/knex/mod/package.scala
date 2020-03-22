package typings.knex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AggregationQueryResult[TResult, TIntersectProps2] = typings.knex.mod.ArrayIfAlready[
    TResult, 
    TIntersectProps2 | (typings.knex.mod.DeferredKeySelection[
      js.Any | js.Object, 
      js.Any | scala.Nothing, 
      typings.knex.knexBooleans.`true` | js.Any, 
      js.Any | js.Object, 
      typings.knex.knexBooleans.`false` | js.Any, 
      (js.Any with TIntersectProps2) | TIntersectProps2, 
      js.Any | scala.Nothing
    ])
  ]
  type AliasDict = typings.knex.mod.Dict[java.lang.String]
  type AlterColumnBuilder = typings.knex.mod.ColumnBuilder
  type AlterTableBuilder = typings.knex.mod.TableBuilder
  type AnyToUnknown[T] = T | js.Any
  type ArrayIfAlready[T1, T2] = T2 | js.Array[T2]
  // If T is an array, get the type of member, else fall back to never
  type ArrayMember[T] = js.Any
  type AsyncConnectionConfigProvider = js.Function0[js.Promise[typings.knex.mod.StaticConnectionConfig]]
  // Intersection conditionally applied only when TParams is non-empty
  // This is primarily to keep the signatures more intuitive.
  type AugmentParams[TTarget, TParams] = TTarget | (js.Object with TTarget with TParams)
  // # Type-aliases for common type combinations
  type Callback = js.Function
  type Client = js.Function
  type ColumnDescriptor[TRecord, TResult] = java.lang.String | typings.knex.mod.Raw[js.Any] | (typings.knex.mod.QueryBuilder[TRecord, TResult]) | typings.knex.mod.Dict[java.lang.String]
  type ConnectionConfigProvider = typings.knex.mod.SyncConnectionConfigProvider | typings.knex.mod.AsyncConnectionConfigProvider
  // Convenience alias and associated companion namespace for working
  // with DeferredSelection having TSingle=true.
  //
  // When TSingle=true in DeferredSelection, then we are effectively
  // deferring an index access operation (TBase[TKey]) over a potentially
  // unknown initial type of TBase and potentially never initial type of TKey
  type DeferredIndex[TBase, TKey /* <: java.lang.String */] = typings.knex.mod.DeferredKeySelection[
    TBase, 
    TKey, 
    typings.knex.knexBooleans.`false`, 
    js.Object, 
    typings.knex.knexBooleans.`true`, 
    js.Object, 
    scala.Nothing
  ]
  type Dict[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Distinct[TRecord /* <: js.Object */, TResult] = typings.knex.mod.ColumnNameQueryBuilder[TRecord, TResult]
  // If T can't be assigned to TBase fallback to an alternate type TAlt
  type IncompatibleToAlt[T, TBase, TAlt] = TAlt | T
  type InferrableColumnDescriptor[TRecord /* <: js.Object */] = java.lang.String | (typings.knex.mod.Ref[js.Any, js.Any]) | typings.knex.mod.Dict[java.lang.String]
  type IntersectAliases[AliasUT] = typings.knex.mod.UnionToIntersection[
    typings.knex.mod.IncompatibleToAlt[js.Any, typings.knex.mod.Dict[js.Any], js.Object]
  ]
  type JoinCallback = js.ThisFunction1[
    /* this */ typings.knex.mod.JoinClause, 
    /* join */ typings.knex.mod.JoinClause, 
    scala.Unit
  ]
  type JoinRaw[TRecord, TResult] = js.Function2[
    /* tableName */ java.lang.String, 
    /* binding */ js.UndefOr[typings.knex.mod.Value | typings.knex.mod.ValueDict], 
    typings.knex.mod.QueryBuilder[TRecord, TResult]
  ]
  type LogFn = js.Function1[/* message */ js.Any, scala.Unit]
  type Lookup[TRegistry /* <: js.Object */, TKey /* <: java.lang.String */, TDefault] = TDefault | (/* import warning: importer.ImportType#apply Failed type conversion: TRegistry[TKey] */ js.Any)
  // Retain the association of original keys with aliased keys at type level
  // to facilitates type-safe aliasing for object syntax
  type MappedAliasType[TBase, TAliasMapping] = js.Object with typings.knex.knexStrings.MappedAliasType with js.Any
  type MaybeArray[T] = T | js.Array[T]
  type MaybeROArray[T] = T | js.Array[T]
  // Boxing is necessary to prevent distribution of conditional types:
  // https://lorefnon.tech/2019/05/02/using-boxing-to-prevent-distribution-of-conditional-types/
  type PartialOrAny[TBase, TKeys] = (typings.knex.mod.SafePick[TBase, TKeys with java.lang.String]) | js.Object
  //
  // QueryBuilder
  //
  type QueryCallback[TRecord, TResult] = js.ThisFunction1[
    /* this */ typings.knex.mod.QueryBuilder[TRecord, TResult], 
    /* builder */ typings.knex.mod.QueryBuilder[TRecord, TResult], 
    scala.Unit
  ]
  type QueryCallbackWithArgs[TRecord, TResult] = js.ThisFunction2[
    /* this */ typings.knex.mod.QueryBuilder[TRecord, TResult], 
    /* builder */ typings.knex.mod.QueryBuilder[TRecord, TResult], 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type RawBinding = typings.knex.mod.Value | (typings.knex.mod.QueryBuilder[js.Any, js.Any])
  type RedshiftConnectionConfig = typings.knex.mod.PgConnectionConfig
  type RefBuilder = js.Function1[
    /* src */ java.lang.String, 
    typings.knex.mod.Ref[
      java.lang.String, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in string ]: string}
    */ typings.knex.knexStrings.RefBuilder with js.Any
    ]
  ]
  // If we have more categories of deferred selection in future,
  // this will combine all of them
  type ResolveResult[S] = typings.knex.mod.DeferredKeySelection.Resolve[S]
  // # Generic type-level utilities
  // If T is object then make it a partial otherwise fallback to any
  //
  // This is primarily to prevent type incompatibilities where target can be unknown.
  // While unknown can be assigned to any, Partial<unknown> can't be.
  type SafePartial[T] = typings.std.Partial[T]
  type SafePick[T, K /* <: java.lang.String */] = typings.std.Pick[T, K]
  /* Rewritten from type alias, can be one of: 
    - typings.knex.mod.ConnectionConfig
    - typings.knex.mod.MariaSqlConnectionConfig
    - typings.knex.mod.MySqlConnectionConfig
    - typings.knex.mod.MsSqlConnectionConfig
    - typings.knex.mod.OracleDbConnectionConfig
    - typings.knex.mod.PgConnectionConfig
    - typings.knex.mod.RedshiftConnectionConfig
    - typings.knex.mod.Sqlite3ConnectionConfig
    - typings.knex.mod.SocketConnectionConfig
  */
  type StaticConnectionConfig = typings.knex.mod._StaticConnectionConfig | typings.knex.mod.RedshiftConnectionConfig
  type StrKey[T] = java.lang.String
  type SyncConnectionConfigProvider = js.Function0[typings.knex.mod.StaticConnectionConfig]
  type TableDescriptor = java.lang.String | typings.knex.mod.Raw[js.Any] | (typings.knex.mod.QueryBuilder[js.Any, js.Any])
  type TableOptions = typings.knex.mod.PgTableOptions
  type Union[TRecord, TResult] = typings.knex.mod.Intersect[TRecord, TResult]
  // https://stackoverflow.com/a/50375286/476712
  type UnionToIntersection[U] = js.Any
  // If T is unknown then convert to any, else retain original
  type UnknownToAny[T] = T
  // If T is an array, get the type of member, else retain original
  type UnwrapArrayMember[T] = T
  //
  // Utility Types
  //
  type Value = java.lang.String | scala.Double | scala.Boolean | typings.std.Date | (js.Array[scala.Boolean | typings.std.Date | scala.Double | java.lang.String]) | typings.node.Buffer | typings.knex.mod.Raw[js.Any]
  type ValueDict = typings.knex.mod.Dict[typings.knex.mod.Value | (typings.knex.mod.QueryBuilder[js.Any, js.Any])]
  type WhereWrapped[TRecord, TResult] = js.Function1[
    /* callback */ typings.knex.mod.QueryCallback[js.Any, js.Array[js.Any]], 
    typings.knex.mod.QueryBuilder[TRecord, TResult]
  ]
  type WithSchema[TRecord, TResult] = js.Function1[/* schema */ java.lang.String, typings.knex.mod.QueryBuilder[TRecord, TResult]]
}
