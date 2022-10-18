package typings.handsontable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersObjectMod {
  
  @JSImport("handsontable/helpers/object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clone_(`object`: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def createObjectPropListener(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("createObjectPropListener")().asInstanceOf[js.Object]
  inline def createObjectPropListener(defaultValue: Any): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("createObjectPropListener")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def createObjectPropListener(defaultValue: Any, propertyToListen: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("createObjectPropListener")(defaultValue.asInstanceOf[js.Any], propertyToListen.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def createObjectPropListener(defaultValue: Unit, propertyToListen: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("createObjectPropListener")(defaultValue.asInstanceOf[js.Any], propertyToListen.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def deepClone(obj: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("deepClone")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def deepExtend(target: js.Object, `extension`: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepExtend")(target.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deepObjectSize(`object`: js.Object): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("deepObjectSize")(`object`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def defineGetter(`object`: js.Object, property: Any, value: Any, options: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineGetter")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def duckSchema(`object`: js.Array[Any]): js.Array[Any] | js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("duckSchema")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any] | js.Object]
  inline def duckSchema(`object`: js.Object): js.Array[Any] | js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("duckSchema")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any] | js.Object]
  
  inline def extend(target: js.Object, `extension`: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def extend(target: js.Object, `extension`: js.Object, writableKeys: js.Array[String]): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], writableKeys.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def getProperty(`object`: js.Object, name: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getProperty")(`object`.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def hasOwnProperty_(`object`: js.Object, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def inherit(Child: js.Object, Parent: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("inherit")(Child.asInstanceOf[js.Any], Parent.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def isObject(`object`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObjectEqual(object1: js.Array[Any], object2: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectEqual")(object1.asInstanceOf[js.Any], object2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isObjectEqual(object1: js.Array[Any], object2: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectEqual")(object1.asInstanceOf[js.Any], object2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isObjectEqual(object1: js.Object, object2: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectEqual")(object1.asInstanceOf[js.Any], object2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isObjectEqual(object1: js.Object, object2: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectEqual")(object1.asInstanceOf[js.Any], object2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def mixin(Base: js.Object, mixins: js.Object*): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(scala.List(Base.asInstanceOf[js.Any]).`++`(mixins.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Object]
  
  inline def objectEach(
    `object`: js.Object,
    iteratee: js.Function3[/* value */ Any, /* key */ Any, /* object */ js.Object, Unit]
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("objectEach")(`object`.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def setProperty(`object`: js.Object, name: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setProperty")(`object`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
