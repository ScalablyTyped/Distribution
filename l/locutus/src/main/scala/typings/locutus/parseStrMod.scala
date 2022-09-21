package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseStrMod {
  
  inline def apply(): Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Any]
  inline def apply(str: Any): Any = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def apply(str: Any, array: Any): Any = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(str: Unit, array: Any): Any = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("locutus/php/strings/parse_str", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
