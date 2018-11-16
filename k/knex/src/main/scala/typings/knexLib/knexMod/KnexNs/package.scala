package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object KnexNs {
  // tslint:disable-next-line no-empty-interface
  type AlterColumnBuilder = ColumnBuilder
  // tslint:disable-next-line no-empty-interface
  type AlterTableBuilder = TableBuilder
  type As = js.Function1[/* columnName */ java.lang.String, QueryBuilder]
  // tslint:disable-next-line no-empty-interface
  type CreateTableBuilder = TableBuilder
  // tslint:disable-next-line no-empty-interface
  type Distinct = ColumnNameQueryBuilder
  type HavingIn = js.Function2[
    /* columnName */ java.lang.String, 
    /* values */ js.Array[knexLib.Value], 
    QueryBuilder
  ]
  type JoinCallback = js.ThisFunction1[/* this */ JoinClause, /* join */ JoinClause, scala.Unit]
  type JoinRaw = js.Function2[
    /* tableName */ java.lang.String, 
    /* binding */ js.UndefOr[knexLib.Value], 
    QueryBuilder
  ]
  // tslint:disable-next-line no-empty-interface
  type MySqlAlterTableBuilder = AlterTableBuilder
  type OrderBy = js.Function2[
    /* columnName */ java.lang.String, 
    /* direction */ js.UndefOr[java.lang.String], 
    QueryBuilder
  ]
  //
  // QueryBuilder
  //
  type QueryCallback = js.ThisFunction1[/* this */ QueryBuilder, /* builder */ QueryBuilder, scala.Unit]
  type QueryCallbackWithArgs = js.ThisFunction2[/* this */ QueryBuilder, /* builder */ QueryBuilder, /* repeated */js.Any, scala.Unit]
  type Table = js.Function1[
    /* tableName */ knexLib.TableName | knexLib.knexMod.Identifier | js.Function | Raw, 
    QueryBuilder
  ]
  type WhereBetween = js.Function2[
    /* columnName */ java.lang.String, 
    /* range */ js.Tuple2[knexLib.Value, knexLib.Value], 
    QueryBuilder
  ]
  type WhereNull = js.Function1[/* columnName */ java.lang.String, QueryBuilder]
  type WhereWrapped = js.Function1[/* callback */ QueryCallback, QueryBuilder]
  type WithSchema = js.Function1[/* schema */ java.lang.String, QueryBuilder]
}
