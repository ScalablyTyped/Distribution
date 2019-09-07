package typings.atKoaMulter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldNameSize extends js.Object {
  /** Max field name size (Default: 100 bytes) */
  var fieldNameSize: js.UndefOr[Double] = js.undefined
  /** Max field value size (Default: 1MB) */
  var fieldSize: js.UndefOr[Double] = js.undefined
  /** Max number of non- file fields (Default: Infinity) */
  var fields: js.UndefOr[Double] = js.undefined
  /** For multipart forms, the max file size (in bytes)(Default: Infinity) */
  var fileSize: js.UndefOr[Double] = js.undefined
  /** For multipart forms, the max number of file fields (Default: Infinity) */
  var files: js.UndefOr[Double] = js.undefined
  /** For multipart forms, the max number of header key=> value pairs to parse Default: 2000(same as node's http). */
  var headerPairs: js.UndefOr[Double] = js.undefined
  /** For multipart forms, the max number of parts (fields + files)(Default: Infinity) */
  var parts: js.UndefOr[Double] = js.undefined
  /** Keep the full path of files instead of just the base name (Default: false) */
  var preservePath: js.UndefOr[Boolean] = js.undefined
}

object Anon_FieldNameSize {
  @scala.inline
  def apply(
    fieldNameSize: Int | Double = null,
    fieldSize: Int | Double = null,
    fields: Int | Double = null,
    fileSize: Int | Double = null,
    files: Int | Double = null,
    headerPairs: Int | Double = null,
    parts: Int | Double = null,
    preservePath: js.UndefOr[Boolean] = js.undefined
  ): Anon_FieldNameSize = {
    val __obj = js.Dynamic.literal()
    if (fieldNameSize != null) __obj.updateDynamic("fieldNameSize")(fieldNameSize.asInstanceOf[js.Any])
    if (fieldSize != null) __obj.updateDynamic("fieldSize")(fieldSize.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (headerPairs != null) __obj.updateDynamic("headerPairs")(headerPairs.asInstanceOf[js.Any])
    if (parts != null) __obj.updateDynamic("parts")(parts.asInstanceOf[js.Any])
    if (!js.isUndefined(preservePath)) __obj.updateDynamic("preservePath")(preservePath)
    __obj.asInstanceOf[Anon_FieldNameSize]
  }
}

