package typings.makerJs.MakerJs.models

import org.scalablytyped.runtime.StringDictionary
import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IModelMap
import typings.makerJs.MakerJs.IPathMap
import typings.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rectangle extends IModel {
  @JSName("origin")
  var origin_Rectangle: IPoint
  @JSName("paths")
  var paths_Rectangle: IPathMap
}

object Rectangle {
  @scala.inline
  def apply(
    origin: IPoint,
    paths: IPathMap,
    exporterOptions: StringDictionary[js.Any] = null,
    layer: String = null,
    models: IModelMap = null,
    notes: String = null,
    `type`: String = null,
    units: String = null
  ): Rectangle = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    if (exporterOptions != null) __obj.updateDynamic("exporterOptions")(exporterOptions.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (models != null) __obj.updateDynamic("models")(models.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rectangle]
  }
}

