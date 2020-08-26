package typings.hedron.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxProps
  extends Styleable
     with /**
  *  Allow for customer props due to ability to add
  * custom breakpoints
  */
/* x */ StringDictionary[js.Any] {
  /**
    * Draws all child columns with 'bounding boxes' for easy
    * visualization of the grid. This enables debug mode for all the
    * children of this component
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * Sets whether the Box should fill up all available space
    */
  var fill: js.UndefOr[Boolean] = js.native
  /**
    * Controls the CSS flex property
    */
  var flex: js.UndefOr[String] = js.native
  /**
    * Convenience property for disabling padding
    */
  var fluid: js.UndefOr[Boolean] = js.native
  /**
    * Shifts the box to the bottom of the parent Bounds
    */
  var shiftDown: js.UndefOr[Boolean] = js.native
  /**
    * Shifts the box to the left of the parent Bounds
    */
  var shiftLeft: js.UndefOr[Boolean] = js.native
  /**
    * Shifts the box to the right of the parent Bounds
    */
  var shiftRight: js.UndefOr[Boolean] = js.native
  /**
    * Shifts the box to the top of the parent Bounds
    */
  var shiftUp: js.UndefOr[Boolean] = js.native
}

object BoxProps {
  @scala.inline
  def apply(): BoxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxProps]
  }
  @scala.inline
  implicit class BoxPropsOps[Self <: BoxProps] (val x: Self) extends AnyVal {
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFlex(value: String): Self = this.set("flex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlex: Self = this.set("flex", js.undefined)
    @scala.inline
    def setFluid(value: Boolean): Self = this.set("fluid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFluid: Self = this.set("fluid", js.undefined)
    @scala.inline
    def setShiftDown(value: Boolean): Self = this.set("shiftDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShiftDown: Self = this.set("shiftDown", js.undefined)
    @scala.inline
    def setShiftLeft(value: Boolean): Self = this.set("shiftLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShiftLeft: Self = this.set("shiftLeft", js.undefined)
    @scala.inline
    def setShiftRight(value: Boolean): Self = this.set("shiftRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShiftRight: Self = this.set("shiftRight", js.undefined)
    @scala.inline
    def setShiftUp(value: Boolean): Self = this.set("shiftUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShiftUp: Self = this.set("shiftUp", js.undefined)
  }
  
}

