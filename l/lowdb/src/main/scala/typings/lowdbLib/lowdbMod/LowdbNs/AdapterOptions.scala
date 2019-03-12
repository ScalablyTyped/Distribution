package typings
package lowdbLib.lowdbMod.LowdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdapterOptions[SchemaT] extends js.Object {
  var defaultValue: js.UndefOr[SchemaT] = js.undefined
  var deserialize: js.UndefOr[js.Function1[/* serializedData */ java.lang.String, SchemaT]] = js.undefined
  var serialize: js.UndefOr[js.Function1[/* data */ SchemaT, java.lang.String]] = js.undefined
}

object AdapterOptions {
  @scala.inline
  def apply[SchemaT](
    defaultValue: SchemaT = null,
    deserialize: /* serializedData */ java.lang.String => SchemaT = null,
    serialize: /* data */ SchemaT => java.lang.String = null
  ): AdapterOptions[SchemaT] = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (deserialize != null) __obj.updateDynamic("deserialize")(js.Any.fromFunction1(deserialize))
    if (serialize != null) __obj.updateDynamic("serialize")(js.Any.fromFunction1(serialize))
    __obj.asInstanceOf[AdapterOptions[SchemaT]]
  }
}

