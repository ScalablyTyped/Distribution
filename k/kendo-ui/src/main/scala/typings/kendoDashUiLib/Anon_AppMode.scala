package typings
package kendoDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppMode extends js.Object {
  var appMode: scala.Boolean
  var browser: java.lang.String
  var device: java.lang.String
  var flatVersion: scala.Double
  var majorVersion: java.lang.String
  var minorVersion: java.lang.String
  var name: java.lang.String
  var tablet: js.Any
}

object Anon_AppMode {
  @scala.inline
  def apply(
    appMode: scala.Boolean,
    browser: java.lang.String,
    device: java.lang.String,
    flatVersion: scala.Double,
    majorVersion: java.lang.String,
    minorVersion: java.lang.String,
    name: java.lang.String,
    tablet: js.Any
  ): Anon_AppMode = {
    val __obj = js.Dynamic.literal(appMode = appMode, browser = browser, device = device, flatVersion = flatVersion, majorVersion = majorVersion, minorVersion = minorVersion, name = name, tablet = tablet)
  
    __obj.asInstanceOf[Anon_AppMode]
  }
}

