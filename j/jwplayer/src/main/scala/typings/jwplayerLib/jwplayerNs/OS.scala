package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OS extends js.Object {
  var android: scala.Boolean
  var androidNative: scala.Boolean
     // Android native browser
  var iOS: scala.Boolean
  var iPad: scala.Boolean
  var iPhone: scala.Boolean
  var mac: scala.Boolean
  var mobile: scala.Boolean
  var version: Version
  var windows: scala.Boolean
}

object OS {
  @scala.inline
  def apply(
    android: scala.Boolean,
    androidNative: scala.Boolean,
    iOS: scala.Boolean,
    iPad: scala.Boolean,
    iPhone: scala.Boolean,
    mac: scala.Boolean,
    mobile: scala.Boolean,
    version: Version,
    windows: scala.Boolean
  ): OS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("android")(android)
    __obj.updateDynamic("androidNative")(androidNative)
    __obj.updateDynamic("iOS")(iOS)
    __obj.updateDynamic("iPad")(iPad)
    __obj.updateDynamic("iPhone")(iPhone)
    __obj.updateDynamic("mac")(mac)
    __obj.updateDynamic("mobile")(mobile)
    __obj.updateDynamic("version")(version)
    __obj.updateDynamic("windows")(windows)
    __obj.asInstanceOf[OS]
  }
}

