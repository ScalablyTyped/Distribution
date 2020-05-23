package typings.makerJs.MakerJs.exporter

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPath
import typings.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class to traverse an item 's models or paths and ultimately render each path.
  * @private
  */
trait Exporter extends js.Object {
  var beginModel: js.Any
  var endModel: js.Any
  var fixPath: js.Any
  var fixPoint: js.Any
  var map: js.Any
  /**
    * Export an object.
    *
    * @param item The object to export. May be a path, an array of paths, a model, or an array of models.
    * @param offset The offset position of the object.
    */
  def exportItem(itemId: String, itemToExport: js.Any, origin: IPoint): Unit
  /**
    * Export a model.
    *
    * @param modelToExport The model to export.
    * @param offset The offset position of the model.
    */
  def exportModel(modelId: String, modelToExport: IModel, offset: IPoint): Unit
  /**
    * Export a path.
    *
    * @param pathToExport The path to export.
    * @param offset The offset position of the path.
    */
  def exportPath(id: String, pathToExport: IPath, offset: IPoint, layer: String): Unit
}

object Exporter {
  @scala.inline
  def apply(
    beginModel: js.Any,
    endModel: js.Any,
    exportItem: (String, js.Any, IPoint) => Unit,
    exportModel: (String, IModel, IPoint) => Unit,
    exportPath: (String, IPath, IPoint, String) => Unit,
    fixPath: js.Any,
    fixPoint: js.Any,
    map: js.Any
  ): Exporter = {
    val __obj = js.Dynamic.literal(beginModel = beginModel.asInstanceOf[js.Any], endModel = endModel.asInstanceOf[js.Any], exportItem = js.Any.fromFunction3(exportItem), exportModel = js.Any.fromFunction3(exportModel), exportPath = js.Any.fromFunction4(exportPath), fixPath = fixPath.asInstanceOf[js.Any], fixPoint = fixPoint.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exporter]
  }
}

