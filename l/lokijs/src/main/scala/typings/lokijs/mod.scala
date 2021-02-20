package typings.lokijs

import typings.lokijs.anon.PartialLokiConstructorOpt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * LokiJS
    * A lightweight document oriented javascript database
    * @author Joe Minichino <joe.minichino@gmail.com>
    */
  @JSImport("lokijs", JSImport.Namespace)
  @js.native
  class ^ protected () extends Loki {
    def this(filename: String) = this()
    def this(filename: String, options: PartialLokiConstructorOpt) = this()
  }
  @JSImport("lokijs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lokijs", "Collection")
  @js.native
  class Collection[E /* <: js.Object */] ()
    extends typings.lokijs.Collection[E]
  
  @JSImport("lokijs", "KeyValueStore")
  @js.native
  class KeyValueStore ()
    extends typings.lokijs.KeyValueStore
  
  @JSImport("lokijs", "LokiFsAdapter")
  @js.native
  class LokiFsAdapter ()
    extends typings.lokijs.LokiFsAdapter
  
  @JSImport("lokijs", "LokiLocalStorageAdapter")
  @js.native
  class LokiLocalStorageAdapter ()
    extends typings.lokijs.LokiLocalStorageAdapter
  
  @JSImport("lokijs", "LokiMemoryAdapter")
  @js.native
  class LokiMemoryAdapter ()
    extends typings.lokijs.LokiMemoryAdapter
  
  @JSImport("lokijs", "LokiOps")
  @js.native
  def LokiOps: typings.lokijs.LokiOps = js.native
  @scala.inline
  def LokiOps_=(x: LokiOps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LokiOps")(x.asInstanceOf[js.Any])
  
  @JSImport("lokijs", "LokiPartitioningAdapter")
  @js.native
  class LokiPartitioningAdapter ()
    extends typings.lokijs.LokiPartitioningAdapter
  
  @JSImport("lokijs", "aeq")
  @js.native
  def aeq(prop1: js.Any, prop2: js.Any): Boolean = js.native
  
  @JSImport("lokijs", "gt")
  @js.native
  def gt(prop1: js.Any, prop2: js.Any): Boolean = js.native
  @JSImport("lokijs", "gt")
  @js.native
  def gt(prop1: js.Any, prop2: js.Any, equal: Boolean): Boolean = js.native
  
  @JSImport("lokijs", "lt")
  @js.native
  def lt(prop1: js.Any, prop2: js.Any): Boolean = js.native
  @JSImport("lokijs", "lt")
  @js.native
  def lt(prop1: js.Any, prop2: js.Any, equal: Boolean): Boolean = js.native
  
  object persistenceAdapters {
    
    @JSImport("lokijs", "persistenceAdapters")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("lokijs", "persistenceAdapters.fs")
    @js.native
    def fs: _LokiFsAdapter = js.native
    @scala.inline
    def fs_=(x: _LokiFsAdapter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fs")(x.asInstanceOf[js.Any])
    
    @JSImport("lokijs", "persistenceAdapters.localStorage")
    @js.native
    def localStorage: _LokiLocalStorageAdapter = js.native
    @scala.inline
    def localStorage_=(x: _LokiLocalStorageAdapter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localStorage")(x.asInstanceOf[js.Any])
  }
}
