package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlMod {
  
  @JSImport("locutus/php/xml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def utf8Decode(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("utf8_decode")().asInstanceOf[Any]
  inline def utf8Decode(strData: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("utf8_decode")(strData.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def utf8Encode(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("utf8_encode")().asInstanceOf[Any]
  inline def utf8Encode(argString: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("utf8_encode")(argString.asInstanceOf[js.Any]).asInstanceOf[Any]
}
