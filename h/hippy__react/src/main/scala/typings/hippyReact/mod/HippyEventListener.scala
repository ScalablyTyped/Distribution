package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Hippy React Event
// ----------------------------------------------------------------------
@js.native
trait HippyEventListener extends StObject {
  
  def addCallback(handleFunc: js.Function0[Unit]): Double = js.native
  def addCallback(handleFunc: js.Function0[Unit], callContext: Any): Double = js.native
  
  var eventName: String = js.native
  
  def getSize(): Double = js.native
  
  var listenerIds: js.Array[Double] = js.native
  
  def removeCallback(callbackId: Double): Unit = js.native
  
  def unregister(): Unit = js.native
}
