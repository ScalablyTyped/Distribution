package typings.googleapis.datastreamV1Mod.datastreamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsStreamsObjectsStartbackfilljob
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the stream object resource to start a backfill job for.
    */
  var `object`: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaStartBackfillJobRequest] = js.undefined
}
object ParamsResourceProjectsLocationsStreamsObjectsStartbackfilljob {
  
  inline def apply(): ParamsResourceProjectsLocationsStreamsObjectsStartbackfilljob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsStreamsObjectsStartbackfilljob]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsStreamsObjectsStartbackfilljob](x: Self) {
    
    inline def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
    
    inline def setRequestBody(value: SchemaStartBackfillJobRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
