package typings.knex.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Join[TRecord /* <: js.Object */, TResult] extends js.Object {
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, columns: StringDictionary[String | Double | Boolean | Raw[_]]): QueryBuilder[TRecord2, TResult2] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: AliasDict, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback[_, js.Array[_]],
    columns: StringDictionary[String | Double | Boolean | Raw[_]]
  ): QueryBuilder[TRecord2, TResult2] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback[_, js.Array[_]], raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, clause: JoinCallback): QueryBuilder[TRecord2, TResult2] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, operator: String, column2: String): QueryBuilder[TRecord2, TResult2] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, column1: String, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, columns: StringDictionary[String | Double | Boolean | Raw[_]]): QueryBuilder[TRecord2, TResult2] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableDescriptor, raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
}

