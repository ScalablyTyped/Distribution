package typings
package lovefieldLib.lovefieldMod.lfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  def attach(query: lovefieldLib.lovefieldMod.lfNs.queryNs.Builder): js.Promise[js.Array[js.Object]]
  def begin(scope: js.Array[lovefieldLib.lovefieldMod.lfNs.schemaNs.Table]): js.Promise[scala.Unit]
  def commit(): js.Promise[scala.Unit]
  def exec(queries: js.Array[lovefieldLib.lovefieldMod.lfNs.queryNs.Builder]): js.Promise[js.Array[js.Array[js.Object]]]
  def rollback(): js.Promise[scala.Unit]
  def stats(): TransactionStats
}

