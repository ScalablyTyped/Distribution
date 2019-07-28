package typings.jasmine.jasmineNs

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrettyPrinter
  extends Instantiable0[js.Any] {
  def append(value: js.Any): Unit = js.native
  def emitArray(array: js.Array[_]): Unit = js.native
  def emitObject(obj: js.Any): Unit = js.native
  def emitScalar(value: js.Any): Unit = js.native
  def emitString(value: String): Unit = js.native
  def format(value: js.Any): Unit = js.native
  def iterateObject(obj: js.Any, fn: js.Function2[/* property */ String, /* isGetter */ Boolean, Unit]): Unit = js.native
}

