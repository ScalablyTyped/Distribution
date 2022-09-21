package typings.jsonpath

import typings.jsonpath.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonpath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def apply(obj: Any, pathExpression: String, fn: js.Function1[/* x */ Any, Any]): js.Array[Path] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(obj.asInstanceOf[js.Any], pathExpression.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[Path]]
  
  inline def nodes(obj: Any, pathExpression: String): js.Array[Path] = (^.asInstanceOf[js.Dynamic].applyDynamic("nodes")(obj.asInstanceOf[js.Any], pathExpression.asInstanceOf[js.Any])).asInstanceOf[js.Array[Path]]
  inline def nodes(obj: Any, pathExpression: String, count: Double): js.Array[Path] = (^.asInstanceOf[js.Dynamic].applyDynamic("nodes")(obj.asInstanceOf[js.Any], pathExpression.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[Path]]
  
  inline def parent(obj: Any, pathExpression: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parent")(obj.asInstanceOf[js.Any], pathExpression.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def parse(pathExpression: String): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(pathExpression.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def paths(obj: Any, pathExpression: String): js.Array[js.Array[PathComponent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("paths")(obj.asInstanceOf[js.Any], pathExpression.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[PathComponent]]]
  inline def paths(obj: Any, pathExpression: String, count: Double): js.Array[js.Array[PathComponent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("paths")(obj.asInstanceOf[js.Any], pathExpression.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[PathComponent]]]
  
  inline def query(obj: Any, pathExpression: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(obj.asInstanceOf[js.Any], pathExpression.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def query(obj: Any, pathExpression: String, count: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(obj.asInstanceOf[js.Any], pathExpression.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def stringify(path: js.Array[PathComponent]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def value(obj: Any, pathExpression: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("value")(obj.asInstanceOf[js.Any], pathExpression.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def value[T](obj: Any, pathExpression: String, newValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("value")(obj.asInstanceOf[js.Any], pathExpression.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any])).asInstanceOf[T]
  
  type PathComponent = String | Double
}
