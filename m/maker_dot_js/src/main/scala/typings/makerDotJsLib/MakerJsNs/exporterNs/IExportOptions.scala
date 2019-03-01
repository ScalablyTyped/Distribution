package typings
package makerDotJsLib.MakerJsNs.exporterNs

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
  var units: js.UndefOr[java.lang.String] = js.undefined
}

object IExportOptions {
  @scala.inline
  def apply(units: java.lang.String = null): IExportOptions = {
    val __obj = js.Dynamic.literal()
    if (units != null) __obj.updateDynamic("units")(units)
    __obj.asInstanceOf[IExportOptions]
  }
}

