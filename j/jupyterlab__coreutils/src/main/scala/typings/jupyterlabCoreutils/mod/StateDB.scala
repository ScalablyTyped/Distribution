package typings.jupyterlabCoreutils.mod

import typings.jupyterlabCoreutils.statedbMod.StateDB.IOptions
import typings.phosphorCoreutils.jsonMod.ReadonlyJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils", "StateDB")
@js.native
/**
  * Create a new state database.
  *
  * @param options - The instantiation options for a state database.
  */
class StateDB[T /* <: ReadonlyJSONValue */] ()
  extends typings.jupyterlabCoreutils.statedbMod.StateDB[T] {
  def this(options: IOptions) = this()
}

@JSImport("@jupyterlab/coreutils", "StateDB")
@js.native
object StateDB extends js.Object {
  /**
    * An in-memory string key/value data connector.
    */
  @js.native
  class Connector ()
    extends typings.jupyterlabCoreutils.statedbMod.StateDB.Connector
  
}

