package typings
package knexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object knexMod {
  type AlterColumnBuilder = ColumnBuilder
  type AlterTableBuilder = TableBuilder
  type As = js.Function1[/* columnName */ java.lang.String, QueryBuilder]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - Raw
    - QueryBuilder
    - org.scalablytyped.runtime.StringDictionary[java.lang.String]
  */
  type ColumnName = _ColumnName | org.scalablytyped.runtime.StringDictionary[java.lang.String] | java.lang.String
  type CreateTableBuilder = TableBuilder
  type Distinct = ColumnNameQueryBuilder
  type HavingIn = js.Function2[/* columnName */ java.lang.String, /* values */ js.Array[Value], QueryBuilder]
  type Identifier = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type JoinCallback = js.ThisFunction1[/* this */ JoinClause, /* join */ JoinClause, scala.Unit]
  type JoinRaw = js.Function2[
    /* tableName */ java.lang.String, 
    /* binding */ js.UndefOr[Value | ValueMap], 
    QueryBuilder
  ]
  type MySqlAlterTableBuilder = AlterTableBuilder
  //
  // QueryBuilder
  //
  type QueryCallback = js.ThisFunction1[/* this */ QueryBuilder, /* builder */ QueryBuilder, scala.Unit]
  type QueryCallbackWithArgs = js.ThisFunction2[/* this */ QueryBuilder, /* builder */ QueryBuilder, /* repeated */ js.Any, scala.Unit]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - Raw
    - QueryBuilder
  */
  type TableName = _TableName | java.lang.String
  type Value = java.lang.String | scala.Double | scala.Boolean | stdLib.Date | (js.Array[scala.Boolean | stdLib.Date | scala.Double | java.lang.String]) | nodeLib.Buffer | Raw
  type ValueMap = org.scalablytyped.runtime.StringDictionary[Value | QueryBuilder]
  type WhereBetween = js.Function2[/* columnName */ java.lang.String, /* range */ js.Tuple2[Value, Value], QueryBuilder]
  type WhereNull = js.Function1[/* columnName */ java.lang.String, QueryBuilder]
  type WhereWrapped = js.Function1[/* callback */ QueryCallback, QueryBuilder]
  type WithSchema = js.Function1[/* schema */ java.lang.String, QueryBuilder]
}
