package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Join[TRecord /* <: js.Object */, TResult] extends js.Object {
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](raw: Raw[_]): (QueryBuilder[TRecord2, TResult2]) with ChainableInterface[js.Array[TRecord2]] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: Identifier, clause: JoinCallback): (QueryBuilder[TRecord2, TResult2]) with ChainableInterface[js.Array[TRecord2]] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: Identifier, column1: java.lang.String, column2: java.lang.String): (QueryBuilder[TRecord2, TResult2]) with ChainableInterface[js.Array[TRecord2]] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: Identifier,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): (QueryBuilder[TRecord2, TResult2]) with ChainableInterface[js.Array[TRecord2]] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: Identifier, column1: java.lang.String, raw: Raw[_]): (QueryBuilder[TRecord2, TResult2]) with ChainableInterface[js.Array[TRecord2]] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: Identifier,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): (QueryBuilder[TRecord2, TResult2]) with ChainableInterface[js.Array[TRecord2]] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: Identifier, raw: Raw[_]): (QueryBuilder[TRecord2, TResult2]) with ChainableInterface[js.Array[TRecord2]] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback, clause: JoinCallback): (QueryBuilder[TRecord2, TResult2]) with ChainableInterface[js.Array[TRecord2]] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback, column1: java.lang.String, column2: java.lang.String): (QueryBuilder[TRecord2, TResult2]) with ChainableInterface[js.Array[TRecord2]] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): (QueryBuilder[TRecord2, TResult2]) with ChainableInterface[js.Array[TRecord2]] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback, column1: java.lang.String, raw: Raw[_]): (QueryBuilder[TRecord2, TResult2]) with ChainableInterface[js.Array[TRecord2]] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: QueryCallback,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): (QueryBuilder[TRecord2, TResult2]) with ChainableInterface[js.Array[TRecord2]] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: QueryCallback, raw: Raw[_]): (QueryBuilder[TRecord2, TResult2]) with ChainableInterface[js.Array[TRecord2]] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableName, clause: JoinCallback): (QueryBuilder[TRecord2, TResult2]) with ChainableInterface[js.Array[TRecord2]] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableName, column1: java.lang.String, column2: java.lang.String): (QueryBuilder[TRecord2, TResult2]) with ChainableInterface[js.Array[TRecord2]] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: TableName,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): (QueryBuilder[TRecord2, TResult2]) with ChainableInterface[js.Array[TRecord2]] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableName, column1: java.lang.String, raw: Raw[_]): (QueryBuilder[TRecord2, TResult2]) with ChainableInterface[js.Array[TRecord2]] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](
    tableName: TableName,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw[_]]
  ): (QueryBuilder[TRecord2, TResult2]) with ChainableInterface[js.Array[TRecord2]] = js.native
  def apply[TJoinTargetRecord /* <: js.Object */, TRecord2 /* <: js.Object */, TResult2](tableName: TableName, raw: Raw[_]): (QueryBuilder[TRecord2, TResult2]) with ChainableInterface[js.Array[TRecord2]] = js.native
}

