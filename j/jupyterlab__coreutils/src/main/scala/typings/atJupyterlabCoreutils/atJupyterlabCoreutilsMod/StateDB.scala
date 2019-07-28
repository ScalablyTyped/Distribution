package typings.atJupyterlabCoreutils.atJupyterlabCoreutilsMod

import typings.atJupyterlabCoreutils.libStatedbMod.StateDBNs.IOptions
import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONValue
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
  extends typings.atJupyterlabCoreutils.libStatedbMod.StateDB[T] {
  def this(options: IOptions) = this()
}

