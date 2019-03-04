package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBodyRenderOptionsSprite extends js.Object {
  /**
    * An `String` that defines the path to the image to use as the sprite texture, if any.
    *
    * @property render.sprite.texture
    * @type string
    */
  var texture: java.lang.String
  /**
    * A `Number` that defines the scaling in the x-axis for the sprite, if any.
    *
    * @property render.sprite.xScale
    * @type number
    * @default 1
    */
  var xScale: scala.Double
  /**
    * A `Number` that defines the scaling in the y-axis for the sprite, if any.
    *
    * @property render.sprite.yScale
    * @type number
    * @default 1
    */
  var yScale: scala.Double
}

object IBodyRenderOptionsSprite {
  @scala.inline
  def apply(texture: java.lang.String, xScale: scala.Double, yScale: scala.Double): IBodyRenderOptionsSprite = {
    val __obj = js.Dynamic.literal(texture = texture, xScale = xScale, yScale = yScale)
  
    __obj.asInstanceOf[IBodyRenderOptionsSprite]
  }
}

