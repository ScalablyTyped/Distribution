package typings.jui

import typings.jui.juiStrings.horizontal
import typings.jui.juiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBarSize extends js.Object {
  /**
    * @cfg {Number} [barSize=4]
    * set splitter's bar size
    */
  var barSize: js.UndefOr[Double] = js.undefined
  /**
    * @cfg {Object} [barStyle={}]
    * set custom splitter bar style
    */
  var barStyle: js.UndefOr[js.Object] = js.undefined
  /**
    * @cfg {"vertical"/"horizontal"} [direction='vertical']
    * set bar's direction
    */
  var direction: js.UndefOr[vertical | horizontal] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {Boolean} [fixed=false]
    *
    * if fixed is true, panels can not resize.
    *
    */
  var fixed: js.UndefOr[Boolean] = js.undefined
  /**
    * @cfg {String} [hideClass='hide']
    * set splitter's hide class for design
    */
  var hideClass: js.UndefOr[String] = js.undefined
  /**
    * @cfg {String/Number} [initSize='50%']
    * set first panel's default width or height
    */
  var initSize: js.UndefOr[String | Double] = js.undefined
  /**
    * @cfg {String} [items=[]]
    *
    * set items  to placed in vertical or horizontal
    *
    * support max two times
    *
    */
  var items: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * @cfg {Number/Array} [minSize=30]
    * set panel's minimum width or height
    *
    * if minSize is number , minSize is conver to array
    *
    * minSize[0] is first panel's minimum size
    * minSize[1] is second panel's minimum size
    *
    */
  var minSize: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /**
    * @cfg {String} [splitterClass='ui-splitter']
    * set splitter's class for design
    */
  var splitterClass: js.UndefOr[String] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
}

object AnonBarSize {
  @scala.inline
  def apply(
    barSize: Int | Double = null,
    barStyle: js.Object = null,
    direction: vertical | horizontal = null,
    event: js.Any = null,
    fixed: js.UndefOr[Boolean] = js.undefined,
    hideClass: String = null,
    initSize: String | Double = null,
    items: js.Array[_] = null,
    minSize: Double | js.Array[Double] = null,
    splitterClass: String = null,
    tpl: js.Any = null
  ): AnonBarSize = {
    val __obj = js.Dynamic.literal()
    if (barSize != null) __obj.updateDynamic("barSize")(barSize.asInstanceOf[js.Any])
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (hideClass != null) __obj.updateDynamic("hideClass")(hideClass.asInstanceOf[js.Any])
    if (initSize != null) __obj.updateDynamic("initSize")(initSize.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (splitterClass != null) __obj.updateDynamic("splitterClass")(splitterClass.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBarSize]
  }
}

