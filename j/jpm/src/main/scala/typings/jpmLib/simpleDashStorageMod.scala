package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Lets an add-on store data so that it's retained across Firefox restarts
 */
@JSImport("sdk/simple-storage", JSImport.Namespace)
@js.native
object simpleDashStorageMod extends js.Object {
  val quotaUsage: scala.Double = js.native
  val storage: js.Any = js.native
  @JSName("on")
  def on_OverQuota(event: jpmLib.jpmLibStrings.OverQuota, handler: js.Function0[_]): scala.Unit = js.native
}

