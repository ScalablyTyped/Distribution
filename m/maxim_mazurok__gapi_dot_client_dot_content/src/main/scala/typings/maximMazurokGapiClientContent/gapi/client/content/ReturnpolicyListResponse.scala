package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnpolicyListResponse extends js.Object {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#returnpolicyListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  var resources: js.UndefOr[js.Array[ReturnPolicy]] = js.native
}
object ReturnpolicyListResponse {
  
  @scala.inline
  def apply(): ReturnpolicyListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnpolicyListResponse]
  }
  
  @scala.inline
  implicit class ReturnpolicyListResponseOps[Self <: ReturnpolicyListResponse] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: ReturnPolicy*): Self = this.set("resources", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: js.Array[ReturnPolicy]): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
  }
}
