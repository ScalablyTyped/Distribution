package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Control")
@js.native
class Control () extends Class {
  def this(options: ControlOptions) = this()
  // Extension methods
  var onAdd: js.UndefOr[js.Function1[/* map */ Map, stdLib.HTMLElement]] = js.native
  var onRemove: js.UndefOr[js.Function1[/* map */ Map, scala.Unit]] = js.native
  var options: ControlOptions = js.native
  def addTo(map: Map): this.type = js.native
  def getContainer(): js.UndefOr[stdLib.HTMLElement] = js.native
  def getPosition(): ControlPosition = js.native
  def remove(): this.type = js.native
  def setPosition(position: ControlPosition): this.type = js.native
}

/* static members */
@JSImport("leaflet", "Control")
@js.native
object Control extends js.Object {
  def extend[T /* <: js.Object */](props: T): leafletLib.Anon_ArgsAny[T] with leafletLib.Anon_Attribution = js.native
}

