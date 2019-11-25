package typings.mapboxDashGl.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends js.Object {
  var bearing: js.UndefOr[Double] = js.undefined
  var center: js.UndefOr[js.Array[Double]] = js.undefined
  var glyphs: js.UndefOr[String] = js.undefined
  var layers: js.UndefOr[js.Array[Layer]] = js.undefined
  var light: js.UndefOr[Light] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var pitch: js.UndefOr[Double] = js.undefined
  var sources: js.UndefOr[Sources] = js.undefined
  var sprite: js.UndefOr[String] = js.undefined
  var transition: js.UndefOr[Transition] = js.undefined
  var version: Double
  var zoom: js.UndefOr[Double] = js.undefined
}

object Style {
  @scala.inline
  def apply(
    version: Double,
    bearing: Int | Double = null,
    center: js.Array[Double] = null,
    glyphs: String = null,
    layers: js.Array[Layer] = null,
    light: Light = null,
    metadata: js.Any = null,
    name: String = null,
    pitch: Int | Double = null,
    sources: Sources = null,
    sprite: String = null,
    transition: Transition = null,
    zoom: Int | Double = null
  ): Style = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    if (bearing != null) __obj.updateDynamic("bearing")(bearing.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (glyphs != null) __obj.updateDynamic("glyphs")(glyphs.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (light != null) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    if (sprite != null) __obj.updateDynamic("sprite")(sprite.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
}

