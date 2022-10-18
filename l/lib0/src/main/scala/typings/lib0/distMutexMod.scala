package typings.lib0

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMutexMod {
  
  @JSImport("lib0/dist/mutex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMutex(): mutex = ^.asInstanceOf[js.Dynamic].applyDynamic("createMutex")().asInstanceOf[mutex]
  
  type mutex = js.Function2[/* cb */ js.Function0[Unit], /* elseCb */ js.UndefOr[js.Function0[Unit]], Any]
}
