package typings.istanbulLibHook.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var verbose: Boolean
}

object Options {
  @scala.inline
  def apply(verbose: Boolean): Options = {
    val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

