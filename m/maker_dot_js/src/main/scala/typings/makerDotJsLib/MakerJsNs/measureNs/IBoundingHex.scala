package typings
package makerDotJsLib.MakerJsNs.measureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A hexagon which surrounds a model.
  */
trait IBoundingHex
  extends makerDotJsLib.MakerJsNs.IModel {
  /**
    * Radius of the hexagon, which is also the length of a side.
    */
  var radius: scala.Double
}

object IBoundingHex {
  @scala.inline
  def apply(
    radius: scala.Double,
    exporterOptions: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    layer: java.lang.String = null,
    models: makerDotJsLib.MakerJsNs.IModelMap = null,
    notes: java.lang.String = null,
    origin: makerDotJsLib.MakerJsNs.IPoint = null,
    paths: makerDotJsLib.MakerJsNs.IPathMap = null,
    `type`: java.lang.String = null,
    units: java.lang.String = null
  ): IBoundingHex = {
    val __obj = js.Dynamic.literal(radius = radius)
    if (exporterOptions != null) __obj.updateDynamic("exporterOptions")(exporterOptions)
    if (layer != null) __obj.updateDynamic("layer")(layer)
    if (models != null) __obj.updateDynamic("models")(models)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (paths != null) __obj.updateDynamic("paths")(paths)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (units != null) __obj.updateDynamic("units")(units)
    __obj.asInstanceOf[IBoundingHex]
  }
}

