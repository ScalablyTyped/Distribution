package typings.hapiIron.anon

import typings.hapiIron.mod.Key
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encrypted extends js.Object {
  var encrypted: Buffer = js.native
  var key: Key = js.native
}

object Encrypted {
  @scala.inline
  def apply(encrypted: Buffer, key: Key): Encrypted = {
    val __obj = js.Dynamic.literal(encrypted = encrypted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encrypted]
  }
  @scala.inline
  implicit class EncryptedOps[Self <: Encrypted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEncrypted(value: Buffer): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
  }
  
}

