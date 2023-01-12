package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestFailure extends StObject {
  
  /** The actual output URL evaluated by load balancer containing the scheme, host, path and query parameters. */
  var actualOutputUrl: js.UndefOr[String] = js.undefined
  
  /** Actual HTTP status code for rule with `urlRedirect` calculated by load balancer */
  var actualRedirectResponseCode: js.UndefOr[Double] = js.undefined
  
  /** BackendService or BackendBucket returned by load balancer. */
  var actualService: js.UndefOr[String] = js.undefined
  
  /** The expected output URL evaluated by load balancer containing the scheme, host, path and query parameters. */
  var expectedOutputUrl: js.UndefOr[String] = js.undefined
  
  /** Expected HTTP status code for rule with `urlRedirect` calculated by load balancer */
  var expectedRedirectResponseCode: js.UndefOr[Double] = js.undefined
  
  /** Expected BackendService or BackendBucket resource the given URL should be mapped to. */
  var expectedService: js.UndefOr[String] = js.undefined
  
  /** HTTP headers of the request. */
  var headers: js.UndefOr[js.Array[UrlMapTestHeader]] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestFailure] (val x: Self) extends AnyVal {
    
    inline def setActualOutputUrl(value: String): Self = StObject.set(x, "actualOutputUrl", value.asInstanceOf[js.Any])
    
    inline def setActualOutputUrlUndefined: Self = StObject.set(x, "actualOutputUrl", js.undefined)
    
    inline def setActualRedirectResponseCode(value: Double): Self = StObject.set(x, "actualRedirectResponseCode", value.asInstanceOf[js.Any])
    
    inline def setActualRedirectResponseCodeUndefined: Self = StObject.set(x, "actualRedirectResponseCode", js.undefined)
    
    inline def setActualService(value: String): Self = StObject.set(x, "actualService", value.asInstanceOf[js.Any])
    
    inline def setActualServiceUndefined: Self = StObject.set(x, "actualService", js.undefined)
    
    inline def setExpectedOutputUrl(value: String): Self = StObject.set(x, "expectedOutputUrl", value.asInstanceOf[js.Any])
    
    inline def setExpectedOutputUrlUndefined: Self = StObject.set(x, "expectedOutputUrl", js.undefined)
    
    inline def setExpectedRedirectResponseCode(value: Double): Self = StObject.set(x, "expectedRedirectResponseCode", value.asInstanceOf[js.Any])
    
    inline def setExpectedRedirectResponseCodeUndefined: Self = StObject.set(x, "expectedRedirectResponseCode", js.undefined)
    
    inline def setExpectedService(value: String): Self = StObject.set(x, "expectedService", value.asInstanceOf[js.Any])
    
    inline def setExpectedServiceUndefined: Self = StObject.set(x, "expectedService", js.undefined)
    
    inline def setHeaders(value: js.Array[UrlMapTestHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: UrlMapTestHeader*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
