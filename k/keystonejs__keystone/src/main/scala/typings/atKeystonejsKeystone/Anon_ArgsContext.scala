package typings.atKeystonejsKeystone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArgsContext[Record /* <: js.Object */] extends js.Object {
  def getList(key: String): Anon_Args = js.native
  def query(args: js.Any, context: js.Any): js.Promise[Record] = js.native
  def query(args: js.Any, context: js.Any, options: Anon_SkipAccessControl): js.Promise[Record] = js.native
  def queryMany(args: js.Any, context: js.Any): js.Promise[js.Array[Record]] = js.native
  def queryMany(args: js.Any, context: js.Any, options: Anon_SkipAccessControl): js.Promise[js.Array[Record]] = js.native
  def queryManyMeta(args: js.Any, context: js.Any): js.Promise[Anon_Count] = js.native
  def queryManyMeta(args: js.Any, context: js.Any, options: Anon_SkipAccessControl): js.Promise[Anon_Count] = js.native
}

