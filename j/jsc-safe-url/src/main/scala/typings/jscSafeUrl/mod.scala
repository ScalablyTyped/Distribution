package typings.jscSafeUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsc-safe-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isJscSafeUrl(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJscSafeUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def toJscSafeUrl(urlToConvert: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toJscSafeUrl")(urlToConvert.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toNormalUrl(urlToNormalize: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toNormalUrl")(urlToNormalize.asInstanceOf[js.Any]).asInstanceOf[String]
}
