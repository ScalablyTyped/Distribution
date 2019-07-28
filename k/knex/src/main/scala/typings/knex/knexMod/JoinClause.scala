package typings.knex.knexMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JoinClause extends js.Object {
  def andOn(callback: JoinCallback): JoinClause = js.native
  def andOn(column1: String, column2: String): JoinClause = js.native
  def andOn(column1: String, operator: String, column2: String): JoinClause = js.native
  def andOn(column1: String, operator: String, column2: Raw[_]): JoinClause = js.native
  def andOn(column1: String, raw: Raw[_]): JoinClause = js.native
  def andOn(columns: StringDictionary[String | Raw[_]]): JoinClause = js.native
  def andOn(raw: Raw[_]): JoinClause = js.native
  def andOnBetween(column1: String, range: js.Tuple2[_, _]): JoinClause = js.native
  def andOnExists(callback: QueryCallback[_, js.Array[_]]): JoinClause = js.native
  def andOnIn(column1: String, values: js.Array[_]): JoinClause = js.native
  def andOnNotBetween(column1: String, range: js.Tuple2[_, _]): JoinClause = js.native
  def andOnNotExists(callback: QueryCallback[_, js.Array[_]]): JoinClause = js.native
  def andOnNotIn(column1: String, values: js.Array[_]): JoinClause = js.native
  def andOnNotNull(column1: String): JoinClause = js.native
  def andOnNull(column1: String): JoinClause = js.native
  def on(callback: JoinCallback): JoinClause = js.native
  def on(column1: String, column2: String): JoinClause = js.native
  def on(column1: String, operator: String, column2: String): JoinClause = js.native
  def on(column1: String, operator: String, column2: Raw[_]): JoinClause = js.native
  def on(column1: String, raw: Raw[_]): JoinClause = js.native
  def on(columns: StringDictionary[String | Raw[_]]): JoinClause = js.native
  def on(raw: Raw[_]): JoinClause = js.native
  def onBetween(column1: String, range: js.Tuple2[_, _]): JoinClause = js.native
  def onExists(callback: QueryCallback[_, js.Array[_]]): JoinClause = js.native
  def onIn(column1: String, values: js.Array[_]): JoinClause = js.native
  def onNotBetween(column1: String, range: js.Tuple2[_, _]): JoinClause = js.native
  def onNotExists(callback: QueryCallback[_, js.Array[_]]): JoinClause = js.native
  def onNotIn(column1: String, values: js.Array[_]): JoinClause = js.native
  def onNotNull(column1: String): JoinClause = js.native
  def onNull(column1: String): JoinClause = js.native
  def orOn(callback: JoinCallback): JoinClause = js.native
  def orOn(column1: String, column2: String): JoinClause = js.native
  def orOn(column1: String, operator: String, column2: String): JoinClause = js.native
  def orOn(column1: String, operator: String, column2: Raw[_]): JoinClause = js.native
  def orOn(column1: String, raw: Raw[_]): JoinClause = js.native
  def orOn(columns: StringDictionary[String | Raw[_]]): JoinClause = js.native
  def orOn(raw: Raw[_]): JoinClause = js.native
  def orOnBetween(column1: String, range: js.Tuple2[_, _]): JoinClause = js.native
  def orOnExists(callback: QueryCallback[_, js.Array[_]]): JoinClause = js.native
  def orOnIn(column1: String, values: js.Array[_]): JoinClause = js.native
  def orOnNotBetween(column1: String, range: js.Tuple2[_, _]): JoinClause = js.native
  def orOnNotExists(callback: QueryCallback[_, js.Array[_]]): JoinClause = js.native
  def orOnNotIn(column1: String, values: js.Array[_]): JoinClause = js.native
  def orOnNotNull(column1: String): JoinClause = js.native
  def orOnNull(column1: String): JoinClause = js.native
  def `type`(`type`: String): JoinClause = js.native
  def using(column: String): JoinClause = js.native
  def using(column: js.Array[String]): JoinClause = js.native
  def using(column: StringDictionary[String | Raw[_]]): JoinClause = js.native
  def using(column: Raw[_]): JoinClause = js.native
}

