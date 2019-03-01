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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("annotation")(annotation)
    __obj.updateDynamic("created")(created)
    __obj.updateDynamic("fingerprint")(fingerprint)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("pubkey")(pubkey)
    __obj.updateDynamic("updated")(updated)
    __obj.asInstanceOf[SSHKey]
  }
}

