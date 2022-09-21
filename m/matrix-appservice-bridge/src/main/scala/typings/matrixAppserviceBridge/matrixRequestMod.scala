package typings.matrixAppserviceBridge

import typings.matrixAppserviceBridge.eventTypesMod.EphemeralEvent
import typings.matrixAppserviceBridge.eventTypesMod.WeakEvent
import typings.matrixAppserviceBridge.requestsRequestMod.Request
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matrixRequestMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/requests/matrix-request", "EphemeralMatrixRequest")
  @js.native
  open class EphemeralMatrixRequest protected () extends MatrixRequest[EphemeralEvent] {
    def this(event: EphemeralEvent) = this()
    
    def `type`(): String = js.native
  }
  
  @JSImport("matrix-appservice-bridge/lib/components/requests/matrix-request", "MatrixRequest")
  @js.native
  open class MatrixRequest[T] protected () extends Request[T] {
    def this(event: T) = this()
    
    val event: T = js.native
  }
  
  @JSImport("matrix-appservice-bridge/lib/components/requests/matrix-request", "TimelineMatrixRequest")
  @js.native
  open class TimelineMatrixRequest protected () extends MatrixRequest[WeakEvent] {
    def this(event: WeakEvent) = this()
    
    def content(): Record[String, Any] = js.native
    
    def roomId(): String = js.native
    
    def sender(): String = js.native
    
    def stateKey(): js.UndefOr[String] = js.native
    
    def `type`(): String = js.native
  }
}
