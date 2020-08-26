package typings.makerJs.MakerJs.exporter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @private
  */
@js.native
trait IExportOptions extends js.Object {
  /**
    * Unit system to embed in exported file.
    */
  var units: js.UndefOr[String] = js.native
}

object IExportOptions {
  @scala.inline
  def apply(): IExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExportOptions]
  }
  @scala.inline
  implicit class IExportOptionsOps[Self <: IExportOptions] (val x: Self) extends AnyVal {
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
    def setUnits(value: String): Self = this.set("units", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
  }
  
}

