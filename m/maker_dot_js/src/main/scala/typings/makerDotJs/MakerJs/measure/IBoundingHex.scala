package typings.makerDotJs.MakerJs.measure

import org.scalablytyped.runtime.StringDictionary
import typings.makerDotJs.MakerJs.IModel
import typings.makerDotJs.MakerJs.IModelMap
import typings.makerDotJs.MakerJs.IPathMap
import typings.makerDotJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A hexagon which surrounds a model.
  */
trait IBoundingHex extends IModel {
  /**
    * Radius of the hexagon, which is also the length of a side.
    */
  var radius: Double
}

object IBoundingHex {
  @scala.inline
  def apply(
    radius: Double,
    exporterOptions: StringDictionary[js.Any] = null,
    layer: String = null,
    models: IModelMap = null,
    notes: String = null,
    origin: IPoint = null,
    paths: IPathMap = null,
    `type`: String = null,
    units: String = null
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

