package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConstraintRenderDefinition extends js.Object {
  /**
    * A `Number` that defines the line width to use when rendering the constraint outline.
    * A value of `0` means no outline will be rendered.
    *
    * @property render.lineWidth
    * @type number
    * @default 2
    */
  var lineWidth: scala.Double
  /**
    * A `String` that defines the stroke style to use when rendering the constraint outline.
    * It is the same as when using a canvas, so it accepts CSS style property values.
    *
    * @property render.strokeStyle
    * @type string
    * @default a random colour
    */
  var strokeStyle: java.lang.String
  /**
    * A flag that indicates if the constraint should be rendered.
    *
    * @property render.visible
    * @type boolean
    * @default true
    */
  var visible: scala.Boolean
}

