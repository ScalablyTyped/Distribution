package typings.jszip.anon

import typings.std.PromiseConstructorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Promise extends js.Object {
  var Promise: PromiseConstructorLike
}

object Promise {
  @scala.inline
  def apply(Promise: PromiseConstructorLike): Promise = {
    val __obj = js.Dynamic.literal(Promise = Promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[Promise]
  }
}

