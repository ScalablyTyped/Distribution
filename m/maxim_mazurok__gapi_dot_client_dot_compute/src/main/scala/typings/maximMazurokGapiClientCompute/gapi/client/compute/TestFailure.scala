package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestFailure extends StObject {
  
  /** BackendService or BackendBucket returned by load balancer. */
  var actualService: js.UndefOr[String] = js.native
  
  /** Expected BackendService or BackendBucket resource the given URL should be mapped to. */
  var expectedService: js.UndefOr[String] = js.native
  
  /** Host portion of the URL. */
  var host: js.UndefOr[String] = js.native
  
  /** Path portion including query parameters in the URL. */
  var path: js.UndefOr[String] = js.native
}
object TestFailure {
  
  @scala.inline
  def apply(): TestFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestFailure]
  }
  
  @scala.inline
  implicit class TestFailureMutableBuilder[Self <: TestFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActualService(value: String): Self = StObject.set(x, "actualService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualServiceUndefined: Self = StObject.set(x, "actualService", js.undefined)
    
    @scala.inline
    def setExpectedService(value: String): Self = StObject.set(x, "expectedService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedServiceUndefined: Self = StObject.set(x, "expectedService", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
