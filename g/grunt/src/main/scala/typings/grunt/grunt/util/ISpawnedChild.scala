package typings.grunt.grunt.util

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
  def forever(): Unit
  /**
    * Shut down the child and don't let it restart.
    */
  def kill(): Unit
  /**
    * Convenience function. Overrides options. restarts to 0.
    * Runs command exactly once no matter the options passed into the constructor.
    */
  def once(): Unit
  /**
    * Start the cmd with the options provided.
    */
  def start(): Unit
}

object ISpawnedChild {
  @scala.inline
  def apply(forever: () => Unit, kill: () => Unit, once: () => Unit, start: () => Unit): ISpawnedChild = {
    val __obj = js.Dynamic.literal(forever = js.Any.fromFunction0(forever), kill = js.Any.fromFunction0(kill), once = js.Any.fromFunction0(once), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[ISpawnedChild]
  }
}

