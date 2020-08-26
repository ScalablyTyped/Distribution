package typings.graphqlToolsLoadFiles.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/load-files", "loadFilesSync")
@js.native
object loadFilesSync extends js.Object {
  def apply[T](pattern: String): js.Array[T] = js.native
  def apply[T](pattern: String, options: LoadFilesOptions): js.Array[T] = js.native
  def apply[T](pattern: js.Array[String]): js.Array[T] = js.native
  def apply[T](pattern: js.Array[String], options: LoadFilesOptions): js.Array[T] = js.native
}

