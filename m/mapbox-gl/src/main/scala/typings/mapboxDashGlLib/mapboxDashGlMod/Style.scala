package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends js.Object {
  var bearing: js.UndefOr[scala.Double] = js.undefined
  var center: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var glyphs: js.UndefOr[java.lang.String] = js.undefined
  var layers: js.UndefOr[js.Array[Layer]] = js.undefined
  var light: js.UndefOr[Light] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var pitch: js.UndefOr[scala.Double] = js.undefined
  var sources: js.UndefOr[Sources] = js.undefined
  var sprite: js.UndefOr[java.lang.String] = js.undefined
  var transition: js.UndefOr[Transition] = js.undefined
  var version: scala.Double
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

object Style {
  @scala.inline
  def apply(
    version: scala.Double,
    bearing: scala.Int | scala.Double = null,
    center: js.Array[scala.Double] = null,
    glyphs: java.lang.String = null,
    layers: js.Array[Layer] = null,
    light: Light = null,
    metadata: js.Any = null,
    name: java.lang.String = null,
    pitch: scala.Int | scala.Double = null,
    sources: Sources = null,
    sprite: java.lang.String = null,
    transition: Transition = null,
    zoom: scala.Int | scala.Double = null
  ): Style = {
    val __obj = js.Dynamic.literal(version = version)
    if (bearing != null) __obj.updateDynamic("bearing")(bearing.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center)
    if (glyphs != null) __obj.updateDynamic("glyphs")(glyphs)
    if (layers != null) __obj.updateDynamic("layers")(layers)
    if (light != null) __obj.updateDynamic("light")(light)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (name != null) __obj.updateDynamic("name")(name)
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources)
    if (sprite != null) __obj.updateDynamic("sprite")(sprite)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
}

