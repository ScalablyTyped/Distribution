package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phpPcreMod {
  
  @JSImport("locutus/php/pcre", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pregQuote(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("preg_quote")().asInstanceOf[Any]
  inline def pregQuote(str: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("preg_quote")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def pregQuote(str: Any, delimiter: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("preg_quote")(str.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def pregQuote(str: Unit, delimiter: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("preg_quote")(str.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def sqlRegcase(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("sql_regcase")().asInstanceOf[Any]
  inline def sqlRegcase(str: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("sql_regcase")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
}
