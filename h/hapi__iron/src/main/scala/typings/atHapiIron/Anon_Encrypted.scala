package typings.atHapiIron

import typings.atHapiIron.atHapiIronMod.Key
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encrypted extends js.Object {
  var encrypted: Buffer
  var key: Key
}

object Anon_Encrypted {
  @scala.inline
  def apply(encrypted: Buffer, key: Key): Anon_Encrypted = {
    val __obj = js.Dynamic.literal(encrypted = encrypted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Encrypted]
  }
}

