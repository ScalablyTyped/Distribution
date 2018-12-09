package typings
package lowdbLib.lowdbMod.LowdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdapterAsync[SchemaT] extends BaseAdapter[SchemaT] {
  def write(state: js.Object): js.Promise[scala.Unit] = js.native
}

