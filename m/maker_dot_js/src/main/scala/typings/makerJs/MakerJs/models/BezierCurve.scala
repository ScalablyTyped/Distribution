package typings.makerJs.MakerJs.models

import org.scalablytyped.runtime.StringDictionary
import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IModelMap
import typings.makerJs.MakerJs.IPathBezierSeed
import typings.makerJs.MakerJs.IPathMap
import typings.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BezierCurve extends IModel {
  var accuracy: Double
  @JSName("models")
  var models_BezierCurve: IModelMap
  @JSName("origin")
  var origin_BezierCurve: IPoint
  @JSName("paths")
  var paths_BezierCurve: IPathMap
  var seed: IPathBezierSeed
  @JSName("type")
  var type_BezierCurve: String
}

object BezierCurve {
  @scala.inline
  def apply(
    accuracy: Double,
    models: IModelMap,
    origin: IPoint,
    paths: IPathMap,
    seed: IPathBezierSeed,
    `type`: String,
    exporterOptions: StringDictionary[js.Any] = null,
    layer: String = null,
    notes: String = null,
    units: String = null
  ): BezierCurve = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], models = models.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (exporterOptions != null) __obj.updateDynamic("exporterOptions")(exporterOptions.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[BezierCurve]
  }
}

