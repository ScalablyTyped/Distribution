package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.maximMazurokGapiClientBooks.anon.AcquirePermission
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FamilyInfo extends StObject {
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Family membership info of the user that made the request. */
  var membership: js.UndefOr[AcquirePermission] = js.undefined
}
object FamilyInfo {
  
  inline def apply(): FamilyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FamilyInfo]
  }
  
  extension [Self <: FamilyInfo](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMembership(value: AcquirePermission): Self = StObject.set(x, "membership", value.asInstanceOf[js.Any])
    
    inline def setMembershipUndefined: Self = StObject.set(x, "membership", js.undefined)
  }
}
