package typings.ismobilejs

import typings.ismobilejs.typesIsMobileMod.IsMobileParameter
import typings.ismobilejs.typesIsMobileMod.isMobileResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ismobilejs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): isMobileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[isMobileResult]
  inline def default(param: IsMobileParameter): isMobileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param.asInstanceOf[js.Any]).asInstanceOf[isMobileResult]
}
