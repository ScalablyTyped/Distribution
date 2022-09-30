package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HippyEventEmitter extends StObject {
  
  def addListener(event: String, callback: js.Function1[/* data */ js.UndefOr[Any], Unit]): Unit = js.native
  def addListener(event: String, callback: js.Function1[/* data */ js.UndefOr[Any], Unit], context: Any): Unit = js.native
  
  def emit(event: String, param: Any): Boolean = js.native
  
  var hippyEventListeners: EventListeners = js.native
  
  def listenerSize(event: String): Double = js.native
  
  def removeAllListeners(event: String): Unit = js.native
  
  def sharedListeners(): EventListeners = js.native
}
