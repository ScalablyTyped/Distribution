package typings.instagramPrivateApi.anon

import typings.instagramPrivateApi.mod.IgApiClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buffer extends js.Object {
  var buffer: typings.node.Buffer
  var client: IgApiClient
}

object Buffer {
  @scala.inline
  def apply(buffer: typings.node.Buffer, client: IgApiClient): Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
}

