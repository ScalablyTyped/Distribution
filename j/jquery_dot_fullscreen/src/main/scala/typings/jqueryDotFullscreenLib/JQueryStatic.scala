package typings
package jqueryDotFullscreenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Extends JqueryStatic ($)
  * i.e: To use $.fullscreen.functionName()
  */
trait JQueryStatic extends js.Object {
  var fullscreen: JQueryFullscreen
}

object JQueryStatic {
  @scala.inline
  def apply(fullscreen: JQueryFullscreen): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fullscreen")(fullscreen)
    __obj.asInstanceOf[JQueryStatic]
  }
}

