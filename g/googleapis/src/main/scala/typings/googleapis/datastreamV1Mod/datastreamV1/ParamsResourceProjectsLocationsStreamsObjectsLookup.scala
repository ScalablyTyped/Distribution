package typings.googleapis.datastreamV1Mod.datastreamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsStreamsObjectsLookup
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent stream that owns the collection of objects.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaLookupStreamObjectRequest] = js.undefined
}
object ParamsResourceProjectsLocationsStreamsObjectsLookup {
  
  inline def apply(): ParamsResourceProjectsLocationsStreamsObjectsLookup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsStreamsObjectsLookup]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsStreamsObjectsLookup](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaLookupStreamObjectRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
