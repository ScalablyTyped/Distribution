package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSHKey extends js.Object {
  var annotation: String
  var created: String
  var fingerprint: String
  var id: String
  var name: String
  var pubkey: String
  var updated: String
}

object SSHKey {
  @scala.inline
  def apply(
    annotation: String,
    created: String,
    fingerprint: String,
    id: String,
    name: String,
    pubkey: String,
    updated: String
  ): SSHKey = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pubkey = pubkey.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SSHKey]
  }
}

