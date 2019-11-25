package typings.kendoDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppMode extends js.Object {
  var appMode: Boolean
  var browser: String
  var device: String
  var flatVersion: Double
  var majorVersion: String
  var minorVersion: String
  var name: String
  var tablet: js.Any
}

object Anon_AppMode {
  @scala.inline
  def apply(
    appMode: Boolean,
    browser: String,
    device: String,
    flatVersion: Double,
    majorVersion: String,
    minorVersion: String,
    name: String,
    tablet: js.Any
  ): Anon_AppMode = {
    val __obj = js.Dynamic.literal(appMode = appMode.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], flatVersion = flatVersion.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AppMode]
  }
}

