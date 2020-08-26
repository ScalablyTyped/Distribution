package typings.jsonpathPlus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONPathCallable extends js.Object {
  def apply[T](options: JSONPathOptions): T = js.native
  def apply[T](options: JSONPathOptionsAutoStart): JSONPathClass = js.native
  def apply[T](path: String): T = js.native
  def apply[T](path: String, json: String): T = js.native
  def apply[T](
    path: String,
    json: String,
    callback: js.UndefOr[scala.Nothing],
    otherTypeCallback: JSONPathOtherTypeCallback
  ): T = js.native
  def apply[T](path: String, json: String, callback: JSONPathCallback): T = js.native
  def apply[T](
    path: String,
    json: String,
    callback: JSONPathCallback,
    otherTypeCallback: JSONPathOtherTypeCallback
  ): T = js.native
  def apply[T](path: String, json: js.Array[_]): T = js.native
  def apply[T](
    path: String,
    json: js.Array[_],
    callback: js.UndefOr[scala.Nothing],
    otherTypeCallback: JSONPathOtherTypeCallback
  ): T = js.native
  def apply[T](path: String, json: js.Array[_], callback: JSONPathCallback): T = js.native
  def apply[T](
    path: String,
    json: js.Array[_],
    callback: JSONPathCallback,
    otherTypeCallback: JSONPathOtherTypeCallback
  ): T = js.native
  def apply[T](path: String, json: js.Object): T = js.native
  def apply[T](
    path: String,
    json: js.Object,
    callback: js.UndefOr[scala.Nothing],
    otherTypeCallback: JSONPathOtherTypeCallback
  ): T = js.native
  def apply[T](path: String, json: js.Object, callback: JSONPathCallback): T = js.native
  def apply[T](
    path: String,
    json: js.Object,
    callback: JSONPathCallback,
    otherTypeCallback: JSONPathOtherTypeCallback
  ): T = js.native
  def apply[T](path: String, json: Boolean): T = js.native
  def apply[T](
    path: String,
    json: Boolean,
    callback: js.UndefOr[scala.Nothing],
    otherTypeCallback: JSONPathOtherTypeCallback
  ): T = js.native
  def apply[T](path: String, json: Boolean, callback: JSONPathCallback): T = js.native
  def apply[T](
    path: String,
    json: Boolean,
    callback: JSONPathCallback,
    otherTypeCallback: JSONPathOtherTypeCallback
  ): T = js.native
  def apply[T](path: String, json: Double): T = js.native
  def apply[T](
    path: String,
    json: Double,
    callback: js.UndefOr[scala.Nothing],
    otherTypeCallback: JSONPathOtherTypeCallback
  ): T = js.native
  def apply[T](path: String, json: Double, callback: JSONPathCallback): T = js.native
  def apply[T](
    path: String,
    json: Double,
    callback: JSONPathCallback,
    otherTypeCallback: JSONPathOtherTypeCallback
  ): T = js.native
  def apply[T](
    path: String,
    json: Null,
    callback: js.UndefOr[scala.Nothing],
    otherTypeCallback: JSONPathOtherTypeCallback
  ): T = js.native
  def apply[T](path: String, json: Null, callback: JSONPathCallback): T = js.native
  def apply[T](path: String, json: Null, callback: JSONPathCallback, otherTypeCallback: JSONPathOtherTypeCallback): T = js.native
  def apply[T](path: js.Array[_]): T = js.native
  def apply[T](path: js.Array[_], json: String): T = js.native
  def apply[T](
    path: js.Array[_],
    json: String,
    callback: js.UndefOr[scala.Nothing],
    otherTypeCallback: JSONPathOtherTypeCallback
  ): T = js.native
  def apply[T](path: js.Array[_], json: String, callback: JSONPathCallback): T = js.native
  def apply[T](
    path: js.Array[_],
    json: String,
    callback: JSONPathCallback,
    otherTypeCallback: JSONPathOtherTypeCallback
  ): T = js.native
  def apply[T](path: js.Array[_], json: js.Array[_]): T = js.native
  def apply[T](
    path: js.Array[_],
    json: js.Array[_],
    callback: js.UndefOr[scala.Nothing],
    otherTypeCallback: JSONPathOtherTypeCallback
  ): T = js.native
  def apply[T](path: js.Array[_], json: js.Array[_], callback: JSONPathCallback): T = js.native
  def apply[T](
    path: js.Array[_],
    json: js.Array[_],
    callback: JSONPathCallback,
    otherTypeCallback: JSONPathOtherTypeCallback
  ): T = js.native
  def apply[T](path: js.Array[_], json: js.Object): T = js.native
  def apply[T](
    path: js.Array[_],
    json: js.Object,
    callback: js.UndefOr[scala.Nothing],
    otherTypeCallback: JSONPathOtherTypeCallback
  ): T = js.native
  def apply[T](path: js.Array[_], json: js.Object, callback: JSONPathCallback): T = js.native
  def apply[T](
    path: js.Array[_],
    json: js.Object,
    callback: JSONPathCallback,
    otherTypeCallback: JSONPathOtherTypeCallback
  ): T = js.native
  def apply[T](path: js.Array[_], json: Boolean): T = js.native
  def apply[T](
    path: js.Array[_],
    json: Boolean,
    callback: js.UndefOr[scala.Nothing],
    otherTypeCallback: JSONPathOtherTypeCallback
  ): T = js.native
  def apply[T](path: js.Array[_], json: Boolean, callback: JSONPathCallback): T = js.native
  def apply[T](
    path: js.Array[_],
    json: Boolean,
    callback: JSONPathCallback,
    otherTypeCallback: JSONPathOtherTypeCallback
  ): T = js.native
  def apply[T](path: js.Array[_], json: Double): T = js.native
  def apply[T](
    path: js.Array[_],
    json: Double,
    callback: js.UndefOr[scala.Nothing],
    otherTypeCallback: JSONPathOtherTypeCallback
  ): T = js.native
  def apply[T](path: js.Array[_], json: Double, callback: JSONPathCallback): T = js.native
  def apply[T](
    path: js.Array[_],
    json: Double,
    callback: JSONPathCallback,
    otherTypeCallback: JSONPathOtherTypeCallback
  ): T = js.native
  def apply[T](
    path: js.Array[_],
    json: Null,
    callback: js.UndefOr[scala.Nothing],
    otherTypeCallback: JSONPathOtherTypeCallback
  ): T = js.native
  def apply[T](path: js.Array[_], json: Null, callback: JSONPathCallback): T = js.native
  def apply[T](
    path: js.Array[_],
    json: Null,
    callback: JSONPathCallback,
    otherTypeCallback: JSONPathOtherTypeCallback
  ): T = js.native
}

