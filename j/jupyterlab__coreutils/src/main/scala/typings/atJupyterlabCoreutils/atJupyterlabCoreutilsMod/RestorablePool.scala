package typings.atJupyterlabCoreutils.atJupyterlabCoreutilsMod

import typings.atJupyterlabCoreutils.libRestorablepoolMod.RestorablePool.IOptions
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IObservableDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils", "RestorablePool")
@js.native
class RestorablePool[T /* <: IObservableDisposable */] protected ()
  extends typings.atJupyterlabCoreutils.libRestorablepoolMod.RestorablePool[T] {
  /**
    * Create a new restorable pool.
    *
    * @param options - The instantiation options for a restorable pool.
    */
  def this(options: IOptions) = this()
}

