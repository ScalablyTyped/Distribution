package typings.lowdb.fileSyncMod

import org.scalablytyped.runtime.TopLevel
import typings.lowdb.mod.AdapterOptions
import typings.lowdb.mod.AdapterSync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lowdb/adapters/FileSync", JSImport.Namespace)
@js.native
class ^[SchemaT] protected () extends AdapterSync[SchemaT] {
  def this(source: String) = this()
  def this(source: String, options: AdapterOptions[SchemaT]) = this()
}

@JSImport("lowdb/adapters/FileSync", JSImport.Namespace)
@js.native
object ^
  extends TopLevel[AdapterSync[js.Any]]

