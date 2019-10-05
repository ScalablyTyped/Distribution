package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Canvas")
@js.native
class Canvas () extends Renderer

@JSImport("leaflet", "canvas")
@js.native
object canvas extends js.Object {
  def apply(): Canvas = js.native
  def apply(options: RendererOptions): Canvas = js.native
}

