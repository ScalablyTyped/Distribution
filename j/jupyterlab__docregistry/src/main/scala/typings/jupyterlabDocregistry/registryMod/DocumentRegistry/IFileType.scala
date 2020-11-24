package typings.jupyterlabDocregistry.registryMod.DocumentRegistry

import typings.jupyterlabServices.contentsMod.Contents.ContentType
import typings.jupyterlabServices.contentsMod.Contents.FileFormat
import typings.jupyterlabUiComponents.mod.LabIcon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface for a file type.
  */
@js.native
trait IFileType extends js.Object {
  
  /**
    * The content type of the new file.
    */
  val contentType: ContentType = js.native
  
  /**
    * An optional display name for the file type.
    */
  val displayName: js.UndefOr[String] = js.native
  
  /**
    * The extensions of the file type (e.g. `".txt"`).  Can be a compound
    * extension (e.g. `".table.json`).
    */
  val extensions: js.Array[String] = js.native
  
  /**
    * The format of the new file.
    */
  val fileFormat: FileFormat = js.native
  
  /**
    * The icon for the file type.
    */
  val icon: js.UndefOr[LabIcon] = js.native
  
  /**
    * The icon class name for the file type.
    */
  val iconClass: js.UndefOr[String] = js.native
  
  /**
    * The icon label for the file type.
    */
  val iconLabel: js.UndefOr[String] = js.native
  
  /**
    * The mime types associated the file type.
    */
  val mimeTypes: js.Array[String] = js.native
  
  /**
    * The name of the file type.
    */
  val name: String = js.native
  
  /**
    * An optional pattern for a file name (e.g. `^Dockerfile$`).
    */
  val pattern: js.UndefOr[String] = js.native
}
object IFileType {
  
  @scala.inline
  def apply(
    contentType: ContentType,
    extensions: js.Array[String],
    fileFormat: FileFormat,
    mimeTypes: js.Array[String],
    name: String
  ): IFileType = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], fileFormat = fileFormat.asInstanceOf[js.Any], mimeTypes = mimeTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileType]
  }
  
  @scala.inline
  implicit class IFileTypeOps[Self <: IFileType] (val x: Self) extends AnyVal {
    
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
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileFormat(value: FileFormat): Self = this.set("fileFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypesVarargs(value: String*): Self = this.set("mimeTypes", js.Array(value :_*))
    
    @scala.inline
    def setMimeTypes(value: js.Array[String]): Self = this.set("mimeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
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
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
  }
}
