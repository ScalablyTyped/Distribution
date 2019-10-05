package typings.lovefield.lovefieldMod.query

import typings.lovefield.lovefieldMod.Binder
import typings.lovefield.lovefieldMod.Row
import typings.lovefield.lovefieldMod.schema.Table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Insert extends Builder {
  def into(table: Table): Insert = js.native
  def values(rows: js.Array[Binder | Row]): Insert = js.native
  def values(rows: Binder): Insert = js.native
}

