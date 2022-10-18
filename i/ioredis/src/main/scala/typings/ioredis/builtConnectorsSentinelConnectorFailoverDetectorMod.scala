package typings.ioredis

import typings.ioredis.builtConnectorsSentinelConnectorMod.default
import typings.ioredis.builtConnectorsSentinelConnectorTypesMod.Sentinel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtConnectorsSentinelConnectorFailoverDetectorMod {
  
  @JSImport("ioredis/built/connectors/SentinelConnector/FailoverDetector", "FailoverDetector")
  @js.native
  open class FailoverDetector protected () extends StObject {
    def this(connector: default, sentinels: js.Array[Sentinel]) = this()
    
    def cleanup(): Unit = js.native
    
    /* private */ var connector: Any = js.native
    
    /* private */ var disconnect: Any = js.native
    
    /* private */ var isDisconnected: Any = js.native
    
    /* private */ var sentinels: Any = js.native
    
    def subscribe(): js.Promise[Unit] = js.native
  }
}
