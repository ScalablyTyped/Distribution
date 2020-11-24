package typings.jasmineDataDrivenTests

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JasmineDataDrivenTest extends js.Object {
  
  def apply[T](
    description: String,
    dataset: js.Array[js.Array[T] | T],
    assertion: js.Function2[/* value */ T, /* done */ js.Function0[Unit], Unit]
  ): Unit = js.native
  def apply[T, U](
    description: String,
    dataset: js.Array[js.Tuple2[T, U]],
    assertion: js.Function3[/* arg0 */ T, /* arg1 */ U, /* done */ js.Function0[Unit], Unit]
  ): Unit = js.native
  def apply[T, U, V](
    description: String,
    dataset: js.Array[js.Tuple3[T, U, V]],
    assertion: js.Function4[/* arg0 */ T, /* arg1 */ U, /* arg2 */ V, /* done */ js.Function0[Unit], Unit]
  ): Unit = js.native
  def apply[T, U, V, W](
    description: String,
    dataset: js.Array[js.Tuple4[T, U, V, W]],
    assertion: js.Function5[
      /* arg0 */ T, 
      /* arg1 */ U, 
      /* arg2 */ V, 
      /* arg3 */ W, 
      /* done */ js.Function0[Unit], 
      Unit
    ]
  ): Unit = js.native
  def apply[T, U, V, W, X](
    description: String,
    dataset: js.Array[js.Tuple5[T, U, V, W, X]],
    assertion: js.Function6[
      /* arg0 */ T, 
      /* arg1 */ U, 
      /* arg2 */ V, 
      /* arg3 */ W, 
      /* arg4 */ X, 
      /* done */ js.Function0[Unit], 
      Unit
    ]
  ): Unit = js.native
  def apply[T, U, V, W, X, Y](
    description: String,
    dataset: js.Array[js.Tuple6[T, U, V, W, X, Y]],
    assertion: js.Function7[
      /* arg0 */ T, 
      /* arg1 */ U, 
      /* arg2 */ V, 
      /* arg3 */ W, 
      /* arg4 */ X, 
      /* arg5 */ Y, 
      /* done */ js.Function0[Unit], 
      Unit
    ]
  ): Unit = js.native
  def apply[T, U, V, W, X, Y, Z](
    description: String,
    dataset: js.Array[js.Tuple7[T, U, V, W, X, Y, Z]],
    assertion: js.Function8[
      /* arg0 */ T, 
      /* arg1 */ U, 
      /* arg2 */ V, 
      /* arg3 */ W, 
      /* arg4 */ X, 
      /* arg5 */ Y, 
      /* arg6 */ Z, 
      /* done */ js.Function0[Unit], 
      Unit
    ]
  ): Unit = js.native
}
