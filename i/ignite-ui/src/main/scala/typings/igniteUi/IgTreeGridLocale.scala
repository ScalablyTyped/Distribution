package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
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
  implicit class IgTreeGridLocaleMutableBuilder[Self <: IgTreeGridLocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapseTooltipText(value: String): Self = StObject.set(x, "collapseTooltipText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseTooltipTextUndefined: Self = StObject.set(x, "collapseTooltipText", js.undefined)
    
    @scala.inline
    def setExpandTooltipText(value: String): Self = StObject.set(x, "expandTooltipText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandTooltipTextUndefined: Self = StObject.set(x, "expandTooltipText", js.undefined)
  }
}
