package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptimizeRestoredTableMetadata extends js.Object {
  
  /** Name of the restored table being optimized. */
  var name: js.UndefOr[String] = js.native
  
  /** The progress of the post-restore optimizations. */
  var progress: js.UndefOr[OperationProgress] = js.native
}
object OptimizeRestoredTableMetadata {
  
  @scala.inline
  def apply(): OptimizeRestoredTableMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptimizeRestoredTableMetadata]
  }
  
  @scala.inline
  implicit class OptimizeRestoredTableMetadataOps[Self <: OptimizeRestoredTableMetadata] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProgress(value: OperationProgress): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
  }
}
