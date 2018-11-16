package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrettyPrinter
  extends ScalablyTyped.runtime.Instantiable0[js.Any] {
  def append(value: js.Any): scala.Unit = js.native
  def emitArray(array: js.Array[_]): scala.Unit = js.native
  def emitObject(obj: js.Any): scala.Unit = js.native
  def emitScalar(value: js.Any): scala.Unit = js.native
  def emitString(value: java.lang.String): scala.Unit = js.native
  def format(value: js.Any): scala.Unit = js.native
  def iterateObject(
    obj: js.Any,
    fn: js.Function2[/* property */ java.lang.String, /* isGetter */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
}

