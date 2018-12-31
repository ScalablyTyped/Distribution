package typings
package makerDotJsLib.MakerJsNs.exporterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class to traverse an item 's models or paths and ultimately render each path.
  * @private
  */
@JSGlobal("MakerJs.exporter.Exporter")
@js.native
class Exporter protected () extends js.Object {
  /**
    * @param map Object containing properties: property name is the type of path, e.g. "line", "circle"; property value
    * is a function to render a path. Function parameters are path and point.
    * @param fixPoint Optional function to modify a point prior to export. Function parameter is a point; function must return a point.
    * @param fixPath Optional function to modify a path prior to output. Function parameters are path and offset point; function must return a path.
    */
  def this(map: makerDotJsLib.MakerJsNs.IPathOriginFunctionMap) = this()
  def this(map: makerDotJsLib.MakerJsNs.IPathOriginFunctionMap, fixPoint: js.Function1[/* pointToFix */ makerDotJsLib.MakerJsNs.IPoint, makerDotJsLib.MakerJsNs.IPoint]) = this()
  def this(map: makerDotJsLib.MakerJsNs.IPathOriginFunctionMap, fixPoint: js.Function1[/* pointToFix */ makerDotJsLib.MakerJsNs.IPoint, makerDotJsLib.MakerJsNs.IPoint], fixPath: js.Function2[
      /* pathToFix */ makerDotJsLib.MakerJsNs.IPath, 
      /* origin */ makerDotJsLib.MakerJsNs.IPoint, 
      makerDotJsLib.MakerJsNs.IPath
    ]) = this()
  def this(map: makerDotJsLib.MakerJsNs.IPathOriginFunctionMap, fixPoint: js.Function1[/* pointToFix */ makerDotJsLib.MakerJsNs.IPoint, makerDotJsLib.MakerJsNs.IPoint], fixPath: js.Function2[
      /* pathToFix */ makerDotJsLib.MakerJsNs.IPath, 
      /* origin */ makerDotJsLib.MakerJsNs.IPoint, 
      makerDotJsLib.MakerJsNs.IPath
    ], beginModel: js.Function2[
      /* id */ java.lang.String, 
      /* modelContext */ makerDotJsLib.MakerJsNs.IModel, 
      scala.Unit
    ]) = this()
  def this(map: makerDotJsLib.MakerJsNs.IPathOriginFunctionMap, fixPoint: js.Function1[/* pointToFix */ makerDotJsLib.MakerJsNs.IPoint, makerDotJsLib.MakerJsNs.IPoint], fixPath: js.Function2[
      /* pathToFix */ makerDotJsLib.MakerJsNs.IPath, 
      /* origin */ makerDotJsLib.MakerJsNs.IPoint, 
      makerDotJsLib.MakerJsNs.IPath
    ], beginModel: js.Function2[
      /* id */ java.lang.String, 
      /* modelContext */ makerDotJsLib.MakerJsNs.IModel, 
      scala.Unit
    ], endModel: js.Function1[/* modelContext */ makerDotJsLib.MakerJsNs.IModel, scala.Unit]) = this()
  var beginModel: js.Any = js.native
  var endModel: js.Any = js.native
  var fixPath: js.Any = js.native
  var fixPoint: js.Any = js.native
  var map: js.Any = js.native
  /**
    * Export an object.
    *
    * @param item The object to export. May be a path, an array of paths, a model, or an array of models.
    * @param offset The offset position of the object.
    */
  def exportItem(itemId: java.lang.String, itemToExport: js.Any, origin: makerDotJsLib.MakerJsNs.IPoint): scala.Unit = js.native
  /**
    * Export a model.
    *
    * @param modelToExport The model to export.
    * @param offset The offset position of the model.
    */
  def exportModel(
    modelId: java.lang.String,
    modelToExport: makerDotJsLib.MakerJsNs.IModel,
    offset: makerDotJsLib.MakerJsNs.IPoint
  ): scala.Unit = js.native
  /**
    * Export a path.
    *
    * @param pathToExport The path to export.
    * @param offset The offset position of the path.
    */
  def exportPath(
    id: java.lang.String,
    pathToExport: makerDotJsLib.MakerJsNs.IPath,
    offset: makerDotJsLib.MakerJsNs.IPoint,
    layer: java.lang.String
  ): scala.Unit = js.native
}

