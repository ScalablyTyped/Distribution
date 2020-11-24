package typings.listJs.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait List extends js.Object {
  
  def add(values: js.Array[js.Object]): Unit = js.native
  def add(values: js.Array[js.Object], callback: js.Function1[/* item */ ListItem, Unit]): Unit = js.native
  
  var alphabet: String = js.native
  
  def clear(): Unit = js.native
  
  def filter(): Unit = js.native
  def filter(filterFunction: js.Function1[/* item */ ListItem, Boolean]): Unit = js.native
  
  var filtered: Boolean = js.native
  
  def fuzzySearch(searchString: String): Unit = js.native
  def fuzzySearch(searchString: String, columns: js.Array[String]): Unit = js.native
  
  def get(valueName: String, value: js.Any): js.Array[ListItem] = js.native
  
  var items: js.Array[js.Object] = js.native
  
  var list: HTMLElement = js.native
  
  var listContainer: HTMLElement = js.native
  
  var matchingItems: js.Array[js.Object] = js.native
  
  def on(event: Event, callback: js.Function1[/* list */ this.type, Unit]): List = js.native
  
  def reIndex(): Unit = js.native
  
  def remove(valueName: String, value: js.Any): Double = js.native
  
  def search(searchString: String): Unit = js.native
  def search(searchString: String, columns: js.Array[String]): Unit = js.native
  
  var searched: Boolean = js.native
  
  def show(i: Double, page: Double): Unit = js.native
  
  def size(): Double = js.native
  
  def sort(valueName: String, options: SortOptions): Unit = js.native
  
  def update(): Unit = js.native
  
  var visibleItems: js.Array[js.Object] = js.native
}
