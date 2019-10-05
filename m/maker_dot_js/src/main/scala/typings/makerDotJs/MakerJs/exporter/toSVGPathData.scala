package typings.makerDotJs.MakerJs.exporter

import typings.makerDotJs.MakerJs.IModel
import typings.makerDotJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.exporter.toSVGPathData")
@js.native
object toSVGPathData extends js.Object {
  /**
    * Convert a model to SVG path data.
    *
    * @param modelToExport Model to export.
    * @param byLayers Boolean flag (default true) to return a map of path data by layer.
    * @param origin Optional reference origin.
    * @returns String of SVG path data (if byLayers is false) or an object map of path data by layer .
    */
  def apply(modelToExport: IModel): IPathDataByLayerMap | String = js.native
  def apply(modelToExport: IModel, byLayers: Boolean): IPathDataByLayerMap | String = js.native
  def apply(modelToExport: IModel, byLayers: Boolean, origin: IPoint): IPathDataByLayerMap | String = js.native
}

