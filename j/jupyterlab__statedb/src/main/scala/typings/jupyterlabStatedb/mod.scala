package typings.jupyterlabStatedb

import typings.jupyterlabStatedb.restorablepoolMod.RestorablePool.IOptions
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IObservableDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/statedb", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  abstract class DataConnector[T, U, V, W] ()
    extends typings.jupyterlabStatedb.dataconnectorMod.DataConnector[T, U, V, W]
  
  @js.native
  class RestorablePool[T /* <: IObservableDisposable */] protected ()
    extends typings.jupyterlabStatedb.restorablepoolMod.RestorablePool[T] {
    /**
      * Create a new restorable pool.
      *
      * @param options - The instantiation options for a restorable pool.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  /**
    * Create a new state database.
    *
    * @param options - The instantiation options for a state database.
    */
  class StateDB[T /* <: ReadonlyPartialJSONValue */] ()
    extends typings.jupyterlabStatedb.statedbMod.StateDB[T] {
    def this(options: typings.jupyterlabStatedb.statedbMod.StateDB.IOptions[T]) = this()
  }
  
  val IStateDB: Token[typings.jupyterlabStatedb.tokensMod.IStateDB[ReadonlyPartialJSONValue]] = js.native
  @js.native
  object StateDB extends js.Object {
    /**
      * An in-memory string key/value data connector.
      */
    @js.native
    class Connector ()
      extends typings.jupyterlabStatedb.statedbMod.StateDB.Connector
    
  }
  
}

