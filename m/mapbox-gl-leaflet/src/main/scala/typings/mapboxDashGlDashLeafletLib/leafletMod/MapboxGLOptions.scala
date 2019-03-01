package typings
package mapboxDashGlDashLeafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapboxGLOptions extends js.Object {
  var accessToken: java.lang.String
  var style: java.lang.String
}

object MapboxGLOptions {
  @scala.inline
  def apply(accessToken: java.lang.String, style: java.lang.String): MapboxGLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessToken")(accessToken)
    __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[MapboxGLOptions]
  }
}

