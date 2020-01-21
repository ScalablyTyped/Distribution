package typings.ixJs.Ix

import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumeratorStatic
  extends Instantiable3[
      /* moveNext */ js.Function0[Boolean], 
      /* getCurrent */ js.Function0[js.Object], 
      /* dispose */ js.Function0[Unit], 
      Enumerator[js.Object]
    ] {
  def create[T](moveNext: js.Function0[Boolean], getCurrent: js.Function0[T]): Enumerator[T] = js.native
  def create[T](moveNext: js.Function0[Boolean], getCurrent: js.Function0[T], dispose: js.Function0[Unit]): Enumerator[T] = js.native
}

