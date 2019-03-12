package typings
package gruntLib.gruntNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://github.com/snbartell/node-spawn}
  */
trait ISpawnedChild extends js.Object {
  /**
    * Convenience function. Overrides options.restarts to -1.
    * Runs command indefinitely no matter the options passed into the constructor.
    */
  def forever(): scala.Unit
  /**
    * Shut down the child and don't let it restart.
    */
  def kill(): scala.Unit
  /**
    * Convenience function. Overrides options. restarts to 0.
    * Runs command exactly once no matter the options passed into the constructor.
    */
  def once(): scala.Unit
  /**
    * Start the cmd with the options provided.
    */
  def start(): scala.Unit
}

object ISpawnedChild {
  @scala.inline
  def apply(forever: () => scala.Unit, kill: () => scala.Unit, once: () => scala.Unit, start: () => scala.Unit): ISpawnedChild = {
    val __obj = js.Dynamic.literal(forever = js.Any.fromFunction0(forever), kill = js.Any.fromFunction0(kill), once = js.Any.fromFunction0(once), start = js.Any.fromFunction0(start))
  
    __obj.asInstanceOf[ISpawnedChild]
  }
}

