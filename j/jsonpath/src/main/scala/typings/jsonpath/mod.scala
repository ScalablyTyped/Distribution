package typings.jsonpath

import typings.jsonpath.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonpath", "apply")
  @js.native
  def apply(obj: js.Any, pathExpression: String, fn: js.Function1[/* x */ js.Any, _]): js.Array[Path] = js.native
  
  @JSImport("jsonpath", "nodes")
  @js.native
  def nodes(obj: js.Any, pathExpression: String): js.Array[Path] = js.native
  @JSImport("jsonpath", "nodes")
  @js.native
  def nodes(obj: js.Any, pathExpression: String, count: Double): js.Array[Path] = js.native
  
  @JSImport("jsonpath", "parent")
  @js.native
  def parent(obj: js.Any, pathExpression: String): js.Any = js.native
  
  @JSImport("jsonpath", "parse")
  @js.native
  def parse(pathExpression: String): js.Array[_] = js.native
  
  @JSImport("jsonpath", "paths")
  @js.native
  def paths(obj: js.Any, pathExpression: String): js.Array[js.Array[PathComponent]] = js.native
  @JSImport("jsonpath", "paths")
  @js.native
  def paths(obj: js.Any, pathExpression: String, count: Double): js.Array[js.Array[PathComponent]] = js.native
  
  @JSImport("jsonpath", "query")
  @js.native
  def query(obj: js.Any, pathExpression: String): js.Array[_] = js.native
  @JSImport("jsonpath", "query")
  @js.native
  def query(obj: js.Any, pathExpression: String, count: Double): js.Array[_] = js.native
  
  @JSImport("jsonpath", "stringify")
  @js.native
  def stringify(path: js.Array[PathComponent]): String = js.native
  
  @JSImport("jsonpath", "value")
  @js.native
  def value(obj: js.Any, pathExpression: String): js.Any = js.native
  @JSImport("jsonpath", "value")
  @js.native
  def value[T](obj: js.Any, pathExpression: String, newValue: T): T = js.native
  
  type PathComponent = String | Double
}
