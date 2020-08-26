package typings.jquerySimplepagination

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimplePaginationOptions extends js.Object {
  /**
    * The class of the CSS theme.
    * 
    * @type {string}
    * @memberof SimplePaginationOptions
    */
  var cssStyle: js.UndefOr[String] = js.native
  /**
    * Which page will be selected immediately after init.
    * 
    * @type {number}
    * @memberof SimplePaginationOptions
    */
  var currentPage: js.UndefOr[Double] = js.native
  /**
    * How many page numbers should be visible while navigating.
    * Minimum allowed: 3 (previous, current & next)
    * 
    * @type {number}
    * @memberof SimplePaginationOptions
    */
  var displayedPages: js.UndefOr[Double] = js.native
  /**
    * How many page numbers are visible at the beginning/ending of the pagination.
    * 
    * @type {number}
    * @memberof SimplePaginationOptions
    */
  var edges: js.UndefOr[Double] = js.native
  /**
    * When this option is true,
    * clicking on the ellipse will replace the ellipse
    * with a number type input in which you can manually set the resulting page.
    * 
    * @type {boolean}
    * @memberof SimplePaginationOptions
    */
  var ellipsePageSet: js.UndefOr[Boolean] = js.native
  var ellipseText: js.UndefOr[String] = js.native
  /**
    * A string used to build the href attribute, added before the page number.
    * 
    * @type {string}
    * @memberof SimplePaginationOptions
    */
  var hrefTextPrefix: js.UndefOr[String] = js.native
  /**
    * Another string used to build the href attribute, added after the page number.
    * 
    * @type {string}
    * @memberof SimplePaginationOptions
    */
  var hrefTextSuffix: js.UndefOr[String] = js.native
  var invertPageOrder: js.UndefOr[Boolean] = js.native
  /**
    * Total number of items that will be used to calculate the pages.
    * 
    * @type {number}
    * @memberof SimplePaginationOptions
    */
  var items: js.UndefOr[Double] = js.native
  /**
    * Number of items displayed on each page.
    * 
    * @type {number}
    * @memberof SimplePaginationOptions
    */
  var itemsOnPage: js.UndefOr[Double] = js.native
  /**
    * A collection of labels that will be used to render the pagination items, replacing the numbers.
    * 
    * @type {any[]}
    * @memberof SimplePaginationOptions
    */
  var labelMap: js.UndefOr[js.Array[_]] = js.native
  var listStyle: js.UndefOr[Boolean] = js.native
  var nextAtFront: js.UndefOr[Boolean] = js.native
  /**
    * Text to be display on the next button.
    * 
    * @type {string}
    * @memberof SimplePaginationOptions
    */
  var nextText: js.UndefOr[String] = js.native
  /**
    * Function to call when the pagination is initialized.
    * 
    * @memberof SimplePaginationOptions
    */
  var onInit: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Function to call when a page is clicked.
    * Page number and event are optional parameters.
    * 
    * @memberof SimplePaginationOptions
    */
  var onPageClick: js.UndefOr[js.Function2[/* page */ Double, /* event */ js.Any, Unit]] = js.native
  /**
    *     If specified, items and itemsOnPage will not be used to calculate the number of pages.
    * 
    * @type {number}
    * @memberof SimplePaginationOptions
    */
  var pages: js.UndefOr[Double] = js.native
  /**
    * Text to be display on the previous button.
    * 
    * @type {string}
    * @memberof SimplePaginationOptions
    */
  var prevText: js.UndefOr[String] = js.native
  /**
    * Set to false if you don't want to select the page immediately after click.
    * 
    * @type {boolean}
    * @memberof SimplePaginationOptions
    */
  var selectOnClick: js.UndefOr[Boolean] = js.native
  var useAnchors: js.UndefOr[Boolean] = js.native
  var useEndEdge: js.UndefOr[Boolean] = js.native
  var useStartEdge: js.UndefOr[Boolean] = js.native
}

