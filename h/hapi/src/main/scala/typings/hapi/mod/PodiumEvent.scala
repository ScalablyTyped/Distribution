package typings.hapi.mod

import typings.podium.mod.Listener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PodiumEvent[K /* <: String */, T] extends StObject {
  
  def emit(criteria: K, listener: js.Function1[/* value */ T, Unit]): Unit = js.native
  
  def hasListeners(criteria: K): this.type = js.native
  
  def on(criteria: K, listener: js.Function1[/* value */ T, Unit]): Unit = js.native
  
  def once(criteria: K): js.Promise[T] = js.native
  def once(criteria: K, listener: js.Function1[/* value */ T, Unit]): Unit = js.native
  
  def removeAllListeners(criteria: K): this.type = js.native
  
  def removeListener(criteria: K, listener: Listener): this.type = js.native
}
