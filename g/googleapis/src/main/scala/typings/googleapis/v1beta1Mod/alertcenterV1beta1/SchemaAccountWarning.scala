package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Alerts for user account warning events.
  */
@js.native
trait SchemaAccountWarning extends js.Object {
  
  /**
    * Required. The email of the user that this event belongs to.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * Optional. Details of the login action associated with the warning event.
    * This is only available for:  * Suspicious login * Suspicious login (less
    * secure app) * Suspicious programmatic login * User suspended (suspicious
    * activity)
    */
  var loginDetails: js.UndefOr[SchemaLoginDetails] = js.native
}
object SchemaAccountWarning {
  
  @scala.inline
  def apply(): SchemaAccountWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountWarning]
  }
  
  @scala.inline
  implicit class SchemaAccountWarningOps[Self <: SchemaAccountWarning] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setLoginDetails(value: SchemaLoginDetails): Self = this.set("loginDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoginDetails: Self = this.set("loginDetails", js.undefined)
  }
}
