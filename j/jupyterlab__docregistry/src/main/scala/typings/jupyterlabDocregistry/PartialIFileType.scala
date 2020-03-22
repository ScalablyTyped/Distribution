package typings.jupyterlabDocregistry

import typings.jupyterlabServices.contentsMod.Contents.ContentType
import typings.jupyterlabServices.contentsMod.Contents.FileFormat
import typings.jupyterlabUiComponents.mod.LabIcon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@jupyterlab/docregistry.@jupyterlab/docregistry/lib/registry.DocumentRegistry.IFileType> */
trait PartialIFileType extends js.Object {
  var contentType: js.UndefOr[ContentType] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  var fileFormat: js.UndefOr[FileFormat] = js.undefined
  var icon: js.UndefOr[LabIcon] = js.undefined
  var iconClass: js.UndefOr[String] = js.undefined
  var iconLabel: js.UndefOr[String] = js.undefined
  var mimeTypes: js.UndefOr[js.Array[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
}

object PartialIFileType {
  @scala.inline
  def apply(
    contentType: ContentType = null,
    displayName: String = null,
    extensions: js.Array[String] = null,
    fileFormat: FileFormat = null,
    icon: LabIcon = null,
    iconClass: String = null,
    iconLabel: String = null,
    mimeTypes: js.Array[String] = null,
    name: String = null,
    pattern: String = null
  ): PartialIFileType = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (fileFormat != null) __obj.updateDynamic("fileFormat")(fileFormat.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (iconLabel != null) __obj.updateDynamic("iconLabel")(iconLabel.asInstanceOf[js.Any])
    if (mimeTypes != null) __obj.updateDynamic("mimeTypes")(mimeTypes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIFileType]
  }
}

