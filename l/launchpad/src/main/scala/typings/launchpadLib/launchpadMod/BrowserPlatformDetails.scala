package typings
package launchpadLib.launchpadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserPlatformDetails extends js.Object {
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var command: js.UndefOr[java.lang.String] = js.undefined
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var defaultLocation: js.UndefOr[java.lang.String] = js.undefined
  var getCommand: js.UndefOr[
    js.Function3[
      /* browser */ BrowserPlatformDetails, 
      /* url */ java.lang.String, 
      /* args */ js.Array[java.lang.String], 
      java.lang.String
    ]
  ] = js.undefined
  var imageName: js.UndefOr[java.lang.String] = js.undefined
  var multi: js.UndefOr[scala.Boolean] = js.undefined
  var opensTab: js.UndefOr[scala.Boolean] = js.undefined
  var pathQuery: js.UndefOr[java.lang.String] = js.undefined
  var plistPath: js.UndefOr[java.lang.String] = js.undefined
  var process: js.UndefOr[java.lang.String] = js.undefined
  var versionKey: js.UndefOr[java.lang.String] = js.undefined
}

object BrowserPlatformDetails {
  @scala.inline
  def apply(
    args: js.Array[java.lang.String] = null,
    command: java.lang.String = null,
    cwd: java.lang.String = null,
    defaultLocation: java.lang.String = null,
    getCommand: (/* browser */ BrowserPlatformDetails, /* url */ java.lang.String, /* args */ js.Array[java.lang.String]) => java.lang.String = null,
    imageName: java.lang.String = null,
    multi: js.UndefOr[scala.Boolean] = js.undefined,
    opensTab: js.UndefOr[scala.Boolean] = js.undefined,
    pathQuery: java.lang.String = null,
    plistPath: java.lang.String = null,
    process: java.lang.String = null,
    versionKey: java.lang.String = null
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

