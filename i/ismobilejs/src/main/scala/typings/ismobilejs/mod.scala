package typings.ismobilejs

import typings.ismobilejs.isMobileMod.IsMobileParameter
import typings.ismobilejs.isMobileMod.isMobileResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ismobilejs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): isMobileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[isMobileResult]
  @scala.inline
  def default(param: IsMobileParameter): isMobileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param.asInstanceOf[js.Any]).asInstanceOf[isMobileResult]
}
