package typings.knex.knexMod

import org.scalablytyped.runtime.StringDictionary
import typings.knex.Anon_Asc
import typings.knex.Anon_Column
import typings.knex.knexMod.DeferredKeySelection.AddUnionMember
import typings.knex.knexNumbers.`false`
import typings.knex.knexStrings.Count
import typings.knex.knexStrings.asc
import typings.knex.knexStrings.desc
import typings.knex.typesResultMod.Registry
import typings.std.Record
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
  @JSName("avgDistinct")
  var avgDistinct_Original: TypePreservingAggregation[TRecord, TResult, _] = js.native
  @JSName("avg")
  var avg_Original: TypePreservingAggregation[TRecord, TResult, _] = js.native
  @JSName("column")
  var column_Original: Select[TRecord, TResult] = js.native
  @JSName("columns")
  var columns_Original: Select[TRecord, TResult] = js.native
  @JSName("countDistinct")
  var countDistinct_Original: AssymetricAggregation[TRecord, TResult, Lookup[Registry, Count, Double | String]] = js.native
  // Aggregation
  @JSName("count")
  var count_Original: AssymetricAggregation[TRecord, TResult, Lookup[Registry, Count, Double | String]] = js.native
  @JSName("crossJoin")
  var crossJoin_Original: Join[TRecord, TResult] = js.native
  @JSName("distinct")
  var distinct_Original: Distinct[TRecord, TResult] = js.native
  // Others
  @JSName("first")
  var first_Original: Select[TRecord, AddUnionMember[UnwrapArrayMember[TResult], js.UndefOr[scala.Nothing]]] = js.native
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
  @JSName("max")
  var max_Original: TypePreservingAggregation[TRecord, TResult, _] = js.native
  @JSName("min")
  var min_Original: TypePreservingAggregation[TRecord, TResult, _] = js.native
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
  @JSName("sumDistinct")
  var sumDistinct_Original: TypePreservingAggregation[TRecord, TResult, _] = js.native
  @JSName("sum")
  var sum_Original: TypePreservingAggregation[TRecord, TResult, _] = js.native
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
  def andHaving(tableName: String, column1: String, operator: String, column2: String): QueryBuilder[TRecord, TResult] = js.native
  def andHaving[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def andHaving[TResult2](sql: String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def andHaving[TResult2](sql: String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def andHaving[TResult2](sql: String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  def andHaving[K1 /* <: String */, K2 /* <: String */](tableName: String, column1: K1, operator: ComparisionOperator, column2: K2): QueryBuilder[TRecord, TResult] = js.native
  def andWhere(callback: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def andWhere(columnName: String): QueryBuilder[TRecord, TResult] = js.native
  def andWhere(columnName: String, operator: String): QueryBuilder[TRecord, TResult] = js.native
  def andWhere(columnName: String, operator: String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  def andWhere(columnName: String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  def andWhere(condition: Boolean): QueryBuilder[TRecord, TResult] = js.native
  def andWhere(left: Raw[_], operator: String): QueryBuilder[TRecord, TResult] = js.native
  def andWhere(left: Raw[_], operator: String, right: Value): QueryBuilder[TRecord, TResult] = js.native
  def andWhere(`object`: js.Object): QueryBuilder[TRecord, TResult] = js.native
  def andWhere(`object`: SafePartial[TRecord]): QueryBuilder[TRecord, TResult] = js.native
  def andWhere(raw: Raw[_]): QueryBuilder[TRecord, TResult] = js.native
  def andWhere[T /* <: String */](columnName: T): QueryBuilder[TRecord, TResult] = js.native
  def andWhere[T /* <: String */](columnName: T, operator: ComparisionOperator): QueryBuilder[TRecord, TResult] = js.native
  def andWhere[T /* <: String */](
    columnName: T,
    operator: ComparisionOperator,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): QueryBuilder[TRecord, TResult] = js.native
  def andWhere[T /* <: String */](
    columnName: T,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): QueryBuilder[TRecord, TResult] = js.native
  def andWhere[TResult2](sql: String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def andWhere[TResult2](sql: String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def andWhere[TResult2](sql: String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  def andWhere[TRecordInner, TResultInner](columnName: String, operator: String, value: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def andWhere[TRecordInner, TResultInner](left: Raw[_], operator: String, right: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def andWhere[T /* <: String */, TRecordInner, TResultInner](columnName: T, operator: ComparisionOperator, value: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def andWhereBetween(columnName: String, range: js.Tuple2[Value, Value]): QueryBuilder[TRecord, TResult] = js.native
  def andWhereBetween[K /* <: String */](
    columnName: K,
    range: js.Tuple2[
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot(callback: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot(columnName: String): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot(columnName: String, operator: String): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot(columnName: String, operator: String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot(columnName: String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot(condition: Boolean): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot(left: Raw[_], operator: String): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot(left: Raw[_], operator: String, right: Value): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot(`object`: js.Object): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot(`object`: SafePartial[TRecord]): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot(raw: Raw[_]): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot[T /* <: String */](columnName: T): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot[T /* <: String */](columnName: T, operator: ComparisionOperator): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot[T /* <: String */](
    columnName: T,
    operator: ComparisionOperator,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot[T /* <: String */](
    columnName: T,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot[TResult2](sql: String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def andWhereNot[TResult2](sql: String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def andWhereNot[TResult2](sql: String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  def andWhereNot[TRecordInner, TResultInner](columnName: String, operator: String, value: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot[TRecordInner, TResultInner](left: Raw[_], operator: String, right: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNot[T /* <: String */, TRecordInner, TResultInner](columnName: T, operator: ComparisionOperator, value: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNotBetween(columnName: String, range: js.Tuple2[Value, Value]): QueryBuilder[TRecord, TResult] = js.native
  def andWhereNotBetween[K /* <: String */](
    columnName: K,
    range: js.Tuple2[
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  @JSName("andWhereNot")
  def andWhereNot_TResult2[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def andWhereRaw(condition: Boolean): QueryBuilder[TRecord, TResult] = js.native
  def andWhereRaw[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def andWhereRaw[TResult2](sql: String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def andWhereRaw[TResult2](sql: String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def andWhereRaw[TResult2](sql: String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("andWhere")
  def andWhere_TResult2[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def as(columnName: String): QueryBuilder[TRecord, TResult] = js.native
  def avg[TResult2](columnNames: ((Record[String, String | js.Array[String] | Raw[_]]) | Raw[_] | String)*): QueryBuilder[TRecord, TResult2] = js.native
  def avg[TAliases /* <: js.Object */, TResult2](aliases: TAliases): QueryBuilder[TRecord, TResult2] = js.native
  def avgDistinct[TResult2](columnNames: ((Record[String, String | js.Array[String] | Raw[_]]) | Raw[_] | String)*): QueryBuilder[TRecord, TResult2] = js.native
  def avgDistinct[TAliases /* <: js.Object */, TResult2](aliases: TAliases): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("avgDistinct")
  def avgDistinct_TKey_StringTResult2[TKey /* <: String */, TResult2](columnNames: TKey*): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("avg")
  def avg_TKey_StringTResult2[TKey /* <: String */, TResult2](columnNames: TKey*): QueryBuilder[TRecord, TResult2] = js.native
  def clearCounters(): QueryBuilder[TRecord, TResult] = js.native
  def clearHaving(): QueryBuilder[TRecord, TResult] = js.native
  def clearOrder(): QueryBuilder[TRecord, TResult] = js.native
  // Clear
  def clearSelect(): QueryBuilder[
    TRecord, 
    TResult | (js.Array[
      DeferredKeySelection[_, scala.Nothing, `false`, js.Object, `false`, js.Object, scala.Nothing]
    ])
  ] = js.native
  def clearWhere(): QueryBuilder[TRecord, TResult] = js.native
  def column(): QueryBuilder[TRecord, TResult] = js.native
  // When all columns are known to be keys of original record,
  // we can extend our selection by these columns
  def column(columnName: typings.knex.knexStrings.`*`): QueryBuilder[
    TRecord, 
    js.Array[
      DeferredKeySelection[TRecord, String, `false`, js.Object, `false`, js.Object, scala.Nothing]
    ]
  ] = js.native
  // For non-inferrable column selection, we will allow consumer to
  // specify result type and if not widen the result to entire record type with any omissions permitted
  def column[TResult2](columnNames: (ColumnDescriptor[TRecord, TResult])*): QueryBuilder[TRecord, TResult2] = js.native
  def column[TResult2](columnNames: js.Array[ColumnDescriptor[TRecord, TResult]]): QueryBuilder[TRecord, TResult2] = js.native
  def column[AliasUT /* <: js.Array[Dict[_] | String] */, TResult2](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param aliases because its type AliasUT is not an array type */ aliases: AliasUT
  ): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("column")
  def column_AliasUT_ArrayInferrableColumnDescriptorTRecordTResult2[AliasUT /* <: js.Array[InferrableColumnDescriptor[TRecord]] */, TResult2](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param aliases because its type AliasUT is not an array type */ aliases: AliasUT
  ): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("column")
  def column_ColNameUT_StringTResult2[ColNameUT /* <: String */, TResult2](columnNames: ColNameUT*): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("column")
  def column_ColNameUT_StringTResult2[ColNameUT /* <: String */, TResult2](columnNames: js.Array[ColNameUT]): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("column")
  def column_TResult2TInnerRecordTInnerResult[TResult2, TInnerRecord, TInnerResult](subQueryBuilders: (QueryBuilder[TInnerRecord, TInnerResult])*): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("column")
  def column_TResult2TInnerRecordTInnerResult[TResult2, TInnerRecord, TInnerResult](subQueryBuilders: js.Array[QueryBuilder[TInnerRecord, TInnerResult]]): QueryBuilder[TRecord, TResult2] = js.native
  def columns(): QueryBuilder[TRecord, TResult] = js.native
  // When all columns are known to be keys of original record,
  // we can extend our selection by these columns
  def columns(columnName: typings.knex.knexStrings.`*`): QueryBuilder[
    TRecord, 
    js.Array[
      DeferredKeySelection[TRecord, String, `false`, js.Object, `false`, js.Object, scala.Nothing]
    ]
  ] = js.native
  // For non-inferrable column selection, we will allow consumer to
  // specify result type and if not widen the result to entire record type with any omissions permitted
  def columns[TResult2](columnNames: (ColumnDescriptor[TRecord, TResult])*): QueryBuilder[TRecord, TResult2] = js.native
  def columns[TResult2](columnNames: js.Array[ColumnDescriptor[TRecord, TResult]]): QueryBuilder[TRecord, TResult2] = js.native
  def columns[AliasUT /* <: js.Array[Dict[_] | String] */, TResult2](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param aliases because its type AliasUT is not an array type */ aliases: AliasUT
  ): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("columns")
  def columns_AliasUT_ArrayInferrableColumnDescriptorTRecordTResult2[AliasUT /* <: js.Array[InferrableColumnDescriptor[TRecord]] */, TResult2](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param aliases because its type AliasUT is not an array type */ aliases: AliasUT
  ): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("columns")
  def columns_ColNameUT_StringTResult2[ColNameUT /* <: String */, TResult2](columnNames: ColNameUT*): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("columns")
  def columns_ColNameUT_StringTResult2[ColNameUT /* <: String */, TResult2](columnNames: js.Array[ColNameUT]): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("columns")
  def columns_TResult2TInnerRecordTInnerResult[TResult2, TInnerRecord, TInnerResult](subQueryBuilders: (QueryBuilder[TInnerRecord, TInnerResult])*): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("columns")
  def columns_TResult2TInnerRecordTInnerResult[TResult2, TInnerRecord, TInnerResult](subQueryBuilders: js.Array[QueryBuilder[TInnerRecord, TInnerResult]]): QueryBuilder[TRecord, TResult2] = js.native
  // Aggregation
  def count[TResult2](columnNames: (Raw[_] | (Record[String, String | js.Array[String] | Raw[_]]) | String)*): QueryBuilder[TRecord, TResult2] = js.native
  // Aggregation
  def count[TAliases /* <: js.Object */, TResult2](aliases: TAliases): QueryBuilder[TRecord, TResult2] = js.native
  def countDistinct[TResult2](columnNames: (Raw[_] | (Record[String, String | js.Array[String] | Raw[_]]) | String)*): QueryBuilder[TRecord, TResult2] = js.native
  def countDistinct[TAliases /* <: js.Object */, TResult2](aliases: TAliases): QueryBuilder[TRecord, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, columns: StringDictionary[String | Double | Boolean | Raw[_]]): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    columns: StringDictionary[String | Double | Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, columns: StringDictionary[String | Double | Boolean | Raw[_]]): QueryBuilder[TRecord2, TResult2] = js.native
  def crossJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def decrement(columnName: String): QueryBuilder[TRecord, Double] = js.native
  def decrement(columnName: String, amount: Double): QueryBuilder[TRecord, Double] = js.native
  def del[TResult2](): QueryBuilder[TRecord, TResult2] = js.native
  def del[TResult2](returning: String): QueryBuilder[TRecord, TResult2] = js.native
  def del[TResult2](returning: js.Array[String]): QueryBuilder[TRecord, TResult2] = js.native
  def del[TKey /* <: StrKey[TRecord] */, TResult2](returning: TKey): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("del")
  def del_TKey_StrKeyTRecordTResult2[TKey /* <: StrKey[TRecord] */, TResult2](returning: js.Array[TKey]): QueryBuilder[TRecord, js.Array[TResult2]] = js.native
  def delete[TResult2](): QueryBuilder[TRecord, TResult2] = js.native
  def delete[TResult2](returning: String): QueryBuilder[TRecord, TResult2] = js.native
  def delete[TResult2](returning: js.Array[String]): QueryBuilder[TRecord, TResult2] = js.native
  def delete[TKey /* <: StrKey[TRecord] */, TResult2](returning: TKey): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("delete")
  def delete_TKey_StrKeyTRecordTResult2[TKey /* <: StrKey[TRecord] */, TResult2](returning: js.Array[TKey]): QueryBuilder[TRecord, TResult2] = js.native
  // When all columns are known to be keys of original record,
  // we can extend our selection by these columns
  def distinct(columnName: typings.knex.knexStrings.`*`): QueryBuilder[
    TRecord, 
    js.Array[
      DeferredKeySelection[TRecord, String, `false`, js.Object, `false`, js.Object, scala.Nothing]
    ]
  ] = js.native
  // For non-inferrable column selection, we will allow consumer to
  // specify result type and if not widen the result to entire record type with any omissions permitted
  def distinct[TResult2](columnNames: (ColumnDescriptor[TRecord, TResult])*): QueryBuilder[TRecord, TResult2] = js.native
  def distinct[TResult2](columnNames: js.Array[ColumnDescriptor[TRecord, TResult]]): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("distinct")
  def distinct_ColNameUT_StringTResult2[ColNameUT /* <: String */, TResult2](columnNames: ColNameUT*): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("distinct")
  def distinct_ColNameUT_StringTResult2[ColNameUT /* <: String */, TResult2](columnNames: js.Array[ColNameUT]): QueryBuilder[TRecord, TResult2] = js.native
  // Others
  def first(): QueryBuilder[
    TRecord, 
    AddUnionMember[
      UnwrapArrayMember[AddUnionMember[UnwrapArrayMember[TResult], js.UndefOr[scala.Nothing]]], 
      js.UndefOr[scala.Nothing]
    ]
  ] = js.native
  // When all columns are known to be keys of original record,
  // we can extend our selection by these columns
  // Others
  def first(columnName: typings.knex.knexStrings.`*`): QueryBuilder[
    TRecord, 
    js.Array[
      DeferredKeySelection[TRecord, String, `false`, js.Object, `false`, js.Object, scala.Nothing]
    ]
  ] = js.native
  // For non-inferrable column selection, we will allow consumer to
  // specify result type and if not widen the result to entire record type with any omissions permitted
  // Others
  def first[TResult2](
    columnNames: (ColumnDescriptor[
      TRecord, 
      AddUnionMember[
        UnwrapArrayMember[
          AddUnionMember[
            UnwrapArrayMember[
              AddUnionMember[
                UnwrapArrayMember[AddUnionMember[UnwrapArrayMember[TResult], js.UndefOr[scala.Nothing]]], 
                js.UndefOr[scala.Nothing]
              ]
            ], 
            js.UndefOr[scala.Nothing]
          ]
        ], 
        js.UndefOr[scala.Nothing]
      ]
    ])*
  ): QueryBuilder[TRecord, TResult2] = js.native
  // Others
  def first[TResult2](
    columnNames: js.Array[
      ColumnDescriptor[
        TRecord, 
        AddUnionMember[
          UnwrapArrayMember[
            AddUnionMember[
              UnwrapArrayMember[
                AddUnionMember[
                  UnwrapArrayMember[AddUnionMember[UnwrapArrayMember[TResult], js.UndefOr[scala.Nothing]]], 
                  js.UndefOr[scala.Nothing]
                ]
              ], 
              js.UndefOr[scala.Nothing]
            ]
          ], 
          js.UndefOr[scala.Nothing]
        ]
      ]
    ]
  ): QueryBuilder[TRecord, TResult2] = js.native
  // Others
  def first[AliasUT /* <: js.Array[Dict[_] | String] */, TResult2](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param aliases because its type AliasUT is not an array type */ aliases: AliasUT
  ): QueryBuilder[TRecord, TResult2] = js.native
  // Others
  @JSName("first")
  def first_AliasUT_ArrayInferrableColumnDescriptorTRecordTResult2[AliasUT /* <: js.Array[InferrableColumnDescriptor[TRecord]] */, TResult2](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param aliases because its type AliasUT is not an array type */ aliases: AliasUT
  ): QueryBuilder[TRecord, TResult2] = js.native
  // Others
  @JSName("first")
  def first_ColNameUT_StringTResult2[ColNameUT /* <: String */, TResult2](columnNames: ColNameUT*): QueryBuilder[TRecord, TResult2] = js.native
  // Others
  @JSName("first")
  def first_ColNameUT_StringTResult2[ColNameUT /* <: String */, TResult2](columnNames: js.Array[ColNameUT]): QueryBuilder[TRecord, TResult2] = js.native
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
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, columns: StringDictionary[String | Double | Boolean | Raw[_]]): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    columns: StringDictionary[String | Double | Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, columns: StringDictionary[String | Double | Boolean | Raw[_]]): QueryBuilder[TRecord2, TResult2] = js.native
  def fullOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  // When all columns are known to be keys of original record,
  // we can extend our selection by these columns
  // Group by
  def groupBy(columnName: typings.knex.knexStrings.`*`): QueryBuilder[
    TRecord, 
    js.Array[
      DeferredKeySelection[TRecord, String, `false`, js.Object, `false`, js.Object, scala.Nothing]
    ]
  ] = js.native
  // For non-inferrable column selection, we will allow consumer to
  // specify result type and if not widen the result to entire record type with any omissions permitted
  // Group by
  def groupBy[TResult2](columnNames: (ColumnDescriptor[TRecord, TResult])*): QueryBuilder[TRecord, TResult2] = js.native
  // Group by
  def groupBy[TResult2](columnNames: js.Array[ColumnDescriptor[TRecord, TResult]]): QueryBuilder[TRecord, TResult2] = js.native
  // Group by
  def groupBy[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  // Group by
  def groupBy[TResult2](sql: String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  // Group by
  def groupBy[TResult2](sql: String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def groupBy[TResult2](sql: String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  def groupByRaw[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def groupByRaw[TResult2](sql: String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def groupByRaw[TResult2](sql: String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def groupByRaw[TResult2](sql: String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  // Group by
  @JSName("groupBy")
  def groupBy_ColNameUT_StringTResult2[ColNameUT /* <: String */, TResult2](columnNames: ColNameUT*): QueryBuilder[TRecord, TResult2] = js.native
  // Group by
  @JSName("groupBy")
  def groupBy_ColNameUT_StringTResult2[ColNameUT /* <: String */, TResult2](columnNames: js.Array[ColNameUT]): QueryBuilder[TRecord, TResult2] = js.native
  // Having
  def having(tableName: String, column1: String, operator: String, column2: String): QueryBuilder[TRecord, TResult] = js.native
  // Having
  def having[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  // Having
  def having[TResult2](sql: String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  // Having
  def having[TResult2](sql: String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def having[TResult2](sql: String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  // Having
  def having[K1 /* <: String */, K2 /* <: String */](tableName: String, column1: K1, operator: ComparisionOperator, column2: K2): QueryBuilder[TRecord, TResult] = js.native
  def havingBetween(columnName: String, values: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def havingBetween[K /* <: String */](
    columnName: K,
    values: js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
  ): QueryBuilder[TRecord, TResult] = js.native
  def havingIn(columnName: String, values: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def havingIn[K /* <: String */](
    columnName: K,
    values: js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
  ): QueryBuilder[TRecord, TResult] = js.native
  def havingNotBetween(columnName: String, values: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def havingNotBetween[K /* <: String */](
    columnName: K,
    values: js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
  ): QueryBuilder[TRecord, TResult] = js.native
  def havingRaw[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def havingRaw[TResult2](sql: String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def havingRaw[TResult2](sql: String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def havingRaw[TResult2](sql: String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  def havingWrapped(callback: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def increment(columnName: String): QueryBuilder[TRecord, Double] = js.native
  def increment(columnName: String, amount: Double): QueryBuilder[TRecord, Double] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, columns: StringDictionary[String | Double | Boolean | Raw[_]]): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    columns: StringDictionary[String | Double | Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, columns: StringDictionary[String | Double | Boolean | Raw[_]]): QueryBuilder[TRecord2, TResult2] = js.native
  def innerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def insert[TResult2](data: MaybeArray[SafePartial[TRecord]]): QueryBuilder[TRecord, TResult2] = js.native
  def insert[TKey /* <: StrKey[TRecord] */, TResult2](data: MaybeArray[SafePartial[TRecord]], returning: TKey): QueryBuilder[TRecord, TResult2] = js.native
  def insert[TKey /* <: StrKey[TRecord] */, TResult2](data: MaybeArray[SafePartial[TRecord]], returning: js.Array[TKey]): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("insert")
  def insert_TKey_StringTResult2[TKey /* <: String */, TResult2](data: MaybeArray[SafePartial[TRecord]], returning: TKey): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("insert")
  def insert_TKey_StringTResult2[TKey /* <: String */, TResult2](data: MaybeArray[SafePartial[TRecord]], returning: js.Array[TKey]): QueryBuilder[TRecord, TResult2] = js.native
  // Intersect
  def intersect(callbacks: ((QueryCallback[_, js.Array[_]]) | Raw[_] | (QueryBuilder[TRecord, _]))*): QueryBuilder[TRecord, TResult] = js.native
  // Intersect
  def intersect(callback: MaybeArray[(QueryCallback[_, js.Array[_]]) | (QueryBuilder[TRecord, _]) | Raw[_]]): QueryBuilder[TRecord, TResult] = js.native
  def intersect(
    callback: MaybeArray[(QueryCallback[_, js.Array[_]]) | (QueryBuilder[TRecord, _]) | Raw[_]],
    wrap: Boolean
  ): QueryBuilder[TRecord, TResult] = js.native
  def into[TRecord2, TResult2](callback: js.Function): QueryBuilder[TRecord2, TResult2] = js.native
  def into[TRecord2, TResult2](raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def into[TRecord2, TResult2](tableName: AliasDict): QueryBuilder[TRecord2, TResult2] = js.native
  def into[TRecord2, TResult2](tableName: TableDescriptor): QueryBuilder[TRecord2, TResult2] = js.native
  // Joins
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, columns: StringDictionary[String | Double | Boolean | Raw[_]]): QueryBuilder[TRecord2, TResult2] = js.native
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    columns: StringDictionary[String | Double | Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  // Joins
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  // Joins
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  // Joins
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  // Joins
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  // Joins
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, columns: StringDictionary[String | Double | Boolean | Raw[_]]): QueryBuilder[TRecord2, TResult2] = js.native
  // Joins
  def join[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def joinRaw(tableName: String): QueryBuilder[TRecord, TResult] = js.native
  def joinRaw(tableName: String, binding: Value): QueryBuilder[TRecord, TResult] = js.native
  def joinRaw(tableName: String, binding: ValueDict): QueryBuilder[TRecord, TResult] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, columns: StringDictionary[String | Double | Boolean | Raw[_]]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    columns: StringDictionary[String | Double | Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, columns: StringDictionary[String | Double | Boolean | Raw[_]]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, columns: StringDictionary[String | Double | Boolean | Raw[_]]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    columns: StringDictionary[String | Double | Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, columns: StringDictionary[String | Double | Boolean | Raw[_]]): QueryBuilder[TRecord2, TResult2] = js.native
  def leftOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def limit(limit: Double): QueryBuilder[TRecord, TResult] = js.native
  def max[TResult2](columnNames: ((Record[String, String | js.Array[String] | Raw[_]]) | Raw[_] | String)*): QueryBuilder[TRecord, TResult2] = js.native
  def max[TAliases /* <: js.Object */, TResult2](aliases: TAliases): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("max")
  def max_TKey_StringTResult2[TKey /* <: String */, TResult2](columnNames: TKey*): QueryBuilder[TRecord, TResult2] = js.native
  def min[TResult2](columnNames: ((Record[String, String | js.Array[String] | Raw[_]]) | Raw[_] | String)*): QueryBuilder[TRecord, TResult2] = js.native
  def min[TAliases /* <: js.Object */, TResult2](aliases: TAliases): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("min")
  def min_TKey_StringTResult2[TKey /* <: String */, TResult2](columnNames: TKey*): QueryBuilder[TRecord, TResult2] = js.native
  def modify[TRecord2 /* <: js.Object */, TResult2 /* <: js.Object */](callback: QueryCallbackWithArgs[TRecord, _], args: js.Any*): QueryBuilder[TRecord2, TResult2] = js.native
  // Paging
  def offset(offset: Double): QueryBuilder[TRecord, TResult] = js.native
  def orHaving(tableName: String, column1: String, operator: String, column2: String): QueryBuilder[TRecord, TResult] = js.native
  def orHaving[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def orHaving[TResult2](sql: String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def orHaving[TResult2](sql: String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def orHaving[TResult2](sql: String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  def orHaving[K1 /* <: String */, K2 /* <: String */](tableName: String, column1: K1, operator: ComparisionOperator, column2: K2): QueryBuilder[TRecord, TResult] = js.native
  def orHavingBetween(columnName: String, values: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def orHavingBetween[K /* <: String */](
    columnName: K,
    values: js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
  ): QueryBuilder[TRecord, TResult] = js.native
  def orHavingNotBetween(columnName: String, values: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def orHavingNotBetween[K /* <: String */](
    columnName: K,
    values: js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
  ): QueryBuilder[TRecord, TResult] = js.native
  def orHavingRaw[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def orHavingRaw[TResult2](sql: String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def orHavingRaw[TResult2](sql: String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def orHavingRaw[TResult2](sql: String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  def orWhere(callback: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def orWhere(columnName: String): QueryBuilder[TRecord, TResult] = js.native
  def orWhere(columnName: String, operator: String): QueryBuilder[TRecord, TResult] = js.native
  def orWhere(columnName: String, operator: String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  def orWhere(columnName: String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  def orWhere(condition: Boolean): QueryBuilder[TRecord, TResult] = js.native
  def orWhere(left: Raw[_], operator: String): QueryBuilder[TRecord, TResult] = js.native
  def orWhere(left: Raw[_], operator: String, right: Value): QueryBuilder[TRecord, TResult] = js.native
  def orWhere(`object`: js.Object): QueryBuilder[TRecord, TResult] = js.native
  def orWhere(`object`: SafePartial[TRecord]): QueryBuilder[TRecord, TResult] = js.native
  def orWhere(raw: Raw[_]): QueryBuilder[TRecord, TResult] = js.native
  def orWhere[T /* <: String */](columnName: T): QueryBuilder[TRecord, TResult] = js.native
  def orWhere[T /* <: String */](columnName: T, operator: ComparisionOperator): QueryBuilder[TRecord, TResult] = js.native
  def orWhere[T /* <: String */](
    columnName: T,
    operator: ComparisionOperator,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): QueryBuilder[TRecord, TResult] = js.native
  def orWhere[T /* <: String */](
    columnName: T,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): QueryBuilder[TRecord, TResult] = js.native
  def orWhere[TResult2](sql: String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def orWhere[TResult2](sql: String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def orWhere[TResult2](sql: String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  def orWhere[TRecordInner, TResultInner](columnName: String, operator: String, value: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def orWhere[TRecordInner, TResultInner](left: Raw[_], operator: String, right: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def orWhere[T /* <: String */, TRecordInner, TResultInner](columnName: T, operator: ComparisionOperator, value: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereBetween(columnName: String, range: js.Tuple2[Value, Value]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereBetween[K /* <: String */](
    columnName: K,
    range: js.Tuple2[
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  def orWhereExists(callback: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereExists[TRecordInner, TResultInner](query: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereIn(columnName: String, values: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereIn(columnName: String, values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereIn(columnNames: js.Array[String], values: js.Array[js.Array[Value]]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereIn(columnNames: js.Array[String], values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereIn[K /* <: String */](
    columnName: K,
    values: js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
  ): QueryBuilder[TRecord, TResult] = js.native
  def orWhereIn[K /* <: String */](columnName: K, values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereIn[TRecordInner, TResultInner](columnName: String, values: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereIn[TRecordInner, TResultInner](columnNames: js.Array[String], values: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereIn[K /* <: String */, TRecordInner, TResultInner](
    columnName: K,
    values: QueryBuilder[
      TRecordInner, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  @JSName("orWhereIn")
  def orWhereIn_K_String[K /* <: String */](
    columnNames: js.Array[K],
    values: js.Array[
      js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  @JSName("orWhereIn")
  def orWhereIn_K_String[K /* <: String */](columnNames: js.Array[K], values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  @JSName("orWhereIn")
  def orWhereIn_K_StringTRecordInnerTResultInner[K /* <: String */, TRecordInner, TResultInner](
    columnNames: js.Array[K],
    values: QueryBuilder[
      TRecordInner, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot(callback: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot(columnName: String): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot(columnName: String, operator: String): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot(columnName: String, operator: String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot(columnName: String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot(condition: Boolean): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot(left: Raw[_], operator: String): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot(left: Raw[_], operator: String, right: Value): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot(`object`: js.Object): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot(`object`: SafePartial[TRecord]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot(raw: Raw[_]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot[T /* <: String */](columnName: T): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot[T /* <: String */](columnName: T, operator: ComparisionOperator): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot[T /* <: String */](
    columnName: T,
    operator: ComparisionOperator,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot[T /* <: String */](
    columnName: T,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot[TResult2](sql: String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def orWhereNot[TResult2](sql: String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def orWhereNot[TResult2](sql: String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  def orWhereNot[TRecordInner, TResultInner](columnName: String, operator: String, value: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot[TRecordInner, TResultInner](left: Raw[_], operator: String, right: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNot[T /* <: String */, TRecordInner, TResultInner](columnName: T, operator: ComparisionOperator, value: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotBetween(columnName: String, range: js.Tuple2[Value, Value]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotBetween[K /* <: String */](
    columnName: K,
    range: js.Tuple2[
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotExists(callback: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotExists[TRecordInner, TResultInner](query: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotIn(columnName: String, values: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotIn(columnName: String, values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotIn(columnNames: js.Array[String], values: js.Array[js.Array[Value]]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotIn(columnNames: js.Array[String], values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotIn[K /* <: String */](
    columnName: K,
    values: js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
  ): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotIn[K /* <: String */](columnName: K, values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotIn[TRecordInner, TResultInner](columnName: String, values: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotIn[TRecordInner, TResultInner](columnNames: js.Array[String], values: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotIn[K /* <: String */, TRecordInner, TResultInner](
    columnName: K,
    values: QueryBuilder[
      TRecordInner, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  @JSName("orWhereNotIn")
  def orWhereNotIn_K_String[K /* <: String */](
    columnNames: js.Array[K],
    values: js.Array[
      js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  @JSName("orWhereNotIn")
  def orWhereNotIn_K_String[K /* <: String */](columnNames: js.Array[K], values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  @JSName("orWhereNotIn")
  def orWhereNotIn_K_StringTRecordInnerTResultInner[K /* <: String */, TRecordInner, TResultInner](
    columnNames: js.Array[K],
    values: QueryBuilder[
      TRecordInner, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  def orWhereNotNull(columnName: String): QueryBuilder[TRecord, TResult] = js.native
  @JSName("orWhereNot")
  def orWhereNot_TResult2[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def orWhereNull(columnName: String): QueryBuilder[TRecord, TResult] = js.native
  def orWhereRaw(condition: Boolean): QueryBuilder[TRecord, TResult] = js.native
  def orWhereRaw[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def orWhereRaw[TResult2](sql: String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def orWhereRaw[TResult2](sql: String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def orWhereRaw[TResult2](sql: String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("orWhere")
  def orWhere_TResult2[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  // Order by
  def orderBy(columnDefs: js.Array[Anon_Asc[TRecord] | Anon_Column | String]): QueryBuilder[TRecord, TResult] = js.native
  // Order by
  def orderBy(columnName: String): QueryBuilder[TRecord, TResult] = js.native
  def orderBy(columnName: String, order: String): QueryBuilder[TRecord, TResult] = js.native
  def orderByRaw[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def orderByRaw[TResult2](sql: String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def orderByRaw[TResult2](sql: String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def orderByRaw[TResult2](sql: String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("orderBy")
  def orderBy_asc(columnName: String, order: asc): QueryBuilder[TRecord, TResult] = js.native
  @JSName("orderBy")
  def orderBy_desc(columnName: String, order: desc): QueryBuilder[TRecord, TResult] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, columns: StringDictionary[String | Double | Boolean | Raw[_]]): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    columns: StringDictionary[String | Double | Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, columns: StringDictionary[String | Double | Boolean | Raw[_]]): QueryBuilder[TRecord2, TResult2] = js.native
  def outerJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def pluck[K /* <: String */](column: K): QueryBuilder[
    TRecord, 
    js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
  ] = js.native
  def pluck[TResult2 /* <: js.Object */](column: String): QueryBuilder[TRecord, TResult2] = js.native
  def returning[TResult2](column: String): QueryBuilder[TRecord, TResult2] = js.native
  def returning[TResult2](column: js.Array[String]): QueryBuilder[TRecord, TResult2] = js.native
  def returning[TKey /* <: StrKey[TRecord] */, TResult2](column: TKey): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("returning")
  def returning_TKey_StrKeyTRecordTResult2[TKey /* <: StrKey[TRecord] */, TResult2](columns: js.Array[TKey]): QueryBuilder[TRecord, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, columns: StringDictionary[String | Double | Boolean | Raw[_]]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    columns: StringDictionary[String | Double | Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, columns: StringDictionary[String | Double | Boolean | Raw[_]]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, columns: StringDictionary[String | Double | Boolean | Raw[_]]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    columns: StringDictionary[String | Double | Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, columns: StringDictionary[String | Double | Boolean | Raw[_]]): QueryBuilder[TRecord2, TResult2] = js.native
  def rightOuterJoin[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def select(): QueryBuilder[TRecord, TResult] = js.native
  // When all columns are known to be keys of original record,
  // we can extend our selection by these columns
  def select(columnName: typings.knex.knexStrings.`*`): QueryBuilder[
    TRecord, 
    js.Array[
      DeferredKeySelection[TRecord, String, `false`, js.Object, `false`, js.Object, scala.Nothing]
    ]
  ] = js.native
  // For non-inferrable column selection, we will allow consumer to
  // specify result type and if not widen the result to entire record type with any omissions permitted
  def select[TResult2](columnNames: (ColumnDescriptor[TRecord, TResult])*): QueryBuilder[TRecord, TResult2] = js.native
  def select[TResult2](columnNames: js.Array[ColumnDescriptor[TRecord, TResult]]): QueryBuilder[TRecord, TResult2] = js.native
  def select[AliasUT /* <: js.Array[Dict[_] | String] */, TResult2](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param aliases because its type AliasUT is not an array type */ aliases: AliasUT
  ): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("select")
  def select_AliasUT_ArrayInferrableColumnDescriptorTRecordTResult2[AliasUT /* <: js.Array[InferrableColumnDescriptor[TRecord]] */, TResult2](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param aliases because its type AliasUT is not an array type */ aliases: AliasUT
  ): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("select")
  def select_ColNameUT_StringTResult2[ColNameUT /* <: String */, TResult2](columnNames: ColNameUT*): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("select")
  def select_ColNameUT_StringTResult2[ColNameUT /* <: String */, TResult2](columnNames: js.Array[ColNameUT]): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("select")
  def select_TResult2TInnerRecordTInnerResult[TResult2, TInnerRecord, TInnerResult](subQueryBuilders: (QueryBuilder[TInnerRecord, TInnerResult])*): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("select")
  def select_TResult2TInnerRecordTInnerResult[TResult2, TInnerRecord, TInnerResult](subQueryBuilders: js.Array[QueryBuilder[TInnerRecord, TInnerResult]]): QueryBuilder[TRecord, TResult2] = js.native
  def sum[TResult2](columnNames: ((Record[String, String | js.Array[String] | Raw[_]]) | Raw[_] | String)*): QueryBuilder[TRecord, TResult2] = js.native
  def sum[TAliases /* <: js.Object */, TResult2](aliases: TAliases): QueryBuilder[TRecord, TResult2] = js.native
  def sumDistinct[TResult2](columnNames: ((Record[String, String | js.Array[String] | Raw[_]]) | Raw[_] | String)*): QueryBuilder[TRecord, TResult2] = js.native
  def sumDistinct[TAliases /* <: js.Object */, TResult2](aliases: TAliases): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("sumDistinct")
  def sumDistinct_TKey_StringTResult2[TKey /* <: String */, TResult2](columnNames: TKey*): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("sum")
  def sum_TKey_StringTResult2[TKey /* <: String */, TResult2](columnNames: TKey*): QueryBuilder[TRecord, TResult2] = js.native
  def table[TRecord2, TResult2](callback: js.Function): QueryBuilder[TRecord2, TResult2] = js.native
  def table[TRecord2, TResult2](raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def table[TRecord2, TResult2](tableName: AliasDict): QueryBuilder[TRecord2, TResult2] = js.native
  def table[TRecord2, TResult2](tableName: TableDescriptor): QueryBuilder[TRecord2, TResult2] = js.native
  def truncate(): QueryBuilder[TRecord, Unit] = js.native
  // Union
  def union(callbacks: ((QueryCallback[_, js.Array[_]]) | Raw[_] | (QueryBuilder[TRecord, _]))*): QueryBuilder[TRecord, TResult] = js.native
  // Union
  def union(callback: MaybeArray[(QueryCallback[_, js.Array[_]]) | (QueryBuilder[TRecord, _]) | Raw[_]]): QueryBuilder[TRecord, TResult] = js.native
  def union(
    callback: MaybeArray[(QueryCallback[_, js.Array[_]]) | (QueryBuilder[TRecord, _]) | Raw[_]],
    wrap: Boolean
  ): QueryBuilder[TRecord, TResult] = js.native
  def unionAll(callbacks: ((QueryCallback[_, js.Array[_]]) | Raw[_] | (QueryBuilder[TRecord, _]))*): QueryBuilder[TRecord, TResult] = js.native
  def unionAll(callback: MaybeArray[(QueryCallback[_, js.Array[_]]) | (QueryBuilder[TRecord, _]) | Raw[_]]): QueryBuilder[TRecord, TResult] = js.native
  def unionAll(
    callback: MaybeArray[(QueryCallback[_, js.Array[_]]) | (QueryBuilder[TRecord, _]) | Raw[_]],
    wrap: Boolean
  ): QueryBuilder[TRecord, TResult] = js.native
  def update[K /* <: String */](
    columnName: K,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
  ): QueryBuilder[TRecord, Double] = js.native
  def update[TResult2](columnName: String, value: Value): QueryBuilder[TRecord, TResult2] = js.native
  def update[TResult2](columnName: String, value: Value, returning: String): QueryBuilder[TRecord, TResult2] = js.native
  def update[TResult2](columnName: String, value: Value, returning: js.Array[String]): QueryBuilder[TRecord, TResult2] = js.native
  def update[TResult2](data: MaybeArray[SafePartial[TRecord]]): QueryBuilder[TRecord, TResult2] = js.native
  def update[TKey /* <: String */, TResult2 /* <: js.Array[js.Object] */](data: MaybeArray[SafePartial[TRecord]], returning: TKey): QueryBuilder[TRecord, TResult2] = js.native
  def update[TKey /* <: String */, TResult2 /* <: js.Array[js.Object] */](data: MaybeArray[SafePartial[TRecord]], returning: js.Array[TKey]): QueryBuilder[TRecord, TResult2] = js.native
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
  def update_TKey_StrKeyTRecordTResult2[TKey /* <: StrKey[TRecord] */, TResult2](data: MaybeArray[SafePartial[TRecord]], returning: TKey): QueryBuilder[TRecord, TResult2] = js.native
  @JSName("update")
  def update_TKey_StrKeyTRecordTResult2[TKey /* <: StrKey[TRecord] */, TResult2](data: MaybeArray[SafePartial[TRecord]], returning: js.Array[TKey]): QueryBuilder[TRecord, TResult2] = js.native
  // Wheres
  def where(callback: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def where(columnName: String): QueryBuilder[TRecord, TResult] = js.native
  def where(columnName: String, operator: String): QueryBuilder[TRecord, TResult] = js.native
  // Wheres
  def where(columnName: String, operator: String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  // Wheres
  def where(columnName: String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  // Wheres
  def where(condition: Boolean): QueryBuilder[TRecord, TResult] = js.native
  def where(left: Raw[_], operator: String): QueryBuilder[TRecord, TResult] = js.native
  // Wheres
  def where(left: Raw[_], operator: String, right: Value): QueryBuilder[TRecord, TResult] = js.native
  // Wheres
  def where(`object`: js.Object): QueryBuilder[TRecord, TResult] = js.native
  // Wheres
  def where(`object`: SafePartial[TRecord]): QueryBuilder[TRecord, TResult] = js.native
  // Wheres
  def where(raw: Raw[_]): QueryBuilder[TRecord, TResult] = js.native
  def where[T /* <: String */](columnName: T): QueryBuilder[TRecord, TResult] = js.native
  def where[T /* <: String */](columnName: T, operator: ComparisionOperator): QueryBuilder[TRecord, TResult] = js.native
  // Wheres
  def where[T /* <: String */](
    columnName: T,
    operator: ComparisionOperator,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): QueryBuilder[TRecord, TResult] = js.native
  // Wheres
  def where[T /* <: String */](
    columnName: T,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): QueryBuilder[TRecord, TResult] = js.native
  // Wheres
  def where[TResult2](sql: String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  // Wheres
  def where[TResult2](sql: String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def where[TResult2](sql: String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  // Wheres
  def where[TRecordInner, TResultInner](columnName: String, operator: String, value: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  // Wheres
  def where[TRecordInner, TResultInner](left: Raw[_], operator: String, right: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  // Wheres
  def where[T /* <: String */, TRecordInner, TResultInner](columnName: T, operator: ComparisionOperator, value: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def whereBetween(columnName: String, range: js.Tuple2[Value, Value]): QueryBuilder[TRecord, TResult] = js.native
  def whereBetween[K /* <: String */](
    columnName: K,
    range: js.Tuple2[
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  def whereExists(callback: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def whereExists[TRecordInner, TResultInner](query: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def whereIn(columnName: String, values: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def whereIn(columnName: String, values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def whereIn(columnNames: js.Array[String], values: js.Array[js.Array[Value]]): QueryBuilder[TRecord, TResult] = js.native
  def whereIn(columnNames: js.Array[String], values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def whereIn[K /* <: String */](
    columnName: K,
    values: js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
  ): QueryBuilder[TRecord, TResult] = js.native
  def whereIn[K /* <: String */](columnName: K, values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def whereIn[TRecordInner, TResultInner](columnName: String, values: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def whereIn[TRecordInner, TResultInner](columnNames: js.Array[String], values: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def whereIn[K /* <: String */, TRecordInner, TResultInner](
    columnName: K,
    values: QueryBuilder[
      TRecordInner, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  @JSName("whereIn")
  def whereIn_K_String[K /* <: String */](
    columnNames: js.Array[K],
    values: js.Array[
      js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  @JSName("whereIn")
  def whereIn_K_String[K /* <: String */](columnNames: js.Array[K], values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  @JSName("whereIn")
  def whereIn_K_StringTRecordInnerTResultInner[K /* <: String */, TRecordInner, TResultInner](
    columnNames: js.Array[K],
    values: QueryBuilder[
      TRecordInner, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  def whereNot(callback: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def whereNot(columnName: String): QueryBuilder[TRecord, TResult] = js.native
  def whereNot(columnName: String, operator: String): QueryBuilder[TRecord, TResult] = js.native
  def whereNot(columnName: String, operator: String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  def whereNot(columnName: String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  def whereNot(condition: Boolean): QueryBuilder[TRecord, TResult] = js.native
  def whereNot(left: Raw[_], operator: String): QueryBuilder[TRecord, TResult] = js.native
  def whereNot(left: Raw[_], operator: String, right: Value): QueryBuilder[TRecord, TResult] = js.native
  def whereNot(`object`: js.Object): QueryBuilder[TRecord, TResult] = js.native
  def whereNot(`object`: SafePartial[TRecord]): QueryBuilder[TRecord, TResult] = js.native
  def whereNot(raw: Raw[_]): QueryBuilder[TRecord, TResult] = js.native
  def whereNot[T /* <: String */](columnName: T): QueryBuilder[TRecord, TResult] = js.native
  def whereNot[T /* <: String */](columnName: T, operator: ComparisionOperator): QueryBuilder[TRecord, TResult] = js.native
  def whereNot[T /* <: String */](
    columnName: T,
    operator: ComparisionOperator,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): QueryBuilder[TRecord, TResult] = js.native
  def whereNot[T /* <: String */](
    columnName: T,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): QueryBuilder[TRecord, TResult] = js.native
  def whereNot[TResult2](sql: String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def whereNot[TResult2](sql: String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def whereNot[TResult2](sql: String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  def whereNot[TRecordInner, TResultInner](columnName: String, operator: String, value: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def whereNot[TRecordInner, TResultInner](left: Raw[_], operator: String, right: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def whereNot[T /* <: String */, TRecordInner, TResultInner](columnName: T, operator: ComparisionOperator, value: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def whereNotBetween(columnName: String, range: js.Tuple2[Value, Value]): QueryBuilder[TRecord, TResult] = js.native
  def whereNotBetween[K /* <: String */](
    columnName: K,
    range: js.Tuple2[
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  def whereNotExists(callback: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def whereNotExists[TRecordInner, TResultInner](query: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def whereNotIn(columnName: String, values: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def whereNotIn(columnName: String, values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def whereNotIn(columnNames: js.Array[String], values: js.Array[js.Array[Value]]): QueryBuilder[TRecord, TResult] = js.native
  def whereNotIn(columnNames: js.Array[String], values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def whereNotIn[K /* <: String */](
    columnName: K,
    values: js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
  ): QueryBuilder[TRecord, TResult] = js.native
  def whereNotIn[K /* <: String */](columnName: K, values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def whereNotIn[TRecordInner, TResultInner](columnName: String, values: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def whereNotIn[TRecordInner, TResultInner](columnNames: js.Array[String], values: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def whereNotIn[K /* <: String */, TRecordInner, TResultInner](
    columnName: K,
    values: QueryBuilder[
      TRecordInner, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  @JSName("whereNotIn")
  def whereNotIn_K_String[K /* <: String */](
    columnNames: js.Array[K],
    values: js.Array[
      js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  @JSName("whereNotIn")
  def whereNotIn_K_String[K /* <: String */](columnNames: js.Array[K], values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  @JSName("whereNotIn")
  def whereNotIn_K_StringTRecordInnerTResultInner[K /* <: String */, TRecordInner, TResultInner](
    columnNames: js.Array[K],
    values: QueryBuilder[
      TRecordInner, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  def whereNotNull(columnName: String): QueryBuilder[TRecord, TResult] = js.native
  @JSName("whereNot")
  def whereNot_TResult2[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def whereNull(columnName: String): QueryBuilder[TRecord, TResult] = js.native
  def whereRaw(condition: Boolean): QueryBuilder[TRecord, TResult] = js.native
  def whereRaw[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def whereRaw[TResult2](sql: String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def whereRaw[TResult2](sql: String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def whereRaw[TResult2](sql: String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
  def whereWrapped(callback: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  // Wheres
  @JSName("where")
  def where_TResult2[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  // Withs
  def `with`(
    alias: String,
    callback: js.Function1[/* queryBuilder */ QueryBuilder[_, js.Array[SafePartial[_]]], _]
  ): QueryBuilder[TRecord, TResult] = js.native
  // Withs
  def `with`(alias: String, raw: QueryBuilder[_, js.Array[SafePartial[_]]]): QueryBuilder[TRecord, TResult] = js.native
  // Withs
  def `with`(alias: String, raw: Raw[_]): QueryBuilder[TRecord, TResult] = js.native
  // Withs
  def `with`(alias: String, sql: String): QueryBuilder[TRecord, TResult] = js.native
  def `with`(alias: String, sql: String, bindings: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def `with`(alias: String, sql: String, bindings: js.Object): QueryBuilder[TRecord, TResult] = js.native
  def withRaw(alias: String, raw: QueryBuilder[_, js.Array[SafePartial[_]]]): QueryBuilder[TRecord, TResult] = js.native
  def withRaw(alias: String, raw: Raw[_]): QueryBuilder[TRecord, TResult] = js.native
  def withRaw(alias: String, sql: String): QueryBuilder[TRecord, TResult] = js.native
  def withRaw(alias: String, sql: String, bindings: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def withRaw(alias: String, sql: String, bindings: js.Object): QueryBuilder[TRecord, TResult] = js.native
  def withRecursive(
    alias: String,
    callback: js.Function1[/* queryBuilder */ QueryBuilder[_, js.Array[SafePartial[_]]], _]
  ): QueryBuilder[TRecord, TResult] = js.native
  def withRecursive(alias: String, raw: QueryBuilder[_, js.Array[SafePartial[_]]]): QueryBuilder[TRecord, TResult] = js.native
  def withRecursive(alias: String, raw: Raw[_]): QueryBuilder[TRecord, TResult] = js.native
  def withRecursive(alias: String, sql: String): QueryBuilder[TRecord, TResult] = js.native
  def withRecursive(alias: String, sql: String, bindings: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def withRecursive(alias: String, sql: String, bindings: js.Object): QueryBuilder[TRecord, TResult] = js.native
  def withSchema(schema: String): QueryBuilder[TRecord, TResult] = js.native
  def withWrapped(
    alias: String,
    callback: js.Function1[/* queryBuilder */ QueryBuilder[_, js.Array[SafePartial[_]]], _]
  ): QueryBuilder[TRecord, TResult] = js.native
  def withWrapped(alias: String, queryBuilder: QueryBuilder[_, js.Array[SafePartial[_]]]): QueryBuilder[TRecord, TResult] = js.native
}

