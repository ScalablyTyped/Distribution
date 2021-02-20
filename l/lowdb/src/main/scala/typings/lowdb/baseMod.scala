package typings.lowdb

import org.scalablytyped.runtime.Shortcut
import typings.lowdb.mod.AdapterOptions
import typings.lowdb.mod.BaseAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("lowdb/adapters/Base", JSImport.Namespace)
  @js.native
  class ^[SchemaT] protected () extends BaseAdapter[SchemaT] {
    def this(source: String) = this()
    def this(source: String, options: AdapterOptions[SchemaT]) = this()
  }
  @JSImport("lowdb/adapters/Base", JSImport.Namespace)
  @js.native
  val ^ : BaseAdapter[js.Any] = js.native
  
  type _To = BaseAdapter[js.Any]
  
  /* This means you don't have to write `^`, but can instead just say `baseMod.foo` */
  override def _to: BaseAdapter[js.Any] = ^
}
