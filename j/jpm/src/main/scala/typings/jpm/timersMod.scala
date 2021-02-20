package typings.jpm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Set one-off and periodic timers
  */
object timersMod {
  
  @JSImport("sdk/timers", "clearInterval")
  @js.native
  def clearInterval(intervalID: INTERVAL_ID): Unit = js.native
  
  @JSImport("sdk/timers", "clearTimeout")
  @js.native
  def clearTimeout(timerID: TIMEOUT_ID): Unit = js.native
  
  @JSImport("sdk/timers", "setInterval")
  @js.native
  def setInterval(callback: js.Function1[/* repeated */ js.Any, _], timeoutMS: Double): INTERVAL_ID = js.native
  
  @JSImport("sdk/timers", "setTimeout")
  @js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, _], timeoutMS: Double): TIMEOUT_ID = js.native
  
  type INTERVAL_ID = Double
  
  type TIMEOUT_ID = Double
}
