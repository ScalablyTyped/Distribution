package typings
package jsonapiDashSerializerLib.jsonapiDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Serializer extends js.Object {
  def serialize(data: js.Any): js.Any
}

object Serializer {
  @scala.inline
  def apply(serialize: js.Function1[js.Any, js.Any]): Serializer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("serialize")(serialize)
    __obj.asInstanceOf[Serializer]
  }
}

