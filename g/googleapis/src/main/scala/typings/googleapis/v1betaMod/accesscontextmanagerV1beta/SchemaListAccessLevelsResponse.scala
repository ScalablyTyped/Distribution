package typings.googleapis.v1betaMod.accesscontextmanagerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response to `ListAccessLevelsRequest`.
  */
@js.native
trait SchemaListAccessLevelsResponse extends js.Object {
  
  /**
    * List of the Access Level instances.
    */
  var accessLevels: js.UndefOr[js.Array[SchemaAccessLevel]] = js.native
  
  /**
    * The pagination token to retrieve the next page of results. If the value
    * is empty, no further results remain.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListAccessLevelsResponse {
  
  @scala.inline
  def apply(): SchemaListAccessLevelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAccessLevelsResponse]
  }
  
  @scala.inline
  implicit class SchemaListAccessLevelsResponseOps[Self <: SchemaListAccessLevelsResponse] (val x: Self) extends AnyVal {
    
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
    def setAccessLevelsVarargs(value: SchemaAccessLevel*): Self = this.set("accessLevels", js.Array(value :_*))
    
    @scala.inline
    def setAccessLevels(value: js.Array[SchemaAccessLevel]): Self = this.set("accessLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessLevels: Self = this.set("accessLevels", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
