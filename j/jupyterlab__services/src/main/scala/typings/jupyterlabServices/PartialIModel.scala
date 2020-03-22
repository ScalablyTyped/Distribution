package typings.jupyterlabServices

import typings.jupyterlabServices.contentsMod.Contents.ContentType
import typings.jupyterlabServices.contentsMod.Contents.FileFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@jupyterlab/services.@jupyterlab/services/lib/contents.Contents.IModel> */
trait PartialIModel extends js.Object {
  var chunk: js.UndefOr[Double] = js.undefined
  var content: js.UndefOr[js.Any] = js.undefined
  var created: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[FileFormat] = js.undefined
  var last_modified: js.UndefOr[String] = js.undefined
  var mimetype: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[ContentType] = js.undefined
  var writable: js.UndefOr[Boolean] = js.undefined
}

object PartialIModel {
  @scala.inline
  def apply(
    chunk: Int | Double = null,
    content: js.Any = null,
    created: String = null,
    format: FileFormat = null,
    last_modified: String = null,
    mimetype: String = null,
    name: String = null,
    path: String = null,
    size: Int | Double = null,
    `type`: ContentType = null,
    writable: js.UndefOr[Boolean] = js.undefined
  ): PartialIModel = {
    val __obj = js.Dynamic.literal()
    if (chunk != null) __obj.updateDynamic("chunk")(chunk.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (last_modified != null) __obj.updateDynamic("last_modified")(last_modified.asInstanceOf[js.Any])
    if (mimetype != null) __obj.updateDynamic("mimetype")(mimetype.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIModel]
  }
}

