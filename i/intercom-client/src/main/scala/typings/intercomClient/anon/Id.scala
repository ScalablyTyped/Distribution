package typings.intercomClient.anon

import typings.intercomClient.companyMod.CompanyIdentifier
import typings.intercomClient.leadMod.LeadIdentifier
import typings.intercomClient.userMod.UserIdIdentifier
import typings.intercomClient.visitorMod.VisitorIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id
  extends StObject
     with CompanyIdentifier
     with LeadIdentifier
     with UserIdIdentifier
     with VisitorIdentifier {
  
  var id: String
}
object Id {
  
  inline def apply(id: String): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
