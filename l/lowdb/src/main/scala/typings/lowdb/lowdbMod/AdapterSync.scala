package typings.lowdb.lowdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdapterSync[SchemaT] extends BaseAdapter[SchemaT] {
  def write(state: js.Object): Unit = js.native
}

