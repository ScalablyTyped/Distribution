package typings.keya

import typings.keya.outNodeSqliteMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keya/out/node/main", JSImport.Namespace)
@js.native
object outNodeMainMod extends js.Object {
  def store(name: String): js.Promise[default] = js.native
  def stores(): js.Promise[js.Array[String]] = js.native
}

