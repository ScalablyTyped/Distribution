package typings.jsforce.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMetadataInfo extends js.Object {
  
  var currentName: String = js.native
  
  var metadata: MetadataInfo = js.native
}
object UpdateMetadataInfo {
  
  @scala.inline
  def apply(currentName: String, metadata: MetadataInfo): UpdateMetadataInfo = {
    val __obj = js.Dynamic.literal(currentName = currentName.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMetadataInfo]
  }
  
  @scala.inline
  implicit class UpdateMetadataInfoOps[Self <: UpdateMetadataInfo] (val x: Self) extends AnyVal {
    
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
    def setCurrentName(value: String): Self = this.set("currentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: MetadataInfo): Self = this.set("metadata", value.asInstanceOf[js.Any])
  }
}
