package typings.lucasmogariReactPagination

import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lucasmogari/react-pagination", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait PageVariant extends StObject
  @JSImport("@lucasmogari/react-pagination", "PageVariant")
  @js.native
  object PageVariant extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PageVariant & String] = js.native
    
    @js.native
    sealed trait before
      extends StObject
         with PageVariant
    /* "before" */ val before: typings.lucasmogariReactPagination.mod.PageVariant.before & String = js.native
    
    @js.native
    sealed trait gap
      extends StObject
         with PageVariant
    /* "gap" */ val gap: typings.lucasmogariReactPagination.mod.PageVariant.gap & String = js.native
    
    @js.native
    sealed trait next
      extends StObject
         with PageVariant
    /* "next" */ val next: typings.lucasmogariReactPagination.mod.PageVariant.next & String = js.native
  }
  
  inline def useNavigation(parameters: UseNavigationParameters): UseNavigationPayload = ^.asInstanceOf[js.Dynamic].applyDynamic("useNavigation")(parameters.asInstanceOf[js.Any]).asInstanceOf[UseNavigationPayload]
  
  type Page = PageVariant | Double
  
  trait PageItem extends StObject {
    
    var current: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var page: PageVariant | Double
    
    var props: PageItemProps
  }
  object PageItem {
    
    inline def apply(page: PageVariant | Double, props: PageItemProps): PageItem = {
      val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageItem]
    }
    
    extension [Self <: PageItem](x: Self) {
      
      inline def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setPage(value: PageVariant | Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setProps(value: PageItemProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait PageItemProps extends StObject {
    
    var `aria-current`: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    def onClick(e: typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent]): Unit
  }
  object PageItemProps {
    
    inline def apply(onClick: typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit): PageItemProps = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick))
      __obj.asInstanceOf[PageItemProps]
    }
    
    extension [Self <: PageItemProps](x: Self) {
      
      inline def `setAria-current`(value: Boolean): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnClick(value: typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    }
  }
  
  trait UseNavigationParameters extends StObject {
    
    var arrows: js.UndefOr[Boolean] = js.undefined
    
    def getPageItemProps(parameters: Any*): Unit
    
    var itemsPerPage: Double
    
    var maxPageItems: js.UndefOr[Double] = js.undefined
    
    var numbers: js.UndefOr[Boolean] = js.undefined
    
    var page: js.UndefOr[Double] = js.undefined
    
    var totalItems: Double
  }
  object UseNavigationParameters {
    
    inline def apply(getPageItemProps: /* repeated */ Any => Unit, itemsPerPage: Double, totalItems: Double): UseNavigationParameters = {
      val __obj = js.Dynamic.literal(getPageItemProps = js.Any.fromFunction1(getPageItemProps), itemsPerPage = itemsPerPage.asInstanceOf[js.Any], totalItems = totalItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseNavigationParameters]
    }
    
    extension [Self <: UseNavigationParameters](x: Self) {
      
      inline def setArrows(value: Boolean): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
      
      inline def setArrowsUndefined: Self = StObject.set(x, "arrows", js.undefined)
      
      inline def setGetPageItemProps(value: /* repeated */ Any => Unit): Self = StObject.set(x, "getPageItemProps", js.Any.fromFunction1(value))
      
      inline def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
      
      inline def setMaxPageItems(value: Double): Self = StObject.set(x, "maxPageItems", value.asInstanceOf[js.Any])
      
      inline def setMaxPageItemsUndefined: Self = StObject.set(x, "maxPageItems", js.undefined)
      
      inline def setNumbers(value: Boolean): Self = StObject.set(x, "numbers", value.asInstanceOf[js.Any])
      
      inline def setNumbersUndefined: Self = StObject.set(x, "numbers", js.undefined)
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    }
  }
  
  trait UseNavigationPayload extends StObject {
    
    var arrows: Boolean
    
    var fromItem: Double
    
    def getPageItem(pageIndex: Double): PageItem
    
    def goTo(page: Page): Unit
    
    var itemsPerPage: Double
    
    var maxPageItems: Double
    
    def next(): Unit
    
    var numbers: Boolean
    
    var page: Double
    
    def previous(): Unit
    
    def setMaxPageItems(maxPageItems: Double): Unit
    
    def setTotalItems(totalItem: Double): Unit
    
    var size: Double
    
    var toItem: Double
    
    var totalItems: Double
    
    var totalPages: Double
  }
  object UseNavigationPayload {
    
    inline def apply(
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
    
    extension [Self <: UseNavigationPayload](x: Self) {
      
      inline def setArrows(value: Boolean): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
      
      inline def setFromItem(value: Double): Self = StObject.set(x, "fromItem", value.asInstanceOf[js.Any])
      
      inline def setGetPageItem(value: Double => PageItem): Self = StObject.set(x, "getPageItem", js.Any.fromFunction1(value))
      
      inline def setGoTo(value: Page => Unit): Self = StObject.set(x, "goTo", js.Any.fromFunction1(value))
      
      inline def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
      
      inline def setMaxPageItems(value: Double): Self = StObject.set(x, "maxPageItems", value.asInstanceOf[js.Any])
      
      inline def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      inline def setNumbers(value: Boolean): Self = StObject.set(x, "numbers", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPrevious(value: () => Unit): Self = StObject.set(x, "previous", js.Any.fromFunction0(value))
      
      inline def setSetMaxPageItems(value: Double => Unit): Self = StObject.set(x, "setMaxPageItems", js.Any.fromFunction1(value))
      
      inline def setSetTotalItems(value: Double => Unit): Self = StObject.set(x, "setTotalItems", js.Any.fromFunction1(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setToItem(value: Double): Self = StObject.set(x, "toItem", value.asInstanceOf[js.Any])
      
      inline def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
      
      inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
    }
  }
}
