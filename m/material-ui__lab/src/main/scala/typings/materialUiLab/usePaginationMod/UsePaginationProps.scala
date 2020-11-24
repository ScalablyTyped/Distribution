package typings.materialUiLab.usePaginationMod

import typings.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsePaginationProps extends js.Object {
  
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
  implicit class UsePaginationPropsOps[Self <: UsePaginationProps] (val x: Self) extends AnyVal {
    
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
    def setBoundaryCount(value: Double): Self = this.set("boundaryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundaryCount: Self = this.set("boundaryCount", js.undefined)
    
    @scala.inline
    def setComponentName(value: String): Self = this.set("componentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentName: Self = this.set("componentName", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setDefaultPage(value: Double): Self = this.set("defaultPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPage: Self = this.set("defaultPage", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setHideNextButton(value: Boolean): Self = this.set("hideNextButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideNextButton: Self = this.set("hideNextButton", js.undefined)
    
    @scala.inline
    def setHidePrevButton(value: Boolean): Self = this.set("hidePrevButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidePrevButton: Self = this.set("hidePrevButton", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* event */ ChangeEvent[_], /* page */ Double) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setShowFirstButton(value: Boolean): Self = this.set("showFirstButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFirstButton: Self = this.set("showFirstButton", js.undefined)
    
    @scala.inline
    def setShowLastButton(value: Boolean): Self = this.set("showLastButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLastButton: Self = this.set("showLastButton", js.undefined)
    
    @scala.inline
    def setSiblingCount(value: Double): Self = this.set("siblingCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiblingCount: Self = this.set("siblingCount", js.undefined)
  }
}
