package typings.makerJs.MakerJs.models

import org.scalablytyped.runtime.StringDictionary
import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IModelMap
import typings.makerJs.MakerJs.IPathMap
import typings.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dome extends IModel {
  @JSName("paths")
  var paths_Dome: IPathMap
}

object Dome {
  @scala.inline
  def apply(
    paths: IPathMap,
    exporterOptions: StringDictionary[js.Any] = null,
    layer: String = null,
    models: IModelMap = null,
    notes: String = null,
    origin: IPoint = null,
    `type`: String = null,
    units: String = null
  ): Dome = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    if (exporterOptions != null) __obj.updateDynamic("exporterOptions")(exporterOptions.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (models != null) __obj.updateDynamic("models")(models.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dome]
  }
}

