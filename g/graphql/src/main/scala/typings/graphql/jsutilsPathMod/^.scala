package typings.graphql.jsutilsPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/jsutils/Path", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addPath(prev: js.UndefOr[scala.Nothing], key: String): Path = js.native
  def addPath(prev: js.UndefOr[scala.Nothing], key: Double): Path = js.native
  def addPath(prev: Path, key: String): Path = js.native
  def addPath(prev: Path, key: Double): Path = js.native
  def pathToArray(path: Path): js.Array[String | Double] = js.native
}

