package typings.jsforce.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileProperties extends js.Object {
  
  var createdById: String = js.native
  
  var createdByName: String = js.native
  
  var createdDate: String = js.native
  
  var fileName: String = js.native
  
  var fullName: String = js.native
  
  var id: String = js.native
  
  var lastModifiedById: String = js.native
  
  var lastModifiedByName: String = js.native
  
  var lastModifiedDate: String = js.native
  
  var manageableState: js.UndefOr[String] = js.native
  
  var namespacePrefix: js.UndefOr[String] = js.native
  
  var `type`: String = js.native
}
object FileProperties {
  
  @scala.inline
  def apply(
    createdById: String,
    createdByName: String,
    createdDate: String,
    fileName: String,
    fullName: String,
    id: String,
    lastModifiedById: String,
    lastModifiedByName: String,
    lastModifiedDate: String,
    `type`: String
  ): FileProperties = {
    val __obj = js.Dynamic.literal(createdById = createdById.asInstanceOf[js.Any], createdByName = createdByName.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastModifiedById = lastModifiedById.asInstanceOf[js.Any], lastModifiedByName = lastModifiedByName.asInstanceOf[js.Any], lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileProperties]
  }
  
  @scala.inline
  implicit class FilePropertiesOps[Self <: FileProperties] (val x: Self) extends AnyVal {
    
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
    def setCreatedById(value: String): Self = this.set("createdById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByName(value: String): Self = this.set("createdByName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: String): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullName(value: String): Self = this.set("fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedById(value: String): Self = this.set("lastModifiedById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByName(value: String): Self = this.set("lastModifiedByName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDate(value: String): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManageableState(value: String): Self = this.set("manageableState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManageableState: Self = this.set("manageableState", js.undefined)
    
    @scala.inline
    def setNamespacePrefix(value: String): Self = this.set("namespacePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespacePrefix: Self = this.set("namespacePrefix", js.undefined)
  }
}
