package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsPrivateconnectionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the private connectivity configuration to get.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsPrivateconnectionsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsPrivateconnectionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsPrivateconnectionsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsPrivateconnectionsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
