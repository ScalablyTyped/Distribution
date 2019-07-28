package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SerializationMethod extends js.Object {
  var serializationMethod: js.UndefOr[String | Null] = js.undefined
}

object Anon_SerializationMethod {
  @scala.inline
  def apply(serializationMethod: String = null): Anon_SerializationMethod = {
    val __obj = js.Dynamic.literal()
    if (serializationMethod != null) __obj.updateDynamic("serializationMethod")(serializationMethod)
    __obj.asInstanceOf[Anon_SerializationMethod]
  }
}

