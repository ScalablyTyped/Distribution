package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Store preferences across application restarts
 */
@JSImport("sdk/simple-prefs", JSImport.Namespace)
@js.native
object simpleDashPrefsMod extends js.Object {
  val prefs: js.Object = js.native
  def on(prefName: java.lang.String, listener: js.Function1[/* prefName */ java.lang.String, _]): scala.Unit = js.native
  def removeListener(prefName: java.lang.String, listener: js.Function): scala.Unit = js.native
}

