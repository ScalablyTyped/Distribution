package typings.makerJs.MakerJs.exporter

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.exporter.toSVG")
@js.native
object toSVG extends js.Object {
  def apply(modelToExport: IModel): String = js.native
  def apply(modelToExport: IModel, options: ISVGRenderOptions): String = js.native
  def apply(pathToExport: IPath): String = js.native
  def apply(pathToExport: IPath, options: ISVGRenderOptions): String = js.native
  def apply(pathsToExport: js.Array[IPath]): String = js.native
  def apply(pathsToExport: js.Array[IPath], options: ISVGRenderOptions): String = js.native
}

