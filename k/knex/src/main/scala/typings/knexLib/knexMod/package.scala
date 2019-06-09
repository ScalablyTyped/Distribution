package typings
package knexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object knexMod {
  type AggregationQueryResult[TResult, TIntersectProps2] = ArrayIfAlready[
    TResult, 
    TIntersectProps2 | (DeferredKeySelection[
      js.Any | js.Object, 
      js.Any | scala.Nothing, 
      knexLib.knexLibNumbers.`true` | js.Any, 
      js.Any | js.Object, 
      knexLib.knexLibNumbers.`false` | js.Any, 
      (js.Any with TIntersectProps2) | TIntersectProps2, 
      js.Any | scala.Nothing
    ])
  ]
  type AliasDict = Dict[java.lang.String]
  type AlterColumnBuilder = ColumnBuilder
  type AlterTableBuilder = TableBuilder
  type AnyToUnknown[T] = ArrayIfAlready[T, UnwrapArrayMember[T] | js.Any]
  type ArrayIfAlready[T1, T2] = T2 | js.Array[T2]
  // If T is an array, get the type of member, else fall back to never
  type ArrayMember[T] = js.Any
  // Intersection conditionally applied only when TParams is non-empty
  // This is primarily to keep the signatures more intuitive.
  type AugmentParams[TTarget, TParams] = TTarget | (js.Object with TTarget with TParams)
  type ColumnDescriptor[TRecord, TResult] = java.lang.String | Raw[js.Any] | (QueryBuilder[TRecord, TResult]) | Dict[java.lang.String]
  type CreateTableBuilder = TableBuilder
  // Convenience alias and associated companion namespace for working
  // with DeferredSelection having TSingle=true.
  //
  // When TSingle=true in DeferredSelection, then we are effectively
  // deferring an index access operation (TBase[TKey]) over a potentially
  // unknown initial type of TBase and potentially never initial type of TKey
  type DeferredIndex[TBase, TKey /* <: java.lang.String */] = DeferredKeySelection[
    TBase, 
    TKey, 
    knexLib.knexLibNumbers.`false`, 
    js.Object, 
    knexLib.knexLibNumbers.`true`, 
    js.Object, 
    scala.Nothing
  ]
  type Dict[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Distinct[TRecord /* <: js.Object */, TResult] = ColumnNameQueryBuilder[TRecord, TResult]
  // If T can't be assigned to TBase fallback to an alternate type TAlt
  type IncompatibleToAlt[T, TBase, TAlt] = TAlt | T
  type InferrableColumnDescriptor[TRecord /* <: js.Object */] = java.lang.String | (Ref[js.Any, js.Any]) | Dict[java.lang.String]
  type IntersectAliases[AliasUT] = UnionToIntersection[IncompatibleToAlt[js.Any, Dict[js.Any], js.Object]]
  type JoinCallback = js.ThisFunction1[/* this */ JoinClause, /* join */ JoinClause, scala.Unit]
  type JoinRaw[TRecord, TResult] = js.Function2[
    /* tableName */ java.lang.String, 
    /* binding */ js.UndefOr[Value | ValueDict], 
    QueryBuilder[TRecord, TResult]
  ]
  type LogFn = js.Function1[/* message */ java.lang.String, scala.Unit]
  type Lookup[TRegistry /* <: js.Object */, TKey /* <: java.lang.String */, TDefault] = TDefault | (/* import warning: ImportType.apply Failed type conversion: TRegistry[TKey] */ js.Any)
  // Retain the association of original keys with aliased keys at type level
  // to facilitates type-safe aliasing for object syntax
  type MappedAliasType[TBase, TAliasMapping] = js.Object with knexLib.knexLibStrings.MappedAliasType with js.Any
  type MaybeArray[T] = T | js.Array[T]
  type MySqlAlterTableBuilder = AlterTableBuilder
  // Boxing is necessary to prevent distribution of conditional types:
  // https://lorefnon.tech/2019/05/02/using-boxing-to-prevent-distribution-of-conditional-types/
  type PartialOrAny[TBase, TKeys] = (stdLib.Pick[TBase, TKeys with java.lang.String]) | js.Object
  //
  // QueryBuilder
  //
  type QueryCallback[TRecord, TResult] = js.ThisFunction1[
    /* this */ QueryBuilder[TRecord, TResult], 
    /* builder */ QueryBuilder[TRecord, TResult], 
    scala.Unit
  ]
  type QueryCallbackWithArgs[TRecord, TResult] = js.ThisFunction2[
    /* this */ QueryBuilder[TRecord, TResult], 
    /* builder */ QueryBuilder[TRecord, TResult], 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type RawBinding = Value | (QueryBuilder[js.Any, js.Any])
  type RefBuilder = js.Function1[
    /* src */ java.lang.String, 
    Ref[
      java.lang.String, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in string ]: string}
    */ knexLib.knexLibStrings.RefBuilder with js.Any
    ]
  ]
  // If we have more categories of deferred selection in future,
  // this will combine all of them
  type ResolveResult[S] = knexLib.knexMod.DeferredKeySelectionNs.Resolve[S]
  // # Generic type-level utilities
  // If T is object then make it a partial otherwise fallback to any
  //
  // This is primarily to prevent type incompatibilities where target can be unknown.
  // While unknown can be assigned to any, Partial<unknown> can't be.
  type SafePartial[T] = stdLib.Partial[T]
  type SafePick[T, K /* <: java.lang.String */] = stdLib.Pick[T, K]
  type StrKey[T] = java.lang.String
  type TableDescriptor = java.lang.String | Raw[js.Any] | (QueryBuilder[js.Any, js.Array[SafePartial[js.Any]]])
  type Union[TRecord, TResult] = Intersect[TRecord, TResult]
  // https://stackoverflow.com/a/50375286/476712
  type UnionToIntersection[U] = js.Any
  // If T is unknown then convert to any, else retain original
  type UnknownToAny[T] = ArrayIfAlready[T, UnwrapArrayMember[T]]
  // If T is an array, get the type of member, else retain original
  type UnwrapArrayMember[T] = T
  //
  // Utility Types
  //
  type Value = java.lang.String | scala.Double | scala.Boolean | stdLib.Date | (js.Array[scala.Boolean | stdLib.Date | scala.Double | java.lang.String]) | nodeLib.Buffer | Raw[js.Any]
  type ValueDict = Dict[Value | (QueryBuilder[js.Any, js.Array[SafePartial[js.Any]]])]
  type WhereWrapped[TRecord, TResult] = js.Function1[
    /* callback */ QueryCallback[js.Any, js.Array[js.Any]], 
    QueryBuilder[TRecord, TResult]
  ]
  type WithSchema[TRecord, TResult] = js.Function1[/* schema */ java.lang.String, QueryBuilder[TRecord, TResult]]
}
