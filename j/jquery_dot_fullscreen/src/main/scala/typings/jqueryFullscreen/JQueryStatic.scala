package typings.jqueryFullscreen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Extends JqueryStatic ($)
  * i.e: To use $.fullscreen.functionName()
  */
@js.native
trait JQueryStatic extends js.Object {
  var fullscreen: JQueryFullscreen = js.native
}

object JQueryStatic {
  @scala.inline
  def apply(fullscreen: JQueryFullscreen): JQueryStatic = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  @scala.inline
  implicit class JQueryStaticOps[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFullscreen(value: JQueryFullscreen): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
  }
  
}

