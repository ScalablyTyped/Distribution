package typings
package jsreportDashCoreLib.jsreportDashCoreMod.JsReportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection extends js.Object {
  def find(query: ScalablyTyped.runtime.StringDictionary[js.Any]): stdLib.Promise[js.Array[js.Object]] = js.native
  def insert(obj: js.Object): stdLib.Promise[js.Object] = js.native
  def remove(query: ScalablyTyped.runtime.StringDictionary[js.Any]): stdLib.Promise[_] = js.native
  def update(query: ScalablyTyped.runtime.StringDictionary[js.Any], update: js.Object): stdLib.Promise[_] = js.native
  def update(query: ScalablyTyped.runtime.StringDictionary[js.Any], update: js.Object, options: js.Object): stdLib.Promise[_] = js.native
}

