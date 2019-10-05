package typings.makerDotJs.MakerJs.exporter

import typings.makerDotJs.MakerJs.IModel
import typings.makerDotJs.MakerJs.IPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.exporter.toDXF")
@js.native
object toDXF extends js.Object {
  def apply(modelToExport: IModel): String = js.native
  def apply(modelToExport: IModel, options: IDXFRenderOptions): String = js.native
  def apply(pathToExport: IPath): String = js.native
  def apply(pathToExport: IPath, options: IDXFRenderOptions): String = js.native
  def apply(pathsToExport: js.Array[IPath]): String = js.native
  def apply(pathsToExport: js.Array[IPath], options: IDXFRenderOptions): String = js.native
}

