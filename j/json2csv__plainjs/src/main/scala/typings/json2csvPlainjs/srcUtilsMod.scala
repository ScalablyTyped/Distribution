package typings.json2csvPlainjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsMod {
  
  @JSImport("@json2csv/plainjs/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fastJoin(arr: js.Array[Any], separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fastJoin")(arr.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def flattenReducer[T](acc: js.Array[T], arr: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenReducer")(acc.asInstanceOf[js.Any], arr.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def getProp(obj: Any, path: String, defaultValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getProp")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Any]
}
