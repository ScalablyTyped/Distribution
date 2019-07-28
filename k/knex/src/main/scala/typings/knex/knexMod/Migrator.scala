package typings.knex.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Migrator extends js.Object {
  def currentVersion(): js.Promise[String] = js.native
  def currentVersion(config: MigratorConfig): js.Promise[String] = js.native
  def down(): js.Promise[_] = js.native
  def down(config: MigratorConfig): js.Promise[_] = js.native
  def latest(): js.Promise[_] = js.native
  def latest(config: MigratorConfig): js.Promise[_] = js.native
  def make(name: String): js.Promise[String] = js.native
  def make(name: String, config: MigratorConfig): js.Promise[String] = js.native
  def rollback(): js.Promise[_] = js.native
  def rollback(config: MigratorConfig): js.Promise[_] = js.native
  def rollback(config: MigratorConfig, all: Boolean): js.Promise[_] = js.native
  def status(): js.Promise[Double] = js.native
  def status(config: MigratorConfig): js.Promise[Double] = js.native
  def up(): js.Promise[_] = js.native
  def up(config: MigratorConfig): js.Promise[_] = js.native
}

