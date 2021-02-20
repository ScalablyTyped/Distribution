package typings.jupyterlabStatedb

import typings.jupyterlabStatedb.restorablepoolMod.RestorablePool.IOptions
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IObservableDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/statedb", "DataConnector")
  @js.native
  abstract class DataConnector[T, U, V, W] ()
    extends typings.jupyterlabStatedb.dataconnectorMod.DataConnector[T, U, V, W]
  
  @JSImport("@jupyterlab/statedb", "IStateDB")
  @js.native
  val IStateDB: Token[typings.jupyterlabStatedb.tokensMod.IStateDB[ReadonlyPartialJSONValue]] = js.native
  
  @JSImport("@jupyterlab/statedb", "RestorablePool")
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
  
  @JSImport("@jupyterlab/statedb", "StateDB")
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
  object StateDB {
    
    /**
      * An in-memory string key/value data connector.
      */
    @JSImport("@jupyterlab/statedb", "StateDB.Connector")
    @js.native
    class Connector ()
      extends typings.jupyterlabStatedb.statedbMod.StateDB.Connector
  }
}
