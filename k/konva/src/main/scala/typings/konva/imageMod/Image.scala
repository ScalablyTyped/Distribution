package typings.konva.imageMod

import typings.konva.contextMod.Context
import typings.konva.shapeMod.Shape
import typings.konva.typesMod.GetSet
import typings.konva.typesMod.IRect
import typings.std.CanvasImageSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/shapes/Image", "Image")
@js.native
class Image () extends Shape[ImageConfig] {
  
  def _hitFunc(context: js.Any): Unit = js.native
  
  def _sceneFunc(context: Context): Unit = js.native
  
  def crop(): IRect = js.native
  def crop(v: IRect): this.type = js.native
  
  def cropHeight(): Double = js.native
  def cropHeight(v: Double): this.type = js.native
  @JSName("cropHeight")
  var cropHeight_Original: GetSet[Double, this.type] = js.native
  
  def cropWidth(): Double = js.native
  def cropWidth(v: Double): this.type = js.native
  @JSName("cropWidth")
  var cropWidth_Original: GetSet[Double, this.type] = js.native
  
  def cropX(): Double = js.native
  def cropX(v: Double): this.type = js.native
  @JSName("cropX")
  var cropX_Original: GetSet[Double, this.type] = js.native
  
  def cropY(): Double = js.native
  def cropY(v: Double): this.type = js.native
  @JSName("cropY")
  var cropY_Original: GetSet[Double, this.type] = js.native
  
  @JSName("crop")
  var crop_Original: GetSet[IRect, this.type] = js.native
  
  def getHeight(): js.Any = js.native
  
  def getWidth(): js.Any = js.native
  
  def image(): this.type = js.native
  def image(v: CanvasImageSource): this.type = js.native
  @JSName("image")
  var image_Original: GetSet[js.UndefOr[CanvasImageSource], this.type] = js.native
  @JSName("image")
  def image_Union(): js.UndefOr[CanvasImageSource] = js.native
}
/* static members */
@JSImport("konva/types/shapes/Image", "Image")
@js.native
object Image extends js.Object {
  
  def fromURL(url: js.Any, callback: js.Any): Unit = js.native
}
