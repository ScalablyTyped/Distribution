package typings
package lovefieldLib.lovefieldMod.queryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Insert extends Builder {
  def into(table: lovefieldLib.lovefieldMod.schemaNs.Table): Insert = js.native
  def values(rows: js.Array[lovefieldLib.lovefieldMod.Binder | lovefieldLib.lovefieldMod.Row]): Insert = js.native
  def values(rows: lovefieldLib.lovefieldMod.Binder): Insert = js.native
}

