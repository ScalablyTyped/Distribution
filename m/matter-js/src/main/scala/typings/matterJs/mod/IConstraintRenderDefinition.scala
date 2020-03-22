package typings.matterJs.mod

import typings.matterJs.matterJsStrings.line
import typings.matterJs.matterJsStrings.pin
import typings.matterJs.matterJsStrings.spring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConstraintRenderDefinition extends js.Object {
  /**
    * A `Boolean` that defines if the constraint's anchor points should be rendered.
    *
    * @property render.anchors
    * @type boolean
    * @default true
    */
  var anchors: js.UndefOr[Boolean] = js.undefined
  /**
    * A `Number` that defines the line width to use when rendering the constraint outline.
    * A value of `0` means no outline will be rendered.
    *
    * @property render.lineWidth
    * @type number
    * @default 2
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * A `String` that defines the stroke style to use when rendering the constraint outline.
    * It is the same as when using a canvas, so it accepts CSS style property values.
    *
    * @property render.strokeStyle
    * @type string
    * @default a random colour
    */
  var strokeStyle: js.UndefOr[String] = js.undefined
  /**
    * A String that defines the constraint rendering type. The possible values are
    * 'line', 'pin', 'spring'. An appropriate render type will be automatically
    * chosen unless one is given in options.
    *
    * @property render.type
    * @type string
    * @default 'line'
    */
  var `type`: js.UndefOr[line | pin | spring] = js.undefined
  /**
    * A flag that indicates if the constraint should be rendered.
    *
    * @property render.visible
    * @type boolean
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object IConstraintRenderDefinition {
  @scala.inline
  def apply(
    anchors: js.UndefOr[Boolean] = js.undefined,
    lineWidth: Int | Double = null,
    strokeStyle: String = null,
    `type`: line | pin | spring = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): IConstraintRenderDefinition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anchors)) __obj.updateDynamic("anchors")(anchors.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConstraintRenderDefinition]
  }
}

