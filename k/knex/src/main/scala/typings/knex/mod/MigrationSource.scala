package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationSource[TMigrationSpec] extends js.Object {
  def getMigration(migration: TMigrationSpec): Migration
  def getMigrationName(migration: TMigrationSpec): String
  def getMigrations(loadExtensions: js.Array[String]): js.Promise[js.Array[TMigrationSpec]]
}

object MigrationSource {
  @scala.inline
  def apply[TMigrationSpec](
    getMigration: TMigrationSpec => Migration,
    getMigrationName: TMigrationSpec => String,
    getMigrations: js.Array[String] => js.Promise[js.Array[TMigrationSpec]]
  ): MigrationSource[TMigrationSpec] = {
    val __obj = js.Dynamic.literal(getMigration = js.Any.fromFunction1(getMigration), getMigrationName = js.Any.fromFunction1(getMigrationName), getMigrations = js.Any.fromFunction1(getMigrations))
    __obj.asInstanceOf[MigrationSource[TMigrationSpec]]
  }
}

