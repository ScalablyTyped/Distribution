package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebUri extends js.Object {
  var webUri: String
}

object WebUri {
  @scala.inline
  def apply(webUri: String): WebUri = {
    val __obj = js.Dynamic.literal(webUri = webUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUri]
  }
}

