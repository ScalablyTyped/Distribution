package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Handler")
@js.native
class Handler protected () extends Class {
  def this(map: Map) = this()
  // Extension methods
  var addHooks: js.UndefOr[js.Function0[Unit]] = js.native
  var removeHooks: js.UndefOr[js.Function0[Unit]] = js.native
  def disable(): this.type = js.native
  def enable(): this.type = js.native
  def enabled(): Boolean = js.native
}

