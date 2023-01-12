package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgTreeGridUpdatingLocale
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Specifies the label of the add child button in touch environment.
    *
    */
  var addChildButtonLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the add child tooltip text.
    *
    */
  var addChildTooltip: js.UndefOr[String] = js.undefined
}
object IgTreeGridUpdatingLocale {
  
  inline def apply(): IgTreeGridUpdatingLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridUpdatingLocale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgTreeGridUpdatingLocale] (val x: Self) extends AnyVal {
    
    inline def setAddChildButtonLabel(value: String): Self = StObject.set(x, "addChildButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setAddChildButtonLabelUndefined: Self = StObject.set(x, "addChildButtonLabel", js.undefined)
    
    inline def setAddChildTooltip(value: String): Self = StObject.set(x, "addChildTooltip", value.asInstanceOf[js.Any])
    
    inline def setAddChildTooltipUndefined: Self = StObject.set(x, "addChildTooltip", js.undefined)
  }
}
