package typings.jimpBmp.anon

import typings.jimpBmp.jimpBmpStrings.`imageSlashx-ms-bmp`
import typings.jimpBmp.jimpBmpStrings.imageSlashbmp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MIMEBMP extends js.Object {
  var MIME_BMP: imageSlashbmp
  var MIME_X_MS_BMP: `imageSlashx-ms-bmp`
}

object MIMEBMP {
  @scala.inline
  def apply(MIME_BMP: imageSlashbmp, MIME_X_MS_BMP: `imageSlashx-ms-bmp`): MIMEBMP = {
    val __obj = js.Dynamic.literal(MIME_BMP = MIME_BMP.asInstanceOf[js.Any], MIME_X_MS_BMP = MIME_X_MS_BMP.asInstanceOf[js.Any])
    __obj.asInstanceOf[MIMEBMP]
  }
}

