package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Migrator extends js.Object {
  def currentVersion(): js.Promise[java.lang.String] = js.native
  def currentVersion(config: MigratorConfig): js.Promise[java.lang.String] = js.native
  def down(): js.Promise[_] = js.native
  def down(config: MigratorConfig): js.Promise[_] = js.native
  def latest(): js.Promise[_] = js.native
  def latest(config: MigratorConfig): js.Promise[_] = js.native
  def make(name: java.lang.String): js.Promise[java.lang.String] = js.native
  def make(name: java.lang.String, config: MigratorConfig): js.Promise[java.lang.String] = js.native
  def rollback(): js.Promise[_] = js.native
  def rollback(config: MigratorConfig): js.Promise[_] = js.native
  def rollback(config: MigratorConfig, all: scala.Boolean): js.Promise[_] = js.native
  def status(): js.Promise[scala.Double] = js.native
  def status(config: MigratorConfig): js.Promise[scala.Double] = js.native
  def up(): js.Promise[_] = js.native
  def up(config: MigratorConfig): js.Promise[_] = js.native
}

