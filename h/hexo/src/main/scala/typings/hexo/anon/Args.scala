package typings.hexo.anon

import typings.minimist.mod.ParsedArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args extends js.Object {
  val args: ParsedArgs
  val debug: Boolean
  val env: String
  val init: Boolean
  val safe: Boolean
  val silent: Boolean
  val version: String
}

object Args {
  @scala.inline
  def apply(
    args: ParsedArgs,
    debug: Boolean,
    env: String,
    init: Boolean,
    safe: Boolean,
    silent: Boolean,
    version: String
  ): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], safe = safe.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
}

