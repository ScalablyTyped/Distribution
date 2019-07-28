package typings.mapboxDashGlDashLeaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapboxGLOptions extends js.Object {
  var accessToken: String
  var style: String
}

object MapboxGLOptions {
  @scala.inline
  def apply(accessToken: String, style: String): MapboxGLOptions = {
    val __obj = js.Dynamic.literal(accessToken = accessToken, style = style)
  
    __obj.asInstanceOf[MapboxGLOptions]
  }
}

