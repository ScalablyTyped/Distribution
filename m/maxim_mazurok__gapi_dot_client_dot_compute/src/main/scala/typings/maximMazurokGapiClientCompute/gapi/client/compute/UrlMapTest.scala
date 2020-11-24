package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlMapTest extends js.Object {
  
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
  implicit class UrlMapTestOps[Self <: UrlMapTest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
}
