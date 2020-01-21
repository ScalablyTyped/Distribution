package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.NumberDictionary
import typings.kendoUi.kendo.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.ObservableArray")
@js.native
class ObservableArray protected ()
  extends Observable_
     with /* index */ NumberDictionary[js.Any] {
  def this(array: js.Array[_]) = this()
  var length: Double = js.native
  def empty(): Unit = js.native
  def every(callback: js.Function3[/* item */ js.Object, /* index */ Double, /* source */ this.type, Boolean]): Boolean = js.native
  def filter(callback: js.Function3[/* item */ js.Object, /* index */ Double, /* source */ this.type, Boolean]): js.Array[_] = js.native
  def find(callback: js.Function3[/* item */ js.Object, /* index */ Double, /* source */ this.type, Boolean]): js.Any = js.native
  def forEach(callback: js.Function3[/* item */ js.Object, /* index */ Double, /* source */ this.type, Unit]): Unit = js.native
  def indexOf(item: js.Any): Double = js.native
  def init(array: js.Array[_]): Unit = js.native
  def join(separator: String): String = js.native
  def map(callback: js.Function3[/* item */ js.Object, /* index */ Double, /* source */ this.type, _]): js.Array[_] = js.native
  def parent(): ObservableObject = js.native
  def pop(): ObservableObject = js.native
  def push(items: js.Any*): Double = js.native
  def remove(item: js.Object): Unit = js.native
  def shift(): js.Any = js.native
  def slice(begin: Double): js.Array[_] = js.native
  def slice(begin: Double, end: Double): js.Array[_] = js.native
  def some(callback: js.Function3[/* item */ js.Object, /* index */ Double, /* source */ this.type, Boolean]): Boolean = js.native
  def sort(): js.Array[_] = js.native
  def sort(compareFn: js.Function2[/* a */ js.Any, /* b */ js.Any, Double]): js.Array[_] = js.native
  def splice(start: Double): js.Array[_] = js.native
  def splice(start: Double, deleteCount: Double, items: js.Any*): js.Array[_] = js.native
  def toJSON(): js.Array[_] = js.native
  def unshift(items: js.Any*): Double = js.native
  def wrap(`object`: js.Object, parent: js.Object): js.Any = js.native
  def wrapAll(source: js.Object, target: js.Object): js.Any = js.native
}

