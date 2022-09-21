package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePeopleDeletecontact
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the contact to delete.
    */
  var resourceName: js.UndefOr[String] = js.undefined
}
object ParamsResourcePeopleDeletecontact {
  
  inline def apply(): ParamsResourcePeopleDeletecontact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePeopleDeletecontact]
  }
  
  extension [Self <: ParamsResourcePeopleDeletecontact](x: Self) {
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
