package typings.jsplumb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsPlumbUtil {
  
  @JSImport("jsplumb", "jsPlumbUtil")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addWithFunction(list: js.Array[Any], item: Any, fn: js.Function1[/* obj */ Any, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addWithFunction")(list.asInstanceOf[js.Any], item.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def extend(target: js.Object, source: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def fastTrim(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fastTrim")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def findWithFunction(list: js.Array[Any], fn: js.Function1[/* obj */ Any, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findWithFunction")(list.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isArray(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBoolean(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDate(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmpty(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFunction(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNamedFunction(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNull(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumber(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def removeWithFunction(list: js.Array[Any], fn: js.Function1[/* obj */ Any, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("removeWithFunction")(list.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def suggest(list: js.Array[Any], item: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("suggest")(list.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def suggest(list: js.Array[Any], item: Any, insertAtHead: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("suggest")(list.asInstanceOf[js.Any], item.asInstanceOf[js.Any], insertAtHead.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def uuid(): UUID = ^.asInstanceOf[js.Dynamic].applyDynamic("uuid")().asInstanceOf[UUID]
}
