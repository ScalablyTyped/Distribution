package typings.jszip

import typings.std.PromiseConstructorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPromise extends js.Object {
  var Promise: PromiseConstructorLike
}

object AnonPromise {
  @scala.inline
  def apply(Promise: PromiseConstructorLike): AnonPromise = {
    val __obj = js.Dynamic.literal(Promise = Promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPromise]
  }
}

