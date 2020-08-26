package typings.guacamoleClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("guacamole-client/lib/IntegerPool", JSImport.Namespace)
@js.native
object integerPoolMod extends js.Object {
  @js.native
  class IntegerPool () extends js.Object {
    /**
      * The next integer to return if no more integers remain.
      */
    var next_int: Double = js.native
    /**
      * Frees the given integer, allowing it to be reused.
      *
      * @param integer The integer to free.
      */
    def free(integer: Double): Unit = js.native
    /**
      * Returns the next available integer in the pool. If possible, a previously
      * used integer will be returned.
      *
      * @return The next available integer.
      */
    def next(): Double = js.native
  }
  
}

