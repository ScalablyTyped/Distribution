package typings.jqueryTimeentry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITimeEntryRegionalOptions extends js.Object {
  
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
  implicit class ITimeEntryRegionalOptionsOps[Self <: ITimeEntryRegionalOptions] (val x: Self) extends AnyVal {
    
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
    def setAmpmNamesVarargs(value: String*): Self = this.set("ampmNames", js.Array(value :_*))
    
    @scala.inline
    def setAmpmNames(value: js.Array[String]): Self = this.set("ampmNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmpmNames: Self = this.set("ampmNames", js.undefined)
    
    @scala.inline
    def setAmpmPrefix(value: String): Self = this.set("ampmPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmpmPrefix: Self = this.set("ampmPrefix", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setShow24Hours(value: Boolean): Self = this.set("show24Hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow24Hours: Self = this.set("show24Hours", js.undefined)
    
    @scala.inline
    def setSpinnerTextsVarargs(value: String*): Self = this.set("spinnerTexts", js.Array(value :_*))
    
    @scala.inline
    def setSpinnerTexts(value: js.Array[String]): Self = this.set("spinnerTexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpinnerTexts: Self = this.set("spinnerTexts", js.undefined)
  }
}
