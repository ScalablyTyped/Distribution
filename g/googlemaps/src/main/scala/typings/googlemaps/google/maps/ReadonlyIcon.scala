package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @see {@link Icon} */
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
  val url: String
}

object ReadonlyIcon {
  @scala.inline
  def apply(
    url: String,
    anchor: Point = null,
    labelOrigin: Point = null,
    origin: Point = null,
    scaledSize: Size = null,
    size: Size = null
  ): ReadonlyIcon = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (labelOrigin != null) __obj.updateDynamic("labelOrigin")(labelOrigin.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (scaledSize != null) __obj.updateDynamic("scaledSize")(scaledSize.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIcon]
  }
}

