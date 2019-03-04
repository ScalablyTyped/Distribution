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
  def apply(
    forever: js.Function0[scala.Unit],
    kill: js.Function0[scala.Unit],
    once: js.Function0[scala.Unit],
    start: js.Function0[scala.Unit]
  ): ISpawnedChild = {
    val __obj = js.Dynamic.literal(forever = forever, kill = kill, once = once, start = start)
  
    __obj.asInstanceOf[ISpawnedChild]
  }
}

