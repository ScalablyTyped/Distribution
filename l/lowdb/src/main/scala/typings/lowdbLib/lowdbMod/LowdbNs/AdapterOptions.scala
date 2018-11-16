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

