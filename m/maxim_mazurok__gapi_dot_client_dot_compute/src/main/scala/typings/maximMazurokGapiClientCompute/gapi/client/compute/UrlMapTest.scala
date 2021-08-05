package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlMapTest extends StObject {
  
  /** Description of this test case. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Host portion of the URL. If headers contains a host header, then host must also match the header value. */
  var host: js.UndefOr[String] = js.undefined
  
  /** Path portion of the URL. */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Expected BackendService or BackendBucket resource the given URL should be mapped to.
    * service cannot be set if expectedRedirectResponseCode is set.
    */
  var service: js.UndefOr[String] = js.undefined
}
object UrlMapTest {
  
  inline def apply(): UrlMapTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlMapTest]
  }
  
  extension [Self <: UrlMapTest](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
