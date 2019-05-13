package typings
package knexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object knexMod {
  type AlterColumnBuilder = ColumnBuilder
  type AlterTableBuilder = TableBuilder
  type ColumnDescriptor[TRecord, TResult] = java.lang.String | Raw[js.Any] | (QueryBuilder[TRecord, TResult]) | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type CountQueryBuilder[TRecord] = QueryBuilder[
    TRecord, 
    js.Array[org.scalablytyped.runtime.StringDictionary[scala.Double | java.lang.String]]
  ]
  type CreateTableBuilder = TableBuilder
  type Distinct[TRecord /* <: js.Object */, TResult] = ColumnNameQueryBuilder[TRecord, TResult]
  type Identifier = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type JoinCallback = js.ThisFunction1[/* this */ JoinClause, /* join */ JoinClause, scala.Unit]
  type JoinRaw[TRecord, TResult] = js.Function2[
    /* tableName */ java.lang.String, 
    /* binding */ js.UndefOr[Value | ValueMap], 
    QueryBuilder[TRecord, TResult]
  ]
  type MaybeArray[T] = T | js.Array[T]
  type MaybeArrayMember[T] = T
  type MySqlAlterTableBuilder = AlterTableBuilder
  //
  // QueryBuilder
  //
  type QueryCallback = js.ThisFunction1[
    /* this */ QueryBuilder[js.Any, js.Any], 
    /* builder */ QueryBuilder[js.Any, js.Any], 
    scala.Unit
  ]
  type QueryCallbackWithArgs = js.ThisFunction2[
    /* this */ QueryBuilder[js.Any, js.Any], 
    /* builder */ QueryBuilder[js.Any, js.Any], 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type ResolveResult[S] = knexLib.knexMod.DeferredKeySelectionNs.Resolve[S]
  type SafePick[T, K /* <: java.lang.String */] = stdLib.Pick[T, K]
  type TableName = java.lang.String | Raw[js.Any] | (QueryBuilder[js.Any, js.Array[stdLib.Partial[js.Any]]])
  type Value = java.lang.String | scala.Double | scala.Boolean | stdLib.Date | js.Array[java.lang.String] | js.Array[scala.Double] | js.Array[stdLib.Date] | js.Array[scala.Boolean] | nodeLib.Buffer | Raw[js.Any]
  type ValueMap = org.scalablytyped.runtime.StringDictionary[Value | (QueryBuilder[js.Any, js.Array[stdLib.Partial[js.Any]]])]
  type WhereResult[TRecord, TResult] = (QueryBuilder[TRecord, TResult]) with (ChainableInterface[js.Array[TResult] | js.Array[TRecord]])
  type WhereWrapped[TRecord, TResult] = js.Function1[/* callback */ QueryCallback, WhereResult[TRecord, TResult]]
  type WithSchema[TRecord, TResult] = js.Function1[/* schema */ java.lang.String, QueryBuilder[TRecord, TResult]]
}
