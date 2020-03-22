package typings.knexDbManager.mod

import typings.knex.mod.QueryBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnexDbManager extends js.Object {
  def close(): js.Promise[Unit] = js.native
  def closeKnex(): js.Promise[Unit] = js.native
  def copyDb(): js.Promise[Unit] = js.native
  def copyDb(fromDbName: String): js.Promise[Unit] = js.native
  def copyDb(fromDbName: String, toDbName: String): js.Promise[Unit] = js.native
  def createDb(): js.Promise[Unit] = js.native
  def createDb(dbName: String): js.Promise[Unit] = js.native
  def createDbOwnerIfNotExist(): js.Promise[Unit] = js.native
  def dbVersion(): js.Promise[String] = js.native
  def dropDb(): js.Promise[Unit] = js.native
  def dropDb(dbName: String): js.Promise[Unit] = js.native
  def knexInstance(): QueryBuilder[_, _] = js.native
  def migrateDb(): js.Promise[Unit] = js.native
  def populateDb(glob: String): js.Promise[Unit] = js.native
  def truncateDb(): js.Promise[Unit] = js.native
  def truncateDb(ignoreTables: js.Array[String]): js.Promise[Unit] = js.native
  def updateIdSequences(): js.Promise[Unit] = js.native
}

