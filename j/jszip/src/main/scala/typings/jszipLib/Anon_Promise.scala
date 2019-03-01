package typings
package jszipLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Promise extends js.Object {
  var Promise: stdLib.PromiseConstructorLike
}

object Anon_Promise {
  @scala.inline
  def apply(Promise: stdLib.PromiseConstructorLike): Anon_Promise = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Promise")(Promise)
    __obj.asInstanceOf[Anon_Promise]
  }
}

