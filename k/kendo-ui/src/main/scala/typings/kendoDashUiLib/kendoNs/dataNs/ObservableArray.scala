package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.ObservableArray")
@js.native
class ObservableArray protected ()
  extends kendoDashUiLib.kendoNs.Observable
     with /* index */ org.scalablytyped.runtime.NumberDictionary[js.Any] {
  def this(array: js.Array[_]) = this()
  var length: scala.Double = js.native
  def empty(): scala.Unit = js.native
  def every(
    callback: js.Function3[/* item */ js.Object, /* index */ scala.Double, /* source */ this.type, scala.Boolean]
  ): scala.Boolean = js.native
  def filter(
    callback: js.Function3[/* item */ js.Object, /* index */ scala.Double, /* source */ this.type, scala.Boolean]
  ): js.Array[_] = js.native
  def find(
    callback: js.Function3[/* item */ js.Object, /* index */ scala.Double, /* source */ this.type, scala.Boolean]
  ): js.Any = js.native
  def forEach(
    callback: js.Function3[/* item */ js.Object, /* index */ scala.Double, /* source */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def indexOf(item: js.Any): scala.Double = js.native
  def init(array: js.Array[_]): scala.Unit = js.native
  def join(separator: java.lang.String): java.lang.String = js.native
  def map(callback: js.Function3[/* item */ js.Object, /* index */ scala.Double, /* source */ this.type, _]): js.Array[_] = js.native
  def parent(): ObservableObject = js.native
  def pop(): ObservableObject = js.native
  def push(items: js.Any*): scala.Double = js.native
  def remove(item: js.Object): scala.Unit = js.native
  def shift(): js.Any = js.native
  def slice(begin: scala.Double): js.Array[_] = js.native
  def slice(begin: scala.Double, end: scala.Double): js.Array[_] = js.native
  def some(
    callback: js.Function3[/* item */ js.Object, /* index */ scala.Double, /* source */ this.type, scala.Boolean]
  ): scala.Boolean = js.native
  def splice(start: scala.Double): js.Array[_] = js.native
  def splice(start: scala.Double, deleteCount: scala.Double, items: js.Any*): js.Array[_] = js.native
  def toJSON(): js.Array[_] = js.native
  def unshift(items: js.Any*): scala.Double = js.native
  def wrap(`object`: js.Object, parent: js.Object): js.Any = js.native
  def wrapAll(source: js.Object, target: js.Object): js.Any = js.native
}

