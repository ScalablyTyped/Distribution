package typings.imagemapster.mod.global.ImageMapster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreaRenderingOptions extends RenderingOptions {
  /**
    * when rendering an area or area group, also render the areas in the
    * other group (or groups) specified
    *
    * This is an area-specific option that allows you to create
    * supergroups. A supergroup is a collection of groups that will all be
    * highlighted simultaneously, but only when the area that defines the
    * supergroup is moused over or activated through code.
    *
    * When the area for which this option has been set is activated, all
    * the areas specified in the includeKeys list will also be rendered.
    * This is a one-way relationship. Defining a supergroup in an area
    * causes all the other groups to be highlighted, but not the other way
    * around.
    *
    * A typical use of this is to define areas that you want to be
    * highlighted when the mouse enters some specific area, but that you
    * do not want to be highlighted on their own if the target area is
    * moused over. This could be a hidden menu, for example: you want the
    * menu to display when the hotspot is moused over, but when it's
    * hidden, mousing over the menu area itself should have no effect.
    */
  var includeKeys: js.UndefOr[String] = js.native
  /**
    * the area is a mask rather than a highlighted area.
    *
    * Normally, every area in an imagemap is an active area, and would be
    * highlighted when moused over (unless its behavior was otherwise
    * specified with staticState). The isMask option allows you to
    * identify an area as being a mask. When a mask is part of an area
    * group, the masked area will be specifically excluded from the
    * rendering of a highlight or selected state.
    *
    * This is usually used in conjunction, or instead of, the nohref
    * attribute of the area tag. When nohref is specified on an area tag,
    * that area is specifically excluded from the hotspot of any area that
    * encompasses it. It will not respond to mouse events, and will not be
    * highlighted. This can be used to create "holes" in hotspots. By
    * default, ImageMapster will treat any area with nohref or no href tag
    * as masks, the same as if this option had been applied.
    *
    * Sometimes you won't be able to use nohref to identify something as a
    * mask, for example, if you intend to re-use an area has both a mask,
    * and an independent hotspot. This would be typical if you wanted to a
    * selectable area that was completely included within another
    * selectable area, but functioned independently, such as concentric
    * circles. In this case, you would need to identify the inner circle
    * as both a mask, and a hotspot. The nohref attribute would make it
    * not act as a hotspot, and only function as a mask. You couldn't also
    * select the inner area. You can solve this problem by including the
    * inner circle in two different groups - one group which is a mask for
    * the main area, and another which is an independent selectable area.
    * You can specify different options for each group, so even though
    * it's just one area, it can function as two completely independent
    * ones.
    *
    * There may also be situations where you do not want an area marked
    * with nohref to be treated as a mask. For example, given "area1" and
    * "area2," you may want to create a configuration where mousing over
    * "area1" causes both "area1" and "area2" to be highlighted, but
    * "area2" should not be highlighted on its own when it is moused over.
    * In this situation, you'll need to use "nohref" to prevent the hover
    * behavior for the area, but you still want it to be treated normally
    * when it's rendered as a result of mousing over "area1." You can
    * accomplish this using the noHrefIsMask global option, below.
    *
    * Generally, masked areas will appear as a window to the underlying
    * image. If stroke is in effect, the stroke will be rendered for the
    * mask as well as the areas, to create both inner and outer borders.
    * You can always specifically enable or disable this, or any other
    * effect, for any area as desired.
    *
    */
  var isMask: js.UndefOr[Boolean] = js.native
  var key: String = js.native
  /**
    * tool tip data for an area
    *
    * When this area-specific option is present and showToolTips = true, a
    * toolTipContainer will be created this will be inserted into it,
    * either as inner text (if only text as passed) or as HTML if a jQuery
    * object is passed. In order to pass anything other than plain text
    * using this option you must use a jQuery object. Any string will be
    * treated as plain text (and special characters rendered correctly).
    */
  var toolTip: js.UndefOr[String] = js.native
}

object AreaRenderingOptions {
  @scala.inline
  def apply(key: String): AreaRenderingOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaRenderingOptions]
  }
  @scala.inline
  implicit class AreaRenderingOptionsOps[Self <: AreaRenderingOptions] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeKeys(value: String): Self = this.set("includeKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeKeys: Self = this.set("includeKeys", js.undefined)
    @scala.inline
    def setIsMask(value: Boolean): Self = this.set("isMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsMask: Self = this.set("isMask", js.undefined)
    @scala.inline
    def setToolTip(value: String): Self = this.set("toolTip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolTip: Self = this.set("toolTip", js.undefined)
  }
  
}

