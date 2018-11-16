package typings
package knexLib.knexMod.KnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Migrator extends js.Object {
  def currentVersion(): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def currentVersion(config: MigratorConfig): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def latest(): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def latest(config: MigratorConfig): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def make(name: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def make(name: java.lang.String, config: MigratorConfig): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def rollback(): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def rollback(config: MigratorConfig): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def status(): bluebirdLib.bluebirdMod.namespaced[scala.Double] = js.native
  def status(config: MigratorConfig): bluebirdLib.bluebirdMod.namespaced[scala.Double] = js.native
}

