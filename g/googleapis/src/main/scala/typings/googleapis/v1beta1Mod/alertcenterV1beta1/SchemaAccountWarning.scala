package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Alerts for user account warning events.
  */
trait SchemaAccountWarning extends StObject {
  
  /**
    * Required. The email of the user that this event belongs to.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Details of the login action associated with the warning event.
    * This is only available for:  * Suspicious login * Suspicious login (less
    * secure app) * Suspicious programmatic login * User suspended (suspicious
    * activity)
    */
  var loginDetails: js.UndefOr[SchemaLoginDetails] = js.undefined
}
object SchemaAccountWarning {
  
  @scala.inline
  def apply(): SchemaAccountWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountWarning]
  }
  
  @scala.inline
  implicit class SchemaAccountWarningMutableBuilder[Self <: SchemaAccountWarning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setLoginDetails(value: SchemaLoginDetails): Self = StObject.set(x, "loginDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginDetailsUndefined: Self = StObject.set(x, "loginDetails", js.undefined)
  }
}
