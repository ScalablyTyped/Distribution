package typings.luminoWidgets.docklayoutMod.DockLayout

import typings.luminoWidgets.tabbarMod.TabBar
import typings.luminoWidgets.widgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which represents the geometry of a tab area.
  */
@js.native
trait ITabAreaGeometry extends js.Object {
  /**
    * The local coordinate of the bottom edge of the tab area.
    *
    * #### Notes
    * This is the distance from the bottom edge of the layout parent
    * widget, to the bottom edge of the tab area.
    */
  var bottom: Double = js.native
  /**
    * The height of the tab area.
    *
    * #### Notes
    * This is total height allocated for the tab area.
    */
  var height: Double = js.native
  /**
    * The local coordinate of the left edge of the tab area.
    *
    * #### Notes
    * This is the distance from the left edge of the layout parent
    * widget, to the left edge of the tab area.
    */
  var left: Double = js.native
  /**
    * The local coordinate of the right edge of the tab area.
    *
    * #### Notes
    * This is the distance from the right edge of the layout parent
    * widget, to the right edge of the tab area.
    */
  var right: Double = js.native
  /**
    * The tab bar for the tab area.
    */
  var tabBar: TabBar[Widget] = js.native
  /**
    * The local coordinate of the top edge of the tab area.
    *
    * #### Notes
    * This is the distance from the top edge of the layout parent
    * widget, to the top edge of the tab area.
    */
  var top: Double = js.native
  /**
    * The width of the tab area.
    *
    * #### Notes
    * This is total width allocated for the tab area.
    */
  var width: Double = js.native
  /**
    * The local X position of the hit test in the dock area.
    *
    * #### Notes
    * This is the distance from the left edge of the layout parent
    * widget, to the local X coordinate of the hit test query.
    */
  var x: Double = js.native
  /**
    * The local Y position of the hit test in the dock area.
    *
    * #### Notes
    * This is the distance from the top edge of the layout parent
    * widget, to the local Y coordinate of the hit test query.
    */
  var y: Double = js.native
}

object ITabAreaGeometry {
  @scala.inline
  def apply(
    bottom: Double,
    height: Double,
    left: Double,
    right: Double,
    tabBar: TabBar[Widget],
    top: Double,
    width: Double,
    x: Double,
    y: Double
  ): ITabAreaGeometry = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], tabBar = tabBar.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabAreaGeometry]
  }
  @scala.inline
  implicit class ITabAreaGeometryOps[Self <: ITabAreaGeometry] (val x: Self) extends AnyVal {
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
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabBar(value: TabBar[Widget]): Self = this.set("tabBar", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

