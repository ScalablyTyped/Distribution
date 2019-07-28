package typings.launchpad.launchpadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserPlatformDetails extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var command: js.UndefOr[String] = js.undefined
  var cwd: js.UndefOr[String] = js.undefined
  var defaultLocation: js.UndefOr[String] = js.undefined
  var getCommand: js.UndefOr[
    js.Function3[
      /* browser */ BrowserPlatformDetails, 
      /* url */ String, 
      /* args */ js.Array[String], 
      String
    ]
  ] = js.undefined
  var imageName: js.UndefOr[String] = js.undefined
  var multi: js.UndefOr[Boolean] = js.undefined
  var opensTab: js.UndefOr[Boolean] = js.undefined
  var pathQuery: js.UndefOr[String] = js.undefined
  var plistPath: js.UndefOr[String] = js.undefined
  var process: js.UndefOr[String] = js.undefined
  var versionKey: js.UndefOr[String] = js.undefined
}

object BrowserPlatformDetails {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    command: String = null,
    cwd: String = null,
    defaultLocation: String = null,
    getCommand: (/* browser */ BrowserPlatformDetails, /* url */ String, /* args */ js.Array[String]) => String = null,
    imageName: String = null,
    multi: js.UndefOr[Boolean] = js.undefined,
    opensTab: js.UndefOr[Boolean] = js.undefined,
    pathQuery: String = null,
    plistPath: String = null,
    process: String = null,
    versionKey: String = null
  ): BrowserPlatformDetails = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (command != null) __obj.updateDynamic("command")(command)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (defaultLocation != null) __obj.updateDynamic("defaultLocation")(defaultLocation)
    if (getCommand != null) __obj.updateDynamic("getCommand")(js.Any.fromFunction3(getCommand))
    if (imageName != null) __obj.updateDynamic("imageName")(imageName)
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi)
    if (!js.isUndefined(opensTab)) __obj.updateDynamic("opensTab")(opensTab)
    if (pathQuery != null) __obj.updateDynamic("pathQuery")(pathQuery)
    if (plistPath != null) __obj.updateDynamic("plistPath")(plistPath)
    if (process != null) __obj.updateDynamic("process")(process)
    if (versionKey != null) __obj.updateDynamic("versionKey")(versionKey)
    __obj.asInstanceOf[BrowserPlatformDetails]
  }
}

