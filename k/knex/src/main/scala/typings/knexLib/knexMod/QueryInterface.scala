package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// QueryInterface
//
@js.native
trait QueryInterface extends js.Object {
  @JSName("andHaving")
  var andHaving_Original: Having = js.native
  @JSName("andWhereBetween")
  var andWhereBetween_Original: WhereBetween = js.native
  @JSName("andWhereNotBetween")
  var andWhereNotBetween_Original: WhereBetween = js.native
  @JSName("andWhereNot")
  var andWhereNot_Original: Where = js.native
  @JSName("andWhereRaw")
  var andWhereRaw_Original: WhereRaw = js.native
  @JSName("andWhere")
  var andWhere_Original: Where = js.native
  @JSName("as")
  var as_Original: As = js.native
  @JSName("column")
  var column_Original: Select = js.native
  @JSName("columns")
  var columns_Original: Select = js.native
  @JSName("crossJoin")
  var crossJoin_Original: Join = js.native
  @JSName("distinct")
  var distinct_Original: Distinct = js.native
  // Others
  @JSName("first")
  var first_Original: Select = js.native
  @JSName("from")
  var from_Original: Table = js.native
  @JSName("fullOuterJoin")
  var fullOuterJoin_Original: Join = js.native
  @JSName("groupByRaw")
  var groupByRaw_Original: RawQueryBuilder = js.native
  // Group by
  @JSName("groupBy")
  var groupBy_Original: GroupBy = js.native
  @JSName("havingIn")
  var havingIn_Original: HavingIn = js.native
  @JSName("havingRaw")
  var havingRaw_Original: RawQueryBuilder = js.native
  @JSName("havingWrapped")
  var havingWrapped_Original: WhereWrapped = js.native
  // Having
  @JSName("having")
  var having_Original: Having = js.native
  @JSName("innerJoin")
  var innerJoin_Original: Join = js.native
  // Intersect
  @JSName("intersect")
  var intersect_Original: Intersect = js.native
  @JSName("into")
  var into_Original: Table = js.native
  @JSName("joinRaw")
  var joinRaw_Original: JoinRaw = js.native
  // Joins
  @JSName("join")
  var join_Original: Join = js.native
  @JSName("leftJoin")
  var leftJoin_Original: Join = js.native
  @JSName("leftOuterJoin")
  var leftOuterJoin_Original: Join = js.native
  @JSName("orHavingRaw")
  var orHavingRaw_Original: RawQueryBuilder = js.native
  @JSName("orHaving")
  var orHaving_Original: Having = js.native
  @JSName("orWhereBetween")
  var orWhereBetween_Original: WhereBetween = js.native
  @JSName("orWhereExists")
  var orWhereExists_Original: WhereExists = js.native
  @JSName("orWhereIn")
  var orWhereIn_Original: WhereIn = js.native
  @JSName("orWhereNotBetween")
  var orWhereNotBetween_Original: WhereBetween = js.native
  @JSName("orWhereNotExists")
  var orWhereNotExists_Original: WhereExists = js.native
  @JSName("orWhereNotIn")
  var orWhereNotIn_Original: WhereIn = js.native
  @JSName("orWhereNotNull")
  var orWhereNotNull_Original: WhereNull = js.native
  @JSName("orWhereNot")
  var orWhereNot_Original: Where = js.native
  @JSName("orWhereNull")
  var orWhereNull_Original: WhereNull = js.native
  @JSName("orWhereRaw")
  var orWhereRaw_Original: WhereRaw = js.native
  @JSName("orWhere")
  var orWhere_Original: Where = js.native
  @JSName("orderByRaw")
  var orderByRaw_Original: RawQueryBuilder = js.native
  // Order by
  @JSName("orderBy")
  var orderBy_Original: OrderBy = js.native
  @JSName("outerJoin")
  var outerJoin_Original: Join = js.native
  @JSName("rightJoin")
  var rightJoin_Original: Join = js.native
  @JSName("rightOuterJoin")
  var rightOuterJoin_Original: Join = js.native
  @JSName("select")
  var select_Original: Select = js.native
  @JSName("table")
  var table_Original: Table = js.native
  @JSName("unionAll")
  var unionAll_Original: Union = js.native
  // Union
  @JSName("union")
  var union_Original: Union = js.native
  @JSName("whereBetween")
  var whereBetween_Original: WhereBetween = js.native
  @JSName("whereExists")
  var whereExists_Original: WhereExists = js.native
  @JSName("whereIn")
  var whereIn_Original: WhereIn = js.native
  @JSName("whereNotBetween")
  var whereNotBetween_Original: WhereBetween = js.native
  @JSName("whereNotExists")
  var whereNotExists_Original: WhereExists = js.native
  @JSName("whereNotIn")
  var whereNotIn_Original: WhereIn = js.native
  @JSName("whereNotNull")
  var whereNotNull_Original: WhereNull = js.native
  @JSName("whereNot")
  var whereNot_Original: Where = js.native
  @JSName("whereNull")
  var whereNull_Original: WhereNull = js.native
  @JSName("whereRaw")
  var whereRaw_Original: WhereRaw = js.native
  @JSName("whereWrapped")
  var whereWrapped_Original: WhereWrapped = js.native
  // Wheres
  @JSName("where")
  var where_Original: Where = js.native
  @JSName("withRaw")
  var withRaw_Original: WithRaw = js.native
  @JSName("withSchema")
  var withSchema_Original: WithSchema = js.native
  @JSName("withWrapped")
  var withWrapped_Original: WithWrapped = js.native
  // Withs
  @JSName("with")
  var with_Original: With = js.native
  def andHaving(raw: Raw): QueryBuilder = js.native
  def andHaving(sql: java.lang.String, bindings: (Value | QueryBuilder)*): QueryBuilder = js.native
  def andHaving(sql: java.lang.String, bindings: js.Array[Value | QueryBuilder]): QueryBuilder = js.native
  def andHaving(sql: java.lang.String, bindings: ValueMap): QueryBuilder = js.native
  def andHaving(
    tableName: java.lang.String,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def andWhere(callback: QueryCallback): QueryBuilder = js.native
  def andWhere(columnName: java.lang.String): QueryBuilder = js.native
  def andWhere(columnName: java.lang.String, operator: java.lang.String): QueryBuilder = js.native
  def andWhere(columnName: java.lang.String, operator: java.lang.String, value: QueryBuilder): QueryBuilder = js.native
  def andWhere(columnName: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder = js.native
  def andWhere(columnName: java.lang.String, value: Value): QueryBuilder = js.native
  def andWhere(condition: scala.Boolean): QueryBuilder = js.native
  def andWhere(left: Raw, operator: java.lang.String): QueryBuilder = js.native
  def andWhere(left: Raw, operator: java.lang.String, right: QueryBuilder): QueryBuilder = js.native
  def andWhere(left: Raw, operator: java.lang.String, right: Value): QueryBuilder = js.native
  def andWhere(`object`: js.Object): QueryBuilder = js.native
  def andWhere(raw: Raw): QueryBuilder = js.native
  def andWhere(sql: java.lang.String, bindings: (Value | QueryBuilder)*): QueryBuilder = js.native
  def andWhere(sql: java.lang.String, bindings: js.Array[Value | QueryBuilder]): QueryBuilder = js.native
  def andWhere(sql: java.lang.String, bindings: ValueMap): QueryBuilder = js.native
  def andWhereBetween(columnName: java.lang.String, range: js.Tuple2[Value, Value]): QueryBuilder = js.native
  def andWhereNot(callback: QueryCallback): QueryBuilder = js.native
  def andWhereNot(columnName: java.lang.String): QueryBuilder = js.native
  def andWhereNot(columnName: java.lang.String, operator: java.lang.String): QueryBuilder = js.native
  def andWhereNot(columnName: java.lang.String, operator: java.lang.String, value: QueryBuilder): QueryBuilder = js.native
  def andWhereNot(columnName: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder = js.native
  def andWhereNot(columnName: java.lang.String, value: Value): QueryBuilder = js.native
  def andWhereNot(condition: scala.Boolean): QueryBuilder = js.native
  def andWhereNot(left: Raw, operator: java.lang.String): QueryBuilder = js.native
  def andWhereNot(left: Raw, operator: java.lang.String, right: QueryBuilder): QueryBuilder = js.native
  def andWhereNot(left: Raw, operator: java.lang.String, right: Value): QueryBuilder = js.native
  def andWhereNot(`object`: js.Object): QueryBuilder = js.native
  def andWhereNot(raw: Raw): QueryBuilder = js.native
  def andWhereNot(sql: java.lang.String, bindings: (Value | QueryBuilder)*): QueryBuilder = js.native
  def andWhereNot(sql: java.lang.String, bindings: js.Array[Value | QueryBuilder]): QueryBuilder = js.native
  def andWhereNot(sql: java.lang.String, bindings: ValueMap): QueryBuilder = js.native
  def andWhereNotBetween(columnName: java.lang.String, range: js.Tuple2[Value, Value]): QueryBuilder = js.native
  def andWhereRaw(condition: scala.Boolean): QueryBuilder = js.native
  def andWhereRaw(raw: Raw): QueryBuilder = js.native
  def andWhereRaw(sql: java.lang.String, bindings: (Value | QueryBuilder)*): QueryBuilder = js.native
  def andWhereRaw(sql: java.lang.String, bindings: js.Array[Value | QueryBuilder]): QueryBuilder = js.native
  def andWhereRaw(sql: java.lang.String, bindings: ValueMap): QueryBuilder = js.native
  def as(columnName: java.lang.String): QueryBuilder = js.native
  def avg(columnName: java.lang.String, columnNames: java.lang.String*): QueryBuilder = js.native
  def avg(columnName: Raw): QueryBuilder = js.native
  def avg(columnName: stdLib.Record[java.lang.String, java.lang.String | js.Array[java.lang.String] | Raw]): QueryBuilder = js.native
  def avgDistinct(columnName: java.lang.String): QueryBuilder = js.native
  def avgDistinct(columnName: Raw): QueryBuilder = js.native
  def avgDistinct(columnName: stdLib.Record[java.lang.String, java.lang.String | Raw]): QueryBuilder = js.native
  def clearCounters(): QueryBuilder = js.native
  def clearOrder(): QueryBuilder = js.native
  // Clear
  def clearSelect(): QueryBuilder = js.native
  def clearWhere(): QueryBuilder = js.native
  def column(aliases: org.scalablytyped.runtime.StringDictionary[java.lang.String | Raw]): QueryBuilder = js.native
  def column(columnNames: ColumnName*): QueryBuilder = js.native
  def column(columnNames: js.Array[ColumnName]): QueryBuilder = js.native
  def columns(aliases: org.scalablytyped.runtime.StringDictionary[java.lang.String | Raw]): QueryBuilder = js.native
  def columns(columnNames: ColumnName*): QueryBuilder = js.native
  def columns(columnNames: js.Array[ColumnName]): QueryBuilder = js.native
  def count(columnName: Raw): QueryBuilder = js.native
  // Aggregation
  def count(columnNames: java.lang.String*): QueryBuilder = js.native
  def count(columnName: stdLib.Record[java.lang.String, java.lang.String | js.Array[java.lang.String] | Raw]): QueryBuilder = js.native
  def countDistinct(columnName: java.lang.String): QueryBuilder = js.native
  def countDistinct(columnName: Raw): QueryBuilder = js.native
  def countDistinct(columnName: stdLib.Record[java.lang.String, java.lang.String | Raw]): QueryBuilder = js.native
  def crossJoin(raw: Raw): QueryBuilder = js.native
  def crossJoin(tableName: Identifier, clause: JoinCallback): QueryBuilder = js.native
  def crossJoin(tableName: Identifier, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def crossJoin(
    tableName: Identifier,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def crossJoin(tableName: Identifier, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def crossJoin(
    tableName: Identifier,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def crossJoin(tableName: Identifier, raw: Raw): QueryBuilder = js.native
  def crossJoin(tableName: QueryCallback, clause: JoinCallback): QueryBuilder = js.native
  def crossJoin(tableName: QueryCallback, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def crossJoin(
    tableName: QueryCallback,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def crossJoin(tableName: QueryCallback, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def crossJoin(
    tableName: QueryCallback,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def crossJoin(tableName: QueryCallback, raw: Raw): QueryBuilder = js.native
  def crossJoin(tableName: TableName, clause: JoinCallback): QueryBuilder = js.native
  def crossJoin(tableName: TableName, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def crossJoin(
    tableName: TableName,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def crossJoin(tableName: TableName, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def crossJoin(
    tableName: TableName,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def crossJoin(tableName: TableName, raw: Raw): QueryBuilder = js.native
  def decrement(columnName: java.lang.String): QueryBuilder = js.native
  def decrement(columnName: java.lang.String, amount: scala.Double): QueryBuilder = js.native
  def del(): QueryBuilder = js.native
  def del(returning: java.lang.String): QueryBuilder = js.native
  def del(returning: js.Array[java.lang.String]): QueryBuilder = js.native
  def delete(): QueryBuilder = js.native
  def delete(returning: java.lang.String): QueryBuilder = js.native
  def delete(returning: js.Array[java.lang.String]): QueryBuilder = js.native
  def distinct(columnNames: ColumnName*): QueryBuilder = js.native
  def distinct(columnNames: js.Array[ColumnName]): QueryBuilder = js.native
  // Others
  def first(aliases: org.scalablytyped.runtime.StringDictionary[java.lang.String | Raw]): QueryBuilder = js.native
  // Others
  def first(columnNames: ColumnName*): QueryBuilder = js.native
  // Others
  def first(columnNames: js.Array[ColumnName]): QueryBuilder = js.native
  def from(callback: js.Function): QueryBuilder = js.native
  def from(raw: Raw): QueryBuilder = js.native
  def from(tableName: Identifier): QueryBuilder = js.native
  def from(tableName: TableName): QueryBuilder = js.native
  def fullOuterJoin(raw: Raw): QueryBuilder = js.native
  def fullOuterJoin(tableName: Identifier, clause: JoinCallback): QueryBuilder = js.native
  def fullOuterJoin(tableName: Identifier, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def fullOuterJoin(
    tableName: Identifier,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def fullOuterJoin(tableName: Identifier, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def fullOuterJoin(
    tableName: Identifier,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def fullOuterJoin(tableName: Identifier, raw: Raw): QueryBuilder = js.native
  def fullOuterJoin(tableName: QueryCallback, clause: JoinCallback): QueryBuilder = js.native
  def fullOuterJoin(tableName: QueryCallback, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def fullOuterJoin(
    tableName: QueryCallback,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def fullOuterJoin(tableName: QueryCallback, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def fullOuterJoin(
    tableName: QueryCallback,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def fullOuterJoin(tableName: QueryCallback, raw: Raw): QueryBuilder = js.native
  def fullOuterJoin(tableName: TableName, clause: JoinCallback): QueryBuilder = js.native
  def fullOuterJoin(tableName: TableName, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def fullOuterJoin(
    tableName: TableName,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def fullOuterJoin(tableName: TableName, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def fullOuterJoin(
    tableName: TableName,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def fullOuterJoin(tableName: TableName, raw: Raw): QueryBuilder = js.native
  // Group by
  def groupBy(columnNames: ColumnName*): QueryBuilder = js.native
  // Group by
  def groupBy(columnNames: js.Array[ColumnName]): QueryBuilder = js.native
  // Group by
  def groupBy(raw: Raw): QueryBuilder = js.native
  // Group by
  def groupBy(sql: java.lang.String, bindings: (Value | QueryBuilder)*): QueryBuilder = js.native
  // Group by
  def groupBy(sql: java.lang.String, bindings: js.Array[Value | QueryBuilder]): QueryBuilder = js.native
  def groupBy(sql: java.lang.String, bindings: ValueMap): QueryBuilder = js.native
  def groupByRaw(raw: Raw): QueryBuilder = js.native
  def groupByRaw(sql: java.lang.String, bindings: (Value | QueryBuilder)*): QueryBuilder = js.native
  def groupByRaw(sql: java.lang.String, bindings: js.Array[Value | QueryBuilder]): QueryBuilder = js.native
  def groupByRaw(sql: java.lang.String, bindings: ValueMap): QueryBuilder = js.native
  // Having
  def having(raw: Raw): QueryBuilder = js.native
  // Having
  def having(sql: java.lang.String, bindings: (Value | QueryBuilder)*): QueryBuilder = js.native
  // Having
  def having(sql: java.lang.String, bindings: js.Array[Value | QueryBuilder]): QueryBuilder = js.native
  def having(sql: java.lang.String, bindings: ValueMap): QueryBuilder = js.native
  // Having
  def having(
    tableName: java.lang.String,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def havingIn(columnName: java.lang.String, values: js.Array[Value]): QueryBuilder = js.native
  def havingRaw(raw: Raw): QueryBuilder = js.native
  def havingRaw(sql: java.lang.String, bindings: (Value | QueryBuilder)*): QueryBuilder = js.native
  def havingRaw(sql: java.lang.String, bindings: js.Array[Value | QueryBuilder]): QueryBuilder = js.native
  def havingRaw(sql: java.lang.String, bindings: ValueMap): QueryBuilder = js.native
  def havingWrapped(callback: QueryCallback): QueryBuilder = js.native
  def increment(columnName: java.lang.String): QueryBuilder = js.native
  def increment(columnName: java.lang.String, amount: scala.Double): QueryBuilder = js.native
  def innerJoin(raw: Raw): QueryBuilder = js.native
  def innerJoin(tableName: Identifier, clause: JoinCallback): QueryBuilder = js.native
  def innerJoin(tableName: Identifier, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def innerJoin(
    tableName: Identifier,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def innerJoin(tableName: Identifier, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def innerJoin(
    tableName: Identifier,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def innerJoin(tableName: Identifier, raw: Raw): QueryBuilder = js.native
  def innerJoin(tableName: QueryCallback, clause: JoinCallback): QueryBuilder = js.native
  def innerJoin(tableName: QueryCallback, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def innerJoin(
    tableName: QueryCallback,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def innerJoin(tableName: QueryCallback, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def innerJoin(
    tableName: QueryCallback,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def innerJoin(tableName: QueryCallback, raw: Raw): QueryBuilder = js.native
  def innerJoin(tableName: TableName, clause: JoinCallback): QueryBuilder = js.native
  def innerJoin(tableName: TableName, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def innerJoin(
    tableName: TableName,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def innerJoin(tableName: TableName, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def innerJoin(
    tableName: TableName,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def innerJoin(tableName: TableName, raw: Raw): QueryBuilder = js.native
  def insert(data: js.Any): QueryBuilder = js.native
  def insert(data: js.Any, returning: java.lang.String): QueryBuilder = js.native
  def insert(data: js.Any, returning: js.Array[java.lang.String]): QueryBuilder = js.native
  def intersect(callback: QueryBuilder): QueryBuilder = js.native
  def intersect(callback: QueryBuilder, wrap: scala.Boolean): QueryBuilder = js.native
  // Intersect
  def intersect(callback: QueryCallback): QueryBuilder = js.native
  def intersect(callback: QueryCallback, wrap: scala.Boolean): QueryBuilder = js.native
  def intersect(callback: Raw): QueryBuilder = js.native
  def intersect(callback: Raw, wrap: scala.Boolean): QueryBuilder = js.native
  // Intersect
  def intersect(callbacks: (QueryCallback | QueryBuilder | Raw)*): QueryBuilder = js.native
  // Intersect
  def intersect(callbacks: js.Array[QueryCallback | QueryBuilder | Raw]): QueryBuilder = js.native
  def intersect(callbacks: js.Array[QueryCallback | QueryBuilder | Raw], wrap: scala.Boolean): QueryBuilder = js.native
  def into(callback: js.Function): QueryBuilder = js.native
  def into(raw: Raw): QueryBuilder = js.native
  def into(tableName: Identifier): QueryBuilder = js.native
  def into(tableName: TableName): QueryBuilder = js.native
  // Joins
  def join(raw: Raw): QueryBuilder = js.native
  def join(tableName: Identifier, clause: JoinCallback): QueryBuilder = js.native
  def join(tableName: Identifier, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def join(
    tableName: Identifier,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def join(tableName: Identifier, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def join(
    tableName: Identifier,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def join(tableName: Identifier, raw: Raw): QueryBuilder = js.native
  def join(tableName: QueryCallback, clause: JoinCallback): QueryBuilder = js.native
  def join(tableName: QueryCallback, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def join(
    tableName: QueryCallback,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def join(tableName: QueryCallback, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def join(
    tableName: QueryCallback,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def join(tableName: QueryCallback, raw: Raw): QueryBuilder = js.native
  // Joins
  def join(tableName: TableName, clause: JoinCallback): QueryBuilder = js.native
  // Joins
  def join(tableName: TableName, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  // Joins
  def join(
    tableName: TableName,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  // Joins
  def join(tableName: TableName, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  // Joins
  def join(
    tableName: TableName,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  // Joins
  def join(tableName: TableName, raw: Raw): QueryBuilder = js.native
  def joinRaw(tableName: java.lang.String): QueryBuilder = js.native
  def joinRaw(tableName: java.lang.String, binding: Value): QueryBuilder = js.native
  def joinRaw(tableName: java.lang.String, binding: ValueMap): QueryBuilder = js.native
  def leftJoin(raw: Raw): QueryBuilder = js.native
  def leftJoin(tableName: Identifier, clause: JoinCallback): QueryBuilder = js.native
  def leftJoin(tableName: Identifier, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def leftJoin(
    tableName: Identifier,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def leftJoin(tableName: Identifier, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def leftJoin(
    tableName: Identifier,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def leftJoin(tableName: Identifier, raw: Raw): QueryBuilder = js.native
  def leftJoin(tableName: QueryCallback, clause: JoinCallback): QueryBuilder = js.native
  def leftJoin(tableName: QueryCallback, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def leftJoin(
    tableName: QueryCallback,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def leftJoin(tableName: QueryCallback, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def leftJoin(
    tableName: QueryCallback,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def leftJoin(tableName: QueryCallback, raw: Raw): QueryBuilder = js.native
  def leftJoin(tableName: TableName, clause: JoinCallback): QueryBuilder = js.native
  def leftJoin(tableName: TableName, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def leftJoin(
    tableName: TableName,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def leftJoin(tableName: TableName, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def leftJoin(
    tableName: TableName,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def leftJoin(tableName: TableName, raw: Raw): QueryBuilder = js.native
  def leftOuterJoin(raw: Raw): QueryBuilder = js.native
  def leftOuterJoin(tableName: Identifier, clause: JoinCallback): QueryBuilder = js.native
  def leftOuterJoin(tableName: Identifier, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def leftOuterJoin(
    tableName: Identifier,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def leftOuterJoin(tableName: Identifier, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def leftOuterJoin(
    tableName: Identifier,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def leftOuterJoin(tableName: Identifier, raw: Raw): QueryBuilder = js.native
  def leftOuterJoin(tableName: QueryCallback, clause: JoinCallback): QueryBuilder = js.native
  def leftOuterJoin(tableName: QueryCallback, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def leftOuterJoin(
    tableName: QueryCallback,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def leftOuterJoin(tableName: QueryCallback, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def leftOuterJoin(
    tableName: QueryCallback,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def leftOuterJoin(tableName: QueryCallback, raw: Raw): QueryBuilder = js.native
  def leftOuterJoin(tableName: TableName, clause: JoinCallback): QueryBuilder = js.native
  def leftOuterJoin(tableName: TableName, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def leftOuterJoin(
    tableName: TableName,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def leftOuterJoin(tableName: TableName, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def leftOuterJoin(
    tableName: TableName,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def leftOuterJoin(tableName: TableName, raw: Raw): QueryBuilder = js.native
  def limit(limit: scala.Double): QueryBuilder = js.native
  def max(columnName: java.lang.String, columnNames: java.lang.String*): QueryBuilder = js.native
  def max(columnName: Raw): QueryBuilder = js.native
  def max(columnName: stdLib.Record[java.lang.String, java.lang.String | js.Array[java.lang.String] | Raw]): QueryBuilder = js.native
  def min(columnName: java.lang.String, columnNames: java.lang.String*): QueryBuilder = js.native
  def min(columnName: Raw): QueryBuilder = js.native
  def min(columnName: stdLib.Record[java.lang.String, java.lang.String | js.Array[java.lang.String] | Raw]): QueryBuilder = js.native
  def modify(callback: QueryCallbackWithArgs, args: js.Any*): QueryBuilder = js.native
  // Paging
  def offset(offset: scala.Double): QueryBuilder = js.native
  def orHaving(raw: Raw): QueryBuilder = js.native
  def orHaving(sql: java.lang.String, bindings: (Value | QueryBuilder)*): QueryBuilder = js.native
  def orHaving(sql: java.lang.String, bindings: js.Array[Value | QueryBuilder]): QueryBuilder = js.native
  def orHaving(sql: java.lang.String, bindings: ValueMap): QueryBuilder = js.native
  def orHaving(
    tableName: java.lang.String,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def orHavingRaw(raw: Raw): QueryBuilder = js.native
  def orHavingRaw(sql: java.lang.String, bindings: (Value | QueryBuilder)*): QueryBuilder = js.native
  def orHavingRaw(sql: java.lang.String, bindings: js.Array[Value | QueryBuilder]): QueryBuilder = js.native
  def orHavingRaw(sql: java.lang.String, bindings: ValueMap): QueryBuilder = js.native
  def orWhere(callback: QueryCallback): QueryBuilder = js.native
  def orWhere(columnName: java.lang.String): QueryBuilder = js.native
  def orWhere(columnName: java.lang.String, operator: java.lang.String): QueryBuilder = js.native
  def orWhere(columnName: java.lang.String, operator: java.lang.String, value: QueryBuilder): QueryBuilder = js.native
  def orWhere(columnName: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder = js.native
  def orWhere(columnName: java.lang.String, value: Value): QueryBuilder = js.native
  def orWhere(condition: scala.Boolean): QueryBuilder = js.native
  def orWhere(left: Raw, operator: java.lang.String): QueryBuilder = js.native
  def orWhere(left: Raw, operator: java.lang.String, right: QueryBuilder): QueryBuilder = js.native
  def orWhere(left: Raw, operator: java.lang.String, right: Value): QueryBuilder = js.native
  def orWhere(`object`: js.Object): QueryBuilder = js.native
  def orWhere(raw: Raw): QueryBuilder = js.native
  def orWhere(sql: java.lang.String, bindings: (Value | QueryBuilder)*): QueryBuilder = js.native
  def orWhere(sql: java.lang.String, bindings: js.Array[Value | QueryBuilder]): QueryBuilder = js.native
  def orWhere(sql: java.lang.String, bindings: ValueMap): QueryBuilder = js.native
  def orWhereBetween(columnName: java.lang.String, range: js.Tuple2[Value, Value]): QueryBuilder = js.native
  def orWhereExists(callback: QueryCallback): QueryBuilder = js.native
  def orWhereExists(query: QueryBuilder): QueryBuilder = js.native
  def orWhereIn(columnName: java.lang.String, values: js.Array[Value]): QueryBuilder = js.native
  def orWhereIn(columnName: java.lang.String, values: QueryBuilder): QueryBuilder = js.native
  def orWhereIn(columnName: java.lang.String, values: QueryCallback): QueryBuilder = js.native
  def orWhereIn(columnNames: js.Array[java.lang.String], values: js.Array[js.Array[Value]]): QueryBuilder = js.native
  def orWhereIn(columnNames: js.Array[java.lang.String], values: QueryBuilder): QueryBuilder = js.native
  def orWhereIn(columnNames: js.Array[java.lang.String], values: QueryCallback): QueryBuilder = js.native
  def orWhereNot(callback: QueryCallback): QueryBuilder = js.native
  def orWhereNot(columnName: java.lang.String): QueryBuilder = js.native
  def orWhereNot(columnName: java.lang.String, operator: java.lang.String): QueryBuilder = js.native
  def orWhereNot(columnName: java.lang.String, operator: java.lang.String, value: QueryBuilder): QueryBuilder = js.native
  def orWhereNot(columnName: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder = js.native
  def orWhereNot(columnName: java.lang.String, value: Value): QueryBuilder = js.native
  def orWhereNot(condition: scala.Boolean): QueryBuilder = js.native
  def orWhereNot(left: Raw, operator: java.lang.String): QueryBuilder = js.native
  def orWhereNot(left: Raw, operator: java.lang.String, right: QueryBuilder): QueryBuilder = js.native
  def orWhereNot(left: Raw, operator: java.lang.String, right: Value): QueryBuilder = js.native
  def orWhereNot(`object`: js.Object): QueryBuilder = js.native
  def orWhereNot(raw: Raw): QueryBuilder = js.native
  def orWhereNot(sql: java.lang.String, bindings: (Value | QueryBuilder)*): QueryBuilder = js.native
  def orWhereNot(sql: java.lang.String, bindings: js.Array[Value | QueryBuilder]): QueryBuilder = js.native
  def orWhereNot(sql: java.lang.String, bindings: ValueMap): QueryBuilder = js.native
  def orWhereNotBetween(columnName: java.lang.String, range: js.Tuple2[Value, Value]): QueryBuilder = js.native
  def orWhereNotExists(callback: QueryCallback): QueryBuilder = js.native
  def orWhereNotExists(query: QueryBuilder): QueryBuilder = js.native
  def orWhereNotIn(columnName: java.lang.String, values: js.Array[Value]): QueryBuilder = js.native
  def orWhereNotIn(columnName: java.lang.String, values: QueryBuilder): QueryBuilder = js.native
  def orWhereNotIn(columnName: java.lang.String, values: QueryCallback): QueryBuilder = js.native
  def orWhereNotIn(columnNames: js.Array[java.lang.String], values: js.Array[js.Array[Value]]): QueryBuilder = js.native
  def orWhereNotIn(columnNames: js.Array[java.lang.String], values: QueryBuilder): QueryBuilder = js.native
  def orWhereNotIn(columnNames: js.Array[java.lang.String], values: QueryCallback): QueryBuilder = js.native
  def orWhereNotNull(columnName: java.lang.String): QueryBuilder = js.native
  def orWhereNull(columnName: java.lang.String): QueryBuilder = js.native
  def orWhereRaw(condition: scala.Boolean): QueryBuilder = js.native
  def orWhereRaw(raw: Raw): QueryBuilder = js.native
  def orWhereRaw(sql: java.lang.String, bindings: (Value | QueryBuilder)*): QueryBuilder = js.native
  def orWhereRaw(sql: java.lang.String, bindings: js.Array[Value | QueryBuilder]): QueryBuilder = js.native
  def orWhereRaw(sql: java.lang.String, bindings: ValueMap): QueryBuilder = js.native
  // Order by
  def orderBy(columnDefs: js.Array[java.lang.String | knexLib.Anon_Column]): QueryBuilder = js.native
  // Order by
  def orderBy(columnName: java.lang.String): QueryBuilder = js.native
  def orderBy(columnName: java.lang.String, order: java.lang.String): QueryBuilder = js.native
  def orderByRaw(raw: Raw): QueryBuilder = js.native
  def orderByRaw(sql: java.lang.String, bindings: (Value | QueryBuilder)*): QueryBuilder = js.native
  def orderByRaw(sql: java.lang.String, bindings: js.Array[Value | QueryBuilder]): QueryBuilder = js.native
  def orderByRaw(sql: java.lang.String, bindings: ValueMap): QueryBuilder = js.native
  def outerJoin(raw: Raw): QueryBuilder = js.native
  def outerJoin(tableName: Identifier, clause: JoinCallback): QueryBuilder = js.native
  def outerJoin(tableName: Identifier, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def outerJoin(
    tableName: Identifier,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def outerJoin(tableName: Identifier, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def outerJoin(
    tableName: Identifier,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def outerJoin(tableName: Identifier, raw: Raw): QueryBuilder = js.native
  def outerJoin(tableName: QueryCallback, clause: JoinCallback): QueryBuilder = js.native
  def outerJoin(tableName: QueryCallback, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def outerJoin(
    tableName: QueryCallback,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def outerJoin(tableName: QueryCallback, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def outerJoin(
    tableName: QueryCallback,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def outerJoin(tableName: QueryCallback, raw: Raw): QueryBuilder = js.native
  def outerJoin(tableName: TableName, clause: JoinCallback): QueryBuilder = js.native
  def outerJoin(tableName: TableName, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def outerJoin(
    tableName: TableName,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def outerJoin(tableName: TableName, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def outerJoin(
    tableName: TableName,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def outerJoin(tableName: TableName, raw: Raw): QueryBuilder = js.native
  def pluck(column: java.lang.String): QueryBuilder = js.native
  def returning(column: java.lang.String): QueryBuilder = js.native
  def returning(column: js.Array[java.lang.String]): QueryBuilder = js.native
  def rightJoin(raw: Raw): QueryBuilder = js.native
  def rightJoin(tableName: Identifier, clause: JoinCallback): QueryBuilder = js.native
  def rightJoin(tableName: Identifier, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def rightJoin(
    tableName: Identifier,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def rightJoin(tableName: Identifier, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def rightJoin(
    tableName: Identifier,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def rightJoin(tableName: Identifier, raw: Raw): QueryBuilder = js.native
  def rightJoin(tableName: QueryCallback, clause: JoinCallback): QueryBuilder = js.native
  def rightJoin(tableName: QueryCallback, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def rightJoin(
    tableName: QueryCallback,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def rightJoin(tableName: QueryCallback, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def rightJoin(
    tableName: QueryCallback,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def rightJoin(tableName: QueryCallback, raw: Raw): QueryBuilder = js.native
  def rightJoin(tableName: TableName, clause: JoinCallback): QueryBuilder = js.native
  def rightJoin(tableName: TableName, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def rightJoin(
    tableName: TableName,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def rightJoin(tableName: TableName, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def rightJoin(
    tableName: TableName,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def rightJoin(tableName: TableName, raw: Raw): QueryBuilder = js.native
  def rightOuterJoin(raw: Raw): QueryBuilder = js.native
  def rightOuterJoin(tableName: Identifier, clause: JoinCallback): QueryBuilder = js.native
  def rightOuterJoin(tableName: Identifier, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def rightOuterJoin(
    tableName: Identifier,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def rightOuterJoin(tableName: Identifier, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def rightOuterJoin(
    tableName: Identifier,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def rightOuterJoin(tableName: Identifier, raw: Raw): QueryBuilder = js.native
  def rightOuterJoin(tableName: QueryCallback, clause: JoinCallback): QueryBuilder = js.native
  def rightOuterJoin(tableName: QueryCallback, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def rightOuterJoin(
    tableName: QueryCallback,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def rightOuterJoin(tableName: QueryCallback, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def rightOuterJoin(
    tableName: QueryCallback,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def rightOuterJoin(tableName: QueryCallback, raw: Raw): QueryBuilder = js.native
  def rightOuterJoin(tableName: TableName, clause: JoinCallback): QueryBuilder = js.native
  def rightOuterJoin(tableName: TableName, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def rightOuterJoin(
    tableName: TableName,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def rightOuterJoin(tableName: TableName, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def rightOuterJoin(
    tableName: TableName,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def rightOuterJoin(tableName: TableName, raw: Raw): QueryBuilder = js.native
  def select(aliases: org.scalablytyped.runtime.StringDictionary[java.lang.String | Raw]): QueryBuilder = js.native
  def select(columnNames: ColumnName*): QueryBuilder = js.native
  def select(columnNames: js.Array[ColumnName]): QueryBuilder = js.native
  def sum(columnName: java.lang.String, columnNames: java.lang.String*): QueryBuilder = js.native
  def sum(columnName: Raw): QueryBuilder = js.native
  def sum(columnName: stdLib.Record[java.lang.String, java.lang.String | js.Array[java.lang.String] | Raw]): QueryBuilder = js.native
  def sumDistinct(columnName: java.lang.String): QueryBuilder = js.native
  def sumDistinct(columnName: Raw): QueryBuilder = js.native
  def sumDistinct(columnName: stdLib.Record[java.lang.String, java.lang.String | Raw]): QueryBuilder = js.native
  def table(callback: js.Function): QueryBuilder = js.native
  def table(raw: Raw): QueryBuilder = js.native
  def table(tableName: Identifier): QueryBuilder = js.native
  def table(tableName: TableName): QueryBuilder = js.native
  def truncate(): QueryBuilder = js.native
  def union(callback: QueryBuilder): QueryBuilder = js.native
  def union(callback: QueryBuilder, wrap: scala.Boolean): QueryBuilder = js.native
  // Union
  def union(callback: QueryCallback): QueryBuilder = js.native
  def union(callback: QueryCallback, wrap: scala.Boolean): QueryBuilder = js.native
  def union(callback: Raw): QueryBuilder = js.native
  def union(callback: Raw, wrap: scala.Boolean): QueryBuilder = js.native
  // Union
  def union(callbacks: (QueryCallback | QueryBuilder | Raw)*): QueryBuilder = js.native
  // Union
  def union(callbacks: js.Array[QueryCallback | QueryBuilder | Raw]): QueryBuilder = js.native
  def union(callbacks: js.Array[QueryCallback | QueryBuilder | Raw], wrap: scala.Boolean): QueryBuilder = js.native
  def unionAll(callback: QueryBuilder): QueryBuilder = js.native
  def unionAll(callback: QueryBuilder, wrap: scala.Boolean): QueryBuilder = js.native
  def unionAll(callback: QueryCallback): QueryBuilder = js.native
  def unionAll(callback: QueryCallback, wrap: scala.Boolean): QueryBuilder = js.native
  def unionAll(callback: Raw): QueryBuilder = js.native
  def unionAll(callback: Raw, wrap: scala.Boolean): QueryBuilder = js.native
  def unionAll(callbacks: (QueryCallback | QueryBuilder | Raw)*): QueryBuilder = js.native
  def unionAll(callbacks: js.Array[QueryCallback | QueryBuilder | Raw]): QueryBuilder = js.native
  def unionAll(callbacks: js.Array[QueryCallback | QueryBuilder | Raw], wrap: scala.Boolean): QueryBuilder = js.native
  def update(columnName: java.lang.String, value: Value): QueryBuilder = js.native
  def update(columnName: java.lang.String, value: Value, returning: java.lang.String): QueryBuilder = js.native
  def update(columnName: java.lang.String, value: Value, returning: js.Array[java.lang.String]): QueryBuilder = js.native
  def update(data: js.Any): QueryBuilder = js.native
  def update(data: js.Any, returning: java.lang.String): QueryBuilder = js.native
  def update(data: js.Any, returning: js.Array[java.lang.String]): QueryBuilder = js.native
  // Wheres
  def where(callback: QueryCallback): QueryBuilder = js.native
  def where(columnName: java.lang.String): QueryBuilder = js.native
  def where(columnName: java.lang.String, operator: java.lang.String): QueryBuilder = js.native
  def where(columnName: java.lang.String, operator: java.lang.String, value: QueryBuilder): QueryBuilder = js.native
  // Wheres
  def where(columnName: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder = js.native
  // Wheres
  def where(columnName: java.lang.String, value: Value): QueryBuilder = js.native
  // Wheres
  def where(condition: scala.Boolean): QueryBuilder = js.native
  def where(left: Raw, operator: java.lang.String): QueryBuilder = js.native
  def where(left: Raw, operator: java.lang.String, right: QueryBuilder): QueryBuilder = js.native
  // Wheres
  def where(left: Raw, operator: java.lang.String, right: Value): QueryBuilder = js.native
  // Wheres
  def where(`object`: js.Object): QueryBuilder = js.native
  // Wheres
  def where(raw: Raw): QueryBuilder = js.native
  // Wheres
  def where(sql: java.lang.String, bindings: (Value | QueryBuilder)*): QueryBuilder = js.native
  // Wheres
  def where(sql: java.lang.String, bindings: js.Array[Value | QueryBuilder]): QueryBuilder = js.native
  def where(sql: java.lang.String, bindings: ValueMap): QueryBuilder = js.native
  def whereBetween(columnName: java.lang.String, range: js.Tuple2[Value, Value]): QueryBuilder = js.native
  def whereExists(callback: QueryCallback): QueryBuilder = js.native
  def whereExists(query: QueryBuilder): QueryBuilder = js.native
  def whereIn(columnName: java.lang.String, values: js.Array[Value]): QueryBuilder = js.native
  def whereIn(columnName: java.lang.String, values: QueryBuilder): QueryBuilder = js.native
  def whereIn(columnName: java.lang.String, values: QueryCallback): QueryBuilder = js.native
  def whereIn(columnNames: js.Array[java.lang.String], values: js.Array[js.Array[Value]]): QueryBuilder = js.native
  def whereIn(columnNames: js.Array[java.lang.String], values: QueryBuilder): QueryBuilder = js.native
  def whereIn(columnNames: js.Array[java.lang.String], values: QueryCallback): QueryBuilder = js.native
  def whereNot(callback: QueryCallback): QueryBuilder = js.native
  def whereNot(columnName: java.lang.String): QueryBuilder = js.native
  def whereNot(columnName: java.lang.String, operator: java.lang.String): QueryBuilder = js.native
  def whereNot(columnName: java.lang.String, operator: java.lang.String, value: QueryBuilder): QueryBuilder = js.native
  def whereNot(columnName: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder = js.native
  def whereNot(columnName: java.lang.String, value: Value): QueryBuilder = js.native
  def whereNot(condition: scala.Boolean): QueryBuilder = js.native
  def whereNot(left: Raw, operator: java.lang.String): QueryBuilder = js.native
  def whereNot(left: Raw, operator: java.lang.String, right: QueryBuilder): QueryBuilder = js.native
  def whereNot(left: Raw, operator: java.lang.String, right: Value): QueryBuilder = js.native
  def whereNot(`object`: js.Object): QueryBuilder = js.native
  def whereNot(raw: Raw): QueryBuilder = js.native
  def whereNot(sql: java.lang.String, bindings: (Value | QueryBuilder)*): QueryBuilder = js.native
  def whereNot(sql: java.lang.String, bindings: js.Array[Value | QueryBuilder]): QueryBuilder = js.native
  def whereNot(sql: java.lang.String, bindings: ValueMap): QueryBuilder = js.native
  def whereNotBetween(columnName: java.lang.String, range: js.Tuple2[Value, Value]): QueryBuilder = js.native
  def whereNotExists(callback: QueryCallback): QueryBuilder = js.native
  def whereNotExists(query: QueryBuilder): QueryBuilder = js.native
  def whereNotIn(columnName: java.lang.String, values: js.Array[Value]): QueryBuilder = js.native
  def whereNotIn(columnName: java.lang.String, values: QueryBuilder): QueryBuilder = js.native
  def whereNotIn(columnName: java.lang.String, values: QueryCallback): QueryBuilder = js.native
  def whereNotIn(columnNames: js.Array[java.lang.String], values: js.Array[js.Array[Value]]): QueryBuilder = js.native
  def whereNotIn(columnNames: js.Array[java.lang.String], values: QueryBuilder): QueryBuilder = js.native
  def whereNotIn(columnNames: js.Array[java.lang.String], values: QueryCallback): QueryBuilder = js.native
  def whereNotNull(columnName: java.lang.String): QueryBuilder = js.native
  def whereNull(columnName: java.lang.String): QueryBuilder = js.native
  def whereRaw(condition: scala.Boolean): QueryBuilder = js.native
  def whereRaw(raw: Raw): QueryBuilder = js.native
  def whereRaw(sql: java.lang.String, bindings: (Value | QueryBuilder)*): QueryBuilder = js.native
  def whereRaw(sql: java.lang.String, bindings: js.Array[Value | QueryBuilder]): QueryBuilder = js.native
  def whereRaw(sql: java.lang.String, bindings: ValueMap): QueryBuilder = js.native
  def whereWrapped(callback: QueryCallback): QueryBuilder = js.native
  // Withs
  def `with`(alias: java.lang.String, callback: js.Function1[/* queryBuilder */ QueryBuilder, _]): QueryBuilder = js.native
  // Withs
  def `with`(alias: java.lang.String, raw: QueryBuilder): QueryBuilder = js.native
  // Withs
  def `with`(alias: java.lang.String, raw: Raw): QueryBuilder = js.native
  // Withs
  def `with`(alias: java.lang.String, sql: java.lang.String): QueryBuilder = js.native
  def `with`(alias: java.lang.String, sql: java.lang.String, bindings: js.Array[Value]): QueryBuilder = js.native
  def `with`(alias: java.lang.String, sql: java.lang.String, bindings: js.Object): QueryBuilder = js.native
  def withRaw(alias: java.lang.String, raw: QueryBuilder): QueryBuilder = js.native
  def withRaw(alias: java.lang.String, raw: Raw): QueryBuilder = js.native
  def withRaw(alias: java.lang.String, sql: java.lang.String): QueryBuilder = js.native
  def withRaw(alias: java.lang.String, sql: java.lang.String, bindings: js.Array[Value]): QueryBuilder = js.native
  def withRaw(alias: java.lang.String, sql: java.lang.String, bindings: js.Object): QueryBuilder = js.native
  def withSchema(schema: java.lang.String): QueryBuilder = js.native
  def withWrapped(alias: java.lang.String, callback: js.Function1[/* queryBuilder */ QueryBuilder, _]): QueryBuilder = js.native
  def withWrapped(alias: java.lang.String, queryBuilder: QueryBuilder): QueryBuilder = js.native
}

