package typings
package launchpadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aurora extends js.Object {
  var aurora: js.UndefOr[launchpadLib.launchpadMod.BrowserPlatformDetails] = js.undefined
  var canary: js.UndefOr[launchpadLib.launchpadMod.BrowserPlatformDetails] = js.undefined
  var chrome: js.UndefOr[launchpadLib.launchpadMod.BrowserPlatformDetails] = js.undefined
  var chromium: js.UndefOr[launchpadLib.launchpadMod.BrowserPlatformDetails] = js.undefined
  var edge: js.UndefOr[launchpadLib.launchpadMod.BrowserPlatformDetails] = js.undefined
  var firefox: js.UndefOr[launchpadLib.launchpadMod.BrowserPlatformDetails] = js.undefined
  var ie: js.UndefOr[launchpadLib.launchpadMod.BrowserPlatformDetails] = js.undefined
  var nodeWebkit: js.UndefOr[launchpadLib.launchpadMod.BrowserPlatformDetails] = js.undefined
  var opera: js.UndefOr[launchpadLib.launchpadMod.BrowserPlatformDetails] = js.undefined
  var phantom: js.UndefOr[launchpadLib.launchpadMod.BrowserPlatformDetails] = js.undefined
  var safari: js.UndefOr[launchpadLib.launchpadMod.BrowserPlatformDetails] = js.undefined
}

object Anon_Aurora {
  @scala.inline
  def apply(
    aurora: launchpadLib.launchpadMod.BrowserPlatformDetails = null,
    canary: launchpadLib.launchpadMod.BrowserPlatformDetails = null,
    chrome: launchpadLib.launchpadMod.BrowserPlatformDetails = null,
    chromium: launchpadLib.launchpadMod.BrowserPlatformDetails = null,
    edge: launchpadLib.launchpadMod.BrowserPlatformDetails = null,
    firefox: launchpadLib.launchpadMod.BrowserPlatformDetails = null,
    ie: launchpadLib.launchpadMod.BrowserPlatformDetails = null,
    nodeWebkit: launchpadLib.launchpadMod.BrowserPlatformDetails = null,
    opera: launchpadLib.launchpadMod.BrowserPlatformDetails = null,
    phantom: launchpadLib.launchpadMod.BrowserPlatformDetails = null,
    safari: launchpadLib.launchpadMod.BrowserPlatformDetails = null
  ): Anon_Aurora = {
    val __obj = js.Dynamic.literal()
    if (aurora != null) __obj.updateDynamic("aurora")(aurora)
    if (canary != null) __obj.updateDynamic("canary")(canary)
    if (chrome != null) __obj.updateDynamic("chrome")(chrome)
    if (chromium != null) __obj.updateDynamic("chromium")(chromium)
    if (edge != null) __obj.updateDynamic("edge")(edge)
    if (firefox != null) __obj.updateDynamic("firefox")(firefox)
    if (ie != null) __obj.updateDynamic("ie")(ie)
    if (nodeWebkit != null) __obj.updateDynamic("nodeWebkit")(nodeWebkit)
    if (opera != null) __obj.updateDynamic("opera")(opera)
    if (phantom != null) __obj.updateDynamic("phantom")(phantom)
    if (safari != null) __obj.updateDynamic("safari")(safari)
    __obj.asInstanceOf[Anon_Aurora]
  }
}

