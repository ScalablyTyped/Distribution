package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pcreMod {
  
  @JSImport("locutus/php/pcre", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pregQuote(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("preg_quote")().asInstanceOf[js.Any]
  inline def pregQuote(str: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("preg_quote")(str.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def pregQuote(str: js.Any, delimiter: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("preg_quote")(str.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def pregQuote(str: Unit, delimiter: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("preg_quote")(str.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def sqlRegcase(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("sql_regcase")().asInstanceOf[js.Any]
  inline def sqlRegcase(str: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("sql_regcase")(str.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
