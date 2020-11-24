package typings.jupyterlabDocregistry.anon

import typings.jupyterlabServices.contentsMod.Contents.ContentType
import typings.jupyterlabServices.contentsMod.Contents.FileFormat
import typings.jupyterlabUiComponents.mod.LabIcon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@jupyterlab/docregistry.@jupyterlab/docregistry/lib/registry.DocumentRegistry.IFileType> */
@js.native
trait PartialIFileType extends js.Object {
  
  var contentType: js.UndefOr[ContentType] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var extensions: js.UndefOr[js.Array[String]] = js.native
  
  var fileFormat: js.UndefOr[FileFormat] = js.native
  
  var icon: js.UndefOr[LabIcon] = js.native
  
  var iconClass: js.UndefOr[String] = js.native
  
  var iconLabel: js.UndefOr[String] = js.native
  
  var mimeTypes: js.UndefOr[js.Array[String]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var pattern: js.UndefOr[String] = js.native
}
object PartialIFileType {
  
  @scala.inline
  def apply(): PartialIFileType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIFileType]
  }
  
  @scala.inline
  implicit class PartialIFileTypeOps[Self <: PartialIFileType] (val x: Self) extends AnyVal {
    
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
    def setContentType(value: ContentType): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setFileFormat(value: FileFormat): Self = this.set("fileFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileFormat: Self = this.set("fileFormat", js.undefined)
    
    @scala.inline
    def setIcon(value: LabIcon): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
    
    @scala.inline
    def setIconLabel(value: String): Self = this.set("iconLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconLabel: Self = this.set("iconLabel", js.undefined)
    
    @scala.inline
    def setMimeTypesVarargs(value: String*): Self = this.set("mimeTypes", js.Array(value :_*))
    
    @scala.inline
    def setMimeTypes(value: js.Array[String]): Self = this.set("mimeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeTypes: Self = this.set("mimeTypes", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
  }
}
