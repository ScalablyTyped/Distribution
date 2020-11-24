package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The value of the condition.
  */
@js.native
trait SchemaConditionValue extends js.Object {
  
  /**
    * A relative date (based on the current date). Valid only if the type is
    * DATE_BEFORE, DATE_AFTER, DATE_ON_OR_BEFORE or DATE_ON_OR_AFTER.  Relative
    * dates are not supported in data validation. They are supported only in
    * conditional formatting and conditional filters.
    */
  var relativeDate: js.UndefOr[String] = js.native
  
  /**
    * A value the condition is based on. The value is parsed as if the user
    * typed into a cell. Formulas are supported (and must begin with an `=` or
    * a &#39;+&#39;).
    */
  var userEnteredValue: js.UndefOr[String] = js.native
}
object SchemaConditionValue {
  
  @scala.inline
  def apply(): SchemaConditionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConditionValue]
  }
  
  @scala.inline
  implicit class SchemaConditionValueOps[Self <: SchemaConditionValue] (val x: Self) extends AnyVal {
    
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
    def setRelativeDate(value: String): Self = this.set("relativeDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativeDate: Self = this.set("relativeDate", js.undefined)
    
    @scala.inline
    def setUserEnteredValue(value: String): Self = this.set("userEnteredValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserEnteredValue: Self = this.set("userEnteredValue", js.undefined)
  }
}
