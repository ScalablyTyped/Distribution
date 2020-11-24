package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgLayoutManagerBorderLayout
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Option specifying the width of the left region, either in px or percentages
    *
    */
  var leftWidth: js.UndefOr[String] = js.native
  
  /**
    * Option specifying the width of the right region, either in px or percentages
    *
    */
  var rightWidth: js.UndefOr[String] = js.native
  
  /**
    * Option specifying whether the footer region in the border layout will be hidden or shown
    *
    */
  var showFooter: js.UndefOr[Boolean] = js.native
  
  /**
    * Option specifying whether the header region in the border layout will be hidden or shown
    *
    */
  var showHeader: js.UndefOr[Boolean] = js.native
  
  /**
    * Option specifying whether the left region in the border layout will be hidden or shown
    *
    */
  var showLeft: js.UndefOr[Boolean] = js.native
  
  /**
    * Option specifying whether the right region in the border layout will be hidden or shown
    *
    */
  var showRight: js.UndefOr[Boolean] = js.native
}
object IgLayoutManagerBorderLayout {
  
  @scala.inline
  def apply(): IgLayoutManagerBorderLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgLayoutManagerBorderLayout]
  }
  
  @scala.inline
  implicit class IgLayoutManagerBorderLayoutOps[Self <: IgLayoutManagerBorderLayout] (val x: Self) extends AnyVal {
    
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
    def setLeftWidth(value: String): Self = this.set("leftWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftWidth: Self = this.set("leftWidth", js.undefined)
    
    @scala.inline
    def setRightWidth(value: String): Self = this.set("rightWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightWidth: Self = this.set("rightWidth", js.undefined)
    
    @scala.inline
    def setShowFooter(value: Boolean): Self = this.set("showFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFooter: Self = this.set("showFooter", js.undefined)
    
    @scala.inline
    def setShowHeader(value: Boolean): Self = this.set("showHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHeader: Self = this.set("showHeader", js.undefined)
    
    @scala.inline
    def setShowLeft(value: Boolean): Self = this.set("showLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLeft: Self = this.set("showLeft", js.undefined)
    
    @scala.inline
    def setShowRight(value: Boolean): Self = this.set("showRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRight: Self = this.set("showRight", js.undefined)
  }
}
