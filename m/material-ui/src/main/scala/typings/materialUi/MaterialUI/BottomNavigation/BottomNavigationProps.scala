package typings.materialUi.MaterialUI.BottomNavigation

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BottomNavigationProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var selectedIndex: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object BottomNavigationProps {
  
  @scala.inline
  def apply(): BottomNavigationProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BottomNavigationProps]
  }
  
  @scala.inline
  implicit class BottomNavigationPropsOps[Self <: BottomNavigationProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setSelectedIndex(value: Double): Self = this.set("selectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedIndex: Self = this.set("selectedIndex", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
