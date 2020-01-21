package typings.jsonpathPlus.mod

import typings.jsonpathPlus.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONPathClass extends js.Object {
  def evaluate(options: AnonCallback): js.Any = js.native
  def evaluate(path: String | js.Array[_]): js.Any = js.native
  def evaluate(path: String | js.Array[_], json: Boolean | Double | String | js.Object | js.Array[_]): js.Any = js.native
  def evaluate(
    path: String | js.Array[_],
    json: Boolean | Double | String | js.Object | js.Array[_],
    callback: JSONPathCallback
  ): js.Any = js.native
  def evaluate(
    path: String | js.Array[_],
    json: Boolean | Double | String | js.Object | js.Array[_],
    callback: JSONPathCallback,
    otherTypeCallback: JSONPathOtherTypeCallback
  ): js.Any = js.native
}

