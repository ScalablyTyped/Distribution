package typings.hapiHoek

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStringifyMod {
  
  inline def apply(value: Any): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(value: Any, replacer: Any): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(value: Any, replacer: Any, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(value: Any, replacer: Any, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(value: Any, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(value: Any, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@hapi/hoek/lib/stringify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
