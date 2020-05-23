package typings.karmaBrowserstackLauncher.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLauncher
  extends /**
  * you can also pass through any additional options supported by browserstack. (EG. `url`, `resolution`, etc.)
  * See {@link browserstack.com/automate/capabilities} for a full list of supported options.
  */
/* option */ StringDictionary[js.Any] {
  /** name of the browser */
  var browser: js.UndefOr[String | Null] = js.undefined
  /** version of the browser */
  var browser_version: js.UndefOr[String | Null] = js.undefined
  /** the BS worker build name (optional, defaults to global) */
  var build: js.UndefOr[String] = js.undefined
  /** name of the device */
  var device: js.UndefOr[String | Null] = js.undefined
  /** the BS worker name (optional, defaults to global) */
  var name: js.UndefOr[String] = js.undefined
  /** which platform */
  var os: js.UndefOr[String | Null] = js.undefined
  /** version of the platform */
  var os_version: js.UndefOr[String | Null] = js.undefined
  /** the BS worker project name (optional, defaults to global) */
  var project: js.UndefOr[String] = js.undefined
  /** allows the session to run on a real mobile device instead of an emulator / simulator */
  var realMobile: js.UndefOr[Boolean] = js.undefined
  /** allows the session to run on a real mobile device instead of an emulator / simulator */
  var real_mobile: js.UndefOr[Boolean] = js.undefined
}

object CustomLauncher {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    browser: js.UndefOr[Null | String] = js.undefined,
    browser_version: js.UndefOr[Null | String] = js.undefined,
    build: String = null,
    device: js.UndefOr[Null | String] = js.undefined,
    name: String = null,
    os: js.UndefOr[Null | String] = js.undefined,
    os_version: js.UndefOr[Null | String] = js.undefined,
    project: String = null,
    realMobile: js.UndefOr[Boolean] = js.undefined,
    real_mobile: js.UndefOr[Boolean] = js.undefined
  ): CustomLauncher = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(browser)) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (!js.isUndefined(browser_version)) __obj.updateDynamic("browser_version")(browser_version.asInstanceOf[js.Any])
    if (build != null) __obj.updateDynamic("build")(build.asInstanceOf[js.Any])
    if (!js.isUndefined(device)) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(os)) __obj.updateDynamic("os")(os.asInstanceOf[js.Any])
    if (!js.isUndefined(os_version)) __obj.updateDynamic("os_version")(os_version.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (!js.isUndefined(realMobile)) __obj.updateDynamic("realMobile")(realMobile.get.asInstanceOf[js.Any])
    if (!js.isUndefined(real_mobile)) __obj.updateDynamic("real_mobile")(real_mobile.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLauncher]
  }
}

