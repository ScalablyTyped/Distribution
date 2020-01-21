package typings.instagramPrivateApi

import typings.instagramPrivateApi.mod.IgApiClient
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuffer extends js.Object {
  var buffer: Buffer
  var client: IgApiClient
}

object AnonBuffer {
  @scala.inline
  def apply(buffer: Buffer, client: IgApiClient): AnonBuffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBuffer]
  }
}

