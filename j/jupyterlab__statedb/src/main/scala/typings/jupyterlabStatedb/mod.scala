package typings.jupyterlabStatedb

import typings.jupyterlabStatedb.libRestorablepoolMod.RestorablePool.IOptions
import typings.luminoCoreutils.mod.Token
import typings.luminoCoreutils.typesJsonMod.ReadonlyPartialJSONValue
import typings.luminoDisposable.mod.IObservableDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* note: abstract class */ @JSImport("@jupyterlab/statedb", "DataConnector")
  @js.native
  open class DataConnector[T, U, V, W] ()
    extends typings.jupyterlabStatedb.libDataconnectorMod.DataConnector[T, U, V, W]
  
  @JSImport("@jupyterlab/statedb", "IStateDB")
  @js.native
  val IStateDB: Token[typings.jupyterlabStatedb.libTokensMod.IStateDB[ReadonlyPartialJSONValue]] = js.native
  
  @JSImport("@jupyterlab/statedb", "RestorablePool")
  @js.native
  open class RestorablePool[T /* <: IObservableDisposable */] protected ()
    extends typings.jupyterlabStatedb.libRestorablepoolMod.RestorablePool[T] {
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
  open class StateDB[T /* <: ReadonlyPartialJSONValue */] ()
    extends typings.jupyterlabStatedb.libStatedbMod.StateDB[T] {
    def this(options: typings.jupyterlabStatedb.libStatedbMod.StateDB.IOptions[T]) = this()
  }
  object StateDB {
    
    /**
      * An in-memory string key/value data connector.
      */
    @JSImport("@jupyterlab/statedb", "StateDB.Connector")
    @js.native
    open class Connector ()
      extends typings.jupyterlabStatedb.libStatedbMod.StateDB.Connector
  }
}
