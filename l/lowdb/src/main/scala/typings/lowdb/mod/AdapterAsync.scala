package typings.lowdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdapterAsync[SchemaT] extends BaseAdapter[SchemaT] {
  
  def write(state: js.Object): js.Promise[Unit] = js.native
}
