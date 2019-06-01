package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Migrator extends js.Object {
  def currentVersion(): bluebirdLib.bluebirdMod.^[java.lang.String] = js.native
  def currentVersion(config: MigratorConfig): bluebirdLib.bluebirdMod.^[java.lang.String] = js.native
  def down(): bluebirdLib.bluebirdMod.^[_] = js.native
  def down(config: MigratorConfig): bluebirdLib.bluebirdMod.^[_] = js.native
  def latest(): bluebirdLib.bluebirdMod.^[_] = js.native
  def latest(config: MigratorConfig): bluebirdLib.bluebirdMod.^[_] = js.native
  def make(name: java.lang.String): bluebirdLib.bluebirdMod.^[java.lang.String] = js.native
  def make(name: java.lang.String, config: MigratorConfig): bluebirdLib.bluebirdMod.^[java.lang.String] = js.native
  def rollback(): bluebirdLib.bluebirdMod.^[_] = js.native
  def rollback(config: MigratorConfig): bluebirdLib.bluebirdMod.^[_] = js.native
  def rollback(config: MigratorConfig, all: scala.Boolean): bluebirdLib.bluebirdMod.^[_] = js.native
  def status(): bluebirdLib.bluebirdMod.^[scala.Double] = js.native
  def status(config: MigratorConfig): bluebirdLib.bluebirdMod.^[scala.Double] = js.native
  def up(): bluebirdLib.bluebirdMod.^[_] = js.native
  def up(config: MigratorConfig): bluebirdLib.bluebirdMod.^[_] = js.native
}

