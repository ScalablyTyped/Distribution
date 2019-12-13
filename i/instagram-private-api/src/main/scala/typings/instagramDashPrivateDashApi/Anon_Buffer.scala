package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiMod.IgApiClient
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffer extends js.Object {
  var buffer: Buffer
  var client: IgApiClient
}

object Anon_Buffer {
  @scala.inline
  def apply(buffer: Buffer, client: IgApiClient): Anon_Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Buffer]
  }
}

