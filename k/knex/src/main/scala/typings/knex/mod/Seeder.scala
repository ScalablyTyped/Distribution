package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knex", "Seeder")
@js.native
class Seeder protected () extends js.Object {
  def this(knex: Knex[_, js.Array[_]]) = this()
  def make(name: String): js.Promise[String] = js.native
  def make(name: String, config: SeederConfig): js.Promise[String] = js.native
  def run(): js.Promise[js.Array[js.Array[String]]] = js.native
  def run(config: SeederConfig): js.Promise[js.Array[js.Array[String]]] = js.native
  def setConfig(config: SeederConfig): SeederConfig = js.native
}

