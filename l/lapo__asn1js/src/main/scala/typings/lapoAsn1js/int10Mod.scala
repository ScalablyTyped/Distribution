package typings.lapoAsn1js

import typings.lapoAsn1js.lapoAsn1jsNumbers.`10`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object int10Mod {
  
  @JSImport("@lapo/asn1js/int10", JSImport.Namespace)
  @js.native
  /**
    * Base 10 value of any length
    * @param [value] Initial value, defaults to 0
    */
  open class ^ ()
    extends StObject
       with Int10 {
    def this(value: Double) = this()
  }
  
  @js.native
  trait Int10 extends StObject {
    
    var buf: js.Array[Double] = js.native
    
    /**
      * Multiply value by `multiplier` and add `add`
      * @param multiplier A multiplier <=256
      * @param add The value to add
      */
    def mulAdd(multiplier: Double, add: Double): Unit = js.native
    
    /**
      * Return as a number if less than 10,000,000,000,000,
      * otherwise return self
      */
    def simplify(): Double | this.type = js.native
    
    /**
      * Subtract value
      * @param value The value to subtract
      */
    def sub(value: Double): Unit = js.native
    
    @JSName("toString")
    def toString_10(base: `10`): String = js.native
  }
}
