package typings
package lovefieldLib.lovefieldMod.lfNs.queryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Insert extends Builder {
  def into(table: lovefieldLib.lovefieldMod.lfNs.schemaNs.Table): Insert = js.native
  def values(rows: js.Array[lovefieldLib.lovefieldMod.lfNs.Binder | lovefieldLib.lovefieldMod.lfNs.Row]): Insert = js.native
  def values(rows: lovefieldLib.lovefieldMod.lfNs.Binder): Insert = js.native
}

