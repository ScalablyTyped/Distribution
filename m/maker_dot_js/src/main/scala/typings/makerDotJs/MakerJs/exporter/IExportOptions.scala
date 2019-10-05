package typings.makerDotJs.MakerJs.exporter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @private
  */
trait IExportOptions extends js.Object {
  /**
    * Unit system to embed in exported file.
    */
  var units: js.UndefOr[String] = js.undefined
}

object IExportOptions {
  @scala.inline
  def apply(units: String = null): IExportOptions = {
    val __obj = js.Dynamic.literal()
    if (units != null) __obj.updateDynamic("units")(units)
    __obj.asInstanceOf[IExportOptions]
  }
}

