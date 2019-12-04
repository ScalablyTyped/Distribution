package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/diff", JSImport.Namespace)
@js.native
object libDiffMod extends js.Object {
  def diffPatch(filename: String, text1: String, text2: String): js.Promise[String] = js.native
}

