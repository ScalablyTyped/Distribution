package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

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
}
object ParamsResourceProjectsLocationsStreamsObjectsStartbackfilljob {
  
  inline def apply(): ParamsResourceProjectsLocationsStreamsObjectsStartbackfilljob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsStreamsObjectsStartbackfilljob]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsStreamsObjectsStartbackfilljob](x: Self) {
    
    inline def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
  }
}
