package typings.lokijs

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LokiJS
  * A lightweight document oriented javascript database
  * @author Joe Minichino <joe.minichino@gmail.com>
  */
@JSGlobal("LokiConstructor")
@js.native
class LokiConstructor protected () extends Loki {
  def this(filename: String) = this()
  def this(
    filename: String,
    options: Partial[LokiConstructorOptions] with Partial[LokiConfigOptions] with Partial[ThrottledSaveDrainOptions]
  ) = this()
}

@JSGlobal("LokiConstructor")
@js.native
object LokiConstructor extends js.Object {
  @js.native
  class Collection[E /* <: js.Object */] ()
    extends typings.lokijs.Collection[E]
  
  @js.native
  class KeyValueStore ()
    extends typings.lokijs.KeyValueStore
  
  @js.native
  class LokiFsAdapter ()
    extends typings.lokijs.LokiFsAdapter
  
  @js.native
  class LokiLocalStorageAdapter ()
    extends typings.lokijs.LokiLocalStorageAdapter
  
  @js.native
  class LokiMemoryAdapter ()
    extends typings.lokijs.LokiMemoryAdapter
  
  @js.native
  class LokiPartitioningAdapter ()
    extends typings.lokijs.LokiPartitioningAdapter
  
  var LokiOps: typings.lokijs.LokiOps = js.native
  def aeq(prop1: js.Any, prop2: js.Any): Boolean = js.native
  def gt(prop1: js.Any, prop2: js.Any): Boolean = js.native
  def gt(prop1: js.Any, prop2: js.Any, equal: Boolean): Boolean = js.native
  def lt(prop1: js.Any, prop2: js.Any): Boolean = js.native
  def lt(prop1: js.Any, prop2: js.Any, equal: Boolean): Boolean = js.native
  @js.native
  object persistenceAdapters extends js.Object {
    var fs: _LokiFsAdapter = js.native
    var localStorage: _LokiLocalStorageAdapter = js.native
  }
  
}

