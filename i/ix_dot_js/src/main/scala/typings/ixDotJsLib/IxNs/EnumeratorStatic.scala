package typings
package ixDotJsLib.IxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumeratorStatic
  extends ScalablyTyped.runtime.Instantiable3[
      /* moveNext */ js.Function0[scala.Boolean], 
      /* getCurrent */ js.Function0[js.Object], 
      /* dispose */ js.Function0[scala.Unit], 
      Enumerator[js.Object]
    ] {
  def create[T](moveNext: js.Function0[scala.Boolean], getCurrent: js.Function0[T]): Enumerator[T] = js.native
  def create[T](
    moveNext: js.Function0[scala.Boolean],
    getCurrent: js.Function0[T],
    dispose: js.Function0[scala.Unit]
  ): Enumerator[T] = js.native
}

