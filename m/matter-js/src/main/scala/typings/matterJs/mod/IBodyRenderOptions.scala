package typings.matterJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBodyRenderOptions extends js.Object {
  /**
    * A String that defines the fill style to use when rendering the body (if a sprite is not defined). It is the same as when using a canvas, so it accepts CSS style property values.
    Default: a random colour
    */
  var fillStyle: js.UndefOr[String] = js.native
  /**
    * A Number that defines the line width to use when rendering the body outline (if a sprite is not defined). A value of 0 means no outline will be rendered.
    Default: 1.5
    */
  var lineWidth: js.UndefOr[Double] = js.native
  /*
    * Sets the opacity. 1.0 is fully opaque. 0.0 is fully translucent
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * An `Object` that defines the sprite properties to use when rendering, if any.
    *
    * @property render.sprite
    * @type object
    */
  var sprite: js.UndefOr[IBodyRenderOptionsSprite] = js.native
  /**
    * A String that defines the stroke style to use when rendering the body outline (if a sprite is not defined). It is the same as when using a canvas, so it accepts CSS style property values.
    Default: a random colour
    */
  var strokeStyle: js.UndefOr[String] = js.native
  /**
    * A flag that indicates if the body should be rendered.
    *
    * @property render.visible
    * @type boolean
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object IBodyRenderOptions {
  @scala.inline
  def apply(): IBodyRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBodyRenderOptions]
  }
  @scala.inline
  implicit class IBodyRenderOptionsOps[Self <: IBodyRenderOptions] (val x: Self) extends AnyVal {
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
    def setFillStyle(value: String): Self = this.set("fillStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillStyle: Self = this.set("fillStyle", js.undefined)
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setSprite(value: IBodyRenderOptionsSprite): Self = this.set("sprite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSprite: Self = this.set("sprite", js.undefined)
    @scala.inline
    def setStrokeStyle(value: String): Self = this.set("strokeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeStyle: Self = this.set("strokeStyle", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

