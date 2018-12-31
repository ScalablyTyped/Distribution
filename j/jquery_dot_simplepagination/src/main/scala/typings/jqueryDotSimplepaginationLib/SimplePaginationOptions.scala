package typings
package jqueryDotSimplepaginationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimplePaginationOptions extends js.Object {
  /**
    * The class of the CSS theme.
    * 
    * @type {string}
    * @memberof SimplePaginationOptions
    */
  var cssStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Which page will be selected immediately after init.
    * 
    * @type {number}
    * @memberof SimplePaginationOptions
    */
  var currentPage: js.UndefOr[scala.Double] = js.undefined
  /**
    * How many page numbers should be visible while navigating.
    * Minimum allowed: 3 (previous, current & next)
    * 
    * @type {number}
    * @memberof SimplePaginationOptions
    */
  var displayedPages: js.UndefOr[scala.Double] = js.undefined
  /**
    * How many page numbers are visible at the beginning/ending of the pagination.
    * 
    * @type {number}
    * @memberof SimplePaginationOptions
    */
  var edges: js.UndefOr[scala.Double] = js.undefined
  /**
    * When this option is true,
    * clicking on the ellipse will replace the ellipse
    * with a number type input in which you can manually set the resulting page.
    * 
    * @type {boolean}
    * @memberof SimplePaginationOptions
    */
  var ellipsePageSet: js.UndefOr[scala.Boolean] = js.undefined
  var ellipseText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A string used to build the href attribute, added before the page number.
    * 
    * @type {string}
    * @memberof SimplePaginationOptions
    */
  var hrefTextPrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Another string used to build the href attribute, added after the page number.
    * 
    * @type {string}
    * @memberof SimplePaginationOptions
    */
  var hrefTextSuffix: js.UndefOr[java.lang.String] = js.undefined
  var invertPageOrder: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Total number of items that will be used to calculate the pages.
    * 
    * @type {number}
    * @memberof SimplePaginationOptions
    */
  var items: js.UndefOr[scala.Double] = js.undefined
  /**
    * Number of items displayed on each page.
    * 
    * @type {number}
    * @memberof SimplePaginationOptions
    */
  var itemsOnPage: js.UndefOr[scala.Double] = js.undefined
  /**
    * A collection of labels that will be used to render the pagination items, replacing the numbers.
    * 
    * @type {any[]}
    * @memberof SimplePaginationOptions
    */
  var labelMap: js.UndefOr[js.Array[_]] = js.undefined
  var listStyle: js.UndefOr[scala.Boolean] = js.undefined
  var nextAtFront: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Text to be display on the next button.
    * 
    * @type {string}
    * @memberof SimplePaginationOptions
    */
  var nextText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Function to call when the pagination is initialized.
    * 
    * @memberof SimplePaginationOptions
    */
  var onInit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Function to call when a page is clicked.
    * Page number and event are optional parameters.
    * 
    * @memberof SimplePaginationOptions
    */
  var onPageClick: js.UndefOr[js.Function2[/* page */ scala.Double, /* event */ js.Any, scala.Unit]] = js.undefined
  /**
    * 	If specified, items and itemsOnPage will not be used to calculate the number of pages.
    * 
    * @type {number}
    * @memberof SimplePaginationOptions
    */
  var pages: js.UndefOr[scala.Double] = js.undefined
  /**
    * Text to be display on the previous button.
    * 
    * @type {string}
    * @memberof SimplePaginationOptions
    */
  var prevText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set to false if you don't want to select the page immediately after click.
    * 
    * @type {boolean}
    * @memberof SimplePaginationOptions
    */
  var selectOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var useAnchors: js.UndefOr[scala.Boolean] = js.undefined
  var useEndEdge: js.UndefOr[scala.Boolean] = js.undefined
  var useStartEdge: js.UndefOr[scala.Boolean] = js.undefined
}

