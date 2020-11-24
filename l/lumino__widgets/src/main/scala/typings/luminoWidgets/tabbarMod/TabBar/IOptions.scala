package typings.luminoWidgets.tabbarMod.TabBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An options object for creating a tab bar.
  */
@js.native
trait IOptions[T] extends js.Object {
  
  /**
    * Whether a tab can be deselected by the user.
    *
    * The default is `false`.
    */
  var allowDeselect: js.UndefOr[Boolean] = js.native
  
  /**
    * The selection behavior when inserting a tab.
    *
    * The default is `'select-tab-if-needed'`.
    */
  var insertBehavior: js.UndefOr[InsertBehavior] = js.native
  
  /**
    * The layout orientation of the tab bar.
    *
    * The default is `horizontal`.
    */
  var orientation: js.UndefOr[Orientation] = js.native
  
  /**
    * The selection behavior when removing a tab.
    *
    * The default is `'select-tab-after'`.
    */
  var removeBehavior: js.UndefOr[RemoveBehavior] = js.native
  
  /**
    * A renderer to use with the tab bar.
    *
    * The default is a shared renderer instance.
    */
  var renderer: js.UndefOr[IRenderer[T]] = js.native
  
  /**
    * Whether the tabs are movable by the user.
    *
    * The default is `false`.
    */
  var tabsMovable: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the titles can be directly edited by the user.
    *
    * The default is `false`.
    */
  var titlesEditable: js.UndefOr[Boolean] = js.native
}
object IOptions {
  
  @scala.inline
  def apply[T](): IOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions[T]]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions[_], T] (val x: Self with IOptions[T]) extends AnyVal {
    
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
    def setAllowDeselect(value: Boolean): Self = this.set("allowDeselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDeselect: Self = this.set("allowDeselect", js.undefined)
    
    @scala.inline
    def setInsertBehavior(value: InsertBehavior): Self = this.set("insertBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertBehavior: Self = this.set("insertBehavior", js.undefined)
    
    @scala.inline
    def setOrientation(value: Orientation): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setRemoveBehavior(value: RemoveBehavior): Self = this.set("removeBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveBehavior: Self = this.set("removeBehavior", js.undefined)
    
    @scala.inline
    def setRenderer(value: IRenderer[T]): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    
    @scala.inline
    def setTabsMovable(value: Boolean): Self = this.set("tabsMovable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabsMovable: Self = this.set("tabsMovable", js.undefined)
    
    @scala.inline
    def setTitlesEditable(value: Boolean): Self = this.set("titlesEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitlesEditable: Self = this.set("titlesEditable", js.undefined)
  }
}
