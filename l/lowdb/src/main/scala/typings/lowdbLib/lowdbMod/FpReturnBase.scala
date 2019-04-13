package typings
package lowdbLib.lowdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FpReturnBase[PathT] extends js.Object {
  def apply(funcs: js.Array[js.Function1[/* a */ _, _]]): js.Any = js.native
  /**
    * Execute a series of functions on the data at a given path.
    * Result of previous function is the input of the next one.
    * Returns the result of the last function.
    */
  def apply[R1](f1: js.Function1[/* a1 */ PathT, R1]): R1 = js.native
  // <R1>(f1: [(a1: PathT) => R1]): R1;
  def apply[R1, R2](f1: js.Tuple2[js.Function1[/* a1 */ PathT, R1], js.Function1[/* a */ R1, R2]]): R2 = js.native
  def apply[R1, R2, R3](
    f1: js.Tuple3[
      js.Function1[/* a1 */ PathT, R1], 
      js.Function1[/* a */ R1, R2], 
      js.Function1[/* a */ R2, R3]
    ]
  ): R3 = js.native
  def apply[R1, R2, R3, R4](
    f1: js.Tuple4[
      js.Function1[/* a1 */ PathT, R1], 
      js.Function1[/* a */ R1, R2], 
      js.Function1[/* a */ R2, R3], 
      js.Function1[/* a */ R3, R4]
    ]
  ): R4 = js.native
  def apply[R1, R2, R3, R4, R5](
    f1: js.Tuple5[
      js.Function1[/* a1 */ PathT, R1], 
      js.Function1[/* a */ R1, R2], 
      js.Function1[/* a */ R2, R3], 
      js.Function1[/* a */ R3, R4], 
      js.Function1[/* a */ R4, R5]
    ]
  ): R5 = js.native
  def apply[R1, R2, R3, R4, R5, R6](
    f1: js.Tuple6[
      js.Function1[/* a1 */ PathT, R1], 
      js.Function1[/* a */ R1, R2], 
      js.Function1[/* a */ R2, R3], 
      js.Function1[/* a */ R3, R4], 
      js.Function1[/* a */ R4, R5], 
      js.Function1[/* a */ R5, R6]
    ]
  ): R6 = js.native
  def apply[R1, R2, R3, R4, R5, R6, R7](
    f1: js.Tuple7[
      js.Function1[/* a1 */ PathT, R1], 
      js.Function1[/* a */ R1, R2], 
      js.Function1[/* a */ R2, R3], 
      js.Function1[/* a */ R3, R4], 
      js.Function1[/* a */ R4, R5], 
      js.Function1[/* a */ R5, R6], 
      js.Function1[/* a */ R6, R7]
    ]
  ): R7 = js.native
}

