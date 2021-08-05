package typings.jsplumb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsPlumbUtil {
  
  @JSImport("jsplumb", "jsPlumbUtil")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addWithFunction(list: js.Array[js.Any], item: js.Any, fn: js.Function1[/* obj */ js.Any, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addWithFunction")(list.asInstanceOf[js.Any], item.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def extend(target: js.Object, source: js.Object): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def fastTrim(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fastTrim")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def findWithFunction(list: js.Array[js.Any], fn: js.Function1[/* obj */ js.Any, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findWithFunction")(list.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isArray(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBoolean(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDate(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmpty(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFunction(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNamedFunction(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNull(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumber(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def removeWithFunction(list: js.Array[js.Any], fn: js.Function1[/* obj */ js.Any, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("removeWithFunction")(list.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def suggest(list: js.Array[js.Any], item: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("suggest")(list.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def suggest(list: js.Array[js.Any], item: js.Any, insertAtHead: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("suggest")(list.asInstanceOf[js.Any], item.asInstanceOf[js.Any], insertAtHead.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def uuid(): UUID = ^.asInstanceOf[js.Dynamic].applyDynamic("uuid")().asInstanceOf[UUID]
}
