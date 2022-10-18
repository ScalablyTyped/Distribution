package typings.lib0

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distJsonMod {
  
  @JSImport("lib0/dist/json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(text: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def parse(text: String, reviver: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def stringify(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(value: Any, replacer: js.Array[String | Double]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: js.Array[String | Double], space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: js.Array[String | Double], space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(
    value: Any,
    replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
    space: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(
    value: Any,
    replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
    space: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Null, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Null, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
}
