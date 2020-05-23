package typings.launchpad.mod

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
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (defaultLocation != null) __obj.updateDynamic("defaultLocation")(defaultLocation.asInstanceOf[js.Any])
    if (getCommand != null) __obj.updateDynamic("getCommand")(js.Any.fromFunction3(getCommand))
    if (imageName != null) __obj.updateDynamic("imageName")(imageName.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opensTab)) __obj.updateDynamic("opensTab")(opensTab.get.asInstanceOf[js.Any])
    if (pathQuery != null) __obj.updateDynamic("pathQuery")(pathQuery.asInstanceOf[js.Any])
    if (plistPath != null) __obj.updateDynamic("plistPath")(plistPath.asInstanceOf[js.Any])
    if (process != null) __obj.updateDynamic("process")(process.asInstanceOf[js.Any])
    if (versionKey != null) __obj.updateDynamic("versionKey")(versionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserPlatformDetails]
  }
}

