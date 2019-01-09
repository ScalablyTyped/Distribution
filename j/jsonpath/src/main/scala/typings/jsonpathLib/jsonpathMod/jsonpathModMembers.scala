package typings
package jsonpathLib.jsonpathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonpath", JSImport.Namespace)
@js.native
object jsonpathModMembers extends js.Object {
  @JSName("apply")
  def apply(obj: js.Any, pathExpression: java.lang.String, fn: js.Function1[/* x */ js.Any, _]): js.Array[jsonpathLib.Anon_Path] = js.native
  def nodes(obj: js.Any, pathExpression: java.lang.String): js.Array[jsonpathLib.Anon_Path] = js.native
  def nodes(obj: js.Any, pathExpression: java.lang.String, count: scala.Double): js.Array[jsonpathLib.Anon_Path] = js.native
  def parent(obj: js.Any, pathExpression: java.lang.String): js.Any = js.native
  def parse(pathExpression: java.lang.String): js.Array[_] = js.native
  def paths(obj: js.Any, pathExpression: java.lang.String): js.Array[js.Array[jsonpathLib.PathComponent]] = js.native
  def paths(obj: js.Any, pathExpression: java.lang.String, count: scala.Double): js.Array[js.Array[jsonpathLib.PathComponent]] = js.native
  def query(obj: js.Any, pathExpression: java.lang.String): js.Array[_] = js.native
  def query(obj: js.Any, pathExpression: java.lang.String, count: scala.Double): js.Array[_] = js.native
  def stringify(path: js.Array[jsonpathLib.PathComponent]): java.lang.String = js.native
  def value(obj: js.Any, pathExpression: java.lang.String): js.Any = js.native
  def value[T](obj: js.Any, pathExpression: java.lang.String, newValue: T): T = js.native
}

