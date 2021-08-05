package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlMod {
  
  @JSImport("locutus/php/xml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def utf8Decode(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("utf8_decode")().asInstanceOf[js.Any]
  inline def utf8Decode(strData: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("utf8_decode")(strData.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def utf8Encode(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("utf8_encode")().asInstanceOf[js.Any]
  inline def utf8Encode(argString: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("utf8_encode")(argString.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
