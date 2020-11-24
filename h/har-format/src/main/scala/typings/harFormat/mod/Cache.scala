package typings.harFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cache extends js.Object {
  
  /**
    * State of a cache entry after the request.
    *
    * Leave out this field if the information is not available.
    */
  var afterRequest: js.UndefOr[CacheDetails | Null] = js.native
  
  /**
    * State of a cache entry before the request.
    *
    * Leave out this field if the information is not available.
    */
  var beforeRequest: js.UndefOr[CacheDetails | Null] = js.native
  
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.native
}
object Cache {
  
  @scala.inline
  def apply(): Cache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cache]
  }
  
  @scala.inline
  implicit class CacheOps[Self <: Cache] (val x: Self) extends AnyVal {
    
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
    def setAfterRequest(value: CacheDetails): Self = this.set("afterRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterRequest: Self = this.set("afterRequest", js.undefined)
    
    @scala.inline
    def setAfterRequestNull: Self = this.set("afterRequest", null)
    
    @scala.inline
    def setBeforeRequest(value: CacheDetails): Self = this.set("beforeRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeRequest: Self = this.set("beforeRequest", js.undefined)
    
    @scala.inline
    def setBeforeRequestNull: Self = this.set("beforeRequest", null)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
  }
}
