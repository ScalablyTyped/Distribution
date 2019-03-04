package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSHKey extends js.Object {
  var annotation: java.lang.String
  var created: java.lang.String
  var fingerprint: java.lang.String
  var id: java.lang.String
  var name: java.lang.String
  var pubkey: java.lang.String
  var updated: java.lang.String
}

object SSHKey {
  @scala.inline
  def apply(
    annotation: java.lang.String,
    created: java.lang.String,
    fingerprint: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    pubkey: java.lang.String,
    updated: java.lang.String
  ): SSHKey = {
    val __obj = js.Dynamic.literal(annotation = annotation, created = created, fingerprint = fingerprint, id = id, name = name, pubkey = pubkey, updated = updated)
  
    __obj.asInstanceOf[SSHKey]
  }
}

