package typings.kendoUi.kendo.dataviz.map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileLayerOptions extends js.Object {
  var name: js.UndefOr[String] = js.native
  var subdomains: js.UndefOr[js.Any] = js.native
  var tileSize: js.UndefOr[Double] = js.native
  var urlTemplate: js.UndefOr[String] = js.native
}

object TileLayerOptions {
  @scala.inline
  def apply(): TileLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayerOptions]
  }
  @scala.inline
  implicit class TileLayerOptionsOps[Self <: TileLayerOptions] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSubdomains(value: js.Any): Self = this.set("subdomains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubdomains: Self = this.set("subdomains", js.undefined)
    @scala.inline
    def setTileSize(value: Double): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileSize: Self = this.set("tileSize", js.undefined)
    @scala.inline
    def setUrlTemplate(value: String): Self = this.set("urlTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlTemplate: Self = this.set("urlTemplate", js.undefined)
  }
  
}

