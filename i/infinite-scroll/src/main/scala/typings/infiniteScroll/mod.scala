package typings.infiniteScroll

import typings.infiniteScroll.anon.Body
import typings.infiniteScroll.infiniteScrollBooleans.`false`
import typings.infiniteScroll.infiniteScrollBooleans.`true`
import typings.infiniteScroll.infiniteScrollStrings.$LeftcurlybracketERightcurlybracketDotinfiniteScroll
import typings.infiniteScroll.infiniteScrollStrings.append
import typings.infiniteScroll.infiniteScrollStrings.error
import typings.infiniteScroll.infiniteScrollStrings.history
import typings.infiniteScroll.infiniteScrollStrings.last
import typings.infiniteScroll.infiniteScrollStrings.load
import typings.infiniteScroll.infiniteScrollStrings.push
import typings.infiniteScroll.infiniteScrollStrings.replace
import typings.infiniteScroll.infiniteScrollStrings.request
import typings.infiniteScroll.infiniteScrollStrings.scrollThreshold
import typings.infiniteScroll.mod.global.JQuery
import typings.isotopeLayout.mod.Isotope
import typings.packery.mod.Packery
import typings.std.ArrayLike
import typings.std.Element
import typings.std.Event
import typings.std.NodeList
import typings.std.Parameters
import typings.std.RequestInit
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("infinite-scroll", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with InfiniteScroll {
    def this(element: String, options: Options) = this()
    def this(element: Element, options: Options) = this()
  }
  @JSImport("infinite-scroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get the Infinite Scroll instance via its element.
    * This is useful for getting the Infinite Scroll instance in JavaScript
    * after it has been initalized in HTML
    */
  /* static member */
  inline def data(element: String): InfiniteScroll = ^.asInstanceOf[js.Dynamic].applyDynamic("data")(element.asInstanceOf[js.Any]).asInstanceOf[InfiniteScroll]
  inline def data(element: Element): InfiniteScroll = ^.asInstanceOf[js.Dynamic].applyDynamic("data")(element.asInstanceOf[js.Any]).asInstanceOf[InfiniteScroll]
  
  @js.native
  trait EventsMap extends StObject {
    
    def append(body: Any, path: String, items: NodeList, response: Response): Unit = js.native
    
    def error(error: String, path: String, response: Response): Unit = js.native
    def error(error: js.Error, path: String, response: Response): Unit = js.native
    
    def history(title: String, path: String): Unit = js.native
    
    def last(body: String, path: String): Unit = js.native
    def last(body: js.Object, path: String): Unit = js.native
    
    def load(body: String, path: String, response: Response): Unit = js.native
    def load(body: js.Object, path: String, response: Response): Unit = js.native
    
    def request(path: String, fetchPromise: js.Promise[Response]): Unit = js.native
    
    def scrollThreshold(): Unit = js.native
  }
  
  @js.native
  trait InfiniteScroll extends StObject {
    
    /**
      * Append items to the container.
      * `appendItems` will load `<script>` within item elements,
      * which is useful for loading embed scripts
      * @param items jQuery object, NodeList, or Array of Elements
      */
    def appendItems(
      items: JQuery[
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for TElement */ Any
        ]
    ): Unit = js.native
    def appendItems(items: ArrayLike[Element]): Unit = js.native
    def appendItems(items: NodeList): Unit = js.native
    
    /** Remove Infinite Scroll functionality completely */
    def destroy(): Unit = js.native
    
    /** Get the absolute URL path for the next page */
    def getAbsolutePath(): String = js.native
    
    /** Get the relative URL path for the next page */
    def getPath(): String = js.native
    
    /**
      * The number of pages loaded.
      * `loadCount` increments by 1 on each `load`
      */
    var loadCount: Double = js.native
    
    /** Load the next page */
    def loadNextPage(): js.Promise[Body] = js.native
    
    def on[E /* <: (/* keyof infinite-scroll.infinite-scroll.EventsMap */ scrollThreshold | request | load | append | error | last | history) & String */](
      event: E,
      handler: /* import warning: importer.ImportType#apply Failed type conversion: infinite-scroll.infinite-scroll.EventsMap[E] */ js.Any
    ): Unit = js.native
    
    var once: /* import warning: importer.ImportType#apply Failed type conversion: this['on'] */ js.Any = js.native
    
    /** Set options after initialization */
    def option(options: Options): Unit = js.native
    
    /**
      * The number of the current loaded page.
      * `pageIndex` increments by 1 on each `load`
      */
    var pageIndex: Double = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.infiniteScroll.infiniteScrollStrings.loadNextPage
    - typings.infiniteScroll.infiniteScrollStrings.appendItems
    - typings.infiniteScroll.infiniteScrollStrings.getPath
    - typings.infiniteScroll.infiniteScrollStrings.getAbsolutePath
    - typings.infiniteScroll.infiniteScrollStrings.option
    - typings.infiniteScroll.infiniteScrollStrings.destroy
  */
  trait Methods extends StObject
  object Methods {
    
    inline def appendItems: typings.infiniteScroll.infiniteScrollStrings.appendItems = "appendItems".asInstanceOf[typings.infiniteScroll.infiniteScrollStrings.appendItems]
    
    inline def destroy: typings.infiniteScroll.infiniteScrollStrings.destroy = "destroy".asInstanceOf[typings.infiniteScroll.infiniteScrollStrings.destroy]
    
    inline def getAbsolutePath: typings.infiniteScroll.infiniteScrollStrings.getAbsolutePath = "getAbsolutePath".asInstanceOf[typings.infiniteScroll.infiniteScrollStrings.getAbsolutePath]
    
    inline def getPath: typings.infiniteScroll.infiniteScrollStrings.getPath = "getPath".asInstanceOf[typings.infiniteScroll.infiniteScrollStrings.getPath]
    
    inline def loadNextPage: typings.infiniteScroll.infiniteScrollStrings.loadNextPage = "loadNextPage".asInstanceOf[typings.infiniteScroll.infiniteScrollStrings.loadNextPage]
    
    inline def option: typings.infiniteScroll.infiniteScrollStrings.option = "option".asInstanceOf[typings.infiniteScroll.infiniteScrollStrings.option]
  }
  
  trait Options extends StObject {
    
    /**
      * Appends selected elements from loaded page to the container
      * @default false
      */
    var append: js.UndefOr[String | `false`] = js.undefined
    
    /**
      * Enables a button to load pages on click.
      * The button state is changed by Infinite Scroll events:
      *
      * - Disabled while loading on request
      * - Re-enabled after page is loaded on load
      * - Hidden when no more pages to load on error and last
      */
    var button: js.UndefOr[String | Element] = js.undefined
    
    /**
      * Checks if Infinite Scroll has reached the last page.
      * This prevents Infinite Scroll from requesting a non-existent page.
      * `last` event will be triggered when last page is reached
      * @default true
      */
    var checkLastPage: js.UndefOr[Boolean] = js.undefined
    
    /** Log events and state changes to the console */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When enabled parses the response body into a DOM.
      * Disable to load flat text
      * @default true
      */
    var domParseResponse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets scroller to an element for overflow element scrolling.
      * Disabled by default, `window` is used to scroll.
      * We recommend disabling `history` with `elementScroll`.
      *
      * Set elementScroll to a selector string or element to use a different parent element.
      * This is useful if a `status` element or `button` is at the bottom of the scroll area
      */
    var elementScroll: js.UndefOr[String | Element | `true`] = js.undefined
    
    /**
      * Sets method, headers, CORS mode, and other options for the fetch request
      * @see {@link <https://developer.mozilla.org/en-US/docs/Web/API/Fetch_API/Using_Fetch#supplying_request_options>}
      */
    var fetchOptions: js.UndefOr[RequestInit | js.Function0[RequestInit]] = js.undefined
    
    // UI
    /** Hides navigation element */
    var hideNav: js.UndefOr[String | Element] = js.undefined
    
    // History
    /**
      * Changes page URL and browser history.
      * Default will use `history.replaceState()`
      * to change the current history entry.
      * Going back in the browser will return the user to previous site
      *
      * Set to `false` to disable
      *
      * Set to `'push'` to use `history.pushState()`
      * to create new history entries for each page change.
      * Going back in the browser will load the previous page
      *
      * @default 'replace'
      */
    var history: js.UndefOr[push | replace | `false`] = js.undefined
    
    /**
      * Updates the window title. Requires history enabled
      * @default true
      */
    var historyTitle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Loads next page when scroll crosses over `scrollThreshold`.
      * Disable `loadOnScroll` if you do not want to load pages on scroll,
      * but still want the `scrollThreshold` event triggered
      * @default true
      */
    var loadOnScroll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Called on initialization.
      * Useful for initial binding events with vanilla JS
      */
    var onInit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Integrates Masonry, Isotope or Packery.
      * Infinite Scroll will add appended items to the layout
      */
    var outlayer: js.UndefOr[typings.masonryLayout.mod.^ | Isotope | Packery] = js.undefined
    
    // Loading
    var path: js.UndefOr[String | js.Function0[String]] = js.undefined
    
    /**
      * Sets the Response body interface method,
      * on the response returned from fetch request
      * @see {@link <https://developer.mozilla.org/en-US/docs/Web/API/Response#Body_Interface_Methods>}
      * @default 'text'
      */
    var responseBody: js.UndefOr[String] = js.undefined
    
    // Scrolling
    /**
      * Sets the distance between the viewport to scroll area
      * for `scrollThreshold` event to be triggered
      * @default 400
      */
    var scrollThreshold: js.UndefOr[Double | `false`] = js.undefined
    
    /**
      * Displays status elements indicating state of page loading. Within the selected element:
      *
      * - `.infinite-scroll-request` element will be displayed on request
      * - `.infinite-scroll-last` element will be displayed on last
      * - `.infinite-scroll-error` element will be displayed on error
      *
      * The selected status element will be hidden on append or load
      *
      * @example
      * ```html
      * <div class="page-load-status">
      *   <p class="infinite-scroll-request">Loading...</p>
      *   <p class="infinite-scroll-last">End of content</p>
      *   <p class="infinite-scroll-error">No more pages to load</p>
      * </div>
      * ```
      * ```js
      * status: '.page-load-status'
      * ```
      */
    var status: js.UndefOr[String | Element] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAppend(value: String | `false`): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      inline def setButton(value: String | Element): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setCheckLastPage(value: Boolean): Self = StObject.set(x, "checkLastPage", value.asInstanceOf[js.Any])
      
      inline def setCheckLastPageUndefined: Self = StObject.set(x, "checkLastPage", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDomParseResponse(value: Boolean): Self = StObject.set(x, "domParseResponse", value.asInstanceOf[js.Any])
      
      inline def setDomParseResponseUndefined: Self = StObject.set(x, "domParseResponse", js.undefined)
      
      inline def setElementScroll(value: String | Element | `true`): Self = StObject.set(x, "elementScroll", value.asInstanceOf[js.Any])
      
      inline def setElementScrollUndefined: Self = StObject.set(x, "elementScroll", js.undefined)
      
      inline def setFetchOptions(value: RequestInit | js.Function0[RequestInit]): Self = StObject.set(x, "fetchOptions", value.asInstanceOf[js.Any])
      
      inline def setFetchOptionsFunction0(value: () => RequestInit): Self = StObject.set(x, "fetchOptions", js.Any.fromFunction0(value))
      
      inline def setFetchOptionsUndefined: Self = StObject.set(x, "fetchOptions", js.undefined)
      
      inline def setHideNav(value: String | Element): Self = StObject.set(x, "hideNav", value.asInstanceOf[js.Any])
      
      inline def setHideNavUndefined: Self = StObject.set(x, "hideNav", js.undefined)
      
      inline def setHistory(value: push | replace | `false`): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryTitle(value: Boolean): Self = StObject.set(x, "historyTitle", value.asInstanceOf[js.Any])
      
      inline def setHistoryTitleUndefined: Self = StObject.set(x, "historyTitle", js.undefined)
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setLoadOnScroll(value: Boolean): Self = StObject.set(x, "loadOnScroll", value.asInstanceOf[js.Any])
      
      inline def setLoadOnScrollUndefined: Self = StObject.set(x, "loadOnScroll", js.undefined)
      
      inline def setOnInit(value: () => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction0(value))
      
      inline def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      inline def setOutlayer(value: typings.masonryLayout.mod.^ | Isotope | Packery): Self = StObject.set(x, "outlayer", value.asInstanceOf[js.Any])
      
      inline def setOutlayerUndefined: Self = StObject.set(x, "outlayer", js.undefined)
      
      inline def setPath(value: String | js.Function0[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathFunction0(value: () => String): Self = StObject.set(x, "path", js.Any.fromFunction0(value))
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setResponseBody(value: String): Self = StObject.set(x, "responseBody", value.asInstanceOf[js.Any])
      
      inline def setResponseBodyUndefined: Self = StObject.set(x, "responseBody", js.undefined)
      
      inline def setScrollThreshold(value: Double | `false`): Self = StObject.set(x, "scrollThreshold", value.asInstanceOf[js.Any])
      
      inline def setScrollThresholdUndefined: Self = StObject.set(x, "scrollThreshold", js.undefined)
      
      inline def setStatus(value: String | Element): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery[TElement] extends StObject {
      
      /**
        * Get the Infinite Scroll instance from a jQuery object.
        * Infinite Scroll instances are useful to access Infinite Scroll properties
        */
      @JSName("data")
      def data_infiniteScroll(key: typings.infiniteScroll.infiniteScrollStrings.infiniteScroll): InfiniteScroll = js.native
      
      /** Initialize Infinite Scroll on an element */
      def infiniteScroll(options: Options): JQuery[TElement] = js.native
      /** Call an Infinite Scroll function on an element */
      def infiniteScroll[M /* <: Methods */](
        method: M,
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<InfiniteScroll[M]> is not an array type */ params: Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: infinite-scroll.infinite-scroll.InfiniteScroll[M] */ js.Any
            ]
      ): JQuery[TElement] = js.native
      
      @JSName("on")
      def on_EinfiniteScroll[E /* <: (/* keyof infinite-scroll.infinite-scroll.EventsMap */ scrollThreshold | request | load | append | error | last | history) & String */](
        event: $LeftcurlybracketERightcurlybracketDotinfiniteScroll,
        handler: js.Function2[
              /* event */ Event, 
              /* params */ Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: infinite-scroll.infinite-scroll.EventsMap[E] */ js.Any
              ], 
              Unit
            ]
      ): Unit = js.native
    }
  }
}
