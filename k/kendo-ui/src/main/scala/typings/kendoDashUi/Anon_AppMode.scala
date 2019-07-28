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
    val __obj = js.Dynamic.literal(appMode = appMode, browser = browser, device = device, flatVersion = flatVersion, majorVersion = majorVersion, minorVersion = minorVersion, name = name, tablet = tablet)
  
    __obj.asInstanceOf[Anon_AppMode]
  }
}

