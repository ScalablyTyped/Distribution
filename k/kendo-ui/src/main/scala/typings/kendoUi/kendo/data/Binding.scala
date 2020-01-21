package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StringDictionary
import typings.kendoUi.kendo.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.Binding")
@js.native
class Binding protected () extends Observable_ {
  def this(parents: js.Array[_], path: String) = this()
  var dependencies: StringDictionary[Boolean] = js.native
  var observable: Boolean = js.native
  var parents: js.Array[_] = js.native
  var path: String = js.native
  var source: js.Any = js.native
  def change(e: js.Object): Unit = js.native
  def destroy(): Unit = js.native
  def get(): js.Any = js.native
  def set(value: js.Any): Unit = js.native
  def start(source: Observable_): Unit = js.native
  def stop(source: Observable_): Unit = js.native
}

