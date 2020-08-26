package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @see {@link Icon} */
@js.native
trait ReadonlyIcon extends js.Object {
  /** @see {@link Icon#anchor} */
  val anchor: js.UndefOr[Point] = js.native
  /** @see {@link Icon#labelOrigin} */
  val labelOrigin: js.UndefOr[Point] = js.native
  /** @see {@link Icon#origin} */
  val origin: js.UndefOr[Point] = js.native
  /** @see {@link Icon#scaledSize} */
  val scaledSize: js.UndefOr[Size] = js.native
  /** @see {@link Icon#size} */
  val size: js.UndefOr[Size] = js.native
  /** @see {@link Icon#url} */
  val url: String = js.native
}

object ReadonlyIcon {
  @scala.inline
  def apply(url: String): ReadonlyIcon = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIcon]
  }
  @scala.inline
  implicit class ReadonlyIconOps[Self <: ReadonlyIcon] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnchor(value: Point): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    @scala.inline
    def setLabelOrigin(value: Point): Self = this.set("labelOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelOrigin: Self = this.set("labelOrigin", js.undefined)
    @scala.inline
    def setOrigin(value: Point): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setScaledSize(value: Size): Self = this.set("scaledSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaledSize: Self = this.set("scaledSize", js.undefined)
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

