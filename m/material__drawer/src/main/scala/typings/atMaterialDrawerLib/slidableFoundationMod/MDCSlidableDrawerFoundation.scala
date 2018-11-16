package typings
package atMaterialDrawerLib.slidableFoundationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/drawer/slidable/foundation", "MDCSlidableDrawerFoundation")
@js.native
class MDCSlidableDrawerFoundation protected ()
  extends atMaterialBaseLib.baseMod.MDCFoundation[atMaterialDrawerLib.slidableAdapterMod.MDCSlidableDrawerAdapter] {
  def this(adapter: atMaterialDrawerLib.slidableAdapterMod.MDCSlidableDrawerAdapter, rootCssClass: java.lang.String, animatingCssClass: java.lang.String, openCssClass: java.lang.String) = this()
  def close(): scala.Unit = js.native
  def isOpen(): scala.Boolean = js.native
  def open(): scala.Unit = js.native
}

@JSImport("@material/drawer/slidable/foundation", "MDCSlidableDrawerFoundation")
@js.native
object MDCSlidableDrawerFoundation extends js.Object {
  val defaultAdapter: atMaterialDrawerLib.slidableAdapterMod.MDCSlidableDrawerAdapter = js.native
}

