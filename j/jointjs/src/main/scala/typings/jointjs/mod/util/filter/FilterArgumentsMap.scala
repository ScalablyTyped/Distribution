package typings.jointjs.mod.util.filter

import typings.jointjs.anon.Amount
import typings.jointjs.anon.Angle
import typings.jointjs.anon.Blur
import typings.jointjs.anon.Dx
import typings.jointjs.anon.Margin
import typings.jointjs.anon.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterArgumentsMap extends js.Object {
  var blur: Y = js.native
  var brightness: Amount = js.native
  var contrast: Amount = js.native
  var dropShadow: Dx = js.native
  var grayscale: Amount = js.native
  var highlight: Blur = js.native
  var hueRotate: Angle = js.native
  var invert: Amount = js.native
  var outline: Margin = js.native
  var saturate: Amount = js.native
  var sepia: Amount = js.native
}

object FilterArgumentsMap {
  @scala.inline
  def apply(
    blur: Y,
    brightness: Amount,
    contrast: Amount,
    dropShadow: Dx,
    grayscale: Amount,
    highlight: Blur,
    hueRotate: Angle,
    invert: Amount,
    outline: Margin,
    saturate: Amount,
    sepia: Amount
  ): FilterArgumentsMap = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], dropShadow = dropShadow.asInstanceOf[js.Any], grayscale = grayscale.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], hueRotate = hueRotate.asInstanceOf[js.Any], invert = invert.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], saturate = saturate.asInstanceOf[js.Any], sepia = sepia.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterArgumentsMap]
  }
  @scala.inline
  implicit class FilterArgumentsMapOps[Self <: FilterArgumentsMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlur(value: Y): Self = this.set("blur", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrightness(value: Amount): Self = this.set("brightness", value.asInstanceOf[js.Any])
    @scala.inline
    def setContrast(value: Amount): Self = this.set("contrast", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropShadow(value: Dx): Self = this.set("dropShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrayscale(value: Amount): Self = this.set("grayscale", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlight(value: Blur): Self = this.set("highlight", value.asInstanceOf[js.Any])
    @scala.inline
    def setHueRotate(value: Angle): Self = this.set("hueRotate", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvert(value: Amount): Self = this.set("invert", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutline(value: Margin): Self = this.set("outline", value.asInstanceOf[js.Any])
    @scala.inline
    def setSaturate(value: Amount): Self = this.set("saturate", value.asInstanceOf[js.Any])
    @scala.inline
    def setSepia(value: Amount): Self = this.set("sepia", value.asInstanceOf[js.Any])
  }
  
}

