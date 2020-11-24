package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultDisplayMetadata extends js.Object {
  
  /** The metalines content to be displayed with the result. */
  var metalines: js.UndefOr[js.Array[ResultDisplayLine]] = js.native
  
  /** The display label for the object. */
  var objectTypeLabel: js.UndefOr[String] = js.native
}
object ResultDisplayMetadata {
  
  @scala.inline
  def apply(): ResultDisplayMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultDisplayMetadata]
  }
  
  @scala.inline
  implicit class ResultDisplayMetadataOps[Self <: ResultDisplayMetadata] (val x: Self) extends AnyVal {
    
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
    def setMetalinesVarargs(value: ResultDisplayLine*): Self = this.set("metalines", js.Array(value :_*))
    
    @scala.inline
    def setMetalines(value: js.Array[ResultDisplayLine]): Self = this.set("metalines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetalines: Self = this.set("metalines", js.undefined)
    
    @scala.inline
    def setObjectTypeLabel(value: String): Self = this.set("objectTypeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectTypeLabel: Self = this.set("objectTypeLabel", js.undefined)
  }
}
