package typings.jitsiMeet.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypedEventEmitter[Events, K /* <: /* keyof Events */ String */] extends StObject {
  
  def addListener(
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any
  ): this.type = js.native
  
  def emit(event: K, args: Any*): Boolean = js.native
  
  def eventNames(): js.Array[K] = js.native
  
  def getMaxListeners(): Double = js.native
  
  def listenerCount(`type`: K): Double = js.native
  
  def listeners(event: K): js.Array[js.Function1[/* e */ Event, Unit]] = js.native
  
  def on(
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any
  ): this.type = js.native
  
  def once(
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any
  ): this.type = js.native
  
  // Added in Node 6...
  def prependListener(
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any
  ): this.type = js.native
  
  def prependOnceListener(
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any
  ): this.type = js.native
  
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: K): this.type = js.native
  
  def removeListener(
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any
  ): this.type = js.native
  
  def setMaxListeners(n: Double): this.type = js.native
}
