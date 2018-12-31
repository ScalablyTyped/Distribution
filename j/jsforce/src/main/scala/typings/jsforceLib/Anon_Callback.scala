package typings
package jsforceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback extends js.Object {
  /** Returns a value from the cache if it exists, otherwise calls SObject.compactLayouts */
  def apply(): jsforceLib.salesforceDashObjectMod.CompactLayoutInfo = js.native
  def apply(callback: jsforceLib.connectionMod.Callback[jsforceLib.salesforceDashObjectMod.CompactLayoutInfo]): jsforceLib.salesforceDashObjectMod.CompactLayoutInfo = js.native
  def clear(): scala.Unit = js.native
}

