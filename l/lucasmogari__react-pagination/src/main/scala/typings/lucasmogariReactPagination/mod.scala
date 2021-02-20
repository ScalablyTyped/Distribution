package typings.lucasmogariReactPagination

import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  sealed trait PageVariant extends StObject
  @JSImport("@lucasmogari/react-pagination", "PageVariant")
  @js.native
  object PageVariant extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PageVariant with String] = js.native
    
    @js.native
    sealed trait before extends PageVariant
    /* "before" */ val before: typings.lucasmogariReactPagination.mod.PageVariant.before with String = js.native
    
    @js.native
    sealed trait gap extends PageVariant
    /* "gap" */ val gap: typings.lucasmogariReactPagination.mod.PageVariant.gap with String = js.native
    
    @js.native
    sealed trait next extends PageVariant
    /* "next" */ val next: typings.lucasmogariReactPagination.mod.PageVariant.next with String = js.native
  }
  
  @JSImport("@lucasmogari/react-pagination", "useNavigation")
  @js.native
  def useNavigation(parameters: UseNavigationParameters): UseNavigationPayload = js.native
  
  type Page = PageVariant | Double
  
  @js.native
  trait PageItem extends StObject {
    
    var current: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var page: PageVariant | Double = js.native
    
    var props: PageItemProps = js.native
  }
  object PageItem {
    
    @scala.inline
    def apply(page: PageVariant | Double, props: PageItemProps): PageItem = {
      val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageItem]
    }
    
    @scala.inline
    implicit class PageItemMutableBuilder[Self <: PageItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setPage(value: PageVariant | Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: PageItemProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PageItemProps extends StObject {
    
    var `aria-current`: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    def onClick(e: typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent]): Unit = js.native
  }
  object PageItemProps {
    
    @scala.inline
    def apply(onClick: typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit): PageItemProps = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick))
      __obj.asInstanceOf[PageItemProps]
    }
    
    @scala.inline
    implicit class PageItemPropsMutableBuilder[Self <: PageItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-current`(value: Boolean): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnClick(value: typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait UseNavigationParameters extends StObject {
    
    var arrows: js.UndefOr[Boolean] = js.native
    
    def getPageItemProps(parameters: js.Any*): Unit = js.native
    
    var itemsPerPage: Double = js.native
    
    var maxPageItems: js.UndefOr[Double] = js.native
    
    var numbers: js.UndefOr[Boolean] = js.native
    
    var page: js.UndefOr[Double] = js.native
    
    var totalItems: Double = js.native
  }
  object UseNavigationParameters {
    
    @scala.inline
    def apply(getPageItemProps: /* repeated */ js.Any => Unit, itemsPerPage: Double, totalItems: Double): UseNavigationParameters = {
      val __obj = js.Dynamic.literal(getPageItemProps = js.Any.fromFunction1(getPageItemProps), itemsPerPage = itemsPerPage.asInstanceOf[js.Any], totalItems = totalItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseNavigationParameters]
    }
    
    @scala.inline
    implicit class UseNavigationParametersMutableBuilder[Self <: UseNavigationParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrows(value: Boolean): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowsUndefined: Self = StObject.set(x, "arrows", js.undefined)
      
      @scala.inline
      def setGetPageItemProps(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "getPageItemProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPageItems(value: Double): Self = StObject.set(x, "maxPageItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPageItemsUndefined: Self = StObject.set(x, "maxPageItems", js.undefined)
      
      @scala.inline
      def setNumbers(value: Boolean): Self = StObject.set(x, "numbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumbersUndefined: Self = StObject.set(x, "numbers", js.undefined)
      
      @scala.inline
      def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      @scala.inline
      def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UseNavigationPayload extends StObject {
    
    var arrows: Boolean = js.native
    
    var fromItem: Double = js.native
    
    def getPageItem(pageIndex: Double): PageItem = js.native
    
    def goTo(page: Page): Unit = js.native
    
    var itemsPerPage: Double = js.native
    
    var maxPageItems: Double = js.native
    
    def next(): Unit = js.native
    
    var numbers: Boolean = js.native
    
    var page: Double = js.native
    
    def previous(): Unit = js.native
    
    def setMaxPageItems(maxPageItems: Double): Unit = js.native
    
    def setTotalItems(totalItem: Double): Unit = js.native
    
    var size: Double = js.native
    
    var toItem: Double = js.native
    
    var totalItems: Double = js.native
    
    var totalPages: Double = js.native
  }
  object UseNavigationPayload {
    
    @scala.inline
    def apply(
      arrows: Boolean,
      fromItem: Double,
      getPageItem: Double => PageItem,
      goTo: Page => Unit,
      itemsPerPage: Double,
      maxPageItems: Double,
      next: () => Unit,
      numbers: Boolean,
      page: Double,
      previous: () => Unit,
      setMaxPageItems: Double => Unit,
      setTotalItems: Double => Unit,
      size: Double,
      toItem: Double,
      totalItems: Double,
      totalPages: Double
    ): UseNavigationPayload = {
      val __obj = js.Dynamic.literal(arrows = arrows.asInstanceOf[js.Any], fromItem = fromItem.asInstanceOf[js.Any], getPageItem = js.Any.fromFunction1(getPageItem), goTo = js.Any.fromFunction1(goTo), itemsPerPage = itemsPerPage.asInstanceOf[js.Any], maxPageItems = maxPageItems.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), numbers = numbers.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], previous = js.Any.fromFunction0(previous), setMaxPageItems = js.Any.fromFunction1(setMaxPageItems), setTotalItems = js.Any.fromFunction1(setTotalItems), size = size.asInstanceOf[js.Any], toItem = toItem.asInstanceOf[js.Any], totalItems = totalItems.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseNavigationPayload]
    }
    
    @scala.inline
    implicit class UseNavigationPayloadMutableBuilder[Self <: UseNavigationPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrows(value: Boolean): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromItem(value: Double): Self = StObject.set(x, "fromItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetPageItem(value: Double => PageItem): Self = StObject.set(x, "getPageItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGoTo(value: Page => Unit): Self = StObject.set(x, "goTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPageItems(value: Double): Self = StObject.set(x, "maxPageItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNumbers(value: Boolean): Self = StObject.set(x, "numbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevious(value: () => Unit): Self = StObject.set(x, "previous", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetMaxPageItems(value: Double => Unit): Self = StObject.set(x, "setMaxPageItems", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTotalItems(value: Double => Unit): Self = StObject.set(x, "setTotalItems", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToItem(value: Double): Self = StObject.set(x, "toItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
    }
  }
}
