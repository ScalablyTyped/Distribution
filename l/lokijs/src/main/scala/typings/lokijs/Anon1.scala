package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  var serializationMethod: js.UndefOr[String | Null] = js.undefined
}

object Anon1 {
  @scala.inline
  def apply(serializationMethod: String = null): Anon1 = {
    val __obj = js.Dynamic.literal()
    if (serializationMethod != null) __obj.updateDynamic("serializationMethod")(serializationMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1]
  }
}

