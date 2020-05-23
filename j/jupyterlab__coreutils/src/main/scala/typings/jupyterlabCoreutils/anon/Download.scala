package typings.jupyterlabCoreutils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Download extends js.Object {
  var download: Boolean
  var format: String
  var path: String
}

object Download {
  @scala.inline
  def apply(download: Boolean, format: String, path: String): Download = {
    val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Download]
  }
}

