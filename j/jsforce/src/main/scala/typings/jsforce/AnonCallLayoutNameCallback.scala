package typings.jsforce

import typings.jsforce.connectionMod.Callback
import typings.jsforce.salesforceObjectMod.LayoutInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCallLayoutNameCallback extends js.Object {
  def apply(): LayoutInfo = js.native
  def apply(layoutName: String): LayoutInfo = js.native
  def apply(layoutName: String, callback: Callback[LayoutInfo]): LayoutInfo = js.native
  def clear(): Unit = js.native
}

