package typings.jwplayer.jwplayerNs

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
    val __obj = js.Dynamic.literal(android = android, androidNative = androidNative, iOS = iOS, iPad = iPad, iPhone = iPhone, mac = mac, mobile = mobile, version = version, windows = windows)
  
    __obj.asInstanceOf[OS]
  }
}

