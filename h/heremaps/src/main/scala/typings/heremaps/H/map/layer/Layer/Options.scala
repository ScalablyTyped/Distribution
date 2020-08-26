package typings.heremaps.H.map.layer.Layer

import typings.heremaps.H.geo.IProjection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options which can be used when creating new layer object.
  * @property min {number=} - The minimum zoom level for which the layer can provide data, default is 0
  * @property max {number=} - The maximum zoom level for which the layer can provide data, default is 22
  * @property dark {boolean=} - Indicates whether the content of this layer is mainly dark, default is false See also H.Map.Options#autoColor
  * @property projection {H.geo.IProjection=} - The projection to be used for this layer, default is H.geo.mercator
  * @property minWorldSize {number=} - The minimal world size at zoom level 0, default is 256
  */
@js.native
trait Options extends js.Object {
  var dark: js.UndefOr[Boolean] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var minWorldSize: js.UndefOr[Double] = js.native
  var projection: js.UndefOr[IProjection] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setDark(value: Boolean): Self = this.set("dark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDark: Self = this.set("dark", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMinWorldSize(value: Double): Self = this.set("minWorldSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWorldSize: Self = this.set("minWorldSize", js.undefined)
    @scala.inline
    def setProjection(value: IProjection): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
  }
  
}

