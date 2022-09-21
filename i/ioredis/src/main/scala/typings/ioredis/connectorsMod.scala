package typings.ioredis

import typings.ioredis.sentinelConnectorMod.SentinelConnectionOptions
import typings.ioredis.sentinelConnectorMod.default
import typings.ioredis.standaloneConnectorMod.StandaloneConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectorsMod {
  
  @JSImport("ioredis/built/connectors", "SentinelConnector")
  @js.native
  open class SentinelConnector protected () extends default {
    def this(options: SentinelConnectionOptions) = this()
  }
  
  @JSImport("ioredis/built/connectors", "StandaloneConnector")
  @js.native
  open class StandaloneConnector protected ()
    extends typings.ioredis.standaloneConnectorMod.default {
    def this(options: StandaloneConnectionOptions) = this()
  }
}
