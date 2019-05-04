package typings
package atJupyterlabApplicationLib.libLayoutrestorerMod.LayoutRestorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration options for layout restorer instantiation.
  */
trait IOptions extends js.Object {
  /**
    * The initial promise that has to be resolved before restoration.
    *
    * #### Notes
    * This promise should equal the JupyterLab application `started` notifier.
    */
  var first: js.Promise[_]
  /**
    * The application command registry.
    */
  var registry: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry
  /**
    * The state database instance.
    */
  var state: atJupyterlabCoreutilsLib.libStatedbMod.IStateDB
}

object IOptions {
  @scala.inline
  def apply(
    first: js.Promise[_],
    registry: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry,
    state: atJupyterlabCoreutilsLib.libStatedbMod.IStateDB
  ): IOptions = {
    val __obj = js.Dynamic.literal(first = first, registry = registry, state = state)
  
    __obj.asInstanceOf[IOptions]
  }
}

