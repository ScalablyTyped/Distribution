package typings.lowdb.baseMod

import org.scalablytyped.runtime.TopLevel
import typings.lowdb.mod.AdapterOptions
import typings.lowdb.mod.BaseAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lowdb/adapters/Base", JSImport.Namespace)
@js.native
class ^[SchemaT] protected () extends BaseAdapter[SchemaT] {
  def this(source: String) = this()
  def this(source: String, options: AdapterOptions[SchemaT]) = this()
}

@JSImport("lowdb/adapters/Base", JSImport.Namespace)
@js.native
object ^
  extends TopLevel[BaseAdapter[js.Any]]

