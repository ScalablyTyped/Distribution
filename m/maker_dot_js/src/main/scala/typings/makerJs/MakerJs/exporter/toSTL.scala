package typings.makerJs.MakerJs.exporter

import typings.makerJs.MakerJs.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.exporter.toSTL")
@js.native
object toSTL extends js.Object {
  /**
    * Executes a JavaScript string with the OpenJsCad engine - converts 2D to 3D.
    *
    * @param modelToExport Model object to export.
    * @param options Export options object.
    * @param options.extrusion Height of 3D extrusion.
    * @param options.resolution Size of facets.
    * @returns String of STL format of 3D object.
    */
  def apply(modelToExport: IModel): String = js.native
  def apply(modelToExport: IModel, options: IOpenJsCadOptions): String = js.native
}

