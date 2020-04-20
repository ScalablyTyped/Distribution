package typings.jose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONWebKeySet extends js.Object {
  var keys: js.Array[JSONWebKey]
}

object JSONWebKeySet {
  @scala.inline
  def apply(keys: js.Array[JSONWebKey]): JSONWebKeySet = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONWebKeySet]
  }
}

