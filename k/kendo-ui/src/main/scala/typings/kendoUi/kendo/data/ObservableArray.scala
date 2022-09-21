package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.NumberDictionary
import typings.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObservableArray
  extends StObject
     with Observable
     with /* index */ NumberDictionary[Any] {
  
  def empty(): Unit = js.native
  
  def every(callback: js.Function3[/* item */ js.Object, /* index */ Double, /* source */ this.type, Boolean]): Boolean = js.native
  
  def filter(callback: js.Function3[/* item */ js.Object, /* index */ Double, /* source */ this.type, Boolean]): js.Array[Any] = js.native
  
  def find(callback: js.Function3[/* item */ js.Object, /* index */ Double, /* source */ this.type, Boolean]): Any = js.native
  
  def forEach(callback: js.Function3[/* item */ js.Object, /* index */ Double, /* source */ this.type, Unit]): Unit = js.native
  
  def indexOf(item: Any): Double = js.native
  
  def init(array: js.Array[Any]): Unit = js.native
  
  def join(separator: String): String = js.native
  
  var length: Double = js.native
  
  def map(callback: js.Function3[/* item */ js.Object, /* index */ Double, /* source */ this.type, Any]): js.Array[Any] = js.native
  
  def parent(): ObservableObject = js.native
  
  def pop(): ObservableObject = js.native
  
  def push(items: Any*): Double = js.native
  
  def remove(item: js.Object): Unit = js.native
  
  def shift(): Any = js.native
  
  def slice(begin: Double): js.Array[Any] = js.native
  def slice(begin: Double, end: Double): js.Array[Any] = js.native
  
  def some(callback: js.Function3[/* item */ js.Object, /* index */ Double, /* source */ this.type, Boolean]): Boolean = js.native
  
  def sort(): js.Array[Any] = js.native
  def sort(compareFn: js.Function2[/* a */ Any, /* b */ Any, Double]): js.Array[Any] = js.native
  
  def splice(start: Double): js.Array[Any] = js.native
  def splice(start: Double, deleteCount: Double, items: Any*): js.Array[Any] = js.native
  
  def toJSON(): js.Array[Any] = js.native
  
  def unshift(items: Any*): Double = js.native
  
  def wrap(`object`: js.Object, parent: js.Object): Any = js.native
  
  def wrapAll(source: js.Object, target: js.Object): Any = js.native
}
