package typings.grpc.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleOAuth2Client extends js.Object {
  def getRequestMetadata(optUri: String, metadataCallback: js.Function2[/* err */ Error, /* headers */ js.Any, Unit]): Unit
}

object GoogleOAuth2Client {
  @scala.inline
  def apply(getRequestMetadata: (String, js.Function2[/* err */ Error, /* headers */ js.Any, Unit]) => Unit): GoogleOAuth2Client = {
    val __obj = js.Dynamic.literal(getRequestMetadata = js.Any.fromFunction2(getRequestMetadata))
    __obj.asInstanceOf[GoogleOAuth2Client]
  }
}

