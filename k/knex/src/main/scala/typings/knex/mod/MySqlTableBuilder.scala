package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MySqlTableBuilder extends TableBuilder {
  def charset(`val`: String): CreateTableBuilder = js.native
  def collate(`val`: String): CreateTableBuilder = js.native
  def engine(`val`: String): CreateTableBuilder = js.native
}

