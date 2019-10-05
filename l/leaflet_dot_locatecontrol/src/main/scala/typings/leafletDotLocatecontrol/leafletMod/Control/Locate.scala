package typings.leafletDotLocatecontrol.leafletMod.Control

import typings.leaflet.leafletMod.Map
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Control.Locate")
@js.native
class Locate ()
  extends typings.leaflet.leafletMod.Control {
  @JSName("onAdd")
  def onAdd_MLocate(map: Map): HTMLElement = js.native
  def setView(): Unit = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
}

