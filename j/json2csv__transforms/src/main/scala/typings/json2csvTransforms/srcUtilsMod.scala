package typings.json2csvTransforms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsMod {
  
  @JSImport("@json2csv/transforms/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flattenReducer[T](acc: js.Array[T], arr: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenReducer")(acc.asInstanceOf[js.Any], arr.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def setProp(obj: Any, path: String, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setProp")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def setProp(obj: Any, path: js.Array[String], value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setProp")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def unsetProp(obj: Any, path: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unsetProp")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def unsetProp(obj: Any, path: js.Array[String]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unsetProp")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
}
