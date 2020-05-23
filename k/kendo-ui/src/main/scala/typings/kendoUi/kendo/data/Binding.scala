package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StringDictionary
import typings.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Binding extends Observable {
  var dependencies: StringDictionary[Boolean] = js.native
  var observable: Boolean = js.native
  var parents: js.Array[_] = js.native
  var path: String = js.native
  var source: js.Any = js.native
  def change(e: js.Object): Unit = js.native
  def destroy(): Unit = js.native
  def get(): js.Any = js.native
  def set(value: js.Any): Unit = js.native
  def start(source: Observable): Unit = js.native
  def stop(source: Observable): Unit = js.native
}

