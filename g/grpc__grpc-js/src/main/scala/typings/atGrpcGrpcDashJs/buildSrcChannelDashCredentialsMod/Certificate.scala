package typings.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Certificate extends js.Object {
  /**
    * The raw certificate in DER form.
    */
  var raw: Buffer
}

object Certificate {
  @scala.inline
  def apply(raw: Buffer): Certificate = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Certificate]
  }
}

