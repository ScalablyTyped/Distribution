package typings.karmaMaterialReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaterialReporterOptions extends js.Object {
  /**
    * whether to open the reporter UI automatically in the default browser
    * @default true
    */
  var autoOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * expand all the expandable suite menus
    * @default true
    */
  var expandSuites: js.UndefOr[Boolean] = js.undefined
  /**
    * port in which the reporter startes a express server
    * @default 3000
    */
  var serverPort: js.UndefOr[Double] = js.undefined
}

object MaterialReporterOptions {
  @scala.inline
  def apply(
    autoOpen: js.UndefOr[Boolean] = js.undefined,
    expandSuites: js.UndefOr[Boolean] = js.undefined,
    serverPort: Int | Double = null
  ): MaterialReporterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(expandSuites)) __obj.updateDynamic("expandSuites")(expandSuites.asInstanceOf[js.Any])
    if (serverPort != null) __obj.updateDynamic("serverPort")(serverPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialReporterOptions]
  }
}

