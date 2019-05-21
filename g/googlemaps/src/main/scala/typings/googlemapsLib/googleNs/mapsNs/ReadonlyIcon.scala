package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadonlyIcon extends js.Object {
  /** @see {@link Icon#anchor} */
  val anchor: js.UndefOr[Point] = js.undefined
  /** @see {@link Icon#labelOrigin} */
  val labelOrigin: js.UndefOr[Point] = js.undefined
  /** @see {@link Icon#origin} */
  val origin: js.UndefOr[Point] = js.undefined
  /** @see {@link Icon#scaledSize} */
  val scaledSize: js.UndefOr[Size] = js.undefined
  /** @see {@link Icon#size} */
  val size: js.UndefOr[Size] = js.undefined
  /** @see {@link Icon#url} */
  val url: java.lang.String
}

object ReadonlyIcon {
  @scala.inline
  def apply(
    url: java.lang.String,
    anchor: Point = null,
    labelOrigin: Point = null,
    origin: Point = null,
    scaledSize: Size = null,
    size: Size = null
  ): ReadonlyIcon = {
    val __obj = js.Dynamic.literal(url = url)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (labelOrigin != null) __obj.updateDynamic("labelOrigin")(labelOrigin)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (scaledSize != null) __obj.updateDynamic("scaledSize")(scaledSize)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[ReadonlyIcon]
  }
}

