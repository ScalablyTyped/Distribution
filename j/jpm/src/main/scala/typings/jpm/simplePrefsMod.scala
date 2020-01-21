package typings.jpm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Store preferences across application restarts
  */
@JSImport("sdk/simple-prefs", JSImport.Namespace)
@js.native
object simplePrefsMod extends js.Object {
  val prefs: js.Object = js.native
  def on(prefName: String, listener: js.Function1[/* prefName */ String, _]): Unit = js.native
  def removeListener(prefName: String, listener: js.Function): Unit = js.native
}

