package typings.hapiIron.anon

import typings.hapiIron.mod.Key
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encrypted extends js.Object {
  var encrypted: Buffer
  var key: Key
}

object Encrypted {
  @scala.inline
  def apply(encrypted: Buffer, key: Key): Encrypted = {
    val __obj = js.Dynamic.literal(encrypted = encrypted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encrypted]
  }
}

