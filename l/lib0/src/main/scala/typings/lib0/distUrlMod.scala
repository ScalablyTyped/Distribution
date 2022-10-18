package typings.lib0

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUrlMod {
  
  @JSImport("lib0/dist/url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeQueryParams(url: String): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeQueryParams")(url.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  
  inline def encodeQueryParams(params: StringDictionary[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeQueryParams")(params.asInstanceOf[js.Any]).asInstanceOf[String]
}
