package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knex", "Seeder")
@js.native
class Seeder protected () extends js.Object {
  def this(knex: Knex[_, js.Array[_]]) = this()
  def make(name: java.lang.String): bluebirdLib.bluebirdMod.^[java.lang.String] = js.native
  def make(name: java.lang.String, config: SeederConfig): bluebirdLib.bluebirdMod.^[java.lang.String] = js.native
  def run(): bluebirdLib.bluebirdMod.^[js.Array[java.lang.String]] = js.native
  def run(config: SeederConfig): bluebirdLib.bluebirdMod.^[js.Array[java.lang.String]] = js.native
  def setConfig(config: SeederConfig): SeederConfig = js.native
}

