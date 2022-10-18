package typings.lib0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pair {
  
  @JSImport("lib0", "pair")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lib0", "pair.Pair")
  @js.native
  open class Pair[L, R] protected ()
    extends typings.lib0.pairMod.Pair[L, R] {
    /**
      * @param {L} left
      * @param {R} right
      */
    def this(left: L, right: R) = this()
  }
  
  inline def create[L, R](left: L, right: R): typings.lib0.pairMod.Pair[L, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typings.lib0.pairMod.Pair[L, R]]
  
  inline def createReversed[L, R](right: R, left: L): typings.lib0.pairMod.Pair[L, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReversed")(right.asInstanceOf[js.Any], left.asInstanceOf[js.Any])).asInstanceOf[typings.lib0.pairMod.Pair[L, R]]
  
  inline def forEach[L, R](arr: js.Array[typings.lib0.pairMod.Pair[L, R]], f: js.Function2[/* arg0 */ L, /* arg1 */ R, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(arr.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def map[L, R, X](arr: js.Array[typings.lib0.pairMod.Pair[L, R]], f: js.Function2[/* arg0 */ L, /* arg1 */ R, X]): js.Array[X] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(arr.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Array[X]]
}
