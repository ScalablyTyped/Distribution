package typings.makerDotJs.MakerJs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A model is a composite object which may contain an array of paths, or an array of models recursively.
  *
  * Example:
  * ```
  * var m = {
  *   paths: {
  *     "line1": { type: 'line', origin: [0, 0], end: [1, 1] },
  *     "line2": { type: 'line', origin: [0, 0], end: [-1, -1] }
  *   }
  * };
  * ```
  */
trait IModel extends js.Object {
  /**
    * Optional exporter options for this model.
    */
  var exporterOptions: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * Optional layer of this model.
    */
  var layer: js.UndefOr[String] = js.undefined
  /**
    * Optional array of models within this model.
    */
  var models: js.UndefOr[IModelMap] = js.undefined
  /**
    * An author may wish to add notes to this model instance.
    */
  var notes: js.UndefOr[String] = js.undefined
  /**
    * Optional origin location of this model.
    */
  var origin: js.UndefOr[IPoint] = js.undefined
  /**
    * Optional array of path objects in this model.
    */
  var paths: js.UndefOr[IPathMap] = js.undefined
  /**
    * A model may want to specify its type, but this value is not employed yet.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Optional unit system of this model. See UnitType for possible values.
    */
  var units: js.UndefOr[String] = js.undefined
}

object IModel {
  @scala.inline
  def apply(
    exporterOptions: StringDictionary[js.Any] = null,
    layer: String = null,
    models: IModelMap = null,
    notes: String = null,
    origin: IPoint = null,
    paths: IPathMap = null,
    `type`: String = null,
    units: String = null
  ): IModel = {
    val __obj = js.Dynamic.literal()
    if (exporterOptions != null) __obj.updateDynamic("exporterOptions")(exporterOptions)
    if (layer != null) __obj.updateDynamic("layer")(layer)
    if (models != null) __obj.updateDynamic("models")(models)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (paths != null) __obj.updateDynamic("paths")(paths)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (units != null) __obj.updateDynamic("units")(units)
    __obj.asInstanceOf[IModel]
  }
}

