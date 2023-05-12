package typings.lib0

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distObjectMod {
  
  @JSImport("lib0/dist/object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assign(target: js.Object, sources: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(scala.List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  inline def assign[T /* <: js.Object */, U](target: T, source: U): T & U = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & U]
  inline def assign[T_1 /* <: js.Object */, U_1, V](target: T_1, source1: U_1, source2: V): T_1 & U_1 & V = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any])).asInstanceOf[T_1 & U_1 & V]
  inline def assign[T_2 /* <: js.Object */, U_2, V_1, W](target: T_2, source1: U_2, source2: V_1, source3: W): T_2 & U_2 & V_1 & W = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], source3.asInstanceOf[js.Any])).asInstanceOf[T_2 & U_2 & V_1 & W]
  
  inline def create(): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[StringDictionary[Any]]
  
  inline def equalFlat(a: StringDictionary[Any], b: StringDictionary[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalFlat")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def every(obj: StringDictionary[Any], f: js.Function2[/* arg0 */ Any, /* arg1 */ String, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(obj.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def forEach[V](obj: StringDictionary[V], f: js.Function2[/* arg0 */ V, /* arg1 */ String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(obj.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def hasProperty(obj: Any, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasProperty")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasProperty(obj: Any, key: js.Symbol): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasProperty")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isEmpty(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")().asInstanceOf[Boolean]
  inline def isEmpty(obj: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def keys(o: js.Object): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(o.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def length(obj: StringDictionary[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(obj.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def map[R](obj: StringDictionary[Any], f: js.Function2[/* arg0 */ Any, /* arg1 */ String, R]): js.Array[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(obj.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Array[R]]
  
  inline def some(obj: StringDictionary[Any], f: js.Function2[/* arg0 */ Any, /* arg1 */ String, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(obj.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
