package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A file type to associate with the renderer.
  */
trait IFileType extends js.Object {
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
    * The file format for the file type ('text', 'base64', or 'json').
    */
  val fileFormat: js.UndefOr[String] = js.undefined
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
    extensions: js.Array[String],
    mimeTypes: js.Array[String],
    name: String,
    displayName: String = null,
    fileFormat: String = null,
    iconClass: String = null,
    iconLabel: String = null,
    pattern: String = null
  ): IFileType = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], mimeTypes = mimeTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (fileFormat != null) __obj.updateDynamic("fileFormat")(fileFormat.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (iconLabel != null) __obj.updateDynamic("iconLabel")(iconLabel.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileType]
  }
}

