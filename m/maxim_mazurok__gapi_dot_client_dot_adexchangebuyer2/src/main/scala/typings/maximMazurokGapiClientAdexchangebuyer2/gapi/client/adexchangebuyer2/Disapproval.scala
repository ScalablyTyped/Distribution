package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disapproval extends StObject {
  
  /** Additional details about the reason for disapproval. */
  var details: js.UndefOr[js.Array[String]] = js.native
  
  /** The categorized reason for disapproval. */
  var reason: js.UndefOr[String] = js.native
}
object Disapproval {
  
  @scala.inline
  def apply(): Disapproval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Disapproval]
  }
  
  @scala.inline
  implicit class DisapprovalMutableBuilder[Self <: Disapproval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: js.Array[String]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setDetailsVarargs(value: String*): Self = StObject.set(x, "details", js.Array(value :_*))
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
