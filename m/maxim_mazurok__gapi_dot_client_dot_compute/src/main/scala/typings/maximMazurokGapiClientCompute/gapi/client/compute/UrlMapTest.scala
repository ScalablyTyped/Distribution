package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlMapTest extends StObject {
  
  /** Description of this test case. */
  var description: js.UndefOr[String] = js.native
  
  /** Host portion of the URL. If headers contains a host header, then host must also match the header value. */
  var host: js.UndefOr[String] = js.native
  
  /** Path portion of the URL. */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Expected BackendService or BackendBucket resource the given URL should be mapped to.
    * service cannot be set if expectedRedirectResponseCode is set.
    */
  var service: js.UndefOr[String] = js.native
}
object UrlMapTest {
  
  @scala.inline
  def apply(): UrlMapTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlMapTest]
  }
  
  @scala.inline
  implicit class UrlMapTestMutableBuilder[Self <: UrlMapTest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
