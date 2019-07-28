package typings.jpm

import typings.jpm.jpmStrings.OverQuota
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lets an add-on store data so that it's retained across Firefox restarts
  */
@JSImport("sdk/simple-storage", JSImport.Namespace)
@js.native
object sdkSimpleDashStorageMod extends js.Object {
  val quotaUsage: Double = js.native
  val storage: js.Any = js.native
  @JSName("on")
  def on_OverQuota(event: OverQuota, handler: js.Function0[_]): Unit = js.native
}

