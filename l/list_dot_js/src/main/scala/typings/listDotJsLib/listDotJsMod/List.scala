package typings
package listDotJsLib.listDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait List extends js.Object {
  var filtered: scala.Boolean = js.native
  var items: js.Array[js.Object] = js.native
  var list: stdLib.HTMLElement = js.native
  var listContainer: stdLib.HTMLElement = js.native
  var matchingItems: js.Array[js.Object] = js.native
  var searched: scala.Boolean = js.native
  var visibleItems: js.Array[js.Object] = js.native
  def add(values: js.Array[js.Object]): scala.Unit = js.native
  def add(
    values: js.Array[js.Object],
    callback: js.Function1[/* item */ listDotJsLib.listDotJsMod.ListNs.ListItem, scala.Unit]
  ): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def filter(filterFunction: js.Function1[/* item */ listDotJsLib.listDotJsMod.ListNs.ListItem, scala.Boolean]): scala.Unit = js.native
  def fuzzySearch(searchString: java.lang.String): scala.Unit = js.native
  def fuzzySearch(searchString: java.lang.String, columns: js.Array[java.lang.String]): scala.Unit = js.native
  def get(valueName: java.lang.String, value: js.Any): js.Array[listDotJsLib.listDotJsMod.ListNs.ListItem] = js.native
  def on(event: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def reIndex(): scala.Unit = js.native
  def remove(valueName: java.lang.String, value: js.Any): scala.Double = js.native
  def search(searchString: java.lang.String): scala.Unit = js.native
  def search(searchString: java.lang.String, columns: js.Array[java.lang.String]): scala.Unit = js.native
  def show(i: scala.Double, page: scala.Double): scala.Unit = js.native
  def size(): scala.Double = js.native
  def sort(valueName: java.lang.String, options: listDotJsLib.listDotJsMod.ListNs.SortOptions): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

