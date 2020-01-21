package typings.jquerySticky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStickyOptions extends js.Object {
  /**
  	 * Pixels between the page bottom and the element's bottom.
  	 * @default 0
  	 */
  var bottomSpacing: js.UndefOr[Double] = js.undefined
  /**
  	 * Boolean determining whether the sticky element should be horizontally centered in the page.
  	 * @default false
  	 */
  var center: js.UndefOr[Boolean] = js.undefined
  /**
  	 * CSS class added to the element's wrapper when "sticked".
  	 * @default is-sticky
  	 */
  var className: js.UndefOr[String] = js.undefined
  /**
  	 * Selector of element referenced to set fixed width of "sticky" element.
  	 * @default ''
  	 */
  var getWidthFrom: js.UndefOr[String] = js.undefined
  /**
  	 * Boolean determining whether widths will be recalculated on window resize (using getWidthfrom).
  	 * @default false
  	 */
  var responsiveWidth: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Pixels between the page top and the element's top.
  	 * @default 0
  	 */
  var topSpacing: js.UndefOr[Double] = js.undefined
  /**
  	 * Boolean determining whether width of the "sticky" element should be updated to match the wrapper's width.
  	 * Wrapper is a placeholder for "sticky" element while it is fixed (out of static elements flow), and its width depends on the context and CSS rules.
  	 * Works only as long getWidthForm isn't set.
  	 * @default true
  	 */
  var widthFromWrapper: js.UndefOr[Boolean] = js.undefined
  /**
  	 * CSS class added to the wrapper.
  	 * @default 'sticky-wrapper'
  	 */
  var wrapperClassName: js.UndefOr[String] = js.undefined
  /**
  	 * Controls z-index of the sticked element.
  	 * @default inherit
  	 */
  var zIndex: js.UndefOr[String] = js.undefined
}

object JQueryStickyOptions {
  @scala.inline
  def apply(
    bottomSpacing: Int | Double = null,
    center: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    getWidthFrom: String = null,
    responsiveWidth: js.UndefOr[Boolean] = js.undefined,
    topSpacing: Int | Double = null,
    widthFromWrapper: js.UndefOr[Boolean] = js.undefined,
    wrapperClassName: String = null,
    zIndex: String = null
  ): JQueryStickyOptions = {
    val __obj = js.Dynamic.literal()
    if (bottomSpacing != null) __obj.updateDynamic("bottomSpacing")(bottomSpacing.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (getWidthFrom != null) __obj.updateDynamic("getWidthFrom")(getWidthFrom.asInstanceOf[js.Any])
    if (!js.isUndefined(responsiveWidth)) __obj.updateDynamic("responsiveWidth")(responsiveWidth.asInstanceOf[js.Any])
    if (topSpacing != null) __obj.updateDynamic("topSpacing")(topSpacing.asInstanceOf[js.Any])
    if (!js.isUndefined(widthFromWrapper)) __obj.updateDynamic("widthFromWrapper")(widthFromWrapper.asInstanceOf[js.Any])
    if (wrapperClassName != null) __obj.updateDynamic("wrapperClassName")(wrapperClassName.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStickyOptions]
  }
}

