package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityContext extends StObject {
  
  /** The security types in this context. */
  var securities: js.UndefOr[js.Array[String]] = js.native
}
object SecurityContext {
  
  @scala.inline
  def apply(): SecurityContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityContext]
  }
  
  @scala.inline
  implicit class SecurityContextMutableBuilder[Self <: SecurityContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurities(value: js.Array[String]): Self = StObject.set(x, "securities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecuritiesUndefined: Self = StObject.set(x, "securities", js.undefined)
    
    @scala.inline
    def setSecuritiesVarargs(value: String*): Self = StObject.set(x, "securities", js.Array(value :_*))
  }
}
