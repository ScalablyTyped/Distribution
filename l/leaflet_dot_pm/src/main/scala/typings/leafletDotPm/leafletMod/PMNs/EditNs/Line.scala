package typings.leafletDotPm.leafletMod.PMNs.EditNs

import typings.leaflet.leafletMod.Layer
import typings.leafletDotPm.leafletMod.PMNs.EditOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Line extends js.Object {
  def disable(): Unit = js.native
  def disable(poly: Layer): Unit = js.native
  def enable(): Unit = js.native
  def enable(options: EditOptions): Unit = js.native
  def enabled(): Boolean = js.native
  def toggleEdit(): Unit = js.native
  def toggleEdit(options: EditOptions): Unit = js.native
}

