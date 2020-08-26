package typings.makerJs.MakerJs.exporter

import typings.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PDF rendering options.
  */
@js.native
trait IPDFRenderOptions extends IExportOptions {
  /**
    * Rendered reference origin.
    */
  var origin: js.UndefOr[IPoint] = js.native
  /**
    * SVG color of the rendered paths.
    */
  var stroke: js.UndefOr[String] = js.native
}

object IPDFRenderOptions {
  @scala.inline
  def apply(): IPDFRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPDFRenderOptions]
  }
  @scala.inline
  implicit class IPDFRenderOptionsOps[Self <: IPDFRenderOptions] (val x: Self) extends AnyVal {
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
    def setOrigin(value: IPoint): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
  }
  
}

