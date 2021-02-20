package typings.lowdb

import org.scalablytyped.runtime.Shortcut
import typings.lowdb.mod.AdapterAsync
import typings.lowdb.mod.AdapterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileAsyncMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("lowdb/adapters/FileAsync", JSImport.Namespace)
  @js.native
  class ^[SchemaT] protected () extends AdapterAsync[SchemaT] {
    def this(source: String) = this()
    def this(source: String, options: AdapterOptions[SchemaT]) = this()
  }
  @JSImport("lowdb/adapters/FileAsync", JSImport.Namespace)
  @js.native
  val ^ : AdapterAsync[js.Any] = js.native
  
  type _To = AdapterAsync[js.Any]
  
  /* This means you don't have to write `^`, but can instead just say `fileAsyncMod.foo` */
  override def _to: AdapterAsync[js.Any] = ^
}
