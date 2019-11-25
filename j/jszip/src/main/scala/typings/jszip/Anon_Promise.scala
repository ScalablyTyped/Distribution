package typings.jszip

import typings.std.PromiseConstructorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Promise extends js.Object {
  var Promise: PromiseConstructorLike
}

object Anon_Promise {
  @scala.inline
  def apply(Promise: PromiseConstructorLike): Anon_Promise = {
    val __obj = js.Dynamic.literal(Promise = Promise.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Promise]
  }
}

