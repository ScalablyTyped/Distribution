package typings.kendoDashUi.kendo.data

import typings.kendoDashUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.ObservableObject")
@js.native
class ObservableObject () extends Observable {
  def this(value: js.Any) = this()
  var uid: String = js.native
  def get(name: String): js.Any = js.native
  def init(): Unit = js.native
  def init(value: js.Any): Unit = js.native
  def parent(): ObservableObject = js.native
  def set(name: String, value: js.Any): Unit = js.native
  def toJSON(): js.Object = js.native
}

