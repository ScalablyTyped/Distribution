package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Assurance details about what validation has been performed on the returned payment credentials so that appropriate instrument risk checks can be applied.
  *
  *  Note: If both cardHolderAuthenticated and accountVerified are true, you don’t need to step up the returned credentials.
  *  If both aren’t, we recommend you to run the same risk checks and , authentication including 3D Secure flow if applicable.
  */
trait AssuranceDetails extends StObject {
  
  /**
    * If true, indicates that Cardholder possession validation has been performed on returned payment credential.
    */
  var accountVerified: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, indicates that identification and verifications (ID&V) was performed on the returned payment credential.
    *
    * If false, the same risk-based authentication can be performed as you would for card transactions.
    * This risk-based authentication can include, but not limited to, step-up with 3D Secure protocol if applicable.
    */
  var cardHolderAuthenticated: js.UndefOr[Boolean] = js.undefined
}
object AssuranceDetails {
  
  inline def apply(): AssuranceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssuranceDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssuranceDetails] (val x: Self) extends AnyVal {
    
    inline def setAccountVerified(value: Boolean): Self = StObject.set(x, "accountVerified", value.asInstanceOf[js.Any])
    
    inline def setAccountVerifiedUndefined: Self = StObject.set(x, "accountVerified", js.undefined)
    
    inline def setCardHolderAuthenticated(value: Boolean): Self = StObject.set(x, "cardHolderAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setCardHolderAuthenticatedUndefined: Self = StObject.set(x, "cardHolderAuthenticated", js.undefined)
  }
}
