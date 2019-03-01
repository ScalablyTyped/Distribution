package typings
package k6Lib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileData extends js.Object {
  var content_type: js.UndefOr[java.lang.String] = js.undefined
  var data: java.lang.String | k6Lib.k6Mod.bytes
  var filename: js.UndefOr[java.lang.String] = js.undefined
}

object FileData {
  @scala.inline
  def apply(
    data: java.lang.String | k6Lib.k6Mod.bytes,
    content_type: java.lang.String = null,
    filename: java.lang.String = null
  ): FileData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (content_type != null) __obj.updateDynamic("content_type")(content_type)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    __obj.asInstanceOf[FileData]
  }
}

