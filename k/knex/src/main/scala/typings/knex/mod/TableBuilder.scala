package typings.knex.mod

import typings.knex.AnonPrecision
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableBuilder extends js.Object {
  def bigIncrements(): ColumnBuilder = js.native
  def bigIncrements(columnName: String): ColumnBuilder = js.native
  def bigInteger(columnName: String): ColumnBuilder = js.native
  def binary(columnName: String): ColumnBuilder = js.native
  def binary(columnName: String, length: Double): ColumnBuilder = js.native
  def boolean(columnName: String): ColumnBuilder = js.native
  def comment(`val`: String): TableBuilder = js.native
  def date(columnName: String): ColumnBuilder = js.native
  def dateTime(columnName: String): ColumnBuilder = js.native
  def dateTime(columnName: String, options: AnonPrecision): ColumnBuilder = js.native
  def decimal(columnName: String): ColumnBuilder = js.native
  def decimal(columnName: String, precision: Double): ColumnBuilder = js.native
  def decimal(columnName: String, precision: Double, scale: Double): ColumnBuilder = js.native
  def decimal(columnName: String, precision: Null, scale: Double): ColumnBuilder = js.native
  def dropColumn(columnName: String): TableBuilder = js.native
  def dropColumns(columnNames: String*): TableBuilder = js.native
  def dropForeign(columnNames: js.Array[String]): TableBuilder = js.native
  def dropForeign(columnNames: js.Array[String], foreignKeyName: String): TableBuilder = js.native
  def dropIndex(columnNames: String): TableBuilder = js.native
  def dropIndex(columnNames: String, indexName: String): TableBuilder = js.native
  def dropIndex(columnNames: js.Array[String | Raw[_]]): TableBuilder = js.native
  def dropIndex(columnNames: js.Array[String | Raw[_]], indexName: String): TableBuilder = js.native
  def dropPrimary(): TableBuilder = js.native
  def dropPrimary(constraintName: String): TableBuilder = js.native
  def dropTimestamps(): ColumnBuilder = js.native
  def dropUnique(columnNames: js.Array[String | Raw[_]]): TableBuilder = js.native
  def dropUnique(columnNames: js.Array[String | Raw[_]], indexName: String): TableBuilder = js.native
  def enu(columnName: String, values: js.Array[Value]): ColumnBuilder = js.native
  def enu(columnName: String, values: js.Array[Value], options: EnumOptions): ColumnBuilder = js.native
  def enum(columnName: String, values: js.Array[Value]): ColumnBuilder = js.native
  def enum(columnName: String, values: js.Array[Value], options: EnumOptions): ColumnBuilder = js.native
  def float(columnName: String): ColumnBuilder = js.native
  def float(columnName: String, precision: Double): ColumnBuilder = js.native
  def float(columnName: String, precision: Double, scale: Double): ColumnBuilder = js.native
  def foreign(column: String): ForeignConstraintBuilder = js.native
  def foreign(column: String, foreignKeyName: String): ForeignConstraintBuilder = js.native
  def foreign(columns: js.Array[String]): MultikeyForeignConstraintBuilder = js.native
  def foreign(columns: js.Array[String], foreignKeyName: String): MultikeyForeignConstraintBuilder = js.native
  def increments(): ColumnBuilder = js.native
  def increments(columnName: String): ColumnBuilder = js.native
  def index(columnNames: String): TableBuilder = js.native
  def index(columnNames: String, indexName: String): TableBuilder = js.native
  def index(columnNames: String, indexName: String, indexType: String): TableBuilder = js.native
  def index(columnNames: js.Array[String | Raw[_]]): TableBuilder = js.native
  def index(columnNames: js.Array[String | Raw[_]], indexName: String): TableBuilder = js.native
  def index(columnNames: js.Array[String | Raw[_]], indexName: String, indexType: String): TableBuilder = js.native
  def integer(columnName: String): ColumnBuilder = js.native
  def integer(columnName: String, length: Double): ColumnBuilder = js.native
  def json(columnName: String): ColumnBuilder = js.native
  def jsonb(columnName: String): ColumnBuilder = js.native
  def primary(columnNames: js.Array[String]): TableBuilder = js.native
  def primary(columnNames: js.Array[String], constraintName: String): TableBuilder = js.native
  def queryContext(context: js.Any): TableBuilder = js.native
  def renameColumn(from: String, to: String): ColumnBuilder = js.native
  def specificType(columnName: String, `type`: String): ColumnBuilder = js.native
  def string(columnName: String): ColumnBuilder = js.native
  def string(columnName: String, length: Double): ColumnBuilder = js.native
  def text(columnName: String): ColumnBuilder = js.native
  def text(columnName: String, textType: String): ColumnBuilder = js.native
  def time(columnName: String): ColumnBuilder = js.native
  def timestamp(columnName: String): ColumnBuilder = js.native
  def timestamp(columnName: String, options: AnonPrecision): ColumnBuilder = js.native
  def timestamp(columnName: String, withoutTz: Boolean): ColumnBuilder = js.native
  def timestamp(columnName: String, withoutTz: Boolean, precision: Double): ColumnBuilder = js.native
  def timestamps(): ColumnBuilder = js.native
  def timestamps(useTimestampType: Boolean): ColumnBuilder = js.native
  def timestamps(useTimestampType: Boolean, makeDefaultNow: Boolean): ColumnBuilder = js.native
  def unique(columnNames: js.Array[String | Raw[_]]): TableBuilder = js.native
  def unique(columnNames: js.Array[String | Raw[_]], indexName: String): TableBuilder = js.native
  def uuid(columnName: String): ColumnBuilder = js.native
}

