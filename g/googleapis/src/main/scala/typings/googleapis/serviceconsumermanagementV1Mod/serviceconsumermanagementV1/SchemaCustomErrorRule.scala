package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A custom error rule.
  */
@js.native
trait SchemaCustomErrorRule extends js.Object {
  
  /**
    * Mark this message as possible payload in error response.  Otherwise,
    * objects of this type will be filtered when they appear in error payload.
    */
  var isErrorType: js.UndefOr[Boolean] = js.native
  
  /**
    * Selects messages to which this rule applies.  Refer to selector for
    * syntax details.
    */
  var selector: js.UndefOr[String] = js.native
}
object SchemaCustomErrorRule {
  
  @scala.inline
  def apply(): SchemaCustomErrorRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomErrorRule]
  }
  
  @scala.inline
  implicit class SchemaCustomErrorRuleOps[Self <: SchemaCustomErrorRule] (val x: Self) extends AnyVal {
    
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
    def setIsErrorType(value: Boolean): Self = this.set("isErrorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsErrorType: Self = this.set("isErrorType", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
}
