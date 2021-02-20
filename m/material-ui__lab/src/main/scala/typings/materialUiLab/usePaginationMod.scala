package typings.materialUiLab

import typings.materialUiLab.materialUiLabStrings.`end-ellipsis`
import typings.materialUiLab.materialUiLabStrings.`start-ellipsis`
import typings.materialUiLab.materialUiLabStrings.first
import typings.materialUiLab.materialUiLabStrings.last
import typings.materialUiLab.materialUiLabStrings.next
import typings.materialUiLab.materialUiLabStrings.page
import typings.materialUiLab.materialUiLabStrings.previous
import typings.react.mod.ChangeEvent
import typings.react.mod.ReactEventHandler
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usePaginationMod {
  
  @JSImport("@material-ui/lab/Pagination/usePagination", JSImport.Default)
  @js.native
  def default(props: UsePaginationProps): UsePaginationResult = js.native
  
  @js.native
  trait UsePaginationItem extends StObject {
    
    var disabled: Boolean = js.native
    
    var onClick: ReactEventHandler[Element] = js.native
    
    var page: Double = js.native
    
    var selected: Boolean = js.native
    
    var `type`: page | first | last | next | previous | `start-ellipsis` | `end-ellipsis` = js.native
  }
  object UsePaginationItem {
    
    @scala.inline
    def apply(
      disabled: Boolean,
      onClick: SyntheticEvent[Element, Event] => Unit,
      page: Double,
      selected: Boolean,
      `type`: page | first | last | next | previous | `start-ellipsis` | `end-ellipsis`
    ): UsePaginationItem = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), page = page.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsePaginationItem]
    }
    
    @scala.inline
    implicit class UsePaginationItemMutableBuilder[Self <: UsePaginationItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: page | first | last | next | previous | `start-ellipsis` | `end-ellipsis`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UsePaginationProps extends StObject {
    
    /**
      * Number of always visible pages at the beginning and end.
      * @default 1
      */
    var boundaryCount: js.UndefOr[Double] = js.native
    
    /**
      * The name of the component where this hook is used.
      */
    var componentName: js.UndefOr[String] = js.native
    
    /**
      * The total number of pages.
      * @default 1
      */
    var count: js.UndefOr[Double] = js.native
    
    /**
      * The page selected by default when the component is uncontrolled.
      * @default 1
      */
    var defaultPage: js.UndefOr[Double] = js.native
    
    /**
      * If `true`, the pagination component will be disabled.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, hide the next-page button.
      * @default false
      */
    var hideNextButton: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, hide the previous-page button.
      * @default false
      */
    var hidePrevButton: js.UndefOr[Boolean] = js.native
    
    /**
      * Callback fired when the page is changed.
      *
      * @param {object} event The event source of the callback.
      * @param {number} page The page selected.
      */
    var onChange: js.UndefOr[js.Function2[/* event */ ChangeEvent[_], /* page */ Double, Unit]] = js.native
    
    /**
      * The current page.
      */
    var page: js.UndefOr[Double] = js.native
    
    /**
      * If `true`, show the first-page button.
      * @default false
      */
    var showFirstButton: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, show the last-page button.
      * @default false
      */
    var showLastButton: js.UndefOr[Boolean] = js.native
    
    /**
      * Number of always visible pages before and after the current page.
      * @default 1
      */
    var siblingCount: js.UndefOr[Double] = js.native
  }
  object UsePaginationProps {
    
    @scala.inline
    def apply(): UsePaginationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsePaginationProps]
    }
    
    @scala.inline
    implicit class UsePaginationPropsMutableBuilder[Self <: UsePaginationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoundaryCount(value: Double): Self = StObject.set(x, "boundaryCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundaryCountUndefined: Self = StObject.set(x, "boundaryCount", js.undefined)
      
      @scala.inline
      def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setDefaultPage(value: Double): Self = StObject.set(x, "defaultPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPageUndefined: Self = StObject.set(x, "defaultPage", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHideNextButton(value: Boolean): Self = StObject.set(x, "hideNextButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideNextButtonUndefined: Self = StObject.set(x, "hideNextButton", js.undefined)
      
      @scala.inline
      def setHidePrevButton(value: Boolean): Self = StObject.set(x, "hidePrevButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidePrevButtonUndefined: Self = StObject.set(x, "hidePrevButton", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* event */ ChangeEvent[_], /* page */ Double) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      @scala.inline
      def setShowFirstButton(value: Boolean): Self = StObject.set(x, "showFirstButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFirstButtonUndefined: Self = StObject.set(x, "showFirstButton", js.undefined)
      
      @scala.inline
      def setShowLastButton(value: Boolean): Self = StObject.set(x, "showLastButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLastButtonUndefined: Self = StObject.set(x, "showLastButton", js.undefined)
      
      @scala.inline
      def setSiblingCount(value: Double): Self = StObject.set(x, "siblingCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiblingCountUndefined: Self = StObject.set(x, "siblingCount", js.undefined)
    }
  }
  
  @js.native
  trait UsePaginationResult extends StObject {
    
    var items: js.Array[UsePaginationItem] = js.native
  }
  object UsePaginationResult {
    
    @scala.inline
    def apply(items: js.Array[UsePaginationItem]): UsePaginationResult = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsePaginationResult]
    }
    
    @scala.inline
    implicit class UsePaginationResultMutableBuilder[Self <: UsePaginationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[UsePaginationItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: UsePaginationItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
}
