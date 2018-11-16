package typings
package kineticjsLib.KineticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IImage extends IShape {
  def applyFilter(config: js.Any): js.Any = js.native
  def clearImageBuffer(): js.Any = js.native
  def createImageBuffer(callback: js.Function0[_]): js.Any = js.native
  def getCrop(): js.Any = js.native
  def getFilter(): js.Any = js.native
  def getImage(): IImage = js.native
  def setCrop(config: CropConfig): js.Any = js.native
  def setFilter(config: js.Any): js.Any = js.native
  def setImage(image: IImage): js.Any = js.native
}

