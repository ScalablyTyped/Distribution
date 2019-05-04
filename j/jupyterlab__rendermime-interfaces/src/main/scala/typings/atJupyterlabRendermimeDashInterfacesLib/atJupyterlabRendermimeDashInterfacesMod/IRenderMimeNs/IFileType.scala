package typings
package atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs

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
  val displayName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The extensions of the file type (e.g. `".txt"`).  Can be a compound
    * extension (e.g. `".table.json`).
    */
  val extensions: js.Array[java.lang.String]
  /**
    * The file format for the file type ('text', 'base64', or 'json').
    */
  val fileFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The icon class name for the file type.
    */
  val iconClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The icon label for the file type.
    */
  val iconLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The mime types associated the file type.
    */
  val mimeTypes: js.Array[java.lang.String]
  /**
    * The name of the file type.
    */
  val name: java.lang.String
  /**
    * An optional pattern for a file name (e.g. `^Dockerfile$`).
    */
  val pattern: js.UndefOr[java.lang.String] = js.undefined
}

object IFileType {
  @scala.inline
  def apply(
    extensions: js.Array[java.lang.String],
    mimeTypes: js.Array[java.lang.String],
    name: java.lang.String,
    displayName: java.lang.String = null,
    fileFormat: java.lang.String = null,
    iconClass: java.lang.String = null,
    iconLabel: java.lang.String = null,
    pattern: java.lang.String = null
  ): IFileType = {
    val __obj = js.Dynamic.literal(extensions = extensions, mimeTypes = mimeTypes, name = name)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (fileFormat != null) __obj.updateDynamic("fileFormat")(fileFormat)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (iconLabel != null) __obj.updateDynamic("iconLabel")(iconLabel)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    __obj.asInstanceOf[IFileType]
  }
}

