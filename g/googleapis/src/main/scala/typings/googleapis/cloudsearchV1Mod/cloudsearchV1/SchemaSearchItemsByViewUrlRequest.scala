package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSearchItemsByViewUrlRequest extends js.Object {
  
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.native
  
  /**
    * The next_page_token value returned from a previous request, if any.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Specify the full view URL to find the corresponding item. The maximum
    * length is 2048 characters.
    */
  var viewUrl: js.UndefOr[String] = js.native
}
object SchemaSearchItemsByViewUrlRequest {
  
  @scala.inline
  def apply(): SchemaSearchItemsByViewUrlRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchItemsByViewUrlRequest]
  }
  
  @scala.inline
  implicit class SchemaSearchItemsByViewUrlRequestOps[Self <: SchemaSearchItemsByViewUrlRequest] (val x: Self) extends AnyVal {
    
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
    def setDebugOptions(value: SchemaDebugOptions): Self = this.set("debugOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugOptions: Self = this.set("debugOptions", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setViewUrl(value: String): Self = this.set("viewUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewUrl: Self = this.set("viewUrl", js.undefined)
  }
}
