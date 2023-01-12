package typings.maplibreGl.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MAXPARALLELIMAGEREQUESTS extends StObject {
  
  var MAX_PARALLEL_IMAGE_REQUESTS: Double
  
  var REGISTERED_PROTOCOLS: StringDictionary[Any]
}
object MAXPARALLELIMAGEREQUESTS {
  
  inline def apply(MAX_PARALLEL_IMAGE_REQUESTS: Double, REGISTERED_PROTOCOLS: StringDictionary[Any]): MAXPARALLELIMAGEREQUESTS = {
    val __obj = js.Dynamic.literal(MAX_PARALLEL_IMAGE_REQUESTS = MAX_PARALLEL_IMAGE_REQUESTS.asInstanceOf[js.Any], REGISTERED_PROTOCOLS = REGISTERED_PROTOCOLS.asInstanceOf[js.Any])
    __obj.asInstanceOf[MAXPARALLELIMAGEREQUESTS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MAXPARALLELIMAGEREQUESTS] (val x: Self) extends AnyVal {
    
    inline def setMAX_PARALLEL_IMAGE_REQUESTS(value: Double): Self = StObject.set(x, "MAX_PARALLEL_IMAGE_REQUESTS", value.asInstanceOf[js.Any])
    
    inline def setREGISTERED_PROTOCOLS(value: StringDictionary[Any]): Self = StObject.set(x, "REGISTERED_PROTOCOLS", value.asInstanceOf[js.Any])
  }
}