object SimplePaginationOptions {
  @scala.inline
  def apply(): SimplePaginationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimplePaginationOptions]
  }
  @scala.inline
  implicit class SimplePaginationOptionsOps[Self <: SimplePaginationOptions] (val x: Self) extends AnyVal {
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
    def setCssStyle(value: String): Self = this.set("cssStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssStyle: Self = this.set("cssStyle", js.undefined)
    @scala.inline
    def setCurrentPage(value: Double): Self = this.set("currentPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentPage: Self = this.set("currentPage", js.undefined)
    @scala.inline
    def setDisplayedPages(value: Double): Self = this.set("displayedPages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayedPages: Self = this.set("displayedPages", js.undefined)
    @scala.inline
    def setEdges(value: Double): Self = this.set("edges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdges: Self = this.set("edges", js.undefined)
    @scala.inline
    def setEllipsePageSet(value: Boolean): Self = this.set("ellipsePageSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsePageSet: Self = this.set("ellipsePageSet", js.undefined)
    @scala.inline
    def setEllipseText(value: String): Self = this.set("ellipseText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipseText: Self = this.set("ellipseText", js.undefined)
    @scala.inline
    def setHrefTextPrefix(value: String): Self = this.set("hrefTextPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHrefTextPrefix: Self = this.set("hrefTextPrefix", js.undefined)
    @scala.inline
    def setHrefTextSuffix(value: String): Self = this.set("hrefTextSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHrefTextSuffix: Self = this.set("hrefTextSuffix", js.undefined)
    @scala.inline
    def setInvertPageOrder(value: Boolean): Self = this.set("invertPageOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvertPageOrder: Self = this.set("invertPageOrder", js.undefined)
    @scala.inline
    def setItems(value: Double): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setItemsOnPage(value: Double): Self = this.set("itemsOnPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemsOnPage: Self = this.set("itemsOnPage", js.undefined)
    @scala.inline
    def setLabelMapVarargs(value: js.Any*): Self = this.set("labelMap", js.Array(value :_*))
    @scala.inline
    def setLabelMap(value: js.Array[_]): Self = this.set("labelMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelMap: Self = this.set("labelMap", js.undefined)
    @scala.inline
    def setListStyle(value: Boolean): Self = this.set("listStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListStyle: Self = this.set("listStyle", js.undefined)
    @scala.inline
    def setNextAtFront(value: Boolean): Self = this.set("nextAtFront", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextAtFront: Self = this.set("nextAtFront", js.undefined)
    @scala.inline
    def setNextText(value: String): Self = this.set("nextText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextText: Self = this.set("nextText", js.undefined)
    @scala.inline
    def setOnInit(value: () => Unit): Self = this.set("onInit", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnInit: Self = this.set("onInit", js.undefined)
    @scala.inline
    def setOnPageClick(value: (/* page */ Double, /* event */ js.Any) => Unit): Self = this.set("onPageClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPageClick: Self = this.set("onPageClick", js.undefined)
    @scala.inline
    def setPages(value: Double): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
    @scala.inline
    def setPrevText(value: String): Self = this.set("prevText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevText: Self = this.set("prevText", js.undefined)
    @scala.inline
    def setSelectOnClick(value: Boolean): Self = this.set("selectOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectOnClick: Self = this.set("selectOnClick", js.undefined)
    @scala.inline
    def setUseAnchors(value: Boolean): Self = this.set("useAnchors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseAnchors: Self = this.set("useAnchors", js.undefined)
    @scala.inline
    def setUseEndEdge(value: Boolean): Self = this.set("useEndEdge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseEndEdge: Self = this.set("useEndEdge", js.undefined)
    @scala.inline
    def setUseStartEdge(value: Boolean): Self = this.set("useStartEdge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseStartEdge: Self = this.set("useStartEdge", js.undefined)
  }
  
}

