package typings.lowdb

import org.scalablytyped.runtime.Shortcut
import typings.lowdb.mod.AdapterOptions
import typings.lowdb.mod.AdapterSync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoryMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("lowdb/adapters/Memory", JSImport.Namespace)
  @js.native
  class ^[SchemaT] protected () extends AdapterSync[SchemaT] {
    def this(source: String) = this()
    def this(source: String, options: AdapterOptions[SchemaT]) = this()
  }
  @JSImport("lowdb/adapters/Memory", JSImport.Namespace)
  @js.native
  val ^ : AdapterSync[js.Any] = js.native
  
  type _To = AdapterSync[js.Any]
  
  /* This means you don't have to write `^`, but can instead just say `memoryMod.foo` */
  override def _to: AdapterSync[js.Any] = ^
}
