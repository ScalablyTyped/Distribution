package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// QueryInterface
//
@js.native
trait QueryInterface[TRecord /* <: js.Object */, TResult] extends js.Object {
  @JSName("andHaving")
  var andHaving_Original: Having[TRecord, TResult] = js.native
  @JSName("andWhereBetween")
  var andWhereBetween_Original: WhereBetween[TRecord, TResult] = js.native
  @JSName("andWhereNotBetween")
  var andWhereNotBetween_Original: WhereBetween[TRecord, TResult] = js.native
  @JSName("andWhereNot")
  var andWhereNot_Original: Where[TRecord, TResult] = js.native
  @JSName("andWhereRaw")
  var andWhereRaw_Original: WhereRaw[TRecord, TResult] = js.native
  @JSName("andWhere")
  var andWhere_Original: Where[TRecord, TResult] = js.native
  @JSName("as")
  var as_Original: As[TRecord, TResult] = js.native
  @JSName("column")
  var column_Original: Select[TRecord, TResult] = js.native
  @JSName("columns")
  var columns_Original: Select[TRecord, TResult] = js.native
  @JSName("crossJoin")
  var crossJoin_Original: Join[TRecord, TResult] = js.native
  @JSName("distinct")
  var distinct_Original: Distinct[TRecord, TResult] = js.native
  // Others
  @JSName("first")
  var first_Original: Select[TRecord, UnwrapArrayMember[TResult]] = js.native
  @JSName("from")
  var from_Original: Table[TRecord, TResult] = js.native
  @JSName("fullOuterJoin")
  var fullOuterJoin_Original: Join[TRecord, TResult] = js.native
  @JSName("groupByRaw")
  var groupByRaw_Original: RawQueryBuilder[TRecord, TResult] = js.native
  // Group by
  @JSName("groupBy")
  var groupBy_Original: GroupBy[TRecord, TResult] = js.native
  @JSName("havingBetween")
  var havingBetween_Original: HavingRange[TRecord, TResult] = js.native
  @JSName("havingIn")
  var havingIn_Original: HavingRange[TRecord, TResult] = js.native
  @JSName("havingNotBetween")
  var havingNotBetween_Original: HavingRange[TRecord, TResult] = js.native
  @JSName("havingRaw")
  var havingRaw_Original: RawQueryBuilder[TRecord, TResult] = js.native
  @JSName("havingWrapped")
  var havingWrapped_Original: WhereWrapped[TRecord, TResult] = js.native
  // Having
  @JSName("having")
  var having_Original: Having[TRecord, TResult] = js.native
  @JSName("innerJoin")
  var innerJoin_Original: Join[TRecord, TResult] = js.native
  // Intersect
  @JSName("intersect")
  var intersect_Original: Intersect[TRecord, TResult] = js.native
  @JSName("into")
  var into_Original: Table[TRecord, TResult] = js.native
  @JSName("joinRaw")
  var joinRaw_Original: JoinRaw[TRecord, TResult] = js.native
  // Joins
  @JSName("join")
  var join_Original: Join[TRecord, TResult] = js.native
  @JSName("leftJoin")
  var leftJoin_Original: Join[TRecord, TResult] = js.native
  @JSName("leftOuterJoin")
  var leftOuterJoin_Original: Join[TRecord, TResult] = js.native
  @JSName("orHavingBetween")
  var orHavingBetween_Original: HavingRange[TRecord, TResult] = js.native
  @JSName("orHavingNotBetween")
  var orHavingNotBetween_Original: HavingRange[TRecord, TResult] = js.native
  @JSName("orHavingRaw")
  var orHavingRaw_Original: RawQueryBuilder[TRecord, TResult] = js.native
  @JSName("orHaving")
  var orHaving_Original: Having[TRecord, TResult] = js.native
  @JSName("orWhereBetween")
  var orWhereBetween_Original: WhereBetween[TRecord, TResult] = js.native
  @JSName("orWhereExists")
  var orWhereExists_Original: WhereExists[TRecord, TResult] = js.native
  @JSName("orWhereIn")
  var orWhereIn_Original: WhereIn[TRecord, TResult] = js.native
  @JSName("orWhereNotBetween")
  var orWhereNotBetween_Original: WhereBetween[TRecord, TResult] = js.native
  @JSName("orWhereNotExists")
  var orWhereNotExists_Original: WhereExists[TRecord, TResult] = js.native
  @JSName("orWhereNotIn")
  var orWhereNotIn_Original: WhereIn[TRecord, TResult] = js.native
  @JSName("orWhereNotNull")
  var orWhereNotNull_Original: WhereNull[TRecord, TResult] = js.native
  @JSName("orWhereNot")
  var orWhereNot_Original: Where[TRecord, TResult] = js.native
  @JSName("orWhereNull")
  var orWhereNull_Original: WhereNull[TRecord, TResult] = js.native
  @JSName("orWhereRaw")
  var orWhereRaw_Original: WhereRaw[TRecord, TResult] = js.native
  @JSName("orWhere")
  var orWhere_Original: Where[TRecord, TResult] = js.native
  @JSName("orderByRaw")
  var orderByRaw_Original: RawQueryBuilder[TRecord, TResult] = js.native
  // Order by
  @JSName("orderBy")
  var orderBy_Original: OrderBy[TRecord, TResult] = js.native
  @JSName("outerJoin")
  var outerJoin_Original: Join[TRecord, TResult] = js.native
  @JSName("rightJoin")
  var rightJoin_Original: Join[TRecord, TResult] = js.native
  @JSName("rightOuterJoin")
  var rightOuterJoin_Original: Join[TRecord, TResult] = js.native
  @JSName("select")
  var select_Original: Select[TRecord, TResult] = js.native
  @JSName("table")
  var table_Original: Table[TRecord, TResult] = js.native
  @JSName("unionAll")
  var unionAll_Original: Union[TRecord, TResult] = js.native
  // Union
  @JSName("union")
  var union_Original: Union[TRecord, TResult] = js.native
  @JSName("whereBetween")
  var whereBetween_Original: WhereBetween[TRecord, TResult] = js.native
  @JSName("whereExists")
  var whereExists_Original: WhereExists[TRecord, TResult] = js.native
  @JSName("whereIn")
  var whereIn_Original: WhereIn[TRecord, TResult] = js.native
  @JSName("whereNotBetween")
  var whereNotBetween_Original: WhereBetween[TRecord, TResult] = js.native
  @JSName("whereNotExists")
  var whereNotExists_Original: WhereExists[TRecord, TResult] = js.native
  @JSName("whereNotIn")
  var whereNotIn_Original: WhereIn[TRecord, TResult] = js.native
  @JSName("whereNotNull")
  var whereNotNull_Original: WhereNull[TRecord, TResult] = js.native
  @JSName("whereNot")
  var whereNot_Original: Where[TRecord, TResult] = js.native
  @JSName("whereNull")
  var whereNull_Original: WhereNull[TRecord, TResult] = js.native
  @JSName("whereRaw")
  var whereRaw_Original: WhereRaw[TRecord, TResult] = js.native
  @JSName("whereWrapped")
  var whereWrapped_Original: WhereWrapped[TRecord, TResult] = js.native
  // Wheres
  @JSName("where")
  var where_Original: Where[TRecord, TResult] = js.native
  @JSName("withRaw")
  var withRaw_Original: WithRaw[TRecord, TResult] = js.native
  @JSName("withRecursive")
  var withRecursive_Original: With[TRecord, TResult] = js.native
  @JSName("withSchema")
  var withSchema_Original: WithSchema[TRecord, TResult] = js.native
  @JSName("withWrapped")
  var withWrapped_Original: WithWrapped[TRecord, TResult] = js.native
  // Withs
  @JSName("with")
  var with_Original: With[TRecord, TResult] = js.native
  def andHaving(
    tableName: java.lang.String,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord, TResult] = js.native
  def andHaving[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def andHaving[TResult2](sql: java.lang.String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def andHaving[TResult2](sql: java.lang.String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def andHaving[TResult2](sql: java.lang.String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  def andHaving[K1 /* <: java.lang.String */, K2 /* <: java.lang.String */](tableName: java.lang.String, column1: K1, operator: ComparisionOperator, column2: K2): QueryBuilder[TRecord, TResult] = js.native
  def andWhere(callback: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def andWhere(columnName: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def andWhere(columnName: java.lang.String, operator: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def andWhere(columnName: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  def andWhere(columnName: java.lang.String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  def andWhere(condition: scala.Boolean): QueryBuilder[TRecord, TResult] = js.native
  def andWhere(left: Raw[_], operator: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def andWhere(left: Raw[_], operator: java.lang.String, right: Value): QueryBuilder[TRecord, TResult] = js.native
  def andWhere(`object`: js.Object): QueryBuilder[TRecord, TResult] = js.native
  def andWhere(`object`: SafePartial[TRecord]): QueryBuilder[TRecord, TResult] = js.native
  def andWhere(raw: Raw[_]): QueryBuilder[TRecord, TResult] = js.native
  def andWhere[T /* <: java.lang.String */](columnName: T): QueryBuilder[TRecord, TResult] = js.native
  def andWhere[T /* <: java.lang.String */](columnName: T, operator: ComparisionOperator): QueryBuilder[TRecord, TResult] = js.native
  def andWhere[T /* <: java.lang.String */](
    columnName: T,
    operator: ComparisionOperator,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): QueryBuilder[TRecord, TResult] = js.native
  def andWhere[T /* <: java.lang.String */](
    columnName: T,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): QueryBuilder[TRecord, TResult] = js.native
  def andWhere[TResult2](sql: java.lang.String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def andWhere[TResult2](sql: java.lang.String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def andWhere[TResult2](sql: java.lang.String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  def andWhere[TRecordInner, TResultInner](
    columnName: java.lang.String,
    operator: java.lang.String,
    value: QueryBuilder[TRecordInner, TResultInner]
  ): QueryBuilder[TRecord, TResult] = js.native
  def andWhere[TRecordInner, TResultInner](left: Raw[_], operator: java.lang.String, right: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def andWhere[T /* <: java.lang.String */, TRecordInner, TResultInner](columnName: T, operator: ComparisionOperator, value: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def andWhereBetween(columnName: java.lang.String, range: js.Tuple2[Value, Value]): QueryBuilder[TRecord, TResult] = js.native
  def andWhereBetween[K /* <: java.lang.String */](
    columnName: K,
    range: js.Tuple2[
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot(callback: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot(columnName: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot(columnName: java.lang.String, operator: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot(columnName: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot(columnName: java.lang.String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot(condition: scala.Boolean): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot(left: Raw[_], operator: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot(left: Raw[_], operator: java.lang.String, right: Value): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot(`object`: js.Object): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot(`object`: SafePartial[TRecord]): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot(raw: Raw[_]): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot[T /* <: java.lang.String */](columnName: T): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot[T /* <: java.lang.String */](columnName: T, operator: ComparisionOperator): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot[T /* <: java.lang.String */](
    columnName: T,
    operator: ComparisionOperator,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot[T /* <: java.lang.String */](
    columnName: T,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot[TResult2](sql: java.lang.String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def andWhereNot[TResult2](sql: java.lang.String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def andWhereNot[TResult2](sql: java.lang.String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  def andWhereNot[TRecordInner, TResultInner](
    columnName: java.lang.String,
    operator: java.lang.String,
    value: QueryBuilder[TRecordInner, TResultInner]
  ): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot[TRecordInner, TResultInner](left: Raw[_], operator: java.lang.String, right: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot[T /* <: java.lang.String */, TRecordInner, TResultInner](columnName: T, operator: ComparisionOperator, value: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNotBetween(columnName: java.lang.String, range: js.Tuple2[Value, Value]): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNotBetween[K /* <: java.lang.String */](
    columnName: K,
    range: js.Tuple2[
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  @JSName("andWhereNot")
  def andWhereNot_TResult2[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def andWhereRaw(condition: scala.Boolean): QueryBuilder[TRecord, TResult] = js.native
  def andWhereRaw[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def andWhereRaw[TResult2](sql: java.lang.String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def andWhereRaw[TResult2](sql: java.lang.String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def andWhereRaw[TResult2](sql: java.lang.String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("andWhere")
  def andWhere_TResult2[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def as(columnName: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def avg[TResult2](columnName: java.lang.String, columnNames: java.lang.String*): QueryBuilder[TRecord, TResult2] = js.native
  def avg[TResult2](columnName: Raw[_]): QueryBuilder[TRecord, TResult2] = js.native
  def avg[TResult2](
    columnName: stdLib.Record[java.lang.String, java.lang.String | js.Array[java.lang.String] | Raw[_]]
  ): QueryBuilder[TRecord, TResult2] = js.native
  def avgDistinct[TResult2](columnName: java.lang.String): QueryBuilder[TRecord, TResult2] = js.native
  def avgDistinct[TResult2](columnName: Raw[_]): QueryBuilder[TRecord, TResult2] = js.native
  def avgDistinct[TResult2](columnName: stdLib.Record[java.lang.String, java.lang.String | Raw[_]]): QueryBuilder[TRecord, TResult2] = js.native
  def clearCounters(): QueryBuilder[TRecord, TResult] = js.native
  def clearHaving(): QueryBuilder[TRecord, TResult] = js.native
  def clearOrder(): QueryBuilder[TRecord, TResult] = js.native
  // Clear
  def clearSelect(): QueryBuilder[
    TRecord, 
    TResult | (js.Array[
      DeferredKeySelection[
        _, 
        scala.Nothing, 
        knexLib.knexLibNumbers.`false`, 
        js.Object, 
        knexLib.knexLibNumbers.`false`
      ]
    ])
  ] = js.native
  def clearWhere(): QueryBuilder[TRecord, TResult] = js.native
  def column(): QueryBuilder[TRecord, TResult] = js.native
  // For non-inferrable column selection, we will allow consumer to
  // specify result type and if not widen the result to entire record type with any omissions permitted
  def column[TResult2](columnNames: (ColumnDescriptor[TRecord, TResult])*): QueryBuilder[TRecord, TResult2] = js.native
  def column[TResult2](columnNames: js.Array[ColumnDescriptor[TRecord, TResult]]): QueryBuilder[TRecord, TResult2] = js.native
  def column[AliasUT /* <: js.Array[InferrableColumnDescriptor[TRecord]] */, TResult2](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param aliases because its type AliasUT is not an array type */ aliases: AliasUT
  ): QueryBuilder[TRecord, TResult2] = js.native
  // When all columns are known to be keys of original record,
  // we can extend our selection by these columns
  @JSName("column")
  def `column_*`(columnName: knexLib.knexLibStrings.`*`): QueryBuilder[
    TRecord, 
    js.Array[
      DeferredKeySelection[
        TRecord, 
        java.lang.String, 
        knexLib.knexLibNumbers.`false`, 
        js.Object, 
        knexLib.knexLibNumbers.`false`
      ]
    ]
  ] = js.native
  @JSName("column")
  def column_AliasUTArrayTResult2[AliasUT /* <: js.Array[Dict[_] | java.lang.String] */, TResult2](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param aliases because its type AliasUT is not an array type */ aliases: AliasUT
  ): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("column")
  def column_ColNameUTStringTResult2[ColNameUT /* <: java.lang.String */, TResult2](columnNames: ColNameUT*): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("column")
  def column_ColNameUTStringTResult2[ColNameUT /* <: java.lang.String */, TResult2](columnNames: js.Array[ColNameUT]): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("column")
  def column_TResult2TInnerRecordTInnerResult[TResult2, TInnerRecord, TInnerResult](subQueryBuilders: (QueryBuilder[TInnerRecord, TInnerResult])*): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("column")
  def column_TResult2TInnerRecordTInnerResult[TResult2, TInnerRecord, TInnerResult](subQueryBuilders: js.Array[QueryBuilder[TInnerRecord, TInnerResult]]): QueryBuilder[TRecord, TResult2] = js.native
  def columns(): QueryBuilder[TRecord, TResult] = js.native
  // For non-inferrable column selection, we will allow consumer to
  // specify result type and if not widen the result to entire record type with any omissions permitted
  def columns[TResult2](columnNames: (ColumnDescriptor[TRecord, TResult])*): QueryBuilder[TRecord, TResult2] = js.native
  def columns[TResult2](columnNames: js.Array[ColumnDescriptor[TRecord, TResult]]): QueryBuilder[TRecord, TResult2] = js.native
  def columns[AliasUT /* <: js.Array[InferrableColumnDescriptor[TRecord]] */, TResult2](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param aliases because its type AliasUT is not an array type */ aliases: AliasUT
  ): QueryBuilder[TRecord, TResult2] = js.native
  // When all columns are known to be keys of original record,
  // we can extend our selection by these columns
  @JSName("columns")
  def `columns_*`(columnName: knexLib.knexLibStrings.`*`): QueryBuilder[
    TRecord, 
    js.Array[
      DeferredKeySelection[
        TRecord, 
        java.lang.String, 
        knexLib.knexLibNumbers.`false`, 
        js.Object, 
        knexLib.knexLibNumbers.`false`
      ]
    ]
  ] = js.native
  @JSName("columns")
  def columns_AliasUTArrayTResult2[AliasUT /* <: js.Array[Dict[_] | java.lang.String] */, TResult2](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param aliases because its type AliasUT is not an array type */ aliases: AliasUT
  ): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("columns")
  def columns_ColNameUTStringTResult2[ColNameUT /* <: java.lang.String */, TResult2](columnNames: ColNameUT*): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("columns")
  def columns_ColNameUTStringTResult2[ColNameUT /* <: java.lang.String */, TResult2](columnNames: js.Array[ColNameUT]): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("columns")
  def columns_TResult2TInnerRecordTInnerResult[TResult2, TInnerRecord, TInnerResult](subQueryBuilders: (QueryBuilder[TInnerRecord, TInnerResult])*): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("columns")
  def columns_TResult2TInnerRecordTInnerResult[TResult2, TInnerRecord, TInnerResult](subQueryBuilders: js.Array[QueryBuilder[TInnerRecord, TInnerResult]]): QueryBuilder[TRecord, TResult2] = js.native
  def count(columnName: Raw[_]): CountQueryBuilder[TRecord, TResult] = js.native
  // Aggregation
  def count(columnNames: java.lang.String*): CountQueryBuilder[TRecord, TResult] = js.native
  def count(
    columnName: stdLib.Record[java.lang.String, java.lang.String | js.Array[java.lang.String] | Raw[_]]
  ): CountQueryBuilder[TRecord, TResult] = js.native
  def countDistinct(columnName: java.lang.String): CountQueryBuilder[TRecord, TResult] = js.native
  def countDistinct(columnName: Raw[_]): CountQueryBuilder[TRecord, TResult] = js.native
  def countDistinct(columnName: stdLib.Record[java.lang.String, java.lang.String | Raw[_]]): CountQueryBuilder[TRecord, TResult] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: java.lang.String, column2: java.lang.String): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: AliasDict,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: AliasDict,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: java.lang.String, column2: java.lang.String): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: java.lang.String, column2: java.lang.String): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: TableDescriptor,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: TableDescriptor,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def decrement(columnName: java.lang.String): QueryBuilder[TRecord, scala.Double] = js.native
  def decrement(columnName: java.lang.String, amount: scala.Double): QueryBuilder[TRecord, scala.Double] = js.native
  def del[TResult2](): QueryBuilder[TRecord, TResult2] = js.native
  def del[TResult2](returning: java.lang.String): QueryBuilder[TRecord, TResult2] = js.native
  def del[TResult2](returning: js.Array[java.lang.String]): QueryBuilder[TRecord, TResult2] = js.native
  def del[TKey /* <: StrKey[TRecord] */, TResult2](returning: TKey): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("del")
  def del_TKeyStrKeyTResult2[TKey /* <: StrKey[TRecord] */, TResult2](returning: js.Array[TKey]): QueryBuilder[TRecord, js.Array[TResult2]] = js.native
  def delete[TResult2](): QueryBuilder[TRecord, TResult2] = js.native
  def delete[TResult2](returning: java.lang.String): QueryBuilder[TRecord, TResult2] = js.native
  def delete[TResult2](returning: js.Array[java.lang.String]): QueryBuilder[TRecord, TResult2] = js.native
  def delete[TKey /* <: StrKey[TRecord] */, TResult2](returning: TKey): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("delete")
  def delete_TKeyStrKeyTResult2[TKey /* <: StrKey[TRecord] */, TResult2](returning: js.Array[TKey]): QueryBuilder[TRecord, TResult2] = js.native
  // For non-inferrable column selection, we will allow consumer to
  // specify result type and if not widen the result to entire record type with any omissions permitted
  def distinct[TResult2](columnNames: (ColumnDescriptor[TRecord, TResult])*): QueryBuilder[TRecord, TResult2] = js.native
  def distinct[TResult2](columnNames: js.Array[ColumnDescriptor[TRecord, TResult]]): QueryBuilder[TRecord, TResult2] = js.native
  // When all columns are known to be keys of original record,
  // we can extend our selection by these columns
  @JSName("distinct")
  def `distinct_*`(columnName: knexLib.knexLibStrings.`*`): QueryBuilder[
    TRecord, 
    js.Array[
      DeferredKeySelection[
        TRecord, 
        java.lang.String, 
        knexLib.knexLibNumbers.`false`, 
        js.Object, 
        knexLib.knexLibNumbers.`false`
      ]
    ]
  ] = js.native
  @JSName("distinct")
  def distinct_ColNameUTStringTResult2[ColNameUT /* <: java.lang.String */, TResult2](columnNames: ColNameUT*): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("distinct")
  def distinct_ColNameUTStringTResult2[ColNameUT /* <: java.lang.String */, TResult2](columnNames: js.Array[ColNameUT]): QueryBuilder[TRecord, TResult2] = js.native
  // Others
  def first(): QueryBuilder[TRecord, UnwrapArrayMember[UnwrapArrayMember[TResult]]] = js.native
  // For non-inferrable column selection, we will allow consumer to
  // specify result type and if not widen the result to entire record type with any omissions permitted
  // Others
  def first[TResult2](
    columnNames: (ColumnDescriptor[
      TRecord, 
      UnwrapArrayMember[UnwrapArrayMember[UnwrapArrayMember[UnwrapArrayMember[TResult]]]]
    ])*
  ): QueryBuilder[TRecord, TResult2] = js.native
  // Others
  def first[TResult2](
    columnNames: js.Array[
      ColumnDescriptor[
        TRecord, 
        UnwrapArrayMember[UnwrapArrayMember[UnwrapArrayMember[UnwrapArrayMember[TResult]]]]
      ]
    ]
  ): QueryBuilder[TRecord, TResult2] = js.native
  // Others
  def first[AliasUT /* <: js.Array[InferrableColumnDescriptor[TRecord]] */, TResult2](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param aliases because its type AliasUT is not an array type */ aliases: AliasUT
  ): QueryBuilder[TRecord, TResult2] = js.native
  // When all columns are known to be keys of original record,
  // we can extend our selection by these columns
  // Others
  @JSName("first")
  def `first_*`(columnName: knexLib.knexLibStrings.`*`): QueryBuilder[
    TRecord, 
    js.Array[
      DeferredKeySelection[
        TRecord, 
        java.lang.String, 
        knexLib.knexLibNumbers.`false`, 
        js.Object, 
        knexLib.knexLibNumbers.`false`
      ]
    ]
  ] = js.native
  // Others
  @JSName("first")
  def first_AliasUTArrayTResult2[AliasUT /* <: js.Array[Dict[_] | java.lang.String] */, TResult2](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param aliases because its type AliasUT is not an array type */ aliases: AliasUT
  ): QueryBuilder[TRecord, TResult2] = js.native
  // Others
  @JSName("first")
  def first_ColNameUTStringTResult2[ColNameUT /* <: java.lang.String */, TResult2](columnNames: ColNameUT*): QueryBuilder[TRecord, TResult2] = js.native
  // Others
  @JSName("first")
  def first_ColNameUTStringTResult2[ColNameUT /* <: java.lang.String */, TResult2](columnNames: js.Array[ColNameUT]): QueryBuilder[TRecord, TResult2] = js.native
  // Others
  @JSName("first")
  def first_TResult2TInnerRecordTInnerResult[TResult2, TInnerRecord, TInnerResult](subQueryBuilders: (QueryBuilder[TInnerRecord, TInnerResult])*): QueryBuilder[TRecord, TResult2] = js.native
  // Others
  @JSName("first")
  def first_TResult2TInnerRecordTInnerResult[TResult2, TInnerRecord, TInnerResult](subQueryBuilders: js.Array[QueryBuilder[TInnerRecord, TInnerResult]]): QueryBuilder[TRecord, TResult2] = js.native
  def from[TRecord2, TResult2](callback: js.Function): QueryBuilder[TRecord2, TResult2] = js.native
  def from[TRecord2, TResult2](raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def from[TRecord2, TResult2](tableName: AliasDict): QueryBuilder[TRecord2, TResult2] = js.native
  def from[TRecord2, TResult2](tableName: TableDescriptor): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: java.lang.String, column2: java.lang.String): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: AliasDict,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: AliasDict,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: java.lang.String, column2: java.lang.String): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: java.lang.String, column2: java.lang.String): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: TableDescriptor,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: TableDescriptor,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  // For non-inferrable column selection, we will allow consumer to
  // specify result type and if not widen the result to entire record type with any omissions permitted
  // Group by
  def groupBy[TResult2](columnNames: (ColumnDescriptor[TRecord, TResult])*): QueryBuilder[TRecord, TResult2] = js.native
  // Group by
  def groupBy[TResult2](columnNames: js.Array[ColumnDescriptor[TRecord, TResult]]): QueryBuilder[TRecord, TResult2] = js.native
  // Group by
  def groupBy[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  // Group by
  def groupBy[TResult2](sql: java.lang.String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  // Group by
  def groupBy[TResult2](sql: java.lang.String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def groupBy[TResult2](sql: java.lang.String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  def groupByRaw[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def groupByRaw[TResult2](sql: java.lang.String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def groupByRaw[TResult2](sql: java.lang.String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def groupByRaw[TResult2](sql: java.lang.String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  // When all columns are known to be keys of original record,
  // we can extend our selection by these columns
  // Group by
  @JSName("groupBy")
  def `groupBy_*`(columnName: knexLib.knexLibStrings.`*`): QueryBuilder[
    TRecord, 
    js.Array[
      DeferredKeySelection[
        TRecord, 
        java.lang.String, 
        knexLib.knexLibNumbers.`false`, 
        js.Object, 
        knexLib.knexLibNumbers.`false`
      ]
    ]
  ] = js.native
  // Group by
  @JSName("groupBy")
  def groupBy_ColNameUTStringTResult2[ColNameUT /* <: java.lang.String */, TResult2](columnNames: ColNameUT*): QueryBuilder[TRecord, TResult2] = js.native
  // Group by
  @JSName("groupBy")
  def groupBy_ColNameUTStringTResult2[ColNameUT /* <: java.lang.String */, TResult2](columnNames: js.Array[ColNameUT]): QueryBuilder[TRecord, TResult2] = js.native
  // Having
  def having(
    tableName: java.lang.String,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord, TResult] = js.native
  // Having
  def having[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  // Having
  def having[TResult2](sql: java.lang.String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  // Having
  def having[TResult2](sql: java.lang.String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def having[TResult2](sql: java.lang.String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  // Having
  def having[K1 /* <: java.lang.String */, K2 /* <: java.lang.String */](tableName: java.lang.String, column1: K1, operator: ComparisionOperator, column2: K2): QueryBuilder[TRecord, TResult] = js.native
  def havingBetween(columnName: java.lang.String, values: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def havingBetween[K /* <: java.lang.String */](
    columnName: K,
    values: js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
  ): QueryBuilder[TRecord, TResult] = js.native
  def havingIn(columnName: java.lang.String, values: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def havingIn[K /* <: java.lang.String */](
    columnName: K,
    values: js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
  ): QueryBuilder[TRecord, TResult] = js.native
  def havingNotBetween(columnName: java.lang.String, values: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def havingNotBetween[K /* <: java.lang.String */](
    columnName: K,
    values: js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
  ): QueryBuilder[TRecord, TResult] = js.native
  def havingRaw[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def havingRaw[TResult2](sql: java.lang.String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def havingRaw[TResult2](sql: java.lang.String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def havingRaw[TResult2](sql: java.lang.String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  def havingWrapped(callback: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def increment(columnName: java.lang.String): QueryBuilder[TRecord, scala.Double] = js.native
  def increment(columnName: java.lang.String, amount: scala.Double): QueryBuilder[TRecord, scala.Double] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: java.lang.String, column2: java.lang.String): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: AliasDict,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: AliasDict,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: java.lang.String, column2: java.lang.String): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: java.lang.String, column2: java.lang.String): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: TableDescriptor,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: TableDescriptor,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def insert[TResult2](data: MaybeArray[SafePartial[TRecord]]): QueryBuilder[TRecord, TResult2] = js.native
  def insert[TKey /* <: java.lang.String */, TResult2](data: MaybeArray[SafePartial[TRecord]], returning: TKey): QueryBuilder[TRecord, TResult2] = js.native
  def insert[TKey /* <: java.lang.String */, TResult2](data: MaybeArray[SafePartial[TRecord]], returning: js.Array[TKey]): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("insert")
  def insert_TKeyStrKeyTResult2[TKey /* <: StrKey[TRecord] */, TResult2](data: MaybeArray[SafePartial[TRecord]], returning: TKey): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("insert")
  def insert_TKeyStrKeyTResult2[TKey /* <: StrKey[TRecord] */, TResult2](data: MaybeArray[SafePartial[TRecord]], returning: js.Array[TKey]): QueryBuilder[TRecord, TResult2] = js.native
  // Intersect
  def intersect(callback: MaybeArray[(QueryCallback[_, js.Array[_]]) | (QueryBuilder[TRecord, _]) | Raw[_]]): QueryBuilder[TRecord, TResult] = js.native
  def intersect(
    callback: MaybeArray[(QueryCallback[_, js.Array[_]]) | (QueryBuilder[TRecord, _]) | Raw[_]],
    wrap: scala.Boolean
  ): QueryBuilder[TRecord, TResult] = js.native
  // Intersect
  def intersect(callbacks: ((QueryCallback[_, js.Array[_]]) | Raw[_] | (QueryBuilder[TRecord, _]))*): QueryBuilder[TRecord, TResult] = js.native
  def into[TRecord2, TResult2](callback: js.Function): QueryBuilder[TRecord2, TResult2] = js.native
  def into[TRecord2, TResult2](raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def into[TRecord2, TResult2](tableName: AliasDict): QueryBuilder[TRecord2, TResult2] = js.native
  def into[TRecord2, TResult2](tableName: TableDescriptor): QueryBuilder[TRecord2, TResult2] = js.native
  // Joins
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: java.lang.String, column2: java.lang.String): QueryBuilder[TRecord2, TResult2] = js.native
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: AliasDict,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: AliasDict,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: java.lang.String, column2: java.lang.String): QueryBuilder[TRecord2, TResult2] = js.native
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  // Joins
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  // Joins
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: java.lang.String, column2: java.lang.String): QueryBuilder[TRecord2, TResult2] = js.native
  // Joins
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: TableDescriptor,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord2, TResult2] = js.native
  // Joins
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  // Joins
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: TableDescriptor,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  // Joins
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def joinRaw(tableName: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def joinRaw(tableName: java.lang.String, binding: Value): QueryBuilder[TRecord, TResult] = js.native
  def joinRaw(tableName: java.lang.String, binding: ValueDict): QueryBuilder[TRecord, TResult] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: java.lang.String, column2: java.lang.String): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: AliasDict,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: AliasDict,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: java.lang.String, column2: java.lang.String): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: java.lang.String, column2: java.lang.String): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: TableDescriptor,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: TableDescriptor,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: java.lang.String, column2: java.lang.String): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: AliasDict,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: AliasDict,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: java.lang.String, column2: java.lang.String): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: java.lang.String, column2: java.lang.String): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: TableDescriptor,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: TableDescriptor,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def limit(limit: scala.Double): QueryBuilder[TRecord, TResult] = js.native
  def max[TResult2](columnName: java.lang.String, columnNames: java.lang.String*): QueryBuilder[TRecord, TResult2] = js.native
  def max[TResult2](columnName: Raw[_]): QueryBuilder[TRecord, TResult2] = js.native
  def max[TResult2](
    columnName: stdLib.Record[java.lang.String, java.lang.String | js.Array[java.lang.String] | Raw[_]]
  ): QueryBuilder[TRecord, TResult2] = js.native
  def min[TResult2](columnName: java.lang.String, columnNames: java.lang.String*): QueryBuilder[TRecord, TResult2] = js.native
  def min[TResult2](columnName: Raw[_]): QueryBuilder[TRecord, TResult2] = js.native
  def min[TResult2](
    columnName: stdLib.Record[java.lang.String, java.lang.String | js.Array[java.lang.String] | Raw[_]]
  ): QueryBuilder[TRecord, TResult2] = js.native
  def modify[TRecord2 /* <: js.Object */, TResult2 /* <: js.Object */](callback: QueryCallbackWithArgs[TRecord, _], args: js.Any*): QueryBuilder[TRecord2, TResult2] = js.native
  // Paging
  def offset(offset: scala.Double): QueryBuilder[TRecord, TResult] = js.native
  def orHaving(
    tableName: java.lang.String,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord, TResult] = js.native
  def orHaving[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def orHaving[TResult2](sql: java.lang.String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def orHaving[TResult2](sql: java.lang.String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def orHaving[TResult2](sql: java.lang.String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  def orHaving[K1 /* <: java.lang.String */, K2 /* <: java.lang.String */](tableName: java.lang.String, column1: K1, operator: ComparisionOperator, column2: K2): QueryBuilder[TRecord, TResult] = js.native
  def orHavingBetween(columnName: java.lang.String, values: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def orHavingBetween[K /* <: java.lang.String */](
    columnName: K,
    values: js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
  ): QueryBuilder[TRecord, TResult] = js.native
  def orHavingNotBetween(columnName: java.lang.String, values: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def orHavingNotBetween[K /* <: java.lang.String */](
    columnName: K,
    values: js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
  ): QueryBuilder[TRecord, TResult] = js.native
  def orHavingRaw[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def orHavingRaw[TResult2](sql: java.lang.String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def orHavingRaw[TResult2](sql: java.lang.String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def orHavingRaw[TResult2](sql: java.lang.String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  def orWhere(callback: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def orWhere(columnName: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def orWhere(columnName: java.lang.String, operator: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def orWhere(columnName: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  def orWhere(columnName: java.lang.String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  def orWhere(condition: scala.Boolean): QueryBuilder[TRecord, TResult] = js.native
  def orWhere(left: Raw[_], operator: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def orWhere(left: Raw[_], operator: java.lang.String, right: Value): QueryBuilder[TRecord, TResult] = js.native
  def orWhere(`object`: js.Object): QueryBuilder[TRecord, TResult] = js.native
  def orWhere(`object`: SafePartial[TRecord]): QueryBuilder[TRecord, TResult] = js.native
  def orWhere(raw: Raw[_]): QueryBuilder[TRecord, TResult] = js.native
  def orWhere[T /* <: java.lang.String */](columnName: T): QueryBuilder[TRecord, TResult] = js.native
  def orWhere[T /* <: java.lang.String */](columnName: T, operator: ComparisionOperator): QueryBuilder[TRecord, TResult] = js.native
  def orWhere[T /* <: java.lang.String */](
    columnName: T,
    operator: ComparisionOperator,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): QueryBuilder[TRecord, TResult] = js.native
  def orWhere[T /* <: java.lang.String */](
    columnName: T,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): QueryBuilder[TRecord, TResult] = js.native
  def orWhere[TResult2](sql: java.lang.String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def orWhere[TResult2](sql: java.lang.String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def orWhere[TResult2](sql: java.lang.String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  def orWhere[TRecordInner, TResultInner](
    columnName: java.lang.String,
    operator: java.lang.String,
    value: QueryBuilder[TRecordInner, TResultInner]
  ): QueryBuilder[TRecord, TResult] = js.native
  def orWhere[TRecordInner, TResultInner](left: Raw[_], operator: java.lang.String, right: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def orWhere[T /* <: java.lang.String */, TRecordInner, TResultInner](columnName: T, operator: ComparisionOperator, value: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereBetween(columnName: java.lang.String, range: js.Tuple2[Value, Value]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereBetween[K /* <: java.lang.String */](
    columnName: K,
    range: js.Tuple2[
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  def orWhereExists(callback: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereExists[TRecordInner, TResultInner](query: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereIn(columnName: java.lang.String, values: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereIn(columnName: java.lang.String, values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereIn(columnNames: js.Array[java.lang.String], values: js.Array[js.Array[Value]]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereIn(columnNames: js.Array[java.lang.String], values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereIn[K /* <: java.lang.String */](
    columnName: K,
    values: js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
  ): QueryBuilder[TRecord, TResult] = js.native
  def orWhereIn[K /* <: java.lang.String */](columnName: K, values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereIn[TRecordInner, TResultInner](columnName: java.lang.String, values: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereIn[TRecordInner, TResultInner](columnNames: js.Array[java.lang.String], values: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereIn[K /* <: java.lang.String */, TRecordInner, TResultInner](
    columnName: K,
    values: QueryBuilder[
      TRecordInner, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  @JSName("orWhereIn")
  def orWhereIn_KString[K /* <: java.lang.String */](
    columnNames: js.Array[K],
    values: js.Array[
      js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  @JSName("orWhereIn")
  def orWhereIn_KString[K /* <: java.lang.String */](columnNames: js.Array[K], values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  @JSName("orWhereIn")
  def orWhereIn_KStringTRecordInnerTResultInner[K /* <: java.lang.String */, TRecordInner, TResultInner](
    columnNames: js.Array[K],
    values: QueryBuilder[
      TRecordInner, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot(callback: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot(columnName: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot(columnName: java.lang.String, operator: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot(columnName: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot(columnName: java.lang.String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot(condition: scala.Boolean): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot(left: Raw[_], operator: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot(left: Raw[_], operator: java.lang.String, right: Value): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot(`object`: js.Object): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot(`object`: SafePartial[TRecord]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot(raw: Raw[_]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot[T /* <: java.lang.String */](columnName: T): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot[T /* <: java.lang.String */](columnName: T, operator: ComparisionOperator): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot[T /* <: java.lang.String */](
    columnName: T,
    operator: ComparisionOperator,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot[T /* <: java.lang.String */](
    columnName: T,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot[TResult2](sql: java.lang.String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def orWhereNot[TResult2](sql: java.lang.String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def orWhereNot[TResult2](sql: java.lang.String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  def orWhereNot[TRecordInner, TResultInner](
    columnName: java.lang.String,
    operator: java.lang.String,
    value: QueryBuilder[TRecordInner, TResultInner]
  ): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot[TRecordInner, TResultInner](left: Raw[_], operator: java.lang.String, right: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot[T /* <: java.lang.String */, TRecordInner, TResultInner](columnName: T, operator: ComparisionOperator, value: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotBetween(columnName: java.lang.String, range: js.Tuple2[Value, Value]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotBetween[K /* <: java.lang.String */](
    columnName: K,
    range: js.Tuple2[
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotExists(callback: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotExists[TRecordInner, TResultInner](query: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotIn(columnName: java.lang.String, values: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotIn(columnName: java.lang.String, values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotIn(columnNames: js.Array[java.lang.String], values: js.Array[js.Array[Value]]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotIn(columnNames: js.Array[java.lang.String], values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotIn[K /* <: java.lang.String */](
    columnName: K,
    values: js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
  ): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotIn[K /* <: java.lang.String */](columnName: K, values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotIn[TRecordInner, TResultInner](columnName: java.lang.String, values: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotIn[TRecordInner, TResultInner](columnNames: js.Array[java.lang.String], values: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotIn[K /* <: java.lang.String */, TRecordInner, TResultInner](
    columnName: K,
    values: QueryBuilder[
      TRecordInner, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  @JSName("orWhereNotIn")
  def orWhereNotIn_KString[K /* <: java.lang.String */](
    columnNames: js.Array[K],
    values: js.Array[
      js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  @JSName("orWhereNotIn")
  def orWhereNotIn_KString[K /* <: java.lang.String */](columnNames: js.Array[K], values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  @JSName("orWhereNotIn")
  def orWhereNotIn_KStringTRecordInnerTResultInner[K /* <: java.lang.String */, TRecordInner, TResultInner](
    columnNames: js.Array[K],
    values: QueryBuilder[
      TRecordInner, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotNull(columnName: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  @JSName("orWhereNot")
  def orWhereNot_TResult2[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def orWhereNull(columnName: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def orWhereRaw(condition: scala.Boolean): QueryBuilder[TRecord, TResult] = js.native
  def orWhereRaw[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def orWhereRaw[TResult2](sql: java.lang.String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def orWhereRaw[TResult2](sql: java.lang.String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def orWhereRaw[TResult2](sql: java.lang.String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("orWhere")
  def orWhere_TResult2[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  // Order by
  def orderBy(columnDefs: js.Array[knexLib.Anon_Asc[TRecord] | knexLib.Anon_Column | java.lang.String]): QueryBuilder[TRecord, TResult] = js.native
  // Order by
  def orderBy(columnName: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def orderBy(columnName: java.lang.String, order: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def orderByRaw[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def orderByRaw[TResult2](sql: java.lang.String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def orderByRaw[TResult2](sql: java.lang.String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def orderByRaw[TResult2](sql: java.lang.String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("orderBy")
  def orderBy_asc(columnName: java.lang.String, order: knexLib.knexLibStrings.asc): QueryBuilder[TRecord, TResult] = js.native
  @JSName("orderBy")
  def orderBy_desc(columnName: java.lang.String, order: knexLib.knexLibStrings.desc): QueryBuilder[TRecord, TResult] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: java.lang.String, column2: java.lang.String): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: AliasDict,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: AliasDict,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: java.lang.String, column2: java.lang.String): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: java.lang.String, column2: java.lang.String): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: TableDescriptor,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: TableDescriptor,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def pluck[K /* <: java.lang.String */](column: K): QueryBuilder[
    TRecord, 
    js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
  ] = js.native
  def pluck[TResult2 /* <: js.Object */](column: java.lang.String): QueryBuilder[TRecord, TResult2] = js.native
  def returning[TResult2](column: java.lang.String): QueryBuilder[TRecord, TResult2] = js.native
  def returning[TResult2](column: js.Array[java.lang.String]): QueryBuilder[TRecord, TResult2] = js.native
  def returning[TKey /* <: StrKey[TRecord] */, TResult2](column: TKey): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("returning")
  def returning_TKeyStrKeyTResult2[TKey /* <: StrKey[TRecord] */, TResult2](columns: js.Array[TKey]): QueryBuilder[TRecord, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: java.lang.String, column2: java.lang.String): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: AliasDict,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: AliasDict,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: java.lang.String, column2: java.lang.String): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: java.lang.String, column2: java.lang.String): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: TableDescriptor,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: TableDescriptor,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: java.lang.String, column2: java.lang.String): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: AliasDict,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: AliasDict,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: java.lang.String, column2: java.lang.String): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: java.lang.String, column2: java.lang.String): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: TableDescriptor,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: TableDescriptor,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def select(): QueryBuilder[TRecord, TResult] = js.native
  // For non-inferrable column selection, we will allow consumer to
  // specify result type and if not widen the result to entire record type with any omissions permitted
  def select[TResult2](columnNames: (ColumnDescriptor[TRecord, TResult])*): QueryBuilder[TRecord, TResult2] = js.native
  def select[TResult2](columnNames: js.Array[ColumnDescriptor[TRecord, TResult]]): QueryBuilder[TRecord, TResult2] = js.native
  def select[AliasUT /* <: js.Array[InferrableColumnDescriptor[TRecord]] */, TResult2](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param aliases because its type AliasUT is not an array type */ aliases: AliasUT
  ): QueryBuilder[TRecord, TResult2] = js.native
  // When all columns are known to be keys of original record,
  // we can extend our selection by these columns
  @JSName("select")
  def `select_*`(columnName: knexLib.knexLibStrings.`*`): QueryBuilder[
    TRecord, 
    js.Array[
      DeferredKeySelection[
        TRecord, 
        java.lang.String, 
        knexLib.knexLibNumbers.`false`, 
        js.Object, 
        knexLib.knexLibNumbers.`false`
      ]
    ]
  ] = js.native
  @JSName("select")
  def select_AliasUTArrayTResult2[AliasUT /* <: js.Array[Dict[_] | java.lang.String] */, TResult2](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param aliases because its type AliasUT is not an array type */ aliases: AliasUT
  ): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("select")
  def select_ColNameUTStringTResult2[ColNameUT /* <: java.lang.String */, TResult2](columnNames: ColNameUT*): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("select")
  def select_ColNameUTStringTResult2[ColNameUT /* <: java.lang.String */, TResult2](columnNames: js.Array[ColNameUT]): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("select")
  def select_TResult2TInnerRecordTInnerResult[TResult2, TInnerRecord, TInnerResult](subQueryBuilders: (QueryBuilder[TInnerRecord, TInnerResult])*): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("select")
  def select_TResult2TInnerRecordTInnerResult[TResult2, TInnerRecord, TInnerResult](subQueryBuilders: js.Array[QueryBuilder[TInnerRecord, TInnerResult]]): QueryBuilder[TRecord, TResult2] = js.native
  def sum[TResult2](columnName: java.lang.String, columnNames: java.lang.String*): QueryBuilder[TRecord, TResult2] = js.native
  def sum[TResult2](columnName: Raw[_]): QueryBuilder[TRecord, TResult2] = js.native
  def sum[TResult2](
    columnName: stdLib.Record[java.lang.String, java.lang.String | js.Array[java.lang.String] | Raw[_]]
  ): QueryBuilder[TRecord, TResult2] = js.native
  def sumDistinct[TResult2](columnName: java.lang.String): QueryBuilder[TRecord, TResult2] = js.native
  def sumDistinct[TResult2](columnName: Raw[_]): QueryBuilder[TRecord, TResult2] = js.native
  def sumDistinct[TResult2](columnName: stdLib.Record[java.lang.String, java.lang.String | Raw[_]]): QueryBuilder[TRecord, TResult2] = js.native
  def table[TRecord2, TResult2](callback: js.Function): QueryBuilder[TRecord2, TResult2] = js.native
  def table[TRecord2, TResult2](raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def table[TRecord2, TResult2](tableName: AliasDict): QueryBuilder[TRecord2, TResult2] = js.native
  def table[TRecord2, TResult2](tableName: TableDescriptor): QueryBuilder[TRecord2, TResult2] = js.native
  def truncate(): QueryBuilder[TRecord, scala.Unit] = js.native
  // Union
  def union(callback: MaybeArray[(QueryCallback[_, js.Array[_]]) | (QueryBuilder[TRecord, _]) | Raw[_]]): QueryBuilder[TRecord, TResult] = js.native
  def union(
    callback: MaybeArray[(QueryCallback[_, js.Array[_]]) | (QueryBuilder[TRecord, _]) | Raw[_]],
    wrap: scala.Boolean
  ): QueryBuilder[TRecord, TResult] = js.native
  // Union
  def union(callbacks: ((QueryCallback[_, js.Array[_]]) | Raw[_] | (QueryBuilder[TRecord, _]))*): QueryBuilder[TRecord, TResult] = js.native
  def unionAll(callback: MaybeArray[(QueryCallback[_, js.Array[_]]) | (QueryBuilder[TRecord, _]) | Raw[_]]): QueryBuilder[TRecord, TResult] = js.native
  def unionAll(
    callback: MaybeArray[(QueryCallback[_, js.Array[_]]) | (QueryBuilder[TRecord, _]) | Raw[_]],
    wrap: scala.Boolean
  ): QueryBuilder[TRecord, TResult] = js.native
  def unionAll(callbacks: ((QueryCallback[_, js.Array[_]]) | Raw[_] | (QueryBuilder[TRecord, _]))*): QueryBuilder[TRecord, TResult] = js.native
  def update[K /* <: java.lang.String */](
    columnName: K,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
  ): QueryBuilder[TRecord, scala.Double] = js.native
  def update[TResult2](columnName: java.lang.String, value: Value): QueryBuilder[TRecord, TResult2] = js.native
  def update[TResult2](columnName: java.lang.String, value: Value, returning: java.lang.String): QueryBuilder[TRecord, TResult2] = js.native
  def update[TResult2](columnName: java.lang.String, value: Value, returning: js.Array[java.lang.String]): QueryBuilder[TRecord, TResult2] = js.native
  def update[TResult2](data: MaybeArray[SafePartial[TRecord]]): QueryBuilder[TRecord, TResult2] = js.native
  def update[TKey /* <: StrKey[TRecord] */, TResult2](data: MaybeArray[SafePartial[TRecord]], returning: TKey): QueryBuilder[TRecord, TResult2] = js.native
  def update[TKey /* <: StrKey[TRecord] */, TResult2](data: MaybeArray[SafePartial[TRecord]], returning: js.Array[TKey]): QueryBuilder[TRecord, TResult2] = js.native
  def update[K1 /* <: StrKey[TRecord] */, K2 /* <: StrKey[TRecord] */, TResult2](
    columnName: K1,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[K1] */ js.Any,
    returning: K1
  ): QueryBuilder[TRecord, TResult2] = js.native
  def update[K1 /* <: StrKey[TRecord] */, K2 /* <: StrKey[TRecord] */, TResult2](
    columnName: K1,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[K1] */ js.Any,
    returning: js.Array[K1]
  ): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("update")
  def update_TKeyStringTResult2Array[TKey /* <: java.lang.String */, TResult2 /* <: js.Array[js.Object] */](data: MaybeArray[SafePartial[TRecord]], returning: TKey): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("update")
  def update_TKeyStringTResult2Array[TKey /* <: java.lang.String */, TResult2 /* <: js.Array[js.Object] */](data: MaybeArray[SafePartial[TRecord]], returning: js.Array[TKey]): QueryBuilder[TRecord, TResult2] = js.native
  // Wheres
  def where(callback: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def where(columnName: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def where(columnName: java.lang.String, operator: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  // Wheres
  def where(columnName: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  // Wheres
  def where(columnName: java.lang.String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  // Wheres
  def where(condition: scala.Boolean): QueryBuilder[TRecord, TResult] = js.native
  def where(left: Raw[_], operator: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  // Wheres
  def where(left: Raw[_], operator: java.lang.String, right: Value): QueryBuilder[TRecord, TResult] = js.native
  // Wheres
  def where(`object`: js.Object): QueryBuilder[TRecord, TResult] = js.native
  // Wheres
  def where(`object`: SafePartial[TRecord]): QueryBuilder[TRecord, TResult] = js.native
  // Wheres
  def where(raw: Raw[_]): QueryBuilder[TRecord, TResult] = js.native
  def where[T /* <: java.lang.String */](columnName: T): QueryBuilder[TRecord, TResult] = js.native
  def where[T /* <: java.lang.String */](columnName: T, operator: ComparisionOperator): QueryBuilder[TRecord, TResult] = js.native
  // Wheres
  def where[T /* <: java.lang.String */](
    columnName: T,
    operator: ComparisionOperator,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): QueryBuilder[TRecord, TResult] = js.native
  // Wheres
  def where[T /* <: java.lang.String */](
    columnName: T,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): QueryBuilder[TRecord, TResult] = js.native
  // Wheres
  def where[TResult2](sql: java.lang.String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  // Wheres
  def where[TResult2](sql: java.lang.String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def where[TResult2](sql: java.lang.String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  // Wheres
  def where[TRecordInner, TResultInner](
    columnName: java.lang.String,
    operator: java.lang.String,
    value: QueryBuilder[TRecordInner, TResultInner]
  ): QueryBuilder[TRecord, TResult] = js.native
  // Wheres
  def where[TRecordInner, TResultInner](left: Raw[_], operator: java.lang.String, right: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  // Wheres
  def where[T /* <: java.lang.String */, TRecordInner, TResultInner](columnName: T, operator: ComparisionOperator, value: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def whereBetween(columnName: java.lang.String, range: js.Tuple2[Value, Value]): QueryBuilder[TRecord, TResult] = js.native
  def whereBetween[K /* <: java.lang.String */](
    columnName: K,
    range: js.Tuple2[
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  def whereExists(callback: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def whereExists[TRecordInner, TResultInner](query: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def whereIn(columnName: java.lang.String, values: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def whereIn(columnName: java.lang.String, values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def whereIn(columnNames: js.Array[java.lang.String], values: js.Array[js.Array[Value]]): QueryBuilder[TRecord, TResult] = js.native
  def whereIn(columnNames: js.Array[java.lang.String], values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def whereIn[K /* <: java.lang.String */](
    columnName: K,
    values: js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
  ): QueryBuilder[TRecord, TResult] = js.native
  def whereIn[K /* <: java.lang.String */](columnName: K, values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def whereIn[TRecordInner, TResultInner](columnName: java.lang.String, values: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def whereIn[TRecordInner, TResultInner](columnNames: js.Array[java.lang.String], values: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def whereIn[K /* <: java.lang.String */, TRecordInner, TResultInner](
    columnName: K,
    values: QueryBuilder[
      TRecordInner, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  @JSName("whereIn")
  def whereIn_KString[K /* <: java.lang.String */](
    columnNames: js.Array[K],
    values: js.Array[
      js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  @JSName("whereIn")
  def whereIn_KString[K /* <: java.lang.String */](columnNames: js.Array[K], values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  @JSName("whereIn")
  def whereIn_KStringTRecordInnerTResultInner[K /* <: java.lang.String */, TRecordInner, TResultInner](
    columnNames: js.Array[K],
    values: QueryBuilder[
      TRecordInner, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  def whereNot(callback: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def whereNot(columnName: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def whereNot(columnName: java.lang.String, operator: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def whereNot(columnName: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  def whereNot(columnName: java.lang.String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  def whereNot(condition: scala.Boolean): QueryBuilder[TRecord, TResult] = js.native
  def whereNot(left: Raw[_], operator: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def whereNot(left: Raw[_], operator: java.lang.String, right: Value): QueryBuilder[TRecord, TResult] = js.native
  def whereNot(`object`: js.Object): QueryBuilder[TRecord, TResult] = js.native
  def whereNot(`object`: SafePartial[TRecord]): QueryBuilder[TRecord, TResult] = js.native
  def whereNot(raw: Raw[_]): QueryBuilder[TRecord, TResult] = js.native
  def whereNot[T /* <: java.lang.String */](columnName: T): QueryBuilder[TRecord, TResult] = js.native
  def whereNot[T /* <: java.lang.String */](columnName: T, operator: ComparisionOperator): QueryBuilder[TRecord, TResult] = js.native
  def whereNot[T /* <: java.lang.String */](
    columnName: T,
    operator: ComparisionOperator,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): QueryBuilder[TRecord, TResult] = js.native
  def whereNot[T /* <: java.lang.String */](
    columnName: T,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): QueryBuilder[TRecord, TResult] = js.native
  def whereNot[TResult2](sql: java.lang.String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def whereNot[TResult2](sql: java.lang.String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def whereNot[TResult2](sql: java.lang.String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  def whereNot[TRecordInner, TResultInner](
    columnName: java.lang.String,
    operator: java.lang.String,
    value: QueryBuilder[TRecordInner, TResultInner]
  ): QueryBuilder[TRecord, TResult] = js.native
  def whereNot[TRecordInner, TResultInner](left: Raw[_], operator: java.lang.String, right: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def whereNot[T /* <: java.lang.String */, TRecordInner, TResultInner](columnName: T, operator: ComparisionOperator, value: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def whereNotBetween(columnName: java.lang.String, range: js.Tuple2[Value, Value]): QueryBuilder[TRecord, TResult] = js.native
  def whereNotBetween[K /* <: java.lang.String */](
    columnName: K,
    range: js.Tuple2[
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  def whereNotExists(callback: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def whereNotExists[TRecordInner, TResultInner](query: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def whereNotIn(columnName: java.lang.String, values: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def whereNotIn(columnName: java.lang.String, values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def whereNotIn(columnNames: js.Array[java.lang.String], values: js.Array[js.Array[Value]]): QueryBuilder[TRecord, TResult] = js.native
  def whereNotIn(columnNames: js.Array[java.lang.String], values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def whereNotIn[K /* <: java.lang.String */](
    columnName: K,
    values: js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
  ): QueryBuilder[TRecord, TResult] = js.native
  def whereNotIn[K /* <: java.lang.String */](columnName: K, values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def whereNotIn[TRecordInner, TResultInner](columnName: java.lang.String, values: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def whereNotIn[TRecordInner, TResultInner](columnNames: js.Array[java.lang.String], values: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def whereNotIn[K /* <: java.lang.String */, TRecordInner, TResultInner](
    columnName: K,
    values: QueryBuilder[
      TRecordInner, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  @JSName("whereNotIn")
  def whereNotIn_KString[K /* <: java.lang.String */](
    columnNames: js.Array[K],
    values: js.Array[
      js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  @JSName("whereNotIn")
  def whereNotIn_KString[K /* <: java.lang.String */](columnNames: js.Array[K], values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  @JSName("whereNotIn")
  def whereNotIn_KStringTRecordInnerTResultInner[K /* <: java.lang.String */, TRecordInner, TResultInner](
    columnNames: js.Array[K],
    values: QueryBuilder[
      TRecordInner, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  def whereNotNull(columnName: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  @JSName("whereNot")
  def whereNot_TResult2[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def whereNull(columnName: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def whereRaw(condition: scala.Boolean): QueryBuilder[TRecord, TResult] = js.native
  def whereRaw[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def whereRaw[TResult2](sql: java.lang.String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def whereRaw[TResult2](sql: java.lang.String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def whereRaw[TResult2](sql: java.lang.String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  def whereWrapped(callback: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  // Wheres
  @JSName("where")
  def where_TResult2[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  // Withs
  def `with`(
    alias: java.lang.String,
    callback: js.Function1[/* queryBuilder */ QueryBuilder[_, js.Array[SafePartial[_]]], _]
  ): QueryBuilder[TRecord, TResult] = js.native
  // Withs
  def `with`(alias: java.lang.String, raw: QueryBuilder[_, js.Array[SafePartial[_]]]): QueryBuilder[TRecord, TResult] = js.native
  // Withs
  def `with`(alias: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord, TResult] = js.native
  // Withs
  def `with`(alias: java.lang.String, sql: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def `with`(alias: java.lang.String, sql: java.lang.String, bindings: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def `with`(alias: java.lang.String, sql: java.lang.String, bindings: js.Object): QueryBuilder[TRecord, TResult] = js.native
  def withRaw(alias: java.lang.String, raw: QueryBuilder[_, js.Array[SafePartial[_]]]): QueryBuilder[TRecord, TResult] = js.native
  def withRaw(alias: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord, TResult] = js.native
  def withRaw(alias: java.lang.String, sql: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def withRaw(alias: java.lang.String, sql: java.lang.String, bindings: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def withRaw(alias: java.lang.String, sql: java.lang.String, bindings: js.Object): QueryBuilder[TRecord, TResult] = js.native
  def withRecursive(
    alias: java.lang.String,
    callback: js.Function1[/* queryBuilder */ QueryBuilder[_, js.Array[SafePartial[_]]], _]
  ): QueryBuilder[TRecord, TResult] = js.native
  def withRecursive(alias: java.lang.String, raw: QueryBuilder[_, js.Array[SafePartial[_]]]): QueryBuilder[TRecord, TResult] = js.native
  def withRecursive(alias: java.lang.String, raw: Raw[_]): QueryBuilder[TRecord, TResult] = js.native
  def withRecursive(alias: java.lang.String, sql: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def withRecursive(alias: java.lang.String, sql: java.lang.String, bindings: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def withRecursive(alias: java.lang.String, sql: java.lang.String, bindings: js.Object): QueryBuilder[TRecord, TResult] = js.native
  def withSchema(schema: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def withWrapped(
    alias: java.lang.String,
    callback: js.Function1[/* queryBuilder */ QueryBuilder[_, js.Array[SafePartial[_]]], _]
  ): QueryBuilder[TRecord, TResult] = js.native
  def withWrapped(alias: java.lang.String, queryBuilder: QueryBuilder[_, js.Array[SafePartial[_]]]): QueryBuilder[TRecord, TResult] = js.native
}

