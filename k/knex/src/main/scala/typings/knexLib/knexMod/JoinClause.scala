package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JoinClause extends js.Object {
  def andOn(callback: JoinCallback): JoinClause = js.native
  def andOn(column1: java.lang.String, column2: java.lang.String): JoinClause = js.native
  def andOn(column1: java.lang.String, operator: java.lang.String, column2: java.lang.String): JoinClause = js.native
  def andOn(column1: java.lang.String, operator: java.lang.String, column2: Raw[_]): JoinClause = js.native
  def andOn(column1: java.lang.String, raw: Raw[_]): JoinClause = js.native
  def andOn(columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | Raw[_]]): JoinClause = js.native
  def andOn(raw: Raw[_]): JoinClause = js.native
  def andOnBetween(column1: java.lang.String, range: js.Tuple2[_, _]): JoinClause = js.native
  def andOnExists(callback: QueryCallback[_, js.Array[_]]): JoinClause = js.native
  def andOnIn(column1: java.lang.String, values: js.Array[_]): JoinClause = js.native
  def andOnNotBetween(column1: java.lang.String, range: js.Tuple2[_, _]): JoinClause = js.native
  def andOnNotExists(callback: QueryCallback[_, js.Array[_]]): JoinClause = js.native
  def andOnNotIn(column1: java.lang.String, values: js.Array[_]): JoinClause = js.native
  def andOnNotNull(column1: java.lang.String): JoinClause = js.native
  def andOnNull(column1: java.lang.String): JoinClause = js.native
  def on(callback: JoinCallback): JoinClause = js.native
  def on(column1: java.lang.String, column2: java.lang.String): JoinClause = js.native
  def on(column1: java.lang.String, operator: java.lang.String, column2: java.lang.String): JoinClause = js.native
  def on(column1: java.lang.String, operator: java.lang.String, column2: Raw[_]): JoinClause = js.native
  def on(column1: java.lang.String, raw: Raw[_]): JoinClause = js.native
  def on(columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | Raw[_]]): JoinClause = js.native
  def on(raw: Raw[_]): JoinClause = js.native
  def onBetween(column1: java.lang.String, range: js.Tuple2[_, _]): JoinClause = js.native
  def onExists(callback: QueryCallback[_, js.Array[_]]): JoinClause = js.native
  def onIn(column1: java.lang.String, values: js.Array[_]): JoinClause = js.native
  def onNotBetween(column1: java.lang.String, range: js.Tuple2[_, _]): JoinClause = js.native
  def onNotExists(callback: QueryCallback[_, js.Array[_]]): JoinClause = js.native
  def onNotIn(column1: java.lang.String, values: js.Array[_]): JoinClause = js.native
  def onNotNull(column1: java.lang.String): JoinClause = js.native
  def onNull(column1: java.lang.String): JoinClause = js.native
  def orOn(callback: JoinCallback): JoinClause = js.native
  def orOn(column1: java.lang.String, column2: java.lang.String): JoinClause = js.native
  def orOn(column1: java.lang.String, operator: java.lang.String, column2: java.lang.String): JoinClause = js.native
  def orOn(column1: java.lang.String, operator: java.lang.String, column2: Raw[_]): JoinClause = js.native
  def orOn(column1: java.lang.String, raw: Raw[_]): JoinClause = js.native
  def orOn(columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | Raw[_]]): JoinClause = js.native
  def orOn(raw: Raw[_]): JoinClause = js.native
  def orOnBetween(column1: java.lang.String, range: js.Tuple2[_, _]): JoinClause = js.native
  def orOnExists(callback: QueryCallback[_, js.Array[_]]): JoinClause = js.native
  def orOnIn(column1: java.lang.String, values: js.Array[_]): JoinClause = js.native
  def orOnNotBetween(column1: java.lang.String, range: js.Tuple2[_, _]): JoinClause = js.native
  def orOnNotExists(callback: QueryCallback[_, js.Array[_]]): JoinClause = js.native
  def orOnNotIn(column1: java.lang.String, values: js.Array[_]): JoinClause = js.native
  def orOnNotNull(column1: java.lang.String): JoinClause = js.native
  def orOnNull(column1: java.lang.String): JoinClause = js.native
  def `type`(`type`: java.lang.String): JoinClause = js.native
  def using(column: java.lang.String): JoinClause = js.native
  def using(column: js.Array[java.lang.String]): JoinClause = js.native
  def using(column: Raw[_]): JoinClause = js.native
  def using(column: org.scalablytyped.runtime.StringDictionary[java.lang.String | Raw[_]]): JoinClause = js.native
}

