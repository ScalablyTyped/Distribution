package typings.interfaceDatastore.mod

import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("interface-datastore", "MemoryDatastore")
@js.native
class MemoryDatastore[Value] () extends Adapter[Value] {
  
  def _all(): AsyncIterable[Pair[Value]] = js.native
}
