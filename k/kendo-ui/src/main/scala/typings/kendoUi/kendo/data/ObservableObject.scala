package typings.kendoUi.kendo.data

import typings.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObservableObject extends Observable {
  var uid: String = js.native
  def get(name: String): js.Any = js.native
  def init(): Unit = js.native
  def init(value: js.Any): Unit = js.native
  def parent(): ObservableObject = js.native
  def set(name: String, value: js.Any): Unit = js.native
  def toJSON(): js.Object = js.native
}

