package typings.logrocketReact

import typings.logrocket.mod.LR.LogRocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(logRocket: LR): Unit = ^.asInstanceOf[js.Dynamic].apply(logRocket.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("logrocket-react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type LR = LogRocket
}
