package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestFailure extends StObject {
  
  /** BackendService or BackendBucket returned by load balancer. */
  var actualService: js.UndefOr[String] = js.undefined
  
  /** Expected BackendService or BackendBucket resource the given URL should be mapped to. */
  var expectedService: js.UndefOr[String] = js.undefined
  
  /** Host portion of the URL. */
  var host: js.UndefOr[String] = js.undefined
  
  /** Path portion including query parameters in the URL. */
  var path: js.UndefOr[String] = js.undefined
}
object TestFailure {
  
  inline def apply(): TestFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestFailure]
  }
  
  extension [Self <: TestFailure](x: Self) {
    
    inline def setActualService(value: String): Self = StObject.set(x, "actualService", value.asInstanceOf[js.Any])
    
    inline def setActualServiceUndefined: Self = StObject.set(x, "actualService", js.undefined)
    
    inline def setExpectedService(value: String): Self = StObject.set(x, "expectedService", value.asInstanceOf[js.Any])
    
    inline def setExpectedServiceUndefined: Self = StObject.set(x, "expectedService", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
