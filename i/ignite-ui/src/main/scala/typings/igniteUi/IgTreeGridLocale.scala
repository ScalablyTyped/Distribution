package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgTreeGridLocale
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Specifies the collapse indicator tooltip text.
    *
    */
  var collapseTooltipText: js.UndefOr[String] = js.native
  
  /**
    * Specifies the expansion indicator tooltip text.
    *
    */
  var expandTooltipText: js.UndefOr[String] = js.native
}
object IgTreeGridLocale {
  
  @scala.inline
  def apply(): IgTreeGridLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridLocale]
  }
  
  @scala.inline
  implicit class IgTreeGridLocaleOps[Self <: IgTreeGridLocale] (val x: Self) extends AnyVal {
    
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
    def setCollapseTooltipText(value: String): Self = this.set("collapseTooltipText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseTooltipText: Self = this.set("collapseTooltipText", js.undefined)
    
    @scala.inline
    def setExpandTooltipText(value: String): Self = this.set("expandTooltipText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandTooltipText: Self = this.set("expandTooltipText", js.undefined)
  }
}
