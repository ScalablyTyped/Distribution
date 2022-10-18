package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phpJsonMod {
  
  @JSImport("locutus/php/json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def jsonDecode(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("json_decode")().asInstanceOf[Any]
  inline def jsonDecode(strJson: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("json_decode")(strJson.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def jsonEncode(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("json_encode")().asInstanceOf[Any]
  inline def jsonEncode(mixedVal: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("json_encode")(mixedVal.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def jsonLastError(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("json_last_error")().asInstanceOf[Any]
}
