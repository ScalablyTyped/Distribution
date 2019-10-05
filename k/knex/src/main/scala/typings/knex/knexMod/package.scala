package typings.knex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object knexMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.knex.knexMod.DeferredKeySelection.Resolve
  import typings.knex.knexNumbers.`false`
  import typings.knex.knexNumbers.`true`
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Partial
  import typings.std.Pick

  type AggregationQueryResult[TResult, TIntersectProps2] = ArrayIfAlready[
    TResult, 
    TIntersectProps2 | (DeferredKeySelection[
      js.Any | js.Object, 
      js.Any | scala.Nothing, 
      `true` | js.Any, 
      js.Any | js.Object, 
      `false` | js.Any, 
      (js.Any with TIntersectProps2) | TIntersectProps2, 
      js.Any | scala.Nothing
    ])
  ]
  type AliasDict = Dict[String]
  type AlterColumnBuilder = ColumnBuilder
  type AlterTableBuilder = TableBuilder
  type AnyToUnknown[T] = T | js.Any
  type ArrayIfAlready[T1, T2] = T2 | js.Array[T2]
  // If T is an array, get the type of member, else fall back to never
  type ArrayMember[T] = js.Any
  // Intersection conditionally applied only when TParams is non-empty
  // This is primarily to keep the signatures more intuitive.
  type AugmentParams[TTarget, TParams] = TTarget | (js.Object with TTarget with TParams)
  type ColumnDescriptor[TRecord, TResult] = String | Raw[js.Any] | (QueryBuilder[TRecord, TResult]) | Dict[String]
  type CreateTableBuilder = TableBuilder
  // Convenience alias and associated companion namespace for working
  // with DeferredSelection having TSingle=true.
  //
  // When TSingle=true in DeferredSelection, then we are effectively
  // deferring an index access operation (TBase[TKey]) over a potentially
  // unknown initial type of TBase and potentially never initial type of TKey
  type DeferredIndex[TBase, TKey /* <: String */] = DeferredKeySelection[TBase, TKey, `false`, js.Object, `true`, js.Object, scala.Nothing]
  type Dict[T] = StringDictionary[T]
  type Distinct[TRecord /* <: js.Object */, TResult] = ColumnNameQueryBuilder[TRecord, TResult]
  // If T can't be assigned to TBase fallback to an alternate type TAlt
  type IncompatibleToAlt[T, TBase, TAlt] = TAlt | T
  type InferrableColumnDescriptor[TRecord /* <: js.Object */] = String | (Ref[js.Any, js.Any]) | Dict[String]
  type IntersectAliases[AliasUT] = UnionToIntersection[IncompatibleToAlt[js.Any, Dict[js.Any], js.Object]]
  type JoinCallback = js.ThisFunction1[/* this */ JoinClause, /* join */ JoinClause, Unit]
  type JoinRaw[TRecord, TResult] = js.Function2[
    /* tableName */ String, 
    /* binding */ js.UndefOr[Value | ValueDict], 
    QueryBuilder[TRecord, TResult]
  ]
  type LogFn = js.Function1[/* message */ String, Unit]
  type Lookup[TRegistry /* <: js.Object */, TKey /* <: String */, TDefault] = TDefault | (/* import warning: ImportType.apply Failed type conversion: TRegistry[TKey] */ js.Any)
  // Retain the association of original keys with aliased keys at type level
  // to facilitates type-safe aliasing for object syntax
  type MappedAliasType[TBase, TAliasMapping] = js.Object with typings.knex.knexStrings.MappedAliasType with js.Any
  type MaybeArray[T] = T | js.Array[T]
  type MySqlAlterTableBuilder = AlterTableBuilder
  // Boxing is necessary to prevent distribution of conditional types:
  // https://lorefnon.tech/2019/05/02/using-boxing-to-prevent-distribution-of-conditional-types/
  type PartialOrAny[TBase, TKeys] = (SafePick[TBase, TKeys with String]) | js.Object
  type PostgreSqlAlterTableBuilder = AlterTableBuilder
  //
  // QueryBuilder
  //
  type QueryCallback[TRecord, TResult] = js.ThisFunction1[
    /* this */ QueryBuilder[TRecord, TResult], 
    /* builder */ QueryBuilder[TRecord, TResult], 
    Unit
  ]
  type QueryCallbackWithArgs[TRecord, TResult] = js.ThisFunction2[
    /* this */ QueryBuilder[TRecord, TResult], 
    /* builder */ QueryBuilder[TRecord, TResult], 
    /* repeated */ js.Any, 
    Unit
  ]
  type RawBinding = Value | (QueryBuilder[js.Any, js.Any])
  type RefBuilder = js.Function1[
    /* src */ String, 
    Ref[
      String, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in string ]: string}
    */ typings.knex.knexStrings.RefBuilder with js.Any
    ]
  ]
  // If we have more categories of deferred selection in future,
  // this will combine all of them
  type ResolveResult[S] = Resolve[S]
  // # Generic type-level utilities
  // If T is object then make it a partial otherwise fallback to any
  //
  // This is primarily to prevent type incompatibilities where target can be unknown.
  // While unknown can be assigned to any, Partial<unknown> can't be.
  type SafePartial[T] = Partial[T]
  type SafePick[T, K /* <: String */] = Pick[T, K]
  type StrKey[T] = String
  type TableDescriptor = String | Raw[js.Any] | (QueryBuilder[js.Any, js.Array[SafePartial[js.Any]]])
  type Union[TRecord, TResult] = Intersect[TRecord, TResult]
  // https://stackoverflow.com/a/50375286/476712
  type UnionToIntersection[U] = js.Any
  // If T is unknown then convert to any, else retain original
  type UnknownToAny[T] = T
  // If T is an array, get the type of member, else retain original
  type UnwrapArrayMember[T] = T
  //
  // Utility Types
  //
  type Value = String | Double | Boolean | Date | (js.Array[Boolean | Date | Double | String]) | Buffer | Raw[js.Any]
  type ValueDict = Dict[Value | (QueryBuilder[js.Any, js.Array[SafePartial[js.Any]]])]
  type WhereWrapped[TRecord, TResult] = js.Function1[
    /* callback */ QueryCallback[js.Any, js.Array[js.Any]], 
    QueryBuilder[TRecord, TResult]
  ]
  type WithSchema[TRecord, TResult] = js.Function1[/* schema */ String, QueryBuilder[TRecord, TResult]]
}
