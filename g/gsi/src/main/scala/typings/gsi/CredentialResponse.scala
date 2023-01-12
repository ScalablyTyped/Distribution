package typings.gsi

import typings.gsi.gsiStrings.auto
import typings.gsi.gsiStrings.btn
import typings.gsi.gsiStrings.btn_add_session
import typings.gsi.gsiStrings.btn_confirm
import typings.gsi.gsiStrings.btn_confirm_add_session
import typings.gsi.gsiStrings.user
import typings.gsi.gsiStrings.user_1tap
import typings.gsi.gsiStrings.user_2tap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CredentialResponse extends StObject {
  
  /** This field is the returned ID token. */
  var credential: String
  
  /** This field sets how the credential is selected. */
  var select_by: auto | user | user_1tap | user_2tap | btn | btn_confirm | btn_add_session | btn_confirm_add_session
}
object CredentialResponse {
  
  inline def apply(
    credential: String,
    select_by: auto | user | user_1tap | user_2tap | btn | btn_confirm | btn_add_session | btn_confirm_add_session
  ): CredentialResponse = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], select_by = select_by.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CredentialResponse] (val x: Self) extends AnyVal {
    
    inline def setCredential(value: String): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    inline def setSelect_by(
      value: auto | user | user_1tap | user_2tap | btn | btn_confirm | btn_add_session | btn_confirm_add_session
    ): Self = StObject.set(x, "select_by", value.asInstanceOf[js.Any])
  }
}
