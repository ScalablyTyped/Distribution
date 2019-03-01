package typings
package juiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BarSize extends js.Object {
  /**
    * @cfg {Number} [barSize=4]
    * set splitter's bar size
    */
  var barSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * @cfg {Object} [barStyle={}]
    * set custom splitter bar style
    */
  var barStyle: js.UndefOr[js.Object] = js.undefined
  /**
    * @cfg {"vertical"/"horizontal"} [direction='vertical']
    * set bar's direction
    */
  var direction: js.UndefOr[juiLib.juiLibStrings.vertical | juiLib.juiLibStrings.horizontal] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {Boolean} [fixed=false]
    *
    * if fixed is true, panels can not resize.
    *
    */
  var fixed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @cfg {String} [hideClass='hide']
    * set splitter's hide class for design
    */
  var hideClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @cfg {String/Number} [initSize='50%']
    * set first panel's default width or height
    */
  var initSize: js.UndefOr[java.lang.String | scala.Double] = js.undefined
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
  var minSize: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  /**
    * @cfg {String} [splitterClass='ui-splitter']
    * set splitter's class for design
    */
  var splitterClass: js.UndefOr[java.lang.String] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
}

object Anon_BarSize {
  @scala.inline
  def apply(
    barSize: scala.Int | scala.Double = null,
    barStyle: js.Object = null,
    direction: juiLib.juiLibStrings.vertical | juiLib.juiLibStrings.horizontal = null,
    event: js.Any = null,
    fixed: js.UndefOr[scala.Boolean] = js.undefined,
    hideClass: java.lang.String = null,
    initSize: java.lang.String | scala.Double = null,
    items: js.Array[_] = null,
    minSize: scala.Double | js.Array[scala.Double] = null,
    splitterClass: java.lang.String = null,
    tpl: js.Any = null
  ): Anon_BarSize = {
    val __obj = js.Dynamic.literal()
    if (barSize != null) __obj.updateDynamic("barSize")(barSize.asInstanceOf[js.Any])
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event)
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed)
    if (hideClass != null) __obj.updateDynamic("hideClass")(hideClass)
    if (initSize != null) __obj.updateDynamic("initSize")(initSize.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items)
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (splitterClass != null) __obj.updateDynamic("splitterClass")(splitterClass)
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    __obj.asInstanceOf[Anon_BarSize]
  }
}

