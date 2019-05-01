package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Join extends js.Object {
  def apply(raw: Raw): QueryBuilder = js.native
  def apply(tableName: Identifier, clause: JoinCallback): QueryBuilder = js.native
  def apply(tableName: Identifier, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def apply(
    tableName: Identifier,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def apply(tableName: Identifier, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def apply(
    tableName: Identifier,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def apply(tableName: Identifier, raw: Raw): QueryBuilder = js.native
  def apply(tableName: QueryCallback, clause: JoinCallback): QueryBuilder = js.native
  def apply(tableName: QueryCallback, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def apply(
    tableName: QueryCallback,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def apply(tableName: QueryCallback, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def apply(
    tableName: QueryCallback,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def apply(tableName: QueryCallback, raw: Raw): QueryBuilder = js.native
  def apply(tableName: TableName, clause: JoinCallback): QueryBuilder = js.native
  def apply(tableName: TableName, column1: java.lang.String, column2: java.lang.String): QueryBuilder = js.native
  def apply(
    tableName: TableName,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
  def apply(tableName: TableName, column1: java.lang.String, raw: Raw): QueryBuilder = js.native
  def apply(
    tableName: TableName,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | Raw]
  ): QueryBuilder = js.native
  def apply(tableName: TableName, raw: Raw): QueryBuilder = js.native
}

