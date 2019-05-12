package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableBuilder extends js.Object {
  def bigIncrements(): ColumnBuilder = js.native
  def bigIncrements(columnName: java.lang.String): ColumnBuilder = js.native
  def bigInteger(columnName: java.lang.String): ColumnBuilder = js.native
  def binary(columnName: java.lang.String): ColumnBuilder = js.native
  def binary(columnName: java.lang.String, length: scala.Double): ColumnBuilder = js.native
  def boolean(columnName: java.lang.String): ColumnBuilder = js.native
  def comment(`val`: java.lang.String): TableBuilder = js.native
  def date(columnName: java.lang.String): ColumnBuilder = js.native
  def dateTime(columnName: java.lang.String): ColumnBuilder = js.native
  def decimal(columnName: java.lang.String): ColumnBuilder = js.native
  def decimal(columnName: java.lang.String, precision: scala.Double): ColumnBuilder = js.native
  def decimal(columnName: java.lang.String, precision: scala.Double, scale: scala.Double): ColumnBuilder = js.native
  def decimal(columnName: java.lang.String, precision: scala.Null, scale: scala.Double): ColumnBuilder = js.native
  def dropColumn(columnName: java.lang.String): TableBuilder = js.native
  def dropColumns(columnNames: java.lang.String*): TableBuilder = js.native
  def dropForeign(columnNames: js.Array[java.lang.String]): TableBuilder = js.native
  def dropForeign(columnNames: js.Array[java.lang.String], foreignKeyName: java.lang.String): TableBuilder = js.native
  def dropIndex(columnNames: js.Array[java.lang.String | Raw[_]]): TableBuilder = js.native
  def dropIndex(columnNames: js.Array[java.lang.String | Raw[_]], indexName: java.lang.String): TableBuilder = js.native
  def dropPrimary(): TableBuilder = js.native
  def dropPrimary(constraintName: java.lang.String): TableBuilder = js.native
  def dropTimestamps(): ColumnBuilder = js.native
  def dropUnique(columnNames: js.Array[java.lang.String | Raw[_]]): TableBuilder = js.native
  def dropUnique(columnNames: js.Array[java.lang.String | Raw[_]], indexName: java.lang.String): TableBuilder = js.native
  def enu(columnName: java.lang.String, values: js.Array[Value]): ColumnBuilder = js.native
  def enu(columnName: java.lang.String, values: js.Array[Value], options: EnumOptions): ColumnBuilder = js.native
  def enum(columnName: java.lang.String, values: js.Array[Value]): ColumnBuilder = js.native
  def enum(columnName: java.lang.String, values: js.Array[Value], options: EnumOptions): ColumnBuilder = js.native
  def float(columnName: java.lang.String): ColumnBuilder = js.native
  def float(columnName: java.lang.String, precision: scala.Double): ColumnBuilder = js.native
  def float(columnName: java.lang.String, precision: scala.Double, scale: scala.Double): ColumnBuilder = js.native
  def foreign(column: java.lang.String): ForeignConstraintBuilder = js.native
  def foreign(column: java.lang.String, foreignKeyName: java.lang.String): ForeignConstraintBuilder = js.native
  def foreign(columns: js.Array[java.lang.String]): MultikeyForeignConstraintBuilder = js.native
  def foreign(columns: js.Array[java.lang.String], foreignKeyName: java.lang.String): MultikeyForeignConstraintBuilder = js.native
  def increments(): ColumnBuilder = js.native
  def increments(columnName: java.lang.String): ColumnBuilder = js.native
  def index(columnNames: js.Array[java.lang.String | Raw[_]]): TableBuilder = js.native
  def index(columnNames: js.Array[java.lang.String | Raw[_]], indexName: java.lang.String): TableBuilder = js.native
  def index(
    columnNames: js.Array[java.lang.String | Raw[_]],
    indexName: java.lang.String,
    indexType: java.lang.String
  ): TableBuilder = js.native
  def integer(columnName: java.lang.String): ColumnBuilder = js.native
  def integer(columnName: java.lang.String, length: scala.Double): ColumnBuilder = js.native
  def json(columnName: java.lang.String): ColumnBuilder = js.native
  def jsonb(columnName: java.lang.String): ColumnBuilder = js.native
  def primary(columnNames: js.Array[java.lang.String]): TableBuilder = js.native
  def primary(columnNames: js.Array[java.lang.String], constraintName: java.lang.String): TableBuilder = js.native
  def queryContext(context: js.Any): TableBuilder = js.native
  def renameColumn(from: java.lang.String, to: java.lang.String): ColumnBuilder = js.native
  def specificType(columnName: java.lang.String, `type`: java.lang.String): ColumnBuilder = js.native
  def string(columnName: java.lang.String): ColumnBuilder = js.native
  def string(columnName: java.lang.String, length: scala.Double): ColumnBuilder = js.native
  def text(columnName: java.lang.String): ColumnBuilder = js.native
  def text(columnName: java.lang.String, textType: java.lang.String): ColumnBuilder = js.native
  def time(columnName: java.lang.String): ColumnBuilder = js.native
  def timestamp(columnName: java.lang.String): ColumnBuilder = js.native
  def timestamp(columnName: java.lang.String, standard: scala.Boolean): ColumnBuilder = js.native
  def timestamps(): ColumnBuilder = js.native
  def timestamps(useTimestampType: scala.Boolean): ColumnBuilder = js.native
  def timestamps(useTimestampType: scala.Boolean, makeDefaultNow: scala.Boolean): ColumnBuilder = js.native
  def unique(columnNames: js.Array[java.lang.String | Raw[_]]): TableBuilder = js.native
  def unique(columnNames: js.Array[java.lang.String | Raw[_]], indexName: java.lang.String): TableBuilder = js.native
  def uuid(columnName: java.lang.String): ColumnBuilder = js.native
}

