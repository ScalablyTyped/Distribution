package typings.guacamoleCommonJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIntegerPoolMod {
  
  @JSImport("guacamole-common-js/lib/IntegerPool", "IntegerPool")
  @js.native
  open class IntegerPool () extends StObject {
    
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
    
    /**
      * The next integer to return if no more integers remain.
      */
    var next_int: Double = js.native
  }
}
