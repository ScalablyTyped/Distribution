package typings.googleapis.v1alpha2Mod.bigqueryreservationV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsReservationgrantsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * The parent resource name of the reservation grant E.g.: projects/myproject/location/eu.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaReservationGrant] = js.undefined
}
object ParamsResourceProjectsLocationsReservationgrantsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsReservationgrantsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsReservationgrantsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsReservationgrantsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaReservationGrant): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
