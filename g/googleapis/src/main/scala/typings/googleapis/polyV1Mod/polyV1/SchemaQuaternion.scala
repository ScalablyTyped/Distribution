package typings.googleapis.polyV1Mod.polyV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A [Quaternion](//en.wikipedia.org/wiki/Quaternion). Please note: if in the
  * response you see &quot;w: 1&quot; and nothing else this is the default
  * value of [0, 0, 0, 1] where x,y, and z are 0.
  */
@js.native
trait SchemaQuaternion extends js.Object {
  /**
    * The scalar component.
    */
  var w: js.UndefOr[Double] = js.native
  /**
    * The x component.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * The y component.
    */
  var y: js.UndefOr[Double] = js.native
  /**
    * The z component.
    */
  var z: js.UndefOr[Double] = js.native
}

object SchemaQuaternion {
  @scala.inline
  def apply(
    w: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined,
    z: js.UndefOr[Double] = js.undefined
  ): SchemaQuaternion = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(w)) __obj.updateDynamic("w")(w.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (!js.isUndefined(z)) __obj.updateDynamic("z")(z.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQuaternion]
  }
}

