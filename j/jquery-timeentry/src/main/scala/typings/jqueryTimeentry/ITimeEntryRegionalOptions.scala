package typings.jqueryTimeentry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITimeEntryRegionalOptions extends StObject {
  
  /**
    * The AM and PM display text. This is one of the regional settings fields.
    *
    * default: ['AM','PM']
    */
  var ampmNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The text that separates the time from the AM and PM indicators. This is one of the regional settings fields.
    *
    * default: ''
    */
  var ampmPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * The separator between time portions. This is one of the regional settings fields.
    *
    * default: ':'
    */
  var separator: js.UndefOr[String] = js.undefined
  
  /**
    * Indicate whether to use 12-hour (false) or 24-hour (true) time. This is one of the regional settings fields.
    *
    * default: False
    */
  var show24Hours: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The tooltip text for the spinner buttons. This is one of the regional settings fields.
    *
    * default: ['Now', 'Previous field', 'Next field', 'Increment', 'Decrement']
    */
  var spinnerTexts: js.UndefOr[js.Array[String]] = js.undefined
}
object ITimeEntryRegionalOptions {
  
  inline def apply(): ITimeEntryRegionalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimeEntryRegionalOptions]
  }
  
  extension [Self <: ITimeEntryRegionalOptions](x: Self) {
    
    inline def setAmpmNames(value: js.Array[String]): Self = StObject.set(x, "ampmNames", value.asInstanceOf[js.Any])
    
    inline def setAmpmNamesUndefined: Self = StObject.set(x, "ampmNames", js.undefined)
    
    inline def setAmpmNamesVarargs(value: String*): Self = StObject.set(x, "ampmNames", js.Array(value :_*))
    
    inline def setAmpmPrefix(value: String): Self = StObject.set(x, "ampmPrefix", value.asInstanceOf[js.Any])
    
    inline def setAmpmPrefixUndefined: Self = StObject.set(x, "ampmPrefix", js.undefined)
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setShow24Hours(value: Boolean): Self = StObject.set(x, "show24Hours", value.asInstanceOf[js.Any])
    
    inline def setShow24HoursUndefined: Self = StObject.set(x, "show24Hours", js.undefined)
    
    inline def setSpinnerTexts(value: js.Array[String]): Self = StObject.set(x, "spinnerTexts", value.asInstanceOf[js.Any])
    
    inline def setSpinnerTextsUndefined: Self = StObject.set(x, "spinnerTexts", js.undefined)
    
    inline def setSpinnerTextsVarargs(value: String*): Self = StObject.set(x, "spinnerTexts", js.Array(value :_*))
  }
}
