package typings.googleapis.mybusinessaccountmanagementV1Mod.mybusinessaccountmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLocationsAdminsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the admin to remove from the location.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceLocationsAdminsDelete {
  
  inline def apply(): ParamsResourceLocationsAdminsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLocationsAdminsDelete]
  }
  
  extension [Self <: ParamsResourceLocationsAdminsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
