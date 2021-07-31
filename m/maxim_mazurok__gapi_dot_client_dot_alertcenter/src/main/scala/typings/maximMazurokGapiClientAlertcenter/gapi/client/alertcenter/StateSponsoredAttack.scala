package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateSponsoredAttack extends StObject {
  
  /** The email of the user this incident was created for. */
  var email: js.UndefOr[String] = js.undefined
}
object StateSponsoredAttack {
  
  @scala.inline
  def apply(): StateSponsoredAttack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateSponsoredAttack]
  }
  
  @scala.inline
  implicit class StateSponsoredAttackMutableBuilder[Self <: StateSponsoredAttack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
  }
}
