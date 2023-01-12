package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountShippingImprovements extends StObject {
  
  /** Enables automatic shipping improvements. */
  var allowShippingImprovements: js.UndefOr[Boolean] = js.undefined
}
object AccountShippingImprovements {
  
  inline def apply(): AccountShippingImprovements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountShippingImprovements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountShippingImprovements] (val x: Self) extends AnyVal {
    
    inline def setAllowShippingImprovements(value: Boolean): Self = StObject.set(x, "allowShippingImprovements", value.asInstanceOf[js.Any])
    
    inline def setAllowShippingImprovementsUndefined: Self = StObject.set(x, "allowShippingImprovements", js.undefined)
  }
}
