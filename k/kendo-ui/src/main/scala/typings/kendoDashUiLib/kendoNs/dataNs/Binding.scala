package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.Binding")
@js.native
class Binding protected ()
  extends kendoDashUiLib.kendoNs.Observable {
  def this(parents: js.Array[_], path: java.lang.String) = this()
  var dependencies: ScalablyTyped.runtime.StringDictionary[scala.Boolean] = js.native
  var observable: scala.Boolean = js.native
  var parents: js.Array[_] = js.native
  var path: java.lang.String = js.native
  var source: js.Any = js.native
  def change(e: js.Object): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def get(): js.Any = js.native
  def set(value: js.Any): scala.Unit = js.native
  def start(source: kendoDashUiLib.kendoNs.Observable): scala.Unit = js.native
  def stop(source: kendoDashUiLib.kendoNs.Observable): scala.Unit = js.native
}

