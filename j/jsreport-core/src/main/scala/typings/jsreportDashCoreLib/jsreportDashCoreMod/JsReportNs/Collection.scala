package typings
package jsreportDashCoreLib.jsreportDashCoreMod.JsReportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection extends js.Object {
  def find(query: ScalablyTyped.runtime.StringDictionary[js.Any]): js.Promise[js.Array[js.Object]] = js.native
  def insert(obj: js.Object): js.Promise[js.Object] = js.native
  def remove(query: ScalablyTyped.runtime.StringDictionary[js.Any]): js.Promise[_] = js.native
  def update(query: ScalablyTyped.runtime.StringDictionary[js.Any], update: js.Object): js.Promise[_] = js.native
  def update(query: ScalablyTyped.runtime.StringDictionary[js.Any], update: js.Object, options: js.Object): js.Promise[_] = js.native
}

