package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsStreamsObjectsStopbackfilljob
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the stream object resource to stop the backfill job for.
    */
  var `object`: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsStreamsObjectsStopbackfilljob {
  
  inline def apply(): ParamsResourceProjectsLocationsStreamsObjectsStopbackfilljob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsStreamsObjectsStopbackfilljob]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsStreamsObjectsStopbackfilljob](x: Self) {
    
    inline def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
  }
}
