package typings.matterJs.mod

import typings.matterJs.matterJsStrings.line
import typings.matterJs.matterJsStrings.pin
import typings.matterJs.matterJsStrings.spring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConstraintRenderDefinition extends js.Object {
  /**
    * A `Boolean` that defines if the constraint's anchor points should be rendered.
    *
    * @property render.anchors
    * @type boolean
    * @default true
    */
  var anchors: js.UndefOr[Boolean] = js.native
  /**
    * A `Number` that defines the line width to use when rendering the constraint outline.
    * A value of `0` means no outline will be rendered.
    *
    * @property render.lineWidth
    * @type number
    * @default 2
    */
  var lineWidth: js.UndefOr[Double] = js.native
  /**
    * A `String` that defines the stroke style to use when rendering the constraint outline.
    * It is the same as when using a canvas, so it accepts CSS style property values.
    *
    * @property render.strokeStyle
    * @type string
    * @default a random colour
    */
  var strokeStyle: js.UndefOr[String] = js.native
  /**
    * A String that defines the constraint rendering type. The possible values are
    * 'line', 'pin', 'spring'. An appropriate render type will be automatically
    * chosen unless one is given in options.
    *
    * @property render.type
    * @type string
    * @default 'line'
    */
  var `type`: js.UndefOr[line | pin | spring] = js.native
  /**
    * A flag that indicates if the constraint should be rendered.
    *
    * @property render.visible
    * @type boolean
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object IConstraintRenderDefinition {
  @scala.inline
  def apply(): IConstraintRenderDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConstraintRenderDefinition]
  }
  @scala.inline
  implicit class IConstraintRenderDefinitionOps[Self <: IConstraintRenderDefinition] (val x: Self) extends AnyVal {
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
    def setAnchors(value: Boolean): Self = this.set("anchors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchors: Self = this.set("anchors", js.undefined)
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    @scala.inline
    def setStrokeStyle(value: String): Self = this.set("strokeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeStyle: Self = this.set("strokeStyle", js.undefined)
    @scala.inline
    def setType(value: line | pin | spring): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

