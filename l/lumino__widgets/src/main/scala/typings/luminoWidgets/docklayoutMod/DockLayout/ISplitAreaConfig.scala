package typings.luminoWidgets.docklayoutMod.DockLayout

import typings.luminoWidgets.luminoWidgetsStrings.`split-area`
import typings.luminoWidgets.luminoWidgetsStrings.horizontal
import typings.luminoWidgets.luminoWidgetsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A layout config object for a split area.
  */
@js.native
trait ISplitAreaConfig extends AreaConfig {
  /**
    * The children in the split area.
    */
  var children: js.Array[AreaConfig] = js.native
  /**
    * The orientation of the split area.
    */
  var orientation: horizontal | vertical = js.native
  /**
    * The relative sizes of the children.
    */
  var sizes: js.Array[Double] = js.native
  /**
    * The discriminated type of the config object.
    */
  var `type`: `split-area` = js.native
}

object ISplitAreaConfig {
  @scala.inline
  def apply(
    children: js.Array[AreaConfig],
    orientation: horizontal | vertical,
    sizes: js.Array[Double],
    `type`: `split-area`
  ): ISplitAreaConfig = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISplitAreaConfig]
  }
  @scala.inline
  implicit class ISplitAreaConfigOps[Self <: ISplitAreaConfig] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: AreaConfig*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[AreaConfig]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientation(value: horizontal | vertical): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizesVarargs(value: Double*): Self = this.set("sizes", js.Array(value :_*))
    @scala.inline
    def setSizes(value: js.Array[Double]): Self = this.set("sizes", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `split-area`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

