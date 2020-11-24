package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List container versions response.
  */
@js.native
trait SchemaListContainerVersionsResponse extends js.Object {
  
  /**
    * All versions of a GTM Container.
    */
  var containerVersion: js.UndefOr[js.Array[SchemaContainerVersion]] = js.native
  
  /**
    * All container version headers of a GTM Container.
    */
  var containerVersionHeader: js.UndefOr[js.Array[SchemaContainerVersionHeader]] = js.native
}
object SchemaListContainerVersionsResponse {
  
  @scala.inline
  def apply(): SchemaListContainerVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListContainerVersionsResponse]
  }
  
  @scala.inline
  implicit class SchemaListContainerVersionsResponseOps[Self <: SchemaListContainerVersionsResponse] (val x: Self) extends AnyVal {
    
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
    def setContainerVersionVarargs(value: SchemaContainerVersion*): Self = this.set("containerVersion", js.Array(value :_*))
    
    @scala.inline
    def setContainerVersion(value: js.Array[SchemaContainerVersion]): Self = this.set("containerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerVersion: Self = this.set("containerVersion", js.undefined)
    
    @scala.inline
    def setContainerVersionHeaderVarargs(value: SchemaContainerVersionHeader*): Self = this.set("containerVersionHeader", js.Array(value :_*))
    
    @scala.inline
    def setContainerVersionHeader(value: js.Array[SchemaContainerVersionHeader]): Self = this.set("containerVersionHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerVersionHeader: Self = this.set("containerVersionHeader", js.undefined)
  }
}
