package typings
package jqueryDashStickyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStickyOptions extends js.Object {
  /**
  	 * Pixels between the page bottom and the element's bottom.
  	 * @default 0
  	 */
  var bottomSpacing: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Boolean determining whether the sticky element should be horizontally centered in the page.
  	 * @default false
  	 */
  var center: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * CSS class added to the element's wrapper when "sticked".
  	 * @default is-sticky
  	 */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Selector of element referenced to set fixed width of "sticky" element.
  	 * @default ''
  	 */
  var getWidthFrom: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Boolean determining whether widths will be recalculated on window resize (using getWidthfrom).
  	 * @default false
  	 */
  var responsiveWidth: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Pixels between the page top and the element's top.
  	 * @default 0
  	 */
  var topSpacing: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Boolean determining whether width of the "sticky" element should be updated to match the wrapper's width.
  	 * Wrapper is a placeholder for "sticky" element while it is fixed (out of static elements flow), and its width depends on the context and CSS rules.
  	 * Works only as long getWidthForm isn't set.
  	 * @default true
  	 */
  var widthFromWrapper: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * CSS class added to the wrapper.
  	 * @default 'sticky-wrapper'
  	 */
  var wrapperClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Controls z-index of the sticked element.
  	 * @default inherit
  	 */
  var zIndex: js.UndefOr[java.lang.String] = js.undefined
}

