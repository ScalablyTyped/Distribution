package typings.hapiIron

import typings.hapiIron.mod.Key
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncrypted extends js.Object {
  var encrypted: Buffer
  var key: Key
}

object AnonEncrypted {
  @scala.inline
  def apply(encrypted: Buffer, key: Key): AnonEncrypted = {
    val __obj = js.Dynamic.literal(encrypted = encrypted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncrypted]
  }
}

