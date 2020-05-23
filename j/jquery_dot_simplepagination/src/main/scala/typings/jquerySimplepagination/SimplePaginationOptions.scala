package typings.jquerySimplepagination

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
  var cssStyle: js.UndefOr[String] = js.undefined
  /**
    * Which page will be selected immediately after init.
    * 
    * @type {number}
    * @memberof SimplePaginationOptions
    */
  var currentPage: js.UndefOr[Double] = js.undefined
  /**
    * How many page numbers should be visible while navigating.
    * Minimum allowed: 3 (previous, current & next)
    * 
    * @type {number}
    * @memberof SimplePaginationOptions
    */
  var displayedPages: js.UndefOr[Double] = js.undefined
  /**
    * How many page numbers are visible at the beginning/ending of the pagination.
    * 
    * @type {number}
    * @memberof SimplePaginationOptions
    */
  var edges: js.UndefOr[Double] = js.undefined
  /**
    * When this option is true,
    * clicking on the ellipse will replace the ellipse
    * with a number type input in which you can manually set the resulting page.
    * 
    * @type {boolean}
    * @memberof SimplePaginationOptions
    */
  var ellipsePageSet: js.UndefOr[Boolean] = js.undefined
  var ellipseText: js.UndefOr[String] = js.undefined
  /**
    * A string used to build the href attribute, added before the page number.
    * 
    * @type {string}
    * @memberof SimplePaginationOptions
    */
  var hrefTextPrefix: js.UndefOr[String] = js.undefined
  /**
    * Another string used to build the href attribute, added after the page number.
    * 
    * @type {string}
    * @memberof SimplePaginationOptions
    */
  var hrefTextSuffix: js.UndefOr[String] = js.undefined
  var invertPageOrder: js.UndefOr[Boolean] = js.undefined
  /**
    * Total number of items that will be used to calculate the pages.
    * 
    * @type {number}
    * @memberof SimplePaginationOptions
    */
  var items: js.UndefOr[Double] = js.undefined
  /**
    * Number of items displayed on each page.
    * 
    * @type {number}
    * @memberof SimplePaginationOptions
    */
  var itemsOnPage: js.UndefOr[Double] = js.undefined
  /**
    * A collection of labels that will be used to render the pagination items, replacing the numbers.
    * 
    * @type {any[]}
    * @memberof SimplePaginationOptions
    */
  var labelMap: js.UndefOr[js.Array[_]] = js.undefined
  var listStyle: js.UndefOr[Boolean] = js.undefined
  var nextAtFront: js.UndefOr[Boolean] = js.undefined
  /**
    * Text to be display on the next button.
    * 
    * @type {string}
    * @memberof SimplePaginationOptions
    */
  var nextText: js.UndefOr[String] = js.undefined
  /**
    * Function to call when the pagination is initialized.
    * 
    * @memberof SimplePaginationOptions
    */
  var onInit: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Function to call when a page is clicked.
    * Page number and event are optional parameters.
    * 
    * @memberof SimplePaginationOptions
    */
  var onPageClick: js.UndefOr[js.Function2[/* page */ Double, /* event */ js.Any, Unit]] = js.undefined
  /**
    *     If specified, items and itemsOnPage will not be used to calculate the number of pages.
    * 
    * @type {number}
    * @memberof SimplePaginationOptions
    */
  var pages: js.UndefOr[Double] = js.undefined
  /**
    * Text to be display on the previous button.
    * 
    * @type {string}
    * @memberof SimplePaginationOptions
    */
  var prevText: js.UndefOr[String] = js.undefined
  /**
    * Set to false if you don't want to select the page immediately after click.
    * 
    * @type {boolean}
    * @memberof SimplePaginationOptions
    */
  var selectOnClick: js.UndefOr[Boolean] = js.undefined
  var useAnchors: js.UndefOr[Boolean] = js.undefined
  var useEndEdge: js.UndefOr[Boolean] = js.undefined
  var useStartEdge: js.UndefOr[Boolean] = js.undefined
}

