package typings.lesgo

import typings.lesgo.anon.Sub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsGetJwtSubFromAuthHeaderMod {
  
  @JSImport("lesgo/utils/getJwtSubFromAuthHeader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(authHeader: String): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(authHeader.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Null]]
  
  inline def getTokenData(authHeader: String): Sub = ^.asInstanceOf[js.Dynamic].applyDynamic("getTokenData")(authHeader.asInstanceOf[js.Any]).asInstanceOf[Sub]
}
