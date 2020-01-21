package typings.keya

import typings.keya.sqliteMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keya/out/node/main", JSImport.Namespace)
@js.native
object nodeMainMod extends js.Object {
  def store(name: String): js.Promise[default] = js.native
  def stores(): js.Promise[js.Array[String]] = js.native
}