object SimplePaginationOptions {
  @scala.inline
  def apply(
    cssStyle: String = null,
    currentPage: js.UndefOr[Double] = js.undefined,
    displayedPages: js.UndefOr[Double] = js.undefined,
    edges: js.UndefOr[Double] = js.undefined,
    ellipsePageSet: js.UndefOr[Boolean] = js.undefined,
    ellipseText: String = null,
    hrefTextPrefix: String = null,
    hrefTextSuffix: String = null,
    invertPageOrder: js.UndefOr[Boolean] = js.undefined,
    items: js.UndefOr[Double] = js.undefined,
    itemsOnPage: js.UndefOr[Double] = js.undefined,
    labelMap: js.Array[_] = null,
    listStyle: js.UndefOr[Boolean] = js.undefined,
    nextAtFront: js.UndefOr[Boolean] = js.undefined,
    nextText: String = null,
    onInit: () => Unit = null,
    onPageClick: (/* page */ Double, /* event */ js.Any) => Unit = null,
    pages: js.UndefOr[Double] = js.undefined,
    prevText: String = null,
    selectOnClick: js.UndefOr[Boolean] = js.undefined,
    useAnchors: js.UndefOr[Boolean] = js.undefined,
    useEndEdge: js.UndefOr[Boolean] = js.undefined,
    useStartEdge: js.UndefOr[Boolean] = js.undefined
  ): SimplePaginationOptions = {
    val __obj = js.Dynamic.literal()
    if (cssStyle != null) __obj.updateDynamic("cssStyle")(cssStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(currentPage)) __obj.updateDynamic("currentPage")(currentPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayedPages)) __obj.updateDynamic("displayedPages")(displayedPages.get.asInstanceOf[js.Any])
    if (!js.isUndefined(edges)) __obj.updateDynamic("edges")(edges.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ellipsePageSet)) __obj.updateDynamic("ellipsePageSet")(ellipsePageSet.get.asInstanceOf[js.Any])
    if (ellipseText != null) __obj.updateDynamic("ellipseText")(ellipseText.asInstanceOf[js.Any])
    if (hrefTextPrefix != null) __obj.updateDynamic("hrefTextPrefix")(hrefTextPrefix.asInstanceOf[js.Any])
    if (hrefTextSuffix != null) __obj.updateDynamic("hrefTextSuffix")(hrefTextSuffix.asInstanceOf[js.Any])
    if (!js.isUndefined(invertPageOrder)) __obj.updateDynamic("invertPageOrder")(invertPageOrder.get.asInstanceOf[js.Any])
    if (!js.isUndefined(items)) __obj.updateDynamic("items")(items.get.asInstanceOf[js.Any])
    if (!js.isUndefined(itemsOnPage)) __obj.updateDynamic("itemsOnPage")(itemsOnPage.get.asInstanceOf[js.Any])
    if (labelMap != null) __obj.updateDynamic("labelMap")(labelMap.asInstanceOf[js.Any])
    if (!js.isUndefined(listStyle)) __obj.updateDynamic("listStyle")(listStyle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nextAtFront)) __obj.updateDynamic("nextAtFront")(nextAtFront.get.asInstanceOf[js.Any])
    if (nextText != null) __obj.updateDynamic("nextText")(nextText.asInstanceOf[js.Any])
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction0(onInit))
    if (onPageClick != null) __obj.updateDynamic("onPageClick")(js.Any.fromFunction2(onPageClick))
    if (!js.isUndefined(pages)) __obj.updateDynamic("pages")(pages.get.asInstanceOf[js.Any])
    if (prevText != null) __obj.updateDynamic("prevText")(prevText.asInstanceOf[js.Any])
    if (!js.isUndefined(selectOnClick)) __obj.updateDynamic("selectOnClick")(selectOnClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useAnchors)) __obj.updateDynamic("useAnchors")(useAnchors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useEndEdge)) __obj.updateDynamic("useEndEdge")(useEndEdge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useStartEdge)) __obj.updateDynamic("useStartEdge")(useStartEdge.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimplePaginationOptions]
  }
}

