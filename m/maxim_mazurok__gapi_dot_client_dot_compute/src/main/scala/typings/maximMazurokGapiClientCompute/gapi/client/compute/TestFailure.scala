package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestFailure extends js.Object {
  
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
  implicit class TestFailureOps[Self <: TestFailure] (val x: Self) extends AnyVal {
    
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
    def setActualService(value: String): Self = this.set("actualService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActualService: Self = this.set("actualService", js.undefined)
    
    @scala.inline
    def setExpectedService(value: String): Self = this.set("expectedService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedService: Self = this.set("expectedService", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
