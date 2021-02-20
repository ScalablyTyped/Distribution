package typings.listJs

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("list.js", JSImport.Namespace)
  @js.native
  class ^ protected () extends List {
    def this(element: String) = this()
    def this(element: HTMLElement) = this()
    def this(element: String, options: ListOptions) = this()
    def this(element: HTMLElement, options: ListOptions) = this()
    def this(element: String, options: js.UndefOr[scala.Nothing], values: js.Array[js.Object]) = this()
    def this(element: String, options: ListOptions, values: js.Array[js.Object]) = this()
    def this(element: HTMLElement, options: js.UndefOr[scala.Nothing], values: js.Array[js.Object]) = this()
    def this(element: HTMLElement, options: ListOptions, values: js.Array[js.Object]) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.listJs.listJsStrings.updated
    - typings.listJs.listJsStrings.filterStart
    - typings.listJs.listJsStrings.filterComplete
    - typings.listJs.listJsStrings.searchStart
    - typings.listJs.listJsStrings.searchComplete
    - typings.listJs.listJsStrings.sortStart
    - typings.listJs.listJsStrings.sortComplete
  */
  trait Event extends StObject
  object Event {
    
    @scala.inline
    def filterComplete: typings.listJs.listJsStrings.filterComplete = "filterComplete".asInstanceOf[typings.listJs.listJsStrings.filterComplete]
    
    @scala.inline
    def filterStart: typings.listJs.listJsStrings.filterStart = "filterStart".asInstanceOf[typings.listJs.listJsStrings.filterStart]
    
    @scala.inline
    def searchComplete: typings.listJs.listJsStrings.searchComplete = "searchComplete".asInstanceOf[typings.listJs.listJsStrings.searchComplete]
    
    @scala.inline
    def searchStart: typings.listJs.listJsStrings.searchStart = "searchStart".asInstanceOf[typings.listJs.listJsStrings.searchStart]
    
    @scala.inline
    def sortComplete: typings.listJs.listJsStrings.sortComplete = "sortComplete".asInstanceOf[typings.listJs.listJsStrings.sortComplete]
    
    @scala.inline
    def sortStart: typings.listJs.listJsStrings.sortStart = "sortStart".asInstanceOf[typings.listJs.listJsStrings.sortStart]
    
    @scala.inline
    def updated: typings.listJs.listJsStrings.updated = "updated".asInstanceOf[typings.listJs.listJsStrings.updated]
  }
  
  @js.native
  trait FuzzySearchOptions extends StObject {
    
    var distance: js.UndefOr[Double] = js.native
    
    var location: js.UndefOr[Double] = js.native
    
    var multiSearch: js.UndefOr[Boolean] = js.native
    
    var searchClass: js.UndefOr[String] = js.native
    
    var threshold: js.UndefOr[Double] = js.native
  }
  object FuzzySearchOptions {
    
    @scala.inline
    def apply(): FuzzySearchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FuzzySearchOptions]
    }
    
    @scala.inline
    implicit class FuzzySearchOptionsMutableBuilder[Self <: FuzzySearchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      @scala.inline
      def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setMultiSearch(value: Boolean): Self = StObject.set(x, "multiSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiSearchUndefined: Self = StObject.set(x, "multiSearch", js.undefined)
      
      @scala.inline
      def setSearchClass(value: String): Self = StObject.set(x, "searchClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchClassUndefined: Self = StObject.set(x, "searchClass", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  @js.native
  trait List extends StObject {
    
    def add(values: js.Array[js.Object]): Unit = js.native
    def add(values: js.Array[js.Object], callback: js.Function1[/* item */ ListItem, Unit]): Unit = js.native
    
    var alphabet: String = js.native
    
    def clear(): Unit = js.native
    
    def filter(): Unit = js.native
    def filter(filterFunction: js.Function1[/* item */ ListItem, Boolean]): Unit = js.native
    
    var filtered: Boolean = js.native
    
    def fuzzySearch(searchString: String): Unit = js.native
    def fuzzySearch(searchString: String, columns: js.Array[String]): Unit = js.native
    
    def get(valueName: String, value: js.Any): js.Array[ListItem] = js.native
    
    var items: js.Array[js.Object] = js.native
    
    var list: HTMLElement = js.native
    
    var listContainer: HTMLElement = js.native
    
    var matchingItems: js.Array[js.Object] = js.native
    
    def on(event: Event, callback: js.Function1[/* list */ this.type, Unit]): List = js.native
    
    def reIndex(): Unit = js.native
    
    def remove(valueName: String, value: js.Any): Double = js.native
    
    def search(searchString: String): Unit = js.native
    def search(searchString: String, columns: js.Array[String]): Unit = js.native
    
    var searched: Boolean = js.native
    
    def show(i: Double, page: Double): Unit = js.native
    
    def size(): Double = js.native
    
    def sort(valueName: String, options: SortOptions): Unit = js.native
    
    def update(): Unit = js.native
    
    var visibleItems: js.Array[js.Object] = js.native
  }
  
  @js.native
  trait ListItem extends StObject {
    
    var elm: HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def matching(): Boolean = js.native
    
    def show(): Unit = js.native
    
    def values(): js.Object = js.native
    def values(newValues: js.Object): Unit = js.native
    
    def visible(): Boolean = js.native
  }
  
  @js.native
  trait ListOptions extends StObject {
    
    var fuzzySearch: js.UndefOr[FuzzySearchOptions] = js.native
    
    var i: js.UndefOr[Double] = js.native
    
    var indexAsync: js.UndefOr[Boolean] = js.native
    
    var item: js.UndefOr[String] = js.native
    
    var listClass: js.UndefOr[String] = js.native
    
    var page: js.UndefOr[Double] = js.native
    
    var pagination: js.UndefOr[Boolean] = js.native
    
    var searchClass: js.UndefOr[String] = js.native
    
    var sortClass: js.UndefOr[String] = js.native
    
    var valueNames: js.UndefOr[js.Array[String]] = js.native
  }
  object ListOptions {
    
    @scala.inline
    def apply(): ListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListOptions]
    }
    
    @scala.inline
    implicit class ListOptionsMutableBuilder[Self <: ListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFuzzySearch(value: FuzzySearchOptions): Self = StObject.set(x, "fuzzySearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFuzzySearchUndefined: Self = StObject.set(x, "fuzzySearch", js.undefined)
      
      @scala.inline
      def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIUndefined: Self = StObject.set(x, "i", js.undefined)
      
      @scala.inline
      def setIndexAsync(value: Boolean): Self = StObject.set(x, "indexAsync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexAsyncUndefined: Self = StObject.set(x, "indexAsync", js.undefined)
      
      @scala.inline
      def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      @scala.inline
      def setListClass(value: String): Self = StObject.set(x, "listClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListClassUndefined: Self = StObject.set(x, "listClass", js.undefined)
      
      @scala.inline
      def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      @scala.inline
      def setPagination(value: Boolean): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      @scala.inline
      def setSearchClass(value: String): Self = StObject.set(x, "searchClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchClassUndefined: Self = StObject.set(x, "searchClass", js.undefined)
      
      @scala.inline
      def setSortClass(value: String): Self = StObject.set(x, "sortClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortClassUndefined: Self = StObject.set(x, "sortClass", js.undefined)
      
      @scala.inline
      def setValueNames(value: js.Array[String]): Self = StObject.set(x, "valueNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNamesUndefined: Self = StObject.set(x, "valueNames", js.undefined)
      
      @scala.inline
      def setValueNamesVarargs(value: String*): Self = StObject.set(x, "valueNames", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SortOptions extends StObject {
    
    var alphabet: js.UndefOr[String] = js.native
    
    var insensitive: js.UndefOr[Boolean] = js.native
    
    var order: js.UndefOr[String] = js.native
    
    var sortFunction: js.UndefOr[js.Function2[/* a */ js.Object, /* b */ js.Object, js.UndefOr[Double]]] = js.native
  }
  object SortOptions {
    
    @scala.inline
    def apply(): SortOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortOptions]
    }
    
    @scala.inline
    implicit class SortOptionsMutableBuilder[Self <: SortOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlphabet(value: String): Self = StObject.set(x, "alphabet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphabetUndefined: Self = StObject.set(x, "alphabet", js.undefined)
      
      @scala.inline
      def setInsensitive(value: Boolean): Self = StObject.set(x, "insensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsensitiveUndefined: Self = StObject.set(x, "insensitive", js.undefined)
      
      @scala.inline
      def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setSortFunction(value: (/* a */ js.Object, /* b */ js.Object) => js.UndefOr[Double]): Self = StObject.set(x, "sortFunction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortFunctionUndefined: Self = StObject.set(x, "sortFunction", js.undefined)
    }
  }
}
