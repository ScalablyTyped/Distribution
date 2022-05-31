package typings.long

import org.scalablytyped.runtime.Shortcut
import typings.long.mod.LongConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Long extends Shortcut {
    
    @JSGlobal("Long")
    @js.native
    val ^ : js.Object & LongConstructor = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Long")
    @js.native
    class Class protected ()
      extends StObject
         with typings.long.mod.Long {
      /**
        * Constructs a 64 bit two's-complement integer, given its low and high 32 bit values as signed integers. See the from* functions below for more convenient ways of constructing Longs.
        */
      def this(low: Double) = this()
      def this(low: Double, high: Double) = this()
      def this(low: Double, high: Double, unsigned: Boolean) = this()
      def this(low: Double, high: Unit, unsigned: Boolean) = this()
    }
    
    type _To = js.Object & LongConstructor
    
    /* This means you don't have to write `^`, but can instead just say `Long.foo` */
    override def _to: js.Object & LongConstructor = ^
  }
}
