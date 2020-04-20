package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OS extends js.Object {
  var android: Boolean
  var androidNative: Boolean
     // Android native browser
  var iOS: Boolean
  var iPad: Boolean
  var iPhone: Boolean
  var mac: Boolean
  var mobile: Boolean
  var version: Version
  var windows: Boolean
}

object OS {
  @scala.inline
  def apply(
    android: Boolean,
    androidNative: Boolean,
    iOS: Boolean,
    iPad: Boolean,
    iPhone: Boolean,
    mac: Boolean,
    mobile: Boolean,
    version: Version,
    windows: Boolean
  ): OS = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], androidNative = androidNative.asInstanceOf[js.Any], iOS = iOS.asInstanceOf[js.Any], iPad = iPad.asInstanceOf[js.Any], iPhone = iPhone.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[OS]
  }
}

