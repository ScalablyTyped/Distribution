package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridColumnFixingLocale
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Text of the feature chooser button for fixing a currently unfixed column.
    *
    */
  var featureChooserTextFixedColumn: js.UndefOr[String] = js.native
  
  /**
    * Text of the feature chooser button for unfixing a currently fixed column.
    *
    */
  var featureChooserTextUnfixedColumn: js.UndefOr[String] = js.native
  
  /**
    * Specifies the tooltip text on the column fixing header icon when column is not fixed.
    *
    */
  var headerFixButtonText: js.UndefOr[String] = js.native
  
  /**
    * Specifies the tooltip text on the column fixing header icon when column is not fixed.
    *
    */
  var headerUnfixButtonText: js.UndefOr[String] = js.native
}
object IgGridColumnFixingLocale {
  
  @scala.inline
  def apply(): IgGridColumnFixingLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridColumnFixingLocale]
  }
  
  @scala.inline
  implicit class IgGridColumnFixingLocaleMutableBuilder[Self <: IgGridColumnFixingLocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatureChooserTextFixedColumn(value: String): Self = StObject.set(x, "featureChooserTextFixedColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureChooserTextFixedColumnUndefined: Self = StObject.set(x, "featureChooserTextFixedColumn", js.undefined)
    
    @scala.inline
    def setFeatureChooserTextUnfixedColumn(value: String): Self = StObject.set(x, "featureChooserTextUnfixedColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureChooserTextUnfixedColumnUndefined: Self = StObject.set(x, "featureChooserTextUnfixedColumn", js.undefined)
    
    @scala.inline
    def setHeaderFixButtonText(value: String): Self = StObject.set(x, "headerFixButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderFixButtonTextUndefined: Self = StObject.set(x, "headerFixButtonText", js.undefined)
    
    @scala.inline
    def setHeaderUnfixButtonText(value: String): Self = StObject.set(x, "headerUnfixButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUnfixButtonTextUndefined: Self = StObject.set(x, "headerUnfixButtonText", js.undefined)
  }
}
