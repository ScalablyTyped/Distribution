package typings.jpm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Store preferences across application restarts
  */
object simplePrefsMod {
  
  @JSImport("sdk/simple-prefs", "on")
  @js.native
  def on(prefName: String, listener: js.Function1[/* prefName */ String, _]): Unit = js.native
  
  @JSImport("sdk/simple-prefs", "prefs")
  @js.native
  val prefs: js.Object = js.native
  
  @JSImport("sdk/simple-prefs", "removeListener")
  @js.native
  def removeListener(prefName: String, listener: js.Function): Unit = js.native
}
