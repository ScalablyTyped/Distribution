package typings.jqueryTimeentry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITimeEntryRegionalOptions extends StObject {
  
  /**
    * The AM and PM display text. This is one of the regional settings fields.
    *
    * default: ['AM','PM']
    */
  var ampmNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The text that separates the time from the AM and PM indicators. This is one of the regional settings fields.
    *
    * default: ''
    */
  var ampmPrefix: js.UndefOr[String] = js.native
  
  /**
    * The separator between time portions. This is one of the regional settings fields.
    *
    * default: ':'
    */
  var separator: js.UndefOr[String] = js.native
  
  /**
    * Indicate whether to use 12-hour (false) or 24-hour (true) time. This is one of the regional settings fields.
    *
    * default: False
    */
  var show24Hours: js.UndefOr[Boolean] = js.native
  
  /**
    * The tooltip text for the spinner buttons. This is one of the regional settings fields.
    *
    * default: ['Now', 'Previous field', 'Next field', 'Increment', 'Decrement']
    */
  var spinnerTexts: js.UndefOr[js.Array[String]] = js.native
}
object ITimeEntryRegionalOptions {
  
  @scala.inline
  def apply(): ITimeEntryRegionalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimeEntryRegionalOptions]
  }
  
  @scala.inline
  implicit class ITimeEntryRegionalOptionsMutableBuilder[Self <: ITimeEntryRegionalOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmpmNames(value: js.Array[String]): Self = StObject.set(x, "ampmNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmpmNamesUndefined: Self = StObject.set(x, "ampmNames", js.undefined)
    
    @scala.inline
    def setAmpmNamesVarargs(value: String*): Self = StObject.set(x, "ampmNames", js.Array(value :_*))
    
    @scala.inline
    def setAmpmPrefix(value: String): Self = StObject.set(x, "ampmPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmpmPrefixUndefined: Self = StObject.set(x, "ampmPrefix", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    @scala.inline
    def setShow24Hours(value: Boolean): Self = StObject.set(x, "show24Hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow24HoursUndefined: Self = StObject.set(x, "show24Hours", js.undefined)
    
    @scala.inline
    def setSpinnerTexts(value: js.Array[String]): Self = StObject.set(x, "spinnerTexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpinnerTextsUndefined: Self = StObject.set(x, "spinnerTexts", js.undefined)
    
    @scala.inline
    def setSpinnerTextsVarargs(value: String*): Self = StObject.set(x, "spinnerTexts", js.Array(value :_*))
  }
}
