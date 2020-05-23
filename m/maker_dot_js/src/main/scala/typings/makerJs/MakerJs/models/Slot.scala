package typings.makerJs.MakerJs.models

import org.scalablytyped.runtime.StringDictionary
import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IModelMap
import typings.makerJs.MakerJs.IPathMap
import typings.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Slot extends IModel {
  @JSName("models")
  var models_Slot: IModelMap
  @JSName("origin")
  var origin_Slot: IPoint
  @JSName("paths")
  var paths_Slot: IPathMap
}

object Slot {
  @scala.inline
  def apply(
    models: IModelMap,
    origin: IPoint,
    paths: IPathMap,
    exporterOptions: StringDictionary[js.Any] = null,
    layer: String = null,
    notes: String = null,
    `type`: String = null,
    units: String = null
  ): Slot = {
    val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    if (exporterOptions != null) __obj.updateDynamic("exporterOptions")(exporterOptions.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slot]
  }
}

