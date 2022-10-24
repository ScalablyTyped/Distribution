package typings.losslessJson

import typings.losslessJson.anon.CircularRefs
import typings.losslessJson.anon.CircularRefsBoolean
import typings.losslessJson.losslessJsonBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lossless-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lossless-json", "LosslessNumber")
  @js.native
  open class LosslessNumber protected () extends StObject {
    def this(value: String) = this()
    def this(value: Double) = this()
    
    var isLosslessNumber: `true` = js.native
    
    var `type`: typings.losslessJson.losslessJsonStrings.LosslessNumber = js.native
    
    // value as string
    var value: String = js.native
  }
  
  inline def config(): CircularRefsBoolean = ^.asInstanceOf[js.Dynamic].applyDynamic("config")().asInstanceOf[CircularRefsBoolean]
  inline def config(param0: CircularRefs): CircularRefsBoolean = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(param0.asInstanceOf[js.Any]).asInstanceOf[CircularRefsBoolean]
  
  inline def parse(text: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def parse(text: String, reviver: js.Function2[/* key */ String, /* value */ Any, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def stringify(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(value: Any, replacer: js.Array[String | Double]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: js.Array[String | Double], space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: js.Array[String | Double], space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: js.Function2[/* key */ String, /* value */ Any, Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: js.Function2[/* key */ String, /* value */ Any, Any], space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: js.Function2[/* key */ String, /* value */ Any, Any], space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
}
