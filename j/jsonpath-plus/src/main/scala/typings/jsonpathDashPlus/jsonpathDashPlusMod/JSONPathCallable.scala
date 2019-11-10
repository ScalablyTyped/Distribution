package typings.jsonpathDashPlus.jsonpathDashPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONPathCallable extends js.Object {
  def apply[T](options: JSONPathOptions): T = js.native
  def apply[T](options: JSONPathOptionsAutoStart): JSONPathClass = js.native
  def apply[T](path: String | js.Array[_]): T = js.native
  def apply[T](path: String | js.Array[_], json: Boolean | Double | String | js.Object | js.Array[_]): T = js.native
  def apply[T](
    path: String | js.Array[_],
    json: Boolean | Double | String | js.Object | js.Array[_],
    callback: JSONPathCallback
  ): T = js.native
  def apply[T](
    path: String | js.Array[_],
    json: Boolean | Double | String | js.Object | js.Array[_],
    callback: JSONPathCallback,
    otherTypeCallback: JSONPathOtherTypeCallback
  ): T = js.native
}

