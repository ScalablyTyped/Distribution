package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Schema builder
//
@js.native
trait SchemaBuilder
  extends ChainableInterface[scala.Unit] {
  def alterTable(tableName: java.lang.String, callback: js.Function1[/* tableBuilder */ CreateTableBuilder, _]): SchemaBuilder = js.native
  def createTable(tableName: java.lang.String, callback: js.Function1[/* tableBuilder */ CreateTableBuilder, _]): SchemaBuilder = js.native
  def createTableIfNotExists(tableName: java.lang.String, callback: js.Function1[/* tableBuilder */ CreateTableBuilder, _]): SchemaBuilder = js.native
  def dropTable(tableName: java.lang.String): SchemaBuilder = js.native
  def dropTableIfExists(tableName: java.lang.String): SchemaBuilder = js.native
  def hasColumn(tableName: java.lang.String, columnName: java.lang.String): js.Promise[scala.Boolean] = js.native
  def hasTable(tableName: java.lang.String): js.Promise[scala.Boolean] = js.native
  def queryContext(context: js.Any): SchemaBuilder = js.native
  def raw(statement: java.lang.String): SchemaBuilder = js.native
  def renameTable(oldTableName: java.lang.String, newTableName: java.lang.String): js.Promise[scala.Unit] = js.native
  def table(tableName: java.lang.String, callback: js.Function1[/* tableBuilder */ AlterTableBuilder, _]): js.Promise[scala.Unit] = js.native
  def withSchema(schemaName: java.lang.String): SchemaBuilder = js.native
}

