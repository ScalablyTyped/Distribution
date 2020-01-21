package typings.jupyterlabDocregistry.registryMod.DocumentRegistry

import typings.jupyterlabServices.contentsMod.Contents.ContentType
import typings.jupyterlabServices.contentsMod.Contents.FileFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for a file type.
  */
trait IFileType extends js.Object {
  /**
    * The content type of the new file.
    */
  val contentType: ContentType
  /**
    * An optional display name for the file type.
    */
  val displayName: js.UndefOr[String] = js.undefined
  /**
    * The extensions of the file type (e.g. `".txt"`).  Can be a compound
    * extension (e.g. `".table.json`).
    */
  val extensions: js.Array[String]
  /**
    * The format of the new file.
    */
  val fileFormat: FileFormat
  /**
    * The icon class name for the file type.
    */
  val iconClass: js.UndefOr[String] = js.undefined
  /**
    * The icon label for the file type.
    */
  val iconLabel: js.UndefOr[String] = js.undefined
  /**
    * The mime types associated the file type.
    */
  val mimeTypes: js.Array[String]
  /**
    * The name of the file type.
    */
  val name: String
  /**
    * An optional pattern for a file name (e.g. `^Dockerfile$`).
    */
  val pattern: js.UndefOr[String] = js.undefined
}

object IFileType {
  @scala.inline
  def apply(
    contentType: ContentType,
    extensions: js.Array[String],
    fileFormat: FileFormat,
    mimeTypes: js.Array[String],
    name: String,
    displayName: String = null,
    iconClass: String = null,
    iconLabel: String = null,
    pattern: String = null
  ): IFileType = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], fileFormat = fileFormat.asInstanceOf[js.Any], mimeTypes = mimeTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (iconLabel != null) __obj.updateDynamic("iconLabel")(iconLabel.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileType]
  }
}

