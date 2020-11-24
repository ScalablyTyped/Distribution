package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generated advice about this change, used for providing more information
  * about how a change will affect the existing service.
  */
@js.native
trait SchemaAdvice extends js.Object {
  
  /**
    * Useful description for why this advice was applied and what actions
    * should be taken to mitigate any implied risks.
    */
  var description: js.UndefOr[String] = js.native
}
object SchemaAdvice {
  
  @scala.inline
  def apply(): SchemaAdvice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvice]
  }
  
  @scala.inline
  implicit class SchemaAdviceOps[Self <: SchemaAdvice] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
}
