package typings
package hexoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  val args: minimistLib.minimistMod.ParsedArgs
  val debug: scala.Boolean
  val env: java.lang.String
  val init: scala.Boolean
  val safe: scala.Boolean
  val silent: scala.Boolean
  val version: java.lang.String
}

object Anon_Args {
  @scala.inline
  def apply(
    args: minimistLib.minimistMod.ParsedArgs,
    debug: scala.Boolean,
    env: java.lang.String,
    init: scala.Boolean,
    safe: scala.Boolean,
    silent: scala.Boolean,
    version: java.lang.String
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(args = args, debug = debug, env = env, init = init, safe = safe, silent = silent, version = version)
  
    __obj.asInstanceOf[Anon_Args]
  }
}

