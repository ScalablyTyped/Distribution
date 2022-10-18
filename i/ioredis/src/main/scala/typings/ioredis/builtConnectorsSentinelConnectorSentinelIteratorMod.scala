package typings.ioredis

import typings.ioredis.anon.Done
import typings.ioredis.anon.PartialSentinelAddress
import typings.ioredis.builtConnectorsSentinelConnectorTypesMod.SentinelAddress
import typings.std.Iterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtConnectorsSentinelConnectorSentinelIteratorMod {
  
  @JSImport("ioredis/built/connectors/SentinelConnector/SentinelIterator", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with SentinelIterator {
    def this(sentinels: js.Array[PartialSentinelAddress]) = this()
  }
  
  @js.native
  trait SentinelIterator
    extends StObject
       with Iterator[PartialSentinelAddress, Any, Unit] {
    
    def add(sentinel: SentinelAddress): Boolean = js.native
    
    /* private */ var cursor: Any = js.native
    
    def next(): Done = js.native
    
    def reset(moveCurrentEndpointToFirst: Boolean): Unit = js.native
    
    /* private */ var sentinels: Any = js.native
  }
}
