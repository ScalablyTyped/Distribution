package typings
package atJupyterlabSettingeditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug extends js.Object {
  /**
    * The debug command ID.
    */
  var debug: java.lang.String
  /**
    * The command registry.
    */
  var registry: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry
  /**
    * The revert command ID.
    */
  var revert: java.lang.String
  /**
    * The save command ID.
    */
  var save: java.lang.String
}

object Anon_Debug {
  @scala.inline
  def apply(
    debug: java.lang.String,
    registry: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry,
    revert: java.lang.String,
    save: java.lang.String
  ): Anon_Debug = {
    val __obj = js.Dynamic.literal(debug = debug, registry = registry, revert = revert, save = save)
  
    __obj.asInstanceOf[Anon_Debug]
  }
}

