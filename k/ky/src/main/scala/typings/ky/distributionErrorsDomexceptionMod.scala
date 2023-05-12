package typings.ky

import typings.std.AbortSignal
import typings.std.DOMException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributionErrorsDomexceptionMod {
  
  @JSImport("ky/distribution/errors/DOMException", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def composeAbortError(): js.Error | DOMException = ^.asInstanceOf[js.Dynamic].applyDynamic("composeAbortError")().asInstanceOf[js.Error | DOMException]
  inline def composeAbortError(signal: AbortSignal): js.Error | DOMException = ^.asInstanceOf[js.Dynamic].applyDynamic("composeAbortError")(signal.asInstanceOf[js.Any]).asInstanceOf[js.Error | DOMException]
}
