package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRepeatedString extends js.Object {
  var values: js.UndefOr[js.Array[String]] = js.native
}

object SchemaRepeatedString {
  @scala.inline
  def apply(values: js.Array[String] = null): SchemaRepeatedString = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRepeatedString]
  }
}

