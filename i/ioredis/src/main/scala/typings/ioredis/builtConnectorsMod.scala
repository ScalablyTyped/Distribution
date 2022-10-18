package typings.ioredis

import typings.ioredis.builtConnectorsSentinelConnectorMod.SentinelConnectionOptions
import typings.ioredis.builtConnectorsSentinelConnectorMod.default
import typings.ioredis.builtConnectorsStandaloneConnectorMod.StandaloneConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtConnectorsMod {
  
  @JSImport("ioredis/built/connectors", "SentinelConnector")
  @js.native
  open class SentinelConnector protected () extends default {
    def this(options: SentinelConnectionOptions) = this()
  }
  
  @JSImport("ioredis/built/connectors", "StandaloneConnector")
  @js.native
  open class StandaloneConnector protected ()
    extends typings.ioredis.builtConnectorsStandaloneConnectorMod.default {
    def this(options: StandaloneConnectionOptions) = this()
  }
}
