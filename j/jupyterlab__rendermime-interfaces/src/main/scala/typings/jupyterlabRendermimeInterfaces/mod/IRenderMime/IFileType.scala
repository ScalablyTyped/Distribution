package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime

import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.LabIcon.IResolvable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A file type to associate with the renderer.
  */
@js.native
trait IFileType extends js.Object {
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
    * The file format for the file type ('text', 'base64', or 'json').
    */
  val fileFormat: js.UndefOr[String] = js.native
  /**
    * The icon for the file type. Can either be a string containing the name
    * of an existing icon, or an object with {name, svgstr} fields, where
    * svgstr is a string containing the raw contents of an svg file.
    */
  val icon: js.UndefOr[IResolvable] = js.native
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
  def apply(extensions: js.Array[String], mimeTypes: js.Array[String], name: String): IFileType = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], mimeTypes = mimeTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
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
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
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
    def setFileFormat(value: String): Self = this.set("fileFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileFormat: Self = this.set("fileFormat", js.undefined)
    @scala.inline
    def setIcon(value: IResolvable): Self = this.set("icon", value.asInstanceOf[js.Any])
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

