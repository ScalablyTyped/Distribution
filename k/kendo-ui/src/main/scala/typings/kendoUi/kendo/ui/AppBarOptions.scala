package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppBarOptions extends js.Object {
  
  var items: js.UndefOr[js.Array[AppBarItem]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var positionMode: js.UndefOr[String] = js.native
  
  var resize: js.UndefOr[js.Function1[/* e */ AppBarResizeEvent, Unit]] = js.native
  
  var themeColor: js.UndefOr[String] = js.native
}
object AppBarOptions {
  
  @scala.inline
  def apply(): AppBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppBarOptions]
  }
  
  @scala.inline
  implicit class AppBarOptionsOps[Self <: AppBarOptions] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: AppBarItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[AppBarItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setPositionMode(value: String): Self = this.set("positionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionMode: Self = this.set("positionMode", js.undefined)
    
    @scala.inline
    def setResize(value: /* e */ AppBarResizeEvent => Unit): Self = this.set("resize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setThemeColor(value: String): Self = this.set("themeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemeColor: Self = this.set("themeColor", js.undefined)
  }
}
