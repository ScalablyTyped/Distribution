package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgSliderBookmarks
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Get or set a custom css class to be applied to the bookmark anchor element.
    */
  var css: js.UndefOr[String] = js.undefined
  
  /**
    * Get or set whether the bookmark is disabled or not.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Get or set the bookmark title. Show in tooltip on hover.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Get or set the bookmark value. Should be between slider min and max values.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object IgSliderBookmarks {
  
  inline def apply(): IgSliderBookmarks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSliderBookmarks]
  }
  
  extension [Self <: IgSliderBookmarks](x: Self) {
    
    inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
