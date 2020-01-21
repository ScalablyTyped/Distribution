package typings.jupyterlabCoreutils.mod

import typings.jupyterlabCoreutils.restorablepoolMod.RestorablePool.IOptions
import typings.phosphorDisposable.mod.IObservableDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils", "RestorablePool")
@js.native
class RestorablePool[T /* <: IObservableDisposable */] protected ()
  extends typings.jupyterlabCoreutils.restorablepoolMod.RestorablePool[T] {
  /**
    * Create a new restorable pool.
    *
    * @param options - The instantiation options for a restorable pool.
    */
  def this(options: IOptions) = this()
}

