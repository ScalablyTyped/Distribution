package typings.jimpTiff.anon

import typings.jimpTiff.jimpTiffStrings.imageSlashtiff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MIMETIFF extends js.Object {
  var MIME_TIFF: imageSlashtiff
}

object MIMETIFF {
  @scala.inline
  def apply(MIME_TIFF: imageSlashtiff): MIMETIFF = {
    val __obj = js.Dynamic.literal(MIME_TIFF = MIME_TIFF.asInstanceOf[js.Any])
    __obj.asInstanceOf[MIMETIFF]
  }
}

