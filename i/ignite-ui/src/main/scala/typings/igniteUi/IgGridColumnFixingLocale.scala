package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridColumnFixingLocale
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Text of the feature chooser button for fixing a currently unfixed column.
    *
    */
  var featureChooserTextFixedColumn: js.UndefOr[String] = js.undefined
  
  /**
    * Text of the feature chooser button for unfixing a currently fixed column.
    *
    */
  var featureChooserTextUnfixedColumn: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the tooltip text on the column fixing header icon when column is not fixed.
    *
    */
  var headerFixButtonText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the tooltip text on the column fixing header icon when column is not fixed.
    *
    */
  var headerUnfixButtonText: js.UndefOr[String] = js.undefined
}
object IgGridColumnFixingLocale {
  
  inline def apply(): IgGridColumnFixingLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridColumnFixingLocale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgGridColumnFixingLocale] (val x: Self) extends AnyVal {
    
    inline def setFeatureChooserTextFixedColumn(value: String): Self = StObject.set(x, "featureChooserTextFixedColumn", value.asInstanceOf[js.Any])
    
    inline def setFeatureChooserTextFixedColumnUndefined: Self = StObject.set(x, "featureChooserTextFixedColumn", js.undefined)
    
    inline def setFeatureChooserTextUnfixedColumn(value: String): Self = StObject.set(x, "featureChooserTextUnfixedColumn", value.asInstanceOf[js.Any])
    
    inline def setFeatureChooserTextUnfixedColumnUndefined: Self = StObject.set(x, "featureChooserTextUnfixedColumn", js.undefined)
    
    inline def setHeaderFixButtonText(value: String): Self = StObject.set(x, "headerFixButtonText", value.asInstanceOf[js.Any])
    
    inline def setHeaderFixButtonTextUndefined: Self = StObject.set(x, "headerFixButtonText", js.undefined)
    
    inline def setHeaderUnfixButtonText(value: String): Self = StObject.set(x, "headerUnfixButtonText", value.asInstanceOf[js.Any])
    
    inline def setHeaderUnfixButtonTextUndefined: Self = StObject.set(x, "headerUnfixButtonText", js.undefined)
  }
}
