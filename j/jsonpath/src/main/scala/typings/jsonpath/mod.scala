package typings.jsonpath

import typings.jsonpath.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonpath", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @JSName("apply")
  def apply(obj: js.Any, pathExpression: String, fn: js.Function1[/* x */ js.Any, _]): js.Array[Path] = js.native
  def nodes(obj: js.Any, pathExpression: String): js.Array[Path] = js.native
  def nodes(obj: js.Any, pathExpression: String, count: Double): js.Array[Path] = js.native
  def parent(obj: js.Any, pathExpression: String): js.Any = js.native
  def parse(pathExpression: String): js.Array[_] = js.native
  def paths(obj: js.Any, pathExpression: String): js.Array[js.Array[PathComponent]] = js.native
  def paths(obj: js.Any, pathExpression: String, count: Double): js.Array[js.Array[PathComponent]] = js.native
  def query(obj: js.Any, pathExpression: String): js.Array[_] = js.native
  def query(obj: js.Any, pathExpression: String, count: Double): js.Array[_] = js.native
  def stringify(path: js.Array[PathComponent]): String = js.native
  def value(obj: js.Any, pathExpression: String): js.Any = js.native
  def value[T](obj: js.Any, pathExpression: String, newValue: T): T = js.native
  type PathComponent = String | Double
}

