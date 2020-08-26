package typings.luminoDomutils.elementMod.ElementExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which holds the min and max size data for an element.
  */
@js.native
trait ISizeLimits extends js.Object {
  /**
    * The maximum height, in pixels.
    */
  var maxHeight: Double = js.native
  /**
    * The maximum width, in pixels.
    */
  var maxWidth: Double = js.native
  /**
    * The minimum height, in pixels.
    */
  var minHeight: Double = js.native
  /**
    * The minimum width, in pixels.
    */
  var minWidth: Double = js.native
}

object ISizeLimits {
  @scala.inline
  def apply(maxHeight: Double, maxWidth: Double, minHeight: Double, minWidth: Double): ISizeLimits = {
    val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISizeLimits]
  }
  @scala.inline
  implicit class ISizeLimitsOps[Self <: ISizeLimits] (val x: Self) extends AnyVal {
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
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
  }
  
}

