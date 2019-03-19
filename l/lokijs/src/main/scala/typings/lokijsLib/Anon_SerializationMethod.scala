package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SerializationMethod extends js.Object {
  var serializationMethod: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object Anon_SerializationMethod {
  @scala.inline
  def apply(serializationMethod: java.lang.String = null): Anon_SerializationMethod = {
    val __obj = js.Dynamic.literal()
    if (serializationMethod != null) __obj.updateDynamic("serializationMethod")(serializationMethod)
    __obj.asInstanceOf[Anon_SerializationMethod]
  }
}

