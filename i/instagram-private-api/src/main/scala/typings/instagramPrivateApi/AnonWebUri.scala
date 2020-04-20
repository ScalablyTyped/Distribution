package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWebUri extends js.Object {
  var webUri: String
}

object AnonWebUri {
  @scala.inline
  def apply(webUri: String): AnonWebUri = {
    val __obj = js.Dynamic.literal(webUri = webUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWebUri]
  }
}

