package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Schema builder
//
@js.native
trait SchemaBuilder extends ChainableInterface[Unit] {
  def alterTable(tableName: String, callback: js.Function1[/* tableBuilder */ CreateTableBuilder, _]): SchemaBuilder = js.native
  def createSchema(schemaName: String): SchemaBuilder = js.native
  def createSchemaIfNotExists(schemaName: String): SchemaBuilder = js.native
  def createTable(tableName: String, callback: js.Function1[/* tableBuilder */ CreateTableBuilder, _]): SchemaBuilder = js.native
  def createTableIfNotExists(tableName: String, callback: js.Function1[/* tableBuilder */ CreateTableBuilder, _]): SchemaBuilder = js.native
  def dropSchema(schemaName: String): SchemaBuilder = js.native
  def dropSchemaIfExists(schemaName: String): SchemaBuilder = js.native
  def dropTable(tableName: String): SchemaBuilder = js.native
  def dropTableIfExists(tableName: String): SchemaBuilder = js.native
  def hasColumn(tableName: String, columnName: String): js.Promise[Boolean] = js.native
  def hasTable(tableName: String): js.Promise[Boolean] = js.native
  def queryContext(context: js.Any): SchemaBuilder = js.native
  def raw(statement: String): SchemaBuilder = js.native
  def renameTable(oldTableName: String, newTableName: String): js.Promise[Unit] = js.native
  def table(tableName: String, callback: js.Function1[/* tableBuilder */ AlterTableBuilder, _]): js.Promise[Unit] = js.native
  def toSQL(): Sql = js.native
  def withSchema(schemaName: String): SchemaBuilder = js.native
}

