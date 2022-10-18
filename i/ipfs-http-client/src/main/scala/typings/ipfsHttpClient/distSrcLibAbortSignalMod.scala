package typings.ipfsHttpClient

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcLibAbortSignalMod {
  
  @JSImport("ipfs-http-client/dist/src/lib/abort-signal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def abortSignal(signals: js.UndefOr[AbortSignal]*): AbortSignal = ^.asInstanceOf[js.Dynamic].applyDynamic("abortSignal")(signals.asInstanceOf[Seq[js.Any]]*).asInstanceOf[AbortSignal]
}
